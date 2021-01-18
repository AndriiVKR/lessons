package hw20part2;

import java.util.ArrayList;

public class Bank {

    public Account openAccount(Client client, double amount) {
//       Account ac = new Account(amount, client.getFirsName() + " " + client.getLastName());
//       return ac;

//        same code we can write shorter as bellow:

       return new Account(amount, client.getFirsName() + " " + client.getLastName());
    }

    public void deposit(ArrayList<Account> array, Client client,double amount) {
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).getOwner().equals(client.getFirsName() + " " + client.getLastName())) {
                array.get(i).setAmount(array.get(i).getAmount() + amount);
                System.out.println(array.get(i).getAmount());
            }
        }
      }

      public void withdraw(ArrayList<Account> array, Client client, double amount) {
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).getOwner().equals(client.getFirsName() + " " + client.getLastName()) &&
                    array.get(i).getAmount()>= amount) {
                      array.get(i).setAmount(array.get(i).getAmount() - amount);
        } else {
                System.out.println(" Sorry, you do not have enough money on your account");
            }
            System.out.println(array.get(i).getAmount());
      }

    }
}
