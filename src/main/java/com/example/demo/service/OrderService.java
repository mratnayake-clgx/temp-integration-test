package com.example.demo.service;

import com.example.demo.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {
    private final InvoiceService invoiceService;

    private final OrderRepository orderRepository;

    public String print() {
        return "Print Order" + invoiceService.print();
    }
}