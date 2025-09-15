package com.activity.dto;

import com.activity.model.ActivitiyType;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.Map;
@Data
public class ActivityResponse {
    private String id;
    private String userId;
    private ActivitiyType type;
    private Integer duration;
    private  Integer caloriesBurned;
    private LocalDateTime startTime;
    private Map<String,Object> additionMetrics;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
