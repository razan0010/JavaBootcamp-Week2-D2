package HW7.HW7_Account;

public class Main {
    public static void main(String[] args) {

        Account account1 = new Account("11937", "Razan", 18000);
        Account account2 = new Account("11627", "Shatha", 20000);

        //Create objects from Account class

        //call toString method that's print account data
        account1.toString();

        //call debit method that's add amount to the account
        account1.debit(1000);

        //call credit method that's drew amount from the account
        account1.credit(100000);

        // call transfrTo method that's transfer from account to another
        account1.transferTo(account2, 2000);

        account1.toString();

        account2.transferTo(account1, 30000);

        account2.credit(100);


    }
}