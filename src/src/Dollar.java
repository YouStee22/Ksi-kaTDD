class Dollar extends Money{

    private String currency;                                    //dodane od 9
    public Dollar(int amount, String currency) {
       super(amount, currency);                                      //dodane 9
    }
    public Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }
}



class Franc extends Money{
    private String currency;                                    //dodane od 9

    public Franc(int amount, String currency) {
        super(amount, currency);                                      //dodane od 9
    }
    public Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }
}




abstract class Money {

    public Money (int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    protected int amount;
    protected String currency;                                   //dodane od 9 rozdzilu
    abstract Money times(int multipliter);                          //to wgl potrzebne?

    String currency() {
        return currency;
    }

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }
    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }
}
