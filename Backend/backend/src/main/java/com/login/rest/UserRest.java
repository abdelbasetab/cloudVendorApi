package com.login.rest;




import com.login.dto.UserDto;
import com.login.pojo.User;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@RestController
@RequestMapping("/api/auth")
public interface UserRest {




    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@RequestBody UserDto userDto);

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody UserDto userDto);


    //todo to test my GUI

    @GetMapping("/get")
    public ResponseEntity<?> getAllUser();



    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id);

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(@PathVariable Long id);






}
