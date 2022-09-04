package com.ddd_bootcamp.threetier.applicationservice;

import com.ddd_bootcamp.domain.Account;

//ConsumerGroups

public class AccountEventListener {


    //Subscribes to customer-topic and listens
    // for CustomerAddressChangedEvent.
    public void listen() {

        //Fetches all account from repository matching customerId in CustomerAddressChangedEvent
        //updates address of each account
        Account account = null;
        //Get all Account aggregates related to this Customer
       // account.updateAddress(address);
    }

}

// Saga  = business transaction =
// 2 different atomic database transaction ( 1 in each microservice)
// Choreographed Saga
// Orchestrateted Saga
// Software Architecture The Hard Parts - Neal ford.




