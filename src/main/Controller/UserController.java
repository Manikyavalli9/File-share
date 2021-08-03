import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ExceptionHandler(RuntimeException.class)
    @PostMapping("/register")
    private ResponseEntity<Object> registerUser(@RequestBody UserDto userDto, Principal principal) {
        return userService.registerUser(userDto);
    }

}