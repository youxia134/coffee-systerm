public class OrderItem {
    private Product product;
    private int quantity;
    public OrderItem(Product initialProduct,int initialQuantity){
        this.quantity=initialQuantity;
        this.product=initialProduct;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }
    public double getValue(){
        return quantity*product.getPrice();
    }
    public String toString(){
        return quantity+" "+product.getCode()+" "+product.getPrice();
    }
}
