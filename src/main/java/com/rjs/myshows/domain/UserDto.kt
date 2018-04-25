package com.rjs.myshows.domain

import com.rjs.myshows.domain.security.Role
import java.time.LocalDate

open class UserDto: User, BaseDto() {
    override var username: String = ""
    override var email: String = ""
    override var firstName: String? = null
    override var lastName: String? = null
    override var enabled: Boolean = true
    override var roles: MutableSet<Role> = linkedSetOf()
    override var dateOfBirth: LocalDate? = null
}