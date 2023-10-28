package week_09.assigments;

public class TestStock {
    public static void main(String[] args) {
        Stock stock1 = new Stock("ORCL" , "Oracle Corporation");
        stock1.setPreviousClosingPrice(34.5);
        stock1.setCurrentPrice(34.35);
        System.out.println("Stock name  :" + stock1.name);
        System.out.println("Stock symbol:" + stock1.symbol);
        System.out.println("Price-change percentage: " + stock1.getChangePercent());

    }
}
