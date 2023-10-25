package de.dpp.balanceboard.controllers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import de.dpp.balanceboard.models.Message;

@SpringBootTest
public class MessageControllerTest {

    @Autowired
    private MessageController controller;

    @Test
    void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
        assertThat(controller.message("Foo"))
                .isEqualTo(new Message(1, "Hello, Foo!"));
    }
}
