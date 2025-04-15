package org.example.charity_app.controllers;

import org.example.charity_app.entities.User;
import org.example.charity_app.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class UserController {

      @Autowired
    private UserService userService;

    // REST endpoints
    @GetMapping("/api/users")
    @ResponseBody
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/api/users")
    @ResponseBody
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/api/users/{id}")
    @ResponseBody
    public User getUserById(@PathVariable Long id) {
        return userService.getUsersById(id);
    }

    @PutMapping("/api/users/{id}")
    @ResponseBody
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        return ResponseEntity.ok(userService.updateUser(id, user));
    }

    @DeleteMapping("/api/users/{id}")
    @ResponseBody
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

    // === Pages web (login & register)

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // va chercher login.html
    }

    @GetMapping("/register")
    public String registerPage(Model model) {
        model.addAttribute("user", new User());
        return "register"; // va chercher register.html
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/login";
    }
}
