package com.jpmc.midascore.component;

import com.jpmc.midascore.foundation.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TransactionHandler {
    private static final Logger log = LoggerFactory.getLogger(TransactionHandler.class);

    public void handleTransaction(Transaction transaction) {
        log.info("Received transaction: {}", transaction);
        System.out.println("Received transaction: " + transaction);
    }
}
