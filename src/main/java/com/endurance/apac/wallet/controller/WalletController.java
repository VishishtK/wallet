package com.endurance.apac.wallet.controller;

import com.endurance.apac.wallet.model.Wallet;
import com.endurance.apac.wallet.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.UUID;

@RequestMapping("api/wallet")
@RestController
public class WalletController {
    private WalletService walletService;

    @Autowired
    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @GetMapping(path = "{id}")
    public Wallet getWallet(@PathVariable("id") UUID uuid){
        return walletService.getWallet(uuid);
    }

    @PostMapping
    public int addWallet(@RequestBody Wallet wallet){
        return walletService.addWallet(wallet);
    }

    @GetMapping
    public Map<UUID,Wallet> getAllWallets(){
        return walletService.getAllWallets();
    }

    @PutMapping(path = "{id}")
    public Boolean updateWallet(@PathVariable("id") UUID uuid){
        return Boolean.TRUE;
    }

    @DeleteMapping(path = "{id}")
    public Boolean deleteWallet(@PathVariable("id") UUID uuid){
        return Boolean.TRUE;
    }
}
