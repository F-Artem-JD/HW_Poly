package taxes;

public class IncomeMinusExpenses extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int profit = debit - credit;
        int tax = profit * 15 / 100;

        if (tax < 0) {
            return 0;
        }

        return tax;
    }
}
