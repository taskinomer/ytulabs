package tr.edu.yildiz.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "category")
public class Category implements Serializable {

    @Id
    @Column(name = "CATEGORY_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer categoryId;

    @Column(name = "CATEGORY_NAME")
    private String categoryName;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
