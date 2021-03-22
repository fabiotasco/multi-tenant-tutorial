package br.com.f3capital.multitenant.models

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class User(
    val name: String? = null
): Serializable {
    @Id
    @GeneratedValue
    var id: Long? = null
}