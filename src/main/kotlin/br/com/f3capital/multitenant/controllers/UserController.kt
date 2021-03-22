package br.com.f3capital.multitenant.controllers

import br.com.f3capital.multitenant.dto.UserDto
import br.com.f3capital.multitenant.models.User
import br.com.f3capital.multitenant.repositories.UserRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(private val userRepository: UserRepository) {
    @GetMapping
    fun list(): List<User> {
        return userRepository.findAll()
    }

    @PostMapping
    fun addUser(@RequestBody userDto: UserDto): User {
        val userDomain = User(userDto.name)
        return userRepository.save(userDomain)
    }
}