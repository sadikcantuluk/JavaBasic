package JDBC;

public class NorthwndSchema {
    private int CustomerId;
    private String CustomerName;
    private String City;
    private String Country;

    public NorthwndSchema(int customerId, String customerName, String city, String country) {
        CustomerId = customerId;
        CustomerName = customerName;
        City = city;
        Country = country;
    }

    @Override
    public String toString() {
        return "ID :"+this.CustomerId+" Customer Name :"+this.CustomerName+" City :"+this.City+" Country :"+this.Country;
    }
}
