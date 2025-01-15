
package deontap2;

/**
 *
 * @author Bùi Thanh Quân - int710 - CT070242
 */
public class Word {
    private int id;
    private String en;
    private String vn;

    public Word() {
    }

    public Word(int id, String en, String vn) {
        this.id = id;
        this.en = en;
        this.vn = vn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getVn() {
        return vn;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }

    public void display() {
        System.out.println("ID: " + id + " | English: " + en + " | Vietnamese: " + vn);
    }
    
}
