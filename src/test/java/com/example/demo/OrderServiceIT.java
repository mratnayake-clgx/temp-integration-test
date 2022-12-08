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

import static org.mockito.Mockito.when;

@ExtendWith({SpringExtension.class})
@Import({OrderService.class, InvoiceService.class})
class OrderServiceIT {
    @MockBean
    OrderRepository orderRepository;

    @Autowired
    OrderService orderService;

    @Test
    void test() {
        when(orderRepository.count()).thenReturn(10L);

        Assertions.assertEquals("Print OrderPrint Invoice10", orderService.print());
    }
}
