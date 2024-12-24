package com.example.zalominiapp.miniapp.exception;

import com.example.zalominiapp.miniapp.dto.ResponseObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
	
//	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	@ExceptionHandler(UnauthorizedException.class)
	@ResponseStatus(code = HttpStatus.UNAUTHORIZED)
    public ResponseEntity<ResponseObject<Object>> handleUnauthorizedException(UnauthorizedException ex) {
        ResponseObject<Object> responseObject = ResponseObject.builder()
        		.result(false)
                .message("Unauthorized")
                .status(HttpStatus.UNAUTHORIZED.value())
                .data(ex.getMessage())
                .build();

        return ResponseEntity
                .status(HttpStatus.UNAUTHORIZED)
                .contentType(MediaType.APPLICATION_JSON)
                .body(responseObject);
    }
    
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ResponseObject<Object>> handleBadException(BadRequestException ex) {
    	ResponseObject<Object> responseObject = ResponseObject.builder()
    			.result(false)
                .message("Bad Request")
                .status(HttpStatus.BAD_REQUEST.value())
                .data(ex.getMessage())
                .build();
    	
        return ResponseEntity.badRequest().body(responseObject);
    }
    
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(InternalServerErrorException.class)
    public ResponseEntity<ResponseObject<Object>> handleBadException(InternalServerErrorException ex) {
    	ResponseObject<Object> responseObject = ResponseObject.builder()
    			.result(false)
                .message("Internal Server Error")
                .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .data(ex.getMessage())
                .build();
    	
        return ResponseEntity.internalServerError().body(responseObject);
    }
    
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ResponseObject<Object>> handleNotFoundException(NotFoundException ex) {
        ResponseObject<Object> responseObject = ResponseObject.builder()
        		.result(false)
                .message("Not Found")
                .status(HttpStatus.NOT_FOUND.value())
                .data(ex.getMessage())
                .build();

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .contentType(MediaType.APPLICATION_JSON)
                .body(responseObject);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ResponseObject<String>> handleInvalidData(IllegalArgumentException ex) {
        ResponseObject<String> response = ResponseObject.<String>builder()
                .result(false)
                .message(ex.getMessage())
                .status(HttpStatus.BAD_REQUEST.value())
                .data(null)
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }
}
