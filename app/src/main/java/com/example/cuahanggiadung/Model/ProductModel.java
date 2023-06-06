package com.example.cuahanggiadung.Model;

public class ProductModel {
    private int id , category_id;
    private Double  product_price;
    private String product_name, product_description, product_image ;

    public ProductModel(int id, int category_id, Double product_price, String product_name, String product_description, String product_image) {
        this.id = id;
        this.category_id = category_id;
        this.product_price = product_price;
        this.product_name = product_name;
        this.product_description = product_description;
        this.product_image = product_image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public Double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(Double product_price) {
        this.product_price = product_price;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public String getProduct_image() {
        return product_image;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "id=" + id +
                ", category_id=" + category_id +
                ", product_price=" + product_price +
                ", product_name='" + product_name + '\'' +
                ", product_description='" + product_description + '\'' +
                ", product_image='" + product_image + '\'' +
                '}';
    }
}
