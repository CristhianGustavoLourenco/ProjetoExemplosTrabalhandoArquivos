/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author crist
 */
public class Product {
    private String name;
    private Double value;
    private Integer quantity;

    public Product() {
    }

    public Product(String name, Double value, Integer quantity) {
        this.name = name;
        this.value = value;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Double getValue() {
        return value;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    public double total(){
        
        return value * quantity;
    }
}
