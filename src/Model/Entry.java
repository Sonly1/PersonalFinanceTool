package model;

public class Entry {
    private String description;
    private double amount;
    private String category;
    private String date;

    public Entry(String description, double amount, String category, String date) {
        this.description = description;
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    // Getters and setters

    @Override
    public String toString() {
        return "Entry{" +
                "description='" + description + '\'' +
                ", amount=" + amount +
                ", category='" + category + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}

