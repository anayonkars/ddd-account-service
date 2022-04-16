package com.ddd_bootcamp.threetier.applicationservice;

import com.ddd_bootcamp.domain.Account;
import com.ddd_bootcamp.domain.Address;
import com.ddd_bootcamp.threetier.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AccountAppService {

    private AccountRepository accountRepository;

    public AccountAppService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    //@Transactional
    public Account createAccount(Account account) {
        Account savedAccount = accountRepository.save(account);
        return savedAccount;
    }

    //@Transactional
    public Account updateAddress(UUID accountId, Address address) {
        Account account = accountRepository.find(accountId);
        account.updateAddress(address);
        return accountRepository.save(account);
    }

}
