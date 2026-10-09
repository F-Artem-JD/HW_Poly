package taxes;

public class SimplifiedTaxationSystem extends TaxSystem {

    @Override
    public int calcTaxFor(int debit, int credit) {
        int tax = debit * 6 / 100;
        if (tax < 0) {
            return 0;
        }
        return tax;
    }
}
