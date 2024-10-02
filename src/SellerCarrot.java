import java.time.LocalDate;

public class SellerCarrot {
    private LocalDate birthday;
    private int contract;
    private int soldCarrot;
    private String cityName;
    private String registrationNumber;
    private Double fuelEconomy;
    private String name;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
