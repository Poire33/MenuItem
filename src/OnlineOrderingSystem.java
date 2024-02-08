public class OnlineOrderingSystem {
    public static void main(String[] args) {
        // Create an array or list of MenuItem objects
        MenuItem[] menuItems = new MenuItem[] {
            new Burger("Chicken burger", 12, "Bun, chicken, cheese, tomato, BBQ sauce"),
            new Pizza("Pizza 4 fromages", 16, "Mozzarella, Brie, Maroilles, Bleu de Bresse"),
            new Salad("Salmon tartar salad", 9.5, "Rice, salmon, tomato"),
            new Bread("Baguette aux graines", 1.3, "Flour, yeast, salt")
        };


        // Display details of each new item
        for (MenuItem menuItem : menuItems) {
            // Print out the name, description, and price for each item

            System.out.println("Name: " + menuItem.getName());
            System.out.println("Price: €" + menuItem.getPrice());
            System.out.println("Description: " + menuItem.getDescription());
            System.out.println();
        }

        // Calculate and display the total cost of the order
        double totalCost = 0;
        for (MenuItem menuItem : menuItems) {
            totalCost = totalCost + menuItem.getPrice();
        }
        System.out.println("Total Cost: €" + totalCost);
    }
}
