package com.example.study.model.network.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryApiRequest {
    private Long id;
    private String Type;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime createdBy;
    private LocalDateTime updatedAt;
    private LocalDateTime updatedBy;
}