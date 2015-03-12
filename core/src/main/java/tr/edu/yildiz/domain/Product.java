package tr.edu.yildiz.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "product")
public class Product implements Serializable{

    @Id
    @Column(name = "PRODUCT_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer productId;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "PRODUCT_DESCRIPTION")
    private String productDescription;

    @Column(name = "IDATE")
    private Date idate;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID", referencedColumnName = "MEMBER_ID")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID", referencedColumnName = "CATEGORY_ID")
    private Category category;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Date getIdate() {
        return idate;
    }

    public void setIdate(Date idate) {
        this.idate = idate;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
