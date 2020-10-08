package com.endurance.apac.wallet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.time.LocalDate;
import java.util.UUID;

public class Transaction {

    enum TransactionType {
        Credit,
        Debit
    }

    private UUID uuid;
    private UUID walletUuid;
    private String invoiceID;
    private TransactionType transactionType;
    private Integer amount;
    private LocalDate dateOfTransaction;
    private LocalDate dateOfExpiry;

    public Transaction(@JsonProperty("invoiceID") String invoiceID,
                       @JsonProperty("walletUuid") UUID walletUuid,
                       @JsonProperty("transactionType") TransactionType transactionType,
                       @JsonProperty("amount") Integer amount,
                       @JsonProperty("expiryMonths") Integer expiry) {
        this.uuid = UUID.randomUUID();
        this.walletUuid = walletUuid;
        this.invoiceID = invoiceID;
        this.transactionType = transactionType;
        this.amount = amount;
        this.dateOfTransaction = LocalDate.now();
        this.dateOfExpiry = LocalDate.now().plusMonths(expiry);
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public LocalDate getDateOfTransaction() {
        return dateOfTransaction;
    }

    public void setDateOfTransaction(LocalDate dateOfTransaction) {
        this.dateOfTransaction = dateOfTransaction;
    }

    public LocalDate getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(LocalDate dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    public UUID getWalletUuid() {
        return walletUuid;
    }

    public void setWalletUuid(UUID walletUuid) {
        this.walletUuid = walletUuid;
    }
}
