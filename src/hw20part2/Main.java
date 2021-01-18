package hw20part2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("Ivan", "Petrov");
        Client client2 = new Client("Petr", "Petrov");
        Client client3 = new Client("John", "Jonson");
        Client client4 = new Client("Mike", "Mikhailov");

        Bank bank = new Bank();

        Account ac1 = bank.openAccount(client1, 100.15);
        Account ac2 = bank.openAccount(client2, 200.35);
        Account ac3 = bank.openAccount(client3, 500.45);
        Account ac4 = bank.openAccount(client4, 400.1);

        ArrayList<Account> array = new ArrayList<>();
        array.add(ac1);
        array.add(ac2);
        array.add(ac3);
        array.add(ac4);

//        bank.deposit(array, client1, 200.50);
        bank.withdraw(array,client2, 100.30);
//        bank.deposit(array,client3, 9.1);
        bank.withdraw(array,client4, 400.00);

//        System.out.println(ac1.getAmount() + " " + ac1.getOwner());





    }
}
