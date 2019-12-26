package com.scu.demo;

import com.scu.demo.common.domain.Product;
import com.scu.demo.mapper.ProductMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringHelloApplicationTests {
    @Autowired
    ProductMapper mapper;
    @Test
    void contextLoads() {
        List<Product> products = mapper.selectByExample(null);

        for (Product product : products) {
            System.out.println(product.getPname());
        }
    }

}
