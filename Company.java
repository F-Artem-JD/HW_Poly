import taxes.TaxSystem;

public class Company {
    private String title;
    private int debit;
    private int credit;
    private TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }


    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += Math.abs(amount);
        }
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void PayTaxes() {
        int tax = taxSystem.calcTaxFor(debit, credit);
        debit = 0;
        credit = 0;
        System.out.println("Компания " + title + " уплатила налоги в размере: " + tax + " . руб");
    }

    public int applyDeals(Deal[] deals){
        for (Deal deal: deals) {
            credit += deal.creditChange;
            debit += deal.debitChange;
        }
        int balance = debit - credit;
        PayTaxes();
        return balance;
    }
}
