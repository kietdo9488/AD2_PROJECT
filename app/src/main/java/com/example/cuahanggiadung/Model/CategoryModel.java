package com.example.cuahanggiadung.Model;

public class CategoryModel {
    private int id;
    private String category_name;
    private String category_image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getCategory_image() {
        return category_image;
    }

    public void setCategory_image(String category_image) {
        this.category_image = category_image;
    }

    public CategoryModel(int id, String category_name, String category_image) {
        this.id = id;
        this.category_name = category_name;
        this.category_image = category_image;
    }

    @Override
    public String toString() {
        return id + " : " + category_name + " : " + category_image;
    }
}
