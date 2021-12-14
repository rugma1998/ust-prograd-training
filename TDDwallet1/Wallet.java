public class Wallet {

private final double DOLLARTORUPEES= 74.85;
private double balance=0;
private String preferredCurrency;
public double getBalance(){
    if(preferredCurrency=="USD"){
        return balance;
    }
    else if(preferredCurrency=="INR")
    {
        return dollarsToRupees(balance);
    }
    return balance;

}
public String getPreferredCurrency(){
    return preferredCurrency;
}
public void setPreferredCurrency(String preferredCurrency){
    if(preferredCurrency=="USD" || preferredCurrency=="INR"){
        this.preferredCurrency=preferredCurrency;
    }
    else throw new IllegalArgumentException("Make sure that the preferred currency is valid");
}
    Wallet() {
        setPreferredCurrency("INR");
    }

    Wallet(String preferredCurrency) {
        setPreferredCurrency(preferredCurrency);
    }


    public void withdraw(double amount) throws InsufficientFundsException {
        withdraw(amount, preferredCurrency);
    }

    public void withdraw(double amount, String currency) throws InsufficientFundsException {
        if (amount < 0) {
            throw new IllegalArgumentException("withdrawal amount cannot be negative");
        }

        switch (currency) {
            case "INR": withdrawINR(amount); break;
            case "USD": withdrawUSD(amount); break;
        }
    }

    public void withdrawINR(double amount) throws InsufficientFundsException {
        double amountInUSD = this.rupeesToDollars(amount); // INR -> USD
        withdrawUSD(amountInUSD);
    }

    public void withdrawUSD(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("withdrawal amount cannot be greater than balance");
        }
        balance -= amount;
    }


    public void deposit(double amount) {
        deposit(amount, preferredCurrency);
    }

    public void deposit(double amount, String currency) {
        if (amount < 0) { throw new IllegalArgumentException("deposit amount cannot be negative"); }

        switch (currency) {
            case "INR": depositINR(amount); break;
            case "USD": depositUSD(amount); break;
        }
    }

    public void depositINR(double amount) {
        double amountInUSD = this.rupeesToDollars(amount); // INR -> USD
        depositUSD(amountInUSD);
    }

    public void depositUSD(double amount) {
        balance += amount;
    }


    public double rupeesToDollars(double rupees) {
        return rupees / DOLLARTORUPEES;
    }

    public double dollarsToRupees(double dollars) {
        return dollars * DOLLARTORUPEES;
    }

    public double round(double value) {
        return (double) Math.round(value * 100) / 100;
    }
    public class InsufficientFundsException extends Exception{
        InsufficientFundsException() {
            super("Insufficient Funds");
        }

        public InsufficientFundsException(String message) {
            super(message);
        }
    }
}

//    public double rupeeToDollar(double amountInRupee){
//        return amountInRupee/74.85;
//    }
//    public double dollarToRupee(double amountInDollar){
//        return amountInDollar*74.85;
//    }
//    public double rupeeToRupee(double amountInRupee){
//
//        return amountInRupee;
//    }
//    public double dollarToDollar(double amountInDollar){
//
//        return amountInDollar;
//    }
//
//}
