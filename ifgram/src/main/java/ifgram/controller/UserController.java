package ifgram.controller;

import ifgram.dto.UserRequest;
import ifgram.dto.UserResponse;
import ifgram.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;

    // Construtor correto para injeção de dependência
    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public UserResponse criar(@Valid @RequestBody UserRequest request) {
        return service.criar(request);
    }
}