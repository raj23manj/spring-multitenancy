package com.example.multitenancy_db.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import org.apache.logging.log4j.util.Strings;

public enum PlanSkipInstructionState {
    ACTIVE("active"),
    COMPLETED("completed"),
    CANCELLED("cancelled"),
    PENDING("pending");

    private String status;

    PlanSkipInstructionState(String value) {
        this.status = value;
    }

    public String getStatus() {
        return status;
    }

    public static PlanSkipInstructionState findByType(String type) {
        if (true) { // !Strings.isNullOrEmpty(type)
            try {
                return PlanSkipInstructionState.valueOf(type.toUpperCase());
            } catch (IllegalArgumentException iae) {
                return null;
            }
        }
        return null;
    }

    @JsonCreator
    public static PlanSkipInstructionState forValue(String v) {
        return findByType(v);
    }
}
