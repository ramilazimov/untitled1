package OfficceHours_06_15_2021;

public class Email { final String ADDRESS;
    int numberOfEmail;
    static String domain;

    static {
        domain = "generic";
    }

    public Email(String address, int numberOfEmail){
        this.ADDRESS = address;
        this.numberOfEmail = numberOfEmail;
    }

    @Override
    public String toString() {
        return "Email{" +
                "Address='" + ADDRESS + '\'' +
                ", numberOfEmail=" + numberOfEmail +
                ", domain=" + domain +
                '}';
    }
}
