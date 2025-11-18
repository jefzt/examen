public class FoodieDelivery {
    public static void main(String[] args) {

        
        GestorPedidos gestor = new GestorPedidos();

        
        PlatoComida plato1 = new PlatoComida("01", "Frisby", 30000, false);
        PlatoComida plato2 = new PlatoComida("02", "Ensalada De verduras", 19000, true);

        Bebida bebida1 = new Bebida("11", "Jugo de Naranja", 2500, 500);
        Bebida bebida2 = new Bebida("12", "Refresco", 3500, 350);

        gestor.agregarItem(plato1);
        gestor.agregarItem(plato2);
        gestor.agregarItem(bebida1);
        gestor.agregarItem(bebida2);

        System.out.println("PEDIDO FINAL");

        double total = 0;

        for (ItemMenu item : gestor.getItems()) {  
            System.out.println(item.obtenerDetalles()); 
            total += item.getPrecio();
        }

        System.out.println("TOTAL A PAGAR: $" + total);
    }
}