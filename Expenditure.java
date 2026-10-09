public class Expenditure extends Deal {

        String title;
        int price;

        public Expenditure (String title, int price){
            super("Продажа " + title + " на " + price + " руб.", price, 0);
        }
    }
