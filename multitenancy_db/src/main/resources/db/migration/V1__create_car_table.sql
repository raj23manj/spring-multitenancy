CREATE TYPE holiday_type AS ENUM (
    'BANK',
    'MARKET'
);

CREATE TABLE public.holidays (
    id integer NOT NULL,
    type holiday_type,
    date date,
    name CHARACTER VARYING,
    active boolean,
    created_at timestamp without time zone,
    updated_at timestamp without time zone
);

CREATE SEQUENCE IF NOT EXISTS public.holidays_id_seq
START WITH 1
INCREMENT BY 1
NO MINVALUE
NO MAXVALUE
CACHE 1;

ALTER SEQUENCE public.holidays_id_seq OWNED BY public.holidays.id;
ALTER TABLE ONLY public.holidays ALTER COLUMN id SET DEFAULT nextval('holidays_id_seq'::regclass);
ALTER TABLE ONLY public.holidays ADD CONSTRAINT holidays_pkey PRIMARY KEY (id);
