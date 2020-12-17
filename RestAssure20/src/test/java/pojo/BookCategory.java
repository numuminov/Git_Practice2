package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookCategory {


@JsonProperty("id")
    private String category_id;


    @JsonProperty("name")
    private String name ;

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BookCategory{" +
                "id='" + category_id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}