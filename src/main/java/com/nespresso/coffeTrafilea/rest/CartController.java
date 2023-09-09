package com.nespresso.coffeTrafilea.rest;

import com.nespresso.coffeTrafilea.model.Cart;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("cart")
@RestController
@Slf4j
public class CartController {

    @GetMapping
    public Flux<String> getAll() {
        log.info("::GET_ALL Products::");
        return Flux.just("Apllication UP");
    }


    @PostMapping
    public Mono<Cart> post() {
        log.info("::GET_ALL Products::");
        return Mono.just(null);
    }

}
