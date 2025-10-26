public class Account {
    private String id;
    private String name;
    private int balance=0;

    public Account(String id, String name){
        this.id=id;
        this.name=name;
    }
    public Account (String id , String name,int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public int credit(int amount){
        if (amount > 0) {
            balance=balance+amount;
            return balance;
        }
        else
            return balance;

    }

    public int debit (int amount){
        if (balance>=amount&&amount>0){
            balance=balance-amount;
            return balance;
        }
        else {
            return balance;
        }
    }
    public int transferTo(Account another,int amount){
        if (balance>=amount&&amount>0){
           balance= balance -amount;
           another.balance=another.balance+amount;
           return balance;
        }
        else{
            return balance;
        }
    }


   public String toString (){
         return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
   }

}
