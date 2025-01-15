package deontap1;

import java.io.Serializable;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String type;

    public Category() {
    }
    
    public Category(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
