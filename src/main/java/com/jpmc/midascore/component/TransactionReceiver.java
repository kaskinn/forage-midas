package com.jpmc.midascore.component;

import com.jpmc.midascore.foundation.Transaction;
//import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionReceiver {
    private final TransactionHandler transactionHandler;

    public TransactionReceiver(TransactionHandler transactionHandler) {
        this.transactionHandler = transactionHandler;
    }

    @KafkaListener(
            topics = "${general.kafka-topic}",
            groupId = "${spring.kafka.consumer.group-id}"
    )
    public void receive(Transaction transaction) {
        transactionHandler.handleTransaction(transaction);
    }
}
