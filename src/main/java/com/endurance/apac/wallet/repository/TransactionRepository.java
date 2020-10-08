package com.endurance.apac.wallet.repository;

import com.endurance.apac.wallet.dao.TransactionDAO;
import com.endurance.apac.wallet.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class TransactionRepository {

    private final TransactionDAO transactionDAO;

    @Autowired
    public TransactionRepository(TransactionDAO transactionDAO) {
        this.transactionDAO = transactionDAO;
    }

    public Optional<Transaction> getTransactionByID(UUID uuid){
        return transactionDAO.getTransactionByID(uuid);
    }

    public List<Transaction> getAllTransactions(){
        return transactionDAO.getAllTransactions();
    }

    public int addTransaction(Transaction transaction){
        return transactionDAO.addTransaction(transaction);
    }
}
