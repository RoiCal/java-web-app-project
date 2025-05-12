package il.ac.hit.costmanager;

import java.time.LocalDate;
import java.util.Date;

public class CostItem {

    private String description;
    private float cost;
    private String currency;
    private Category category;
    private LocalDate date;

    public CostItem(Category category, String description, float cost, String currency, Date date) {
        setCategory(category);
        setDescription(description);
        setCost(cost);
        setCurrency(currency);
        setDate(LocalDate.now());
    }

    public CostItem(String description) {
        setDescription(description);
    }


    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDate getDate() {
        return date;
    }
}
