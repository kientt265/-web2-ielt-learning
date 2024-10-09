package com.spring.fantasyielts.responses;

import lombok.*;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorResponse {
    private int status;

    private Date timestamp;

    private String message;

    private String details;
}
