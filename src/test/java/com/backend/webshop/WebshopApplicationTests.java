package com.backend.webshop;

import com.backend.webshop.controller.CustomerController;
import com.backend.webshop.controller.OrderController;
import com.backend.webshop.controller.ProductController;
import com.backend.webshop.service.CustomerService;
import com.backend.webshop.service.OrderResponseService;
import com.backend.webshop.service.OrderService;
import com.backend.webshop.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class WebshopApplicationTests {

    @Autowired
    private OrderController orderController;

    @Autowired
    private CustomerController customerController;

    @Autowired
    private ProductController productController;

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderResponseService orderResponseService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProductService productService;

    @Test
    void contextLoads() throws Exception {
        assertThat(orderController).isNotNull();
        assertThat(customerController).isNotNull();
        assertThat(productController).isNotNull();
        assertThat(orderService).isNotNull();
        assertThat(orderResponseService).isNotNull();
        assertThat(customerService).isNotNull();
        assertThat(productService).isNotNull();
    }
}
