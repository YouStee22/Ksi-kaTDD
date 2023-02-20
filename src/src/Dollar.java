//class Dollar extends Money{
//
//    private String currency;
//    public Dollar(int amount, String currency) {
//       super(amount, currency);
//    }
//    static Money dollar (int amount){
//        return new Money(amount, "USD");
//    }
//}



//class Franc extends Money{
//
//    private String currency;
//    public Franc(int amount, String currency) {
//        super(amount, currency);
//    }
//    static Money franc (int amount){
//        return new Franc(amount, "USD");
//    }
//}




 class Money {

    public Money (int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    protected int amount;
    protected String currency;
    String currency() {
        return currency;
    }
    public String toString() {
        return amount + " " + currency;
    }
    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);

    }
    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }
    static Money franc(int amount) {
        return new Money(amount, "CHF");

    }
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && currency().equals(money.currency());
    }
}
