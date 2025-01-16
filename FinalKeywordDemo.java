// Final keyword demonstration
public class FinalKeywordDemo {

    // Final variable: its value cannot be changed once assigned
    final int MAX_VALUE = 100;

    // Final method: cannot be overridden by child classes
    public final void displayFinalMessage() {
        System.out.println("This is a final method. It cannot be overridden.");
    }

    public void showValue() {
        System.out.println("Final variable MAX_VALUE: " + MAX_VALUE);
    }

    // Main method
    public static void main(String[] args) {
        FinalKeywordDemo demo = new FinalKeywordDemo();
        demo.showValue();
        demo.displayFinalMessage();

        
    }
}

// Final class: cannot be extended
final class FinalClass {
    public void show() {
        System.out.println("This is a final class. It cannot be extended.");
    }
}


