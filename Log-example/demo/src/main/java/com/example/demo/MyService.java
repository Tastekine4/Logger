package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    
    private static final Logger logger = LoggerFactory.getLogger(MyService.class);
    
    public void process() {
        logger.info("Process started");
        
        // İşleminizi burada yapın
        
        logger.info("Process finished");
    }
}