package Day0616.generics;

public class Main {
    public static void main(String[] args) {
        String myWord = "Hello";
        Container<String> wordContainer = new Container<>(myWord);
        System.out.println("Word Container Data: "+ wordContainer.getData());
    }
}
