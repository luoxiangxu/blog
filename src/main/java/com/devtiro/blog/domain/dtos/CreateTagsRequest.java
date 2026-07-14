package com.devtiro.blog.domain.dtos;

import java.util.Set;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateTagsRequest {
    @NotEmpty(message = "At Least one tag name is required")
    @Size(max = 10, message = "Maximun {max} is allowed")
    private Set<String> names;
}
