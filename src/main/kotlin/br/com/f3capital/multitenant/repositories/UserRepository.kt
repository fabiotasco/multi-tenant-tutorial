package br.com.f3capital.multitenant.repositories

import br.com.f3capital.multitenant.models.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long> {
}