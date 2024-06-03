package com.example.schema_driven_design.controller.controller

import com.example.todoapi.controller.HelloApi
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController : HelloApi {
    override fun getGreeting(): ResponseEntity<String> {
        return ResponseEntity("Hello, Neko!", HttpStatus.OK)
    }
}
