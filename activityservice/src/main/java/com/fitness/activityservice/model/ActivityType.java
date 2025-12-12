package com.fitness.activityservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

public enum ActivityType {
    RUNNING,
    WALKING,
    PILATES,
    LIFTING,
    WEIGHT_TRAINING,
    HIIT,
    CARDIO,
    STRETCHING,
    OTHER
}
