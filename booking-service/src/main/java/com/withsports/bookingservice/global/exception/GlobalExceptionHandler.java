package com.withsports.bookingservice.global.exception;


import com.withsports.bookingservice.global.dto.Result;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
@RequiredArgsConstructor
@Slf4j
public class GlobalExceptionHandler {


    @ExceptionHandler(BookingException.class)
    public ResponseEntity userExceptionHandler(BookingException te) {
        HttpStatus status = te.getStatus();
        Result errorResult = te.getErrorResult();

        log.warn("[UserException] {}, {}", status, errorResult);

        return ResponseEntity.status(status)
                .body(errorResult);
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException exception) {
        return getValidationErrorBody(exception);
    }

    @ExceptionHandler(BindException.class)
    public ResponseEntity bindExceptionHandler(BindException exception){
        return getValidationErrorBody(exception);
    }

    private ResponseEntity getValidationErrorBody(BindException e){
        BindingResult bindingResult = e.getBindingResult();

        StringBuilder builder = new StringBuilder();
        bindingResult.getFieldErrors()
                .forEach(fieldError -> {
                    builder.append("[");
                    builder.append(fieldError.getField());
                    builder.append("](은)는 ");
                    builder.append(fieldError.getDefaultMessage());
                    builder.append(" 입력된 값: [");
                    builder.append(fieldError.getRejectedValue());
                    builder.append("]");
                });

        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(Result.createErrorResult(builder.toString()));
    }
}
