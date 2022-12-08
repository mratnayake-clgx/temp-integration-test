package com.example.demo;

import com.example.demo.repository.OrderRepository;
import com.example.demo.service.InvoiceService;
import com.example.demo.service.OrderService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith({SpringExtension.class})
@Import({OrderService.class, InvoiceService.class})
class OrderServiceIT {
    @MockBean
    OrderRepository orderRepository;

    @Autowired
    OrderService orderService;

    @Test
    void test() {
        Assertions.assertEquals("Print OrderPrint Invoice", orderService.print());
    }
}
