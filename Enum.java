enum Operation {
    ADD {
        @Override
        public int apply(int a, int b) {
            return a + b;
        }
    },
    SUBTRACT {
        @Override
        public int apply(int a, int b) {
            return a - b;
        }
    },
    MULTIPLY {
        @Override
        public int apply(int a, int b) {
            return a * b;
        }
    },
    DIVIDE {
        @Override
        public int apply(int a, int b) {
            return a / b;
        }
    };

    // Abstract method
    public abstract int apply(int a, int b);
}

public class Enum {
    public static void main(String[] args) {
        int a = 10, b = 5;

        for (Operation op : Operation.values()) {
            System.out.println(op + ": " + op.apply(a, b));
        }
    }
}
