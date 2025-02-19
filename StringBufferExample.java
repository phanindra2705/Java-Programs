public class StringBufferExample {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // Append text
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert text at a specific position
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        // Replace a portion of the string
        sb.replace(6, 7, " Java");
        System.out.println("After replace: " + sb);

        // Delete a portion of the string
        sb.delete(6, 11);
        System.out.println("After delete: " + sb);

        // Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Convert to String
        String finalString = sb.toString();
        System.out.println("Final String: " + finalString);
    }
}
