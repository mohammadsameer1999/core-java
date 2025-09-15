package com.activity.dto;

import com.activity.model.ActivitiyType;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Map;
@Data
@Builder
public class ActivityRequest {
    private String userId;
    private ActivitiyType type;
    private Integer duration;
    private  Integer caloriesBurned;
    private LocalDateTime startTime;
    private Map<String,Object> additionMetrics;

}
