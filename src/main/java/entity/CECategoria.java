
package entity;

public class CECategoria {
    String codiCate;
    String nombCate;

    public String getCodiCate() {
        return codiCate;
    }

    public void setCodiCate(String codiCate) {
        this.codiCate = codiCate;
    }

    public String getNombCate() {
        return nombCate;
    }

    public void setNombCate(String nombCate) {
        this.nombCate = nombCate;
    }

    @Override
    public String toString() {
        return "CECategoria{" + "codiCate=" + codiCate + ", nombCate=" + nombCate + '}';
    }
   
}
