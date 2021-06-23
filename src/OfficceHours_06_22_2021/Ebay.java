package OfficceHours_06_22_2021;

public class Ebay extends OnlineShopping implements AllowUsersToSell{
    @Override
    public void uploadProduct() {

    }

    @Override
    public void viewCart() {

    }

    @Override
    public boolean payFroShipping(double price) {
        return price < 100;
    }

    @Override
    public void buyItem() {
        System.out.println(" buying from Ebay");

    }

    @Override
    public void returnItem() {
        System.out.println("returning to Ebay");

    }
}
