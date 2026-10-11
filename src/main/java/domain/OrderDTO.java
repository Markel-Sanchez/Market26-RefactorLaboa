package domain;

public class OrderDTO { 
    public String description; 
    public String title; 
    public float priceMin; 
    public float priceMax; 
     
    public OrderDTO(String description, String title, float priceMin, float priceMax) { 
        this.description = description; 
        this.title = title; 
        this.priceMin = priceMin; 
        this.priceMax = priceMax; 
    } 
}
