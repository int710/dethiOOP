package deontap1;

import java.io.Serializable;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class Book implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String authors;
    private String title;
    private Category category;

    public Book() {
    }
     
    public Book(String id, String authors, String title, Category category) {
        this.id = id;
        this.authors = authors;
        this.title = title;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }
    
    public void setCategory(Category ctg) {
        if (ctg.getType().equalsIgnoreCase("tạp chí") || 
            ctg.getType().equalsIgnoreCase("KHXH") ||
            ctg.getType().equalsIgnoreCase("KHTN") ||
            ctg.getType().equalsIgnoreCase("luận văn")) {
            this.category = ctg;
        } else {
            System.out.println("Lỗi !, Vui lòng kiểm tra lại category chỉ nhận giá trị tạp chí, KHXH, KHTN, luận văn");
        }
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", authors=" + authors + ", title=" + title + ", category=" + category + '}';
    }
    
    
}
