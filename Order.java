import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class Order implements Iterable<OrderItem> {
    private List<OrderItem> items;

    public Order(){
        items=new ArrayList<OrderItem>();
    }

    public void addItem(OrderItem orderitem){
        items.add(orderitem);
    }

    public void removeItem(OrderItem orderitem){
        Iterator<OrderItem> iterator=iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals(orderitem)){
                iterator.remove();
            }
        }
    }

    public Iterator<OrderItem> iterator(){
        return items.iterator();
    }

    public OrderItem getItem(Product product){
        Iterator<OrderItem> iterator=iterator();
        while(iterator.hasNext()){
            OrderItem it =iterator.next();
            if(it.getProduct().equals(product)){
                return it;
            }
        }
        return null;
    }


    public int getNumberOfItems(){
        return items.size();
    }

    public double getTotalCost (){
        double sum=0;
        Iterator<OrderItem> iterator=iterator();
        while(iterator.hasNext()){
            sum+=iterator.next().getValue();
        }
        return sum;
    }
}
