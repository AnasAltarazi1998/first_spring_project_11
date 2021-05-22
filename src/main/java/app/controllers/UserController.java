package app.controllers;

import org.springframework.web.bind.annotation.RestController;

import app.entities.User;
import app.repositories.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(path = "users")
public class UserController {
    
    @Autowired
    UserRepo userRepo;
    @RequestMapping(value="/add", method=RequestMethod.POST)
    public User addUser(@RequestBody User user) {
        return userRepo.save(user);
    }
    
}
