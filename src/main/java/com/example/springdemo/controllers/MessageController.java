package com.example.springdemo.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.models.Message;

@RestController
public class MessageController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/message")
    public Message message(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Message(counter.incrementAndGet(), String.format(template, name));
    }
}