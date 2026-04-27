import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class Catalog implements Iterable<Product>{
    private List<Product> products;
    public Catalog(){
        products=new ArrayList<>();
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public Iterator<Product> iterator(){
        return products.iterator();
    }
    public Product getProduct(String code){
        Iterator<Product> iterator=iterator();
        while(iterator.hasNext()){
            Product it=iterator.next();
            if(it.getCode().equals(code)) return it;
        }
        return null;
    }
    public int getNumberOfProducts(){
        return products.size();
    }
}
