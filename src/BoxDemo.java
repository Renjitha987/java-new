class Box {
    // Instance variables (data/state)
    double length;
    double width;
    double height;

    // Constructor
    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    // Method to calculate volume
    double calculateVolume() {
        return length * width * height;
    }

    // Method to display box details
    void display() {
        System.out.println("Length : " + length);
        System.out.println("Width  : " + width);
        System.out.println("Height : " + height);
        System.out.println("Volume : " + calculateVolume());
    }
}


// Main class
public class BoxDemo {
    public static void main(String[] args) {

        // Creating objects
        Box box1 = new Box(10, 5, 4);
        Box box2 = new Box(6, 3, 2);

        // Calling methods
        System.out.println("Box 1 Details");
        box1.display();

        System.out.println("\nBox 2 Details");
        box2.display();
    }
}
