
package entity;

import java.util.Date;


public class CEProducto {
    String skuProd;
    String nombProd;
    String descProd;
    String cateProd;
    int stocProd;
    double precProd;
    String unidProd;
    Date caduProd;
    String ubicProd;
    String trazProd;
    int entrPord;
    int saliProd;
    String codiEmpl;

    public CEProducto() {
    }

    public CEProducto(String skuProd, String nombProd, String descProd, String cateProd, int stocProd, double precProd, String unidProd, Date caduProd, String ubicProd, String trazProd, int entrPord, int saliProd, String codiEmpl) {
        this.skuProd = skuProd;
        this.nombProd = nombProd;
        this.descProd = descProd;
        this.cateProd = cateProd;
        this.stocProd = stocProd;
        this.precProd = precProd;
        this.unidProd = unidProd;
        this.caduProd = caduProd;
        this.ubicProd = ubicProd;
        this.trazProd = trazProd;
        this.entrPord = entrPord;
        this.saliProd = saliProd;
        this.codiEmpl = codiEmpl;
    }

    public String getSkuProd() {
        return skuProd;
    }

    public void setSkuProd(String skuProd) {
        this.skuProd = skuProd;
    }

    public String getNombProd() {
        return nombProd;
    }

    public void setNombProd(String nombProd) {
        this.nombProd = nombProd;
    }

    public String getDescProd() {
        return descProd;
    }

    public void setDescProd(String descProd) {
        this.descProd = descProd;
    }

    public String getCateProd() {
        return cateProd;
    }

    public void setCateProd(String cateProd) {
        this.cateProd = cateProd;
    }

    public int getStocProd() {
        return stocProd;
    }

    public void setStocProd(int stocProd) {
        this.stocProd = stocProd;
    }

    public double getPrecProd() {
        return precProd;
    }

    public void setPrecProd(double precProd) {
        this.precProd = precProd;
    }

    public String getUnidProd() {
        return unidProd;
    }

    public void setUnidProd(String unidProd) {
        this.unidProd = unidProd;
    }

    public Date getCaduProd() {
        return caduProd;
    }

    public void setCaduProd(Date caduProd) {
        this.caduProd = caduProd;
    }

    public String getUbicProd() {
        return ubicProd;
    }

    public void setUbicProd(String ubicProd) {
        this.ubicProd = ubicProd;
    }

    public String getTrazProd() {
        return trazProd;
    }

    public void setTrazProd(String trazProd) {
        this.trazProd = trazProd;
    }

    public int getEntrPord() {
        return entrPord;
    }

    public void setEntrPord(int entrPord) {
        this.entrPord = entrPord;
    }

    public int getSaliProd() {
        return saliProd;
    }

    public void setSaliProd(int saliProd) {
        this.saliProd = saliProd;
    }

    public String getCodiEmpl() {
        return codiEmpl;
    }

    public void setCodiEmpl(String codiEmpl) {
        this.codiEmpl = codiEmpl;
    }

    @Override
    public String toString() {
        return "CEProducto{" + "skuProd=" + skuProd + ", nombProd=" + nombProd + ", descProd=" + descProd + ", cateProd=" + cateProd + ", stocProd=" + stocProd + ", precProd=" + precProd + ", unidProd=" + unidProd + ", caduProd=" + caduProd + ", ubicProd=" + ubicProd + ", trazProd=" + trazProd + ", entrPord=" + entrPord + ", saliProd=" + saliProd + ", codiEmpl=" + codiEmpl + '}';
    }
    
    
    
    
}
