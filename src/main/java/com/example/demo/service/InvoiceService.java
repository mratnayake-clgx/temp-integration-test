package com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class InvoiceService {

    public String print(){
        return "Print Invoice";
    }
}
