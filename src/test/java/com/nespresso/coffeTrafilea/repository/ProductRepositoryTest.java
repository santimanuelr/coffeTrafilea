package com.nespresso.coffeTrafilea.repository;

import com.nespresso.coffeTrafilea.model.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class ProductRepositoryTest {

    @Autowired
    ProductRepository productRepository;

    private void insertProducts() {
        productRepository.deleteAll().block();

        List<Product> products = Arrays.asList(
                new Product("Coffe", "coffe", new BigDecimal(23.33)),
                new Product("Coffe", "coffe", new BigDecimal(23.33)),
                new Product("Coffe", "coffe", new BigDecimal(23.33))
        );

        productRepository.saveAll(products).blockLast();
    }

    @Test
    public void whenInsert6_then6AreExpected() {

        insertProducts();

        Assertions.assertEquals(3l, productRepository.findAll().count().block());

    }
}
