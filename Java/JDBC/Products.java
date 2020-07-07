package JDBC;

public class Products {
    private int id;
    private String name;
    private int quantity_in_stock;
    private  int unit_price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(int unit_price) {
        this.unit_price = unit_price;
    }

    public int getQuantity_in_stock() {
        return quantity_in_stock;
    }

    public void setQuantity_in_stock(int quantity_in_stock) {
        this.quantity_in_stock = quantity_in_stock;
    }

    public Products(int id, String name, int quantity_in_stock, int unit_price) {
        this.id = id;
        this.name = name;
        this.quantity_in_stock = quantity_in_stock;
        this.unit_price = unit_price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity_in_stock=" + quantity_in_stock +
                ", unit_price=" + unit_price +
                '}';
    }
}
