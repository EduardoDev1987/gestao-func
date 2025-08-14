package dev.wakandaacademy.gestaoFunc.handler;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Getter
@Log4j2
public class APIException extends RuntimeException {
    private static final String message = null;
    private HttpStatus statusException;
    private ErrorApiResponse bodyException;

    private APIException(HttpStatus statusException, String message, Exception e) {
        super(message, e);
        this.statusException = statusException;
        this.bodyException = ErrorApiResponse.builder()
                .message(message)
                .description(getDescription(e))
                .build();
    }
    public static APIException build(HttpStatus statusException, String Message) {
        return new APIException(statusException, message, null);
    }
    public static APIException build(HttpStatus statusException, String Message, Exception e) {
        log.error("Exception: ", e);
        return new APIException(statusException, message, e);
    }
    private String getDescription(Exception e) {
        return Optional.ofNullable(e)
                .map(APIException::getMessageCause).orElse(null);
    }
    private static String getMessageCause(Exception e) {
        return e.getCause() != null ? e.getCause().getMessage() : e.getMessage();
    }
    public ResponseEntity<ErrorApiResponse> buildErroResponseEntity(){
        return ResponseEntity
                .status(statusException)