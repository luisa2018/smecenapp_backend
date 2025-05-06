package com.smecen.smecenapp_backend.controller;


import com.smecen.smecenapp_backend.dto.UserDTO;
import com.smecen.smecenapp_backend.exception.ModelNotFoundException;
import com.smecen.smecenapp_backend.model.User;
import com.smecen.smecenapp_backend.service.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;



@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService userService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<List<UserDTO>> getAll() throws Exception {
        List<User> users = userService.list();
        List<UserDTO> usersDTO = users.stream().map(this::convertToDTO).collect(Collectors.toList());
        return ResponseEntity.ok(usersDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getById(@PathVariable Integer id) throws Exception {
        User obj = userService.listToId(id);
        if (obj == null) {
            throw new ModelNotFoundException("ID NO ENCONTRADO " + id);
        }

        UserDTO dto = convertToDTO(obj);
        return ResponseEntity.ok(dto);
    }

    @PostMapping
    public ResponseEntity<UserDTO> create(@RequestBody UserDTO dto) throws Exception {
        if (!dto.getPassword().equals(dto.getConfirmPassword())) {
            throw new IllegalArgumentException("Las contraseñas no coinciden");
        }

        User user = convertToEntity(dto);
        User saved = userService.register(user);
        return ResponseEntity.ok(convertToDTO(saved));
    }
    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> update(@PathVariable("id") Integer id, @RequestBody UserDTO dto) throws Exception {
        User existingUser = userService.listToId(id);

        if (existingUser == null) {
            throw new ModelNotFoundException("ID NO ENCONTRADO " + id);
        }
        existingUser.setEmail(dto.getEmail());
        existingUser.setPassword(dto.getPassword());

        User updatedUser = userService.update(existingUser);

        return ResponseEntity.ok(convertToDTO(updatedUser));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception {
        User obj = userService.listToId(id);
        if (obj == null) {
            throw new ModelNotFoundException("ID NO ENCONTRADO " + id);
        }
        userService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }


    private User convertToEntity(UserDTO dto) {
        User user = modelMapper.map(dto, User.class);
        return user;
    }
    private UserDTO convertToDTO(User user) {
        return modelMapper.map(user, UserDTO.class);
    }
}
