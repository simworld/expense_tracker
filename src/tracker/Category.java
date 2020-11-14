package tracker;
import java.util.*;
import java.io.*;


public class Category {
    UUID categoryId = java.util.UUID.randomUUID();
    private String name;

    public Category() {
        super();
    }

    public Category(String name){
        this.name = name;
    }


    public Category(UUID categoryId, String name) {
        this.categoryId = categoryId;
        this.name = name;
    }

    public UUID getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(UUID categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

}
