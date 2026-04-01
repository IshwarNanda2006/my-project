public class HelloWorld4 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello World");
        } else {
            String result = "Hello ";

            for (int i = 0; i < args.length; i++) {
                result += args[i] + " ";
            }

            System.out.println(result.trim());
        }
    }
}
