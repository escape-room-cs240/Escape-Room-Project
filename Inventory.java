import java.util.LinkedList;

public class Inventory {

    LinkedList<Item> inventory = new LinkedList<Item>();
    String name;

    Inventory(){}

    public boolean isEmpty() {
        return (inventory.size() == 0);
    }

    public void add(Item item){
        inventory.add(item);
    }

    public void remove(Item item){
        inventory.remove(item);
    }

    public void clear(){
        inventory.clear();
    }

    public String toString(){
        return inventory.toString();
    }
    
    public String view(Item item){
        return item.getDescription;
    }


}
