import taxes.IncomeMinusExpenses;
import taxes.SimplifiedTaxationSystem;

public class Main {
    public static void main(String[] args){

        Company company1 = new Company("FATMAK", new SimplifiedTaxationSystem());
        company1.shiftMoney(100000);
        company1.shiftMoney(-20000);
        company1.PayTaxes();

        company1.setTaxSystem(new IncomeMinusExpenses());
        company1.shiftMoney(100000);
        company1.shiftMoney(-20000);
        company1.PayTaxes();

        Deal[] deals = {
                new Sale("Ноутбук", 100_000),
                new Sale("Компьютер", 150_000),
                new Expenditure("USB-USB", 1_000),
                new Expenditure("PS5", 80_000)
        };

        company1.applyDeals(deals);


    }
}