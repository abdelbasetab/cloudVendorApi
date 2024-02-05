package com.login.rest;




import com.login.dto.UserDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@CrossOrigin
@RequestMapping("/api/auth")
public interface UserRest {


    @PostMapping("/signin")

    public ResponseEntity<?> authenticateUser(@Valid @RequestBody UserDto userDto);


    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody UserDto userDto);


    //todo to test my GUI

    @GetMapping("/getall")
    public ResponseEntity<?> getAllUser();



    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id);

    @PutMapping("/update")
    public ResponseEntity<?> updateUser(@Valid @RequestBody UserDto userDto);






}
