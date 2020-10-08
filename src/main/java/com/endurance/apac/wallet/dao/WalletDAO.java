package com.endurance.apac.wallet.dao;

import com.endurance.apac.wallet.model.Wallet;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class WalletDAO {

    private static Map<UUID,Wallet> DB = new HashMap<>();

    public int addWallet(Wallet wallet){
        DB.put(wallet.getUuid(), wallet);
        return 1;
    }

    public Wallet getWalletWithID(UUID uuid){
        return DB.get(uuid);
    }

    public Map<UUID,Wallet> getAllWallets(){
        return DB;
    }

    public int deleteWallet(){
        return 1;
    }
}
