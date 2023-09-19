public class Bag {
    
    private int[] things;
    private int count; // Number of items in the bag
    private int max;   // Maximum number of items the bag can hold
 
    public Bag(int maxSize) {
        this.things = new int[maxSize];
        this.count = 0;
        this.max = maxSize;
    }
 
    public boolean add(int thing) {
        if (count >= max) {
            return false; // Bag is full
        }
        things[count++] = thing;
        return true;
    }
 
    public int getCount() {
        return count;
    }
 
    public boolean isFull() {
        return count == max;
    }
 
    public boolean isEmpty() {
        return count == 0;
    }
 
    public boolean remove(int thing) {
        for (int i = 0; i < count; i++) {
            if (things[i] == thing) {
                // Shift the elements to the left after removing the item
                for (int j = i; j < count - 1; j++) {
                    things[j] = things[j + 1];
                }
                count--;
                return true; // Item was found and removed
            }
        }
        return false; // Item not found
    }
 
    public int[] getAll() {
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = things[i];
        }
        return result;
    }
 
    public boolean find(int thing) {
        for (int i = 0; i < count; i++) {
            if (things[i] == thing) {
                return true;
            }
        }
        return false;
    }
 
    public int count(int thing) {
        int counter = 0;
        for (int i = 0; i < count; i++) {
            if (things[i] == thing) {
                counter++;
            }
        }
        return counter;
    }
 
    public boolean removeAll() {
        count = 0;
        return true;
    }
 
    public static void main(String[] args) {
        // Sample usage of Bag
        Bag myBag = new Bag(10);
        myBag.add(5);
        myBag.add(10);
        System.out.println("Is bag full? " + myBag.isFull());
        System.out.println("Number of items in bag: " + myBag.getCount());
        System.out.println("Is 5 in the bag? " + myBag.find(5));
    }
 }
 