

package entity;

import java.util.Date;


public class History {
    private Product product;
    private Reader reader;
    private Date takeOnProduct;
    private Date returnProduct;

    public History() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Reader getClient() {
        return reader;
    }

    public void setClient(Reader reader) {
        this.reader = reader;
    }

    public Date getTakeOnProduct() {
        return takeOnProduct;
    }

    public void setTakeOnProduct(Date takeOnProduct) {
        this.takeOnProduct = takeOnProduct;
    }

    public Date getReturnProduct() {
        return returnProduct;
    }

    public void setReturnProduct(Date returnProduct) {
        this.returnProduct = returnProduct;
    }

    @Override
    public String toString() {
        return "History{" + "product=" + product + ", client=" + reader + ", takeOnProduct=" + takeOnProduct + ", returnProduct=" + returnProduct + '}';
    }
}
