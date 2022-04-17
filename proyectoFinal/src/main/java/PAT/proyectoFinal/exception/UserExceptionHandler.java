package PAT.proyectoFinal.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserExceptionHandler {

  @ExceptionHandler(value = UserAlreadyExistsException.class)
  public ResponseEntity<Object> exception(UserAlreadyExistsException exception) {
    return new ResponseEntity<>("{\"result\" : \"User already exists.\"}", HttpStatus.CONFLICT);
  }




}
