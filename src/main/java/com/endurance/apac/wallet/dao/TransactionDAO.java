package com.endurance.apac.wallet.dao;

import com.endurance.apac.wallet.model.Transaction;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class TransactionDAO {

    private List<Transaction> DB = new ArrayList<>();

    public int addTransaction(Transaction transaction){
        DB.add(transaction);
        return 1;
    }

    int deleteTransaction(){
        return 1;
    }

    public Optional<Transaction> getTransactionByID(UUID uuid){
        return DB.stream()
                .filter(transaction -> transaction.getUuid().equals(uuid))
                .findFirst();
    }

    public List<Transaction> getAllTransactions(){
        return DB;
    }

    int updateTransaction(){
        return 1;
    }
}
