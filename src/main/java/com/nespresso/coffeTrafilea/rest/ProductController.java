package com.nespresso.coffeTrafilea.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RequestMapping("products")
@RestController
@Slf4j
public class ProductController {

    @GetMapping
    public Flux<String> getAll() {
        log.info("::GET_ALL Products::");
        return Flux.just("Apllication UP");
    }

}
