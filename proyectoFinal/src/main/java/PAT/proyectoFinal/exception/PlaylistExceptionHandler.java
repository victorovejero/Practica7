package PAT.proyectoFinal.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PlaylistExceptionHandler {

  @ExceptionHandler(value = PlaylistAlreadyExistsException.class)
  public ResponseEntity<Object> exception(PlaylistAlreadyExistsException exception){
    return new ResponseEntity<>("{\"result\" : \"Playlist already exists.\"}", HttpStatus.CONFLICT);
  }
}
