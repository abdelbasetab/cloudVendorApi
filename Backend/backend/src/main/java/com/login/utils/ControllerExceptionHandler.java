package com.login.utils;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class ControllerExceptionHandler extends ResponseEntityExceptionHandler {

    /**
     * Url : https://hyperskill.org/learn/step/19855
     *
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex,
            HttpHeaders headers,
            HttpStatusCode status,
            WebRequest request) {

        // Just like a POJO, a Map is also converted to a JSON key-value structure
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("status", status.value());
        body.put("timestamp", LocalDateTime.now());
        body.put("exception", ex.getClass());
        return new ResponseEntity<>(body, headers, status);
    }
    */


}
