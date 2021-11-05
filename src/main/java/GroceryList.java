public class GroceryList {
    private final String[] arr;

    // Creates a new empty Grocery List of size 10
    // Remember to create the array!
    // You don't need to change any of the values in the array
    public GroceryList() {
        this.arr = new String[10];
    }

    // Adds an item to the grocery list
    public void add(String item) {
        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] == null) {
                this.arr[i] = item;
                break;
            }
        }
    }

    // Removes an item from the grocery list
    // Replaces the item with null
    // Remember to shift anything to the left if necessary
    public void remove(String item) {
        int i = 0;
        int j = 0;
        for (; j < this.arr.length; i++, j++) {
            if ((this.arr[i] = this.arr[j]) != null && (this.arr[i] = this.arr[j]).equals(item)) {
                i--;
            }
        }
        while (i < j) {
            this.arr[i++] = null;
        }
    }

    // Returns a String representation the grocery list
    // The String should start with "Grocery List:" and
    // contain each non-null value separated by a comma
    // For instance, the string should look something like:
    // Grocery List: eggs, milk, oranges

    // You **may** have an extra comma at the end
    @Override
    public String toString() {
        String x = "";
        for (String i : this.arr) {
            if (i != null) {
                x += i + ", ";
            }
        }
        return "Grocery List: " + x;
    }
}
