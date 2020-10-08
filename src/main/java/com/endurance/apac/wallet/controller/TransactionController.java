package com.endurance.apac.wallet.controller;

import com.endurance.apac.wallet.model.Transaction;
import com.endurance.apac.wallet.service.TransactionService;
import com.endurance.apac.wallet.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/transaction")
@RestController
public class TransactionController {

    private final TransactionService transactionService;
    private final WalletService walletService;

    @Autowired
    public TransactionController(TransactionService transactionService, WalletService walletService) {
        this.transactionService = transactionService;
        this.walletService = walletService;
    }

    @GetMapping(path = "{id}")
    public Transaction getTransaction(@PathVariable("id") UUID uuid){
        return transactionService.getTransactionByID(uuid)
                .orElse(null);
    }

    @PostMapping
    public int addTransaction(@RequestBody Transaction transaction){
        walletService.addAmount(transaction.getWalletUuid(), transaction.getAmount());
        return transactionService.addTransaction(transaction);
    }

    @GetMapping
    public List<Transaction> getAllTransactions(){
        return transactionService.getAllTransactions();
    }

    @DeleteMapping(path = "{id}")
    public Boolean deleteTransaction(@PathVariable("id") UUID uuid){
        return Boolean.TRUE;
    }
}
