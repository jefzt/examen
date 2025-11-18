import java.util.ArrayList;

public class GestorPedidos {
    private ArrayList<ItemMenu> items;

    public GestorPedidos() {
        items = new ArrayList<>();
    }

    public void agregarItem(ItemMenu item) {
        items.add(item);
    }

    public ArrayList<ItemMenu> getItems() {
        return items;
    }
}