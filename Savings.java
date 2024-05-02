package bankAccountApp;

public class Savings extends Account{

    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }
    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }
    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random()*Math.pow(10,3));
        safetyDepositBoxKey = (int) (Math.random()*Math.pow(10,4));
    }
    public void showInfo() {
        super.showInfo();
        System.out.println(" Your Savings Account features" +
                "\n Safety Deposit Box ID: "+safetyDepositBoxID+
                "\n Safety Deposit Box Key: "+safetyDepositBoxKey);
    }

}