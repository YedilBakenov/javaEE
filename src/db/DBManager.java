package db;

import java.util.ArrayList;
import java.util.HashSet;

public class DBManager {

    public static HashSet<Item> items = new HashSet<>();

    public static int id = 4;


    static {
        items.add(new Item(1, "mouse", 10000, 7.5));
        items.add(new Item(2, "noute", 100000, 8.0));
        items.add(new Item(3, "comp", 150000, 9.5));
    }

    public static HashSet<Item> getItems(){
        return items;
    }

    public static void addItem(Item item){
        item.setId(id);
        id++;
        items.add(item);
    }

    public static Item getItemById(int id){
        return items.stream().filter(s -> s.getId()==id).findFirst().orElseThrow();
    }

    public static void updateItem(Item item){
        Item itemById = items.stream().filter(s-> s.getId()==item.getId()).findFirst().orElseThrow();

        itemById.setName(item.getName());
        itemById.setPrice(item.getPrice());
        itemById.setRating(item.getRating());
        itemById.setId(item.getId());

        items.add(itemById);
    }

    public static void deleteItem(int id){
        items.removeIf(s-> s.getId()==id);
    }
}
