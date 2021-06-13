package com.sda.dianalenter.webshop.repository;


import com.sda.dianalenter.webshop.model.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface AccountRepository extends CrudRepository<Account, Long> {

//    List<Account> findAllByIsClosed(Boolean isClosed);
//
//    List<Account> findAllByBillingAddress(String billingAdress);
//
//    List<Account> findAllByClosedDateBetween(Date startDate, Date endDate);

    List<Account> findAllByBillingAddressIsContaining(String city);
    Account findByLogin(String login);
}

