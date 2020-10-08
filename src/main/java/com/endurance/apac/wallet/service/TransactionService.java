package com.endurance.apac.wallet.service;

import com.endurance.apac.wallet.model.Transaction;
import com.endurance.apac.wallet.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TransactionService {

    private final TransactionRepository repository;

    @Autowired
    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    public Optional<Transaction> getTransactionByID(UUID uuid){
        return repository.getTransactionByID(uuid);
    }

    public List<Transaction> getAllTransactions(){
        return repository.getAllTransactions();
    }

    public int addTransaction(Transaction transaction){

        return repository.addTransaction(transaction);
    }
}
