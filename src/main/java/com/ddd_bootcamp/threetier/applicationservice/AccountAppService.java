package com.ddd_bootcamp.threetier.applicationservice;

import com.ddd_bootcamp.domain.Account;
import com.ddd_bootcamp.domain.AccountId;
import com.ddd_bootcamp.domain.Address;
import com.ddd_bootcamp.domain.events.CustomerAddressUpdatedEvent;
import com.ddd_bootcamp.threetier.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.UUID;

@Service
public class AccountAppService {

    private AccountRepository accountRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public AccountAppService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    //@Transactional
    public Account createAccount(Account account) {
        Account savedAccount = accountRepository.save(account);
        //commit transaction
        restTemplate.put("http://localhost:8081/customers/" +  account.getCustomerIdAsString() + "/accounts/" +  account.getAccountIdAsString(),
                null, new HashMap<>());
        //for non 200 http status scenario roll back above transaction
        return savedAccount;
    }

    //@Transactional
    public Account updateAddress(UUID accountId, Address address) {
        Account account = accountRepository.find(new AccountId(accountId));
        account.updateAddress(address);
        return accountRepository.save(account);
    }

    public void sendEventToKafka() {
        System.out.println("here = " + "here kafka");
        kafkaTemplate.send("customer-topic", new CustomerAddressUpdatedEvent(UUID.randomUUID(), new Address("Pune")));
    }
}
