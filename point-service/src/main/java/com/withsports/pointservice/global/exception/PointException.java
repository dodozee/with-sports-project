package com.withsports.pointservice.global.exception;

import com.withsports.pointservice.global.dto.Result;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class PointException extends RuntimeException {
    private HttpStatus status;
    private Result errorResult;;


    protected PointException(HttpStatus status, String message){
        this.status = status;
        this.errorResult = Result.createErrorResult(message);
    }
}
