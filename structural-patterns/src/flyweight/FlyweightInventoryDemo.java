package flyweight;

public class FlyweightInventoryDemo {
    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();

        inventorySystem.takeOrder("Roomba", 221);
        inventorySystem.takeOrder("Base headphone", 361);
        inventorySystem.takeOrder("Samsung TV", 432);
        inventorySystem.takeOrder("Samsung TV", 323);
        inventorySystem.takeOrder("Base headphone", 321);
        inventorySystem.takeOrder("Roomba", 234);
        inventorySystem.takeOrder("Samsung TV", 54);
        inventorySystem.takeOrder("Roomba", 34);
        inventorySystem.takeOrder("Bse headphones", 365);
        inventorySystem.takeOrder("Samsung TV", 332);
        inventorySystem.takeOrder("Roomba", 456);

        inventorySystem.process();

        System.out.println(inventorySystem.report());
    }
}
