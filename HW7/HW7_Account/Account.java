package HW7.HW7_Account;
public class Account {
    private String id;
    private String name;
    private int balance=0;

    public void Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

     Account(String id, String name, int balance ) {
        this.id = id;
        this.name = name;
        this.balance=balance;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }

    //check if amount is sufficient and drew amount from the account
    public int credit(int amount) {
        if(balance >= amount && amount!=0){
            balance-=amount;
            System.out.println( "Your balance after credit "+ amount+ " is: "+balance);
        } else System.out.println("Dear "+ getName() +", your balance is insufficient, current balance= " + getBalance());
        return balance;
    }

    //add amount from the account
    public int debit(int amount) {
        balance+=amount;
        System.out.println("Your balance after debit "+ amount+ " is: "+ balance);
        return balance;
    }

    //check if amount is sufficient and transfer amount from the account to another account
    public int transferTo(Account another, int amount) {
        int transfer=0;
        if(balance>=amount && amount!=0){
            transfer= another.balance += amount;
            balance -=amount;
            System.out.printf(getName()+"'s Balance after transfer: "+ getBalance() +"%n"+ another.getName()+"'s Balance after transfer: "  + another.getBalance());
        } else System.out.println("Dear "+ getName() +", your balance is insufficient, current balance= " + getBalance());
        return transfer;
    }

    // print account data
    public String toString() {
        return System.out.printf("Account data: %nId: "+ getId()+"%nName: "+ getName() +"%nBalance: "+ getBalance()+"%n").toString();

    }
}
