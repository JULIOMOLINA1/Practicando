package Account;
import java.util.ArrayList;
import java.util.List;
class Account {
    private String accountName;
    private String accountHolder;
    private String accountNumber;

    Account(String accountName, String accountHolder, String accountNumber){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public String getData() {
        return "Bank: " + accountName +
                ", Holder: " + accountHolder +
                ", Number: " + accountNumber;
    }
}
class Main {
    public static void main(String[] args) {
        List<Account> accountList = new ArrayList<>();

        accountList.add(new Account("BDO", "Jenifer Alvez", "001-237-9900"));
        accountList.add(new Account("BPI", "John Ronel", "001-247-9982"));
        accountList.add(new Account("JPMC", "Ross Geller", "001-239-9920"));
        accountList.add(new Account("BDO", "Jenifer Adriana", "001-217-9980"));

        for(Account account : accountList){
            System.out.println(account.getData());
        }
    }
}
