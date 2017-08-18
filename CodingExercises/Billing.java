public class Billing {
    final double taxCost = 0.08;
    public double billing(int priceOfBook){
        double tax = priceOfBook * taxCost;
        double totalCost = priceOfBook + tax;
        return totalCost;

    }

    public double billing(int priceOfBook, double quantity){
        double bookCost = quantity * priceOfBook;
        double tax = bookCost * taxCost;
        double totalCost = bookCost + tax;
        return totalCost;

    }

    public double billing(int priceOfBook, double quantity, int couponValue){
        double bookCost = quantity * priceOfBook;
        double discount = ((bookCost * couponValue)) /100;
        double totalBookCost = bookCost - discount;
        double tax = totalBookCost * taxCost;
        double totalCost = totalBookCost + tax;
        return totalCost;


    }

    public static void main(String[] args) {
        Billing obj = new Billing();
        System.out.println (obj.billing(20));
        System.out.println (obj.billing(20,10));
        System.out.println (obj.billing(20,10,50));


    }
}
