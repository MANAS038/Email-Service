package com.example.EmailService.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ResponseDto {
    private String status;
}
