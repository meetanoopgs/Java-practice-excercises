public class stringBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("GeeksforGeeks");
        System.out.println("Initial: " + sb);

        sb.append(" is awesome!");
        System.out.println("After append: " + sb);

        sb.insert(13, " Java");
        System.out.println("After insert: " + sb);
    }
}
