package com.devtiro.blog.domain.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiErrorResponse {

    private int status;
    private String message;
    private List<FieldError> errors;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class FieldError{
        private String field;
        private String message;
    }
}
