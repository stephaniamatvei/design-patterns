package com.designpatterns.structuralpatterns.adapter;

import com.designpatterns.structuralpatterns.adapter.legacy.LegacyBankAccount;

public class Main {
    public static void main(String[] args) {
        LegacyBankAccount legacyBankAccount = new LegacyBankAccount(1, "firstName lastName");

        /* Won't work due to missing parameters!
            AccountCreationService accountCreationService = new AccountCreationService(legacyBankAccount.getID(),
                legacyBankAccount.getName())
        */

        PersonalInfoDB personalInfoDB = new PersonalInfoDB();
        personalInfoDB.setName("firstName lastName");
        personalInfoDB.setEmail("firstname@lastname.com");
        personalInfoDB.setAmount(1000L);

        BankAccountAdapter bankAccountAdapter = new BankAccountAdapter(legacyBankAccount, personalInfoDB);
        AccountCreationService accountCreationService = new AccountCreationService(bankAccountAdapter.getID(),
                bankAccountAdapter.getName(), bankAccountAdapter.getEmail(), bankAccountAdapter.getAmount());

        accountCreationService.createAccount();
    }
}
