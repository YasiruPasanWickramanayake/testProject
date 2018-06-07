package model;

public class News {
    //private int id;
    private String title;
    private String date;
    private String description;
    private String details;
    private String catagory;
    private String image;

    public News(String title, String date, String description, String details, String catagory, String image) {
        //this.id = id;
        this.title = title;
        this.date = date;
        this.description = description;
        this.details = details;
        this.catagory = catagory;
        this.image = image;
    }

    

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getDetails() {
        return details;
    }

    public String getCatagory() {
        return catagory;
    }

    public String getImage() {
        return image;
    }
    
    
}
