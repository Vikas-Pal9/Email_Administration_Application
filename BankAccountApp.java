package bankAccountApp;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) throws FileNotFoundException {

//        Checking ch1 = new Checking("Tom Willosn","321465453",1500);
//        Savings sv1 = new Savings("Richie Rich","487912429",2500);

//        sv1.compound();
//
//        sv1.showInfo();
//        System.out.println("***************");
//        ch1.showInfo();

//        sv1.deposit(5000);
//        sv1.withdraw(200);
//        sv1.transfer("Rent",3000);

        List<Account> accounts =  new LinkedList<Account>();

        String file = "C:\\Users\\2080876\\Downloads\\NewBankAccounts.csv";
        List<String[]> newAccountHolder = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolder){
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            System.out.println(name+" "+sSN+" "+ accountType+" $"+initDeposit);

            if (accountType.equals("Savings")){
                accounts.add(new Savings(name, sSN, initDeposit));
            } else if (accountType.equals("Checking")) {
                accounts.add(new Checking(name, sSN, initDeposit));
            }
            else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }
        for (Account acc : accounts) {
            System.out.println("\n*****************");
            acc.showInfo();
        }
    }
}
