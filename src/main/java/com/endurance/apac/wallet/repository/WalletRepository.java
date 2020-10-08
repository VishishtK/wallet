package com.endurance.apac.wallet.repository;

import com.endurance.apac.wallet.dao.WalletDAO;
import com.endurance.apac.wallet.model.Wallet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

@Repository
public class WalletRepository {

    private final WalletDAO dao;

    @Autowired
    public WalletRepository(WalletDAO dao) {
        this.dao = dao;
    }

    public Wallet getWallet(UUID uuid){
        return dao.getWalletWithID(uuid);
    }

    public int addWallet(Wallet wallet){
        dao.addWallet(wallet);
        return 1;
    }

    public Map<UUID,Wallet> getAllWallets(){
        return dao.getAllWallets();
    }

}
