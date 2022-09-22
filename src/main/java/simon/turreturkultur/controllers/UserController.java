package simon.turreturkultur.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import simon.turreturkultur.models.User;
import simon.turreturkultur.services.IUserService;
import simon.turreturkultur.services.UserService;

import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.HttpMethodConstraint;


@RestController
public class UserController {


    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/createUser")
    public ResponseEntity<String> createUser(@RequestBody User user){
            String msg = "";
            if (userService.save(user) != null) {
                msg = "Din bruger: " + user.getName() + " blev succesfuldt oprettet!";
            } else {
                msg = "Din bruger: " + user.getName() + " blev ikke oprettet, prøv igen!";
            }
            return new ResponseEntity<>(msg, HttpStatus.OK);
        }


}
