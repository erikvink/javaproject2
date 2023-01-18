package ee.bcs.javaproject.tasks;

import java.util.HashMap;
import java.util.Scanner;

public class Lesson4 {
    // Store account nr as a key and account balance as value
    static HashMap<String, Double> accountBalanceMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Sisesta k2sklus");
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("exit")) {
                break;

                // TODO 1
                // Add command: "createAccount ${accountNr}"
                // this has to store accountNr with 0 balance

            } else if (line.equalsIgnoreCase("createAccount")) {
                System.out.println("Sisesta konto number");
                String account = scanner.nextLine();
                accountBalanceMap.put(account, 0.0);
                System.out.println("Konto loodud");

                // TODO 2
                // Add command: "getBalance ${accountNr}"
                // this has to display account balance of specific account

            } else if (line.equalsIgnoreCase("getAccountBalance")) {
                System.out.println("Sisesta konto number");
                String account = scanner.nextLine();
                System.out.println("Sinu konto jääk on: " + accountBalanceMap.get(account));

                // TODO 3
                // Add command: "depositMoney ${accountNr} ${amount}
                // this has to add specified amount of money to account
                // You have to check that amount is positive number

            } else if (line.equalsIgnoreCase("depositMoney")) {
                System.out.println("Sisesta konto number");
                String account = scanner.nextLine();
                Double oldBalance = accountBalanceMap.get(account);
                System.out.println("Palju soovid lisada?");
                Double amount = Double.valueOf(scanner.nextLine());
                if (amount > 0) {
                    Double newBalance = oldBalance + amount;
                    accountBalanceMap.put(account, newBalance);
                    System.out.println("Raha lisatud");
                } else {
                    System.out.println("Summa ei ole sobiv");
                }

                // TODO 4
                // Add command: "withdrawMoney ${accountNr} ${amount}
                // This has to remove specified amount of money from account
                // You have to check that amount is positive number
                // You may not allow this transaction if account balance would become negative

            } else if (line.equalsIgnoreCase("withdrawMoney")) {
                System.out.println("Sisesta konto number");
                String account = scanner.nextLine();
                Double oldBalance = accountBalanceMap.get(account);
                System.out.println("Palju soovid välja võtta?");
                Double amount = Double.valueOf(scanner.nextLine());
                if (amount > oldBalance) {
                    System.out.println("Kontol pole piisavalt vahendeid");
                } else if (amount < 0) {
                    System.out.println("Summa ei saa olla negatiivne");
                } else {
                    Double newBalance = oldBalance - amount;
                    accountBalanceMap.put(account, newBalance);
                    System.out.println(amount + "€ välja võetud");
                }

                // TODO 5
                // Add command: "transfer ${fromAccount} ${toAccount} ${amount}
                // This has to remove specified amount from fromAccount and add it to toAccount
                // Your application needs to check that toAccount is positive
                // And from account has enough money to do that transaction

            } else if (line.equalsIgnoreCase("transferMoney")) {
                System.out.println("Sisesta konto number millelt kanname raha");
                String fromAccount = scanner.nextLine();
                System.out.println("Sisesta konto number kuhu kanname raha");
                String toAccount = scanner.nextLine();
                System.out.println("Palju soovid saata?");
                Double amount = Double.valueOf(scanner.nextLine());
                if (amount > 0) {
                    Double fromAccountBalance = accountBalanceMap.get(fromAccount);
                    if (fromAccountBalance < amount) {
                        System.out.println("pole raha piisavalt");
                    } else {
                        Double toAccountBalance = accountBalanceMap.get(toAccount);
                        Double newFromAccountBalance = fromAccountBalance - amount;
                        Double newToAccountBalance = toAccountBalance + amount;
                        accountBalanceMap.put(fromAccount, newFromAccountBalance);
                        accountBalanceMap.put(toAccount, newToAccountBalance);
                    }
                } else {
                    System.out.println("summa on liiga väike");
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
