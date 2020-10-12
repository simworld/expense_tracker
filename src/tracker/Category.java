package tracker;
import java.util.*;
import java.io.*;


public class Category {

    private Long categoryId = System.currentTimeMillis();
    private String name;

    public Category() {
        super();
    }

    public Category(String name){
        this.name = name;
    }
    public Category(Long categoryId, String name){
        this.categoryId = categoryId;
        this.name = name;
    }


    public Long getCategoryId() {
        return categoryId;
    }

    public String getName() {
        return name;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setName(String name) {
        this.name = name;
    }
}
