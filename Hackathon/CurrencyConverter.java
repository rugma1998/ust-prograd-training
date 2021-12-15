public class CurrencyConverter {
    public double rupeesToDollar(double moneyInRupees) {
        return moneyInRupees/74.85;
    }
    public double dollarToRupees(double moneyInDollar){
        return moneyInDollar*74.85;
    }
    public double rupeesToAustralianDollar(double moneyInRupees){
        return moneyInRupees*54.04;
    }
    public double australianDollarToRupees(double moneyInAustralianDollar){
        return moneyInAustralianDollar/54.04;
    }
    public double rupeesToCanadianDollar(double moneyInRupees){
        return moneyInRupees*59.18;
    }
    public double canadianDollarToRupees(double moneyInCanadianDollar){
        return moneyInCanadianDollar/59.18;
    }
    public double japaneseYenToRupees(double moneyInJapaneseYen) {
        return moneyInJapaneseYen*0.67;
    }
}