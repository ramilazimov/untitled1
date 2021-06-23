package OfficceHours_06_22_2021;

public class Amazon extends OnlineShopping implements AllowUsersToSell{
    @Override
    public void uploadProduct() {

    }

    @Override
    public void viewCart() {

    }

    @Override
    public boolean payFroShipping(double price) {
        return price < 50;
    }

    @Override
    public void buyItem() {

    }

    @Override
    public void returnItem() {

    }

}
