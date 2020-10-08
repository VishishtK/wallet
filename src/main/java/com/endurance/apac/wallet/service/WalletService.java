package com.endurance.apac.wallet.service;

import com.endurance.apac.wallet.model.Wallet;
import com.endurance.apac.wallet.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

@Service
public class WalletService {
    private final WalletRepository repository;

    @Autowired
    public WalletService(WalletRepository repository) {
        this.repository = repository;
    }

    public Wallet getWallet(UUID uuid){
        return repository.getWallet(uuid);
    }

    public int addWallet(Wallet wallet){
        wallet.setBalance(0);
        return repository.addWallet(wallet);
    }

    public Map<UUID,Wallet> getAllWallets(){
        return repository.getAllWallets();
    }

    public int addAmount(UUID walletUuid, Integer amount){
        Wallet wallet = getWallet(walletUuid);
        wallet.setBalance(wallet.getBalance() + amount);
        return repository.addWallet(wallet);
    }
}
