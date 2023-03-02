package com.example.multitenancy_db.entity;

import com.example.multitenancy_db.enums.HolidayType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnTransformer;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "holidays")
@NoArgsConstructor
@AllArgsConstructor
public class Holiday {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    @ColumnTransformer(read = "type::varchar", write = "?::holiday_type")
    private HolidayType type;

    @NotNull
    private LocalDate date;

    @NotNull
    private String name;

    private Boolean active;

    @CreationTimestamp
    private Instant createdAt;

    @UpdateTimestamp
    private Instant updatedAt;

    @PrePersist
    private void prePersistFunction(){

    }

    @PreUpdate
    public void preUpdateFunction(){

    }

}

