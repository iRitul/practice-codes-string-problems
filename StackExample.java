import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        Stack<String> stackOfCards = new Stack<>();
        stackOfCards.push("Jack");
        stackOfCards.push("Queen");
        stackOfCards.push("King");
        stackOfCards.push("Ace");
        System.out.println("Stack => " + stackOfCards);
        System.out.println();
        String cardAtTop = stackOfCards.pop();
        System.out.println("Stack.pop() => " + cardAtTop);
        System.out.println("Current Stack => " + stackOfCards);
        System.out.println();
        cardAtTop = stackOfCards.peek();
        System.out.println("Stack.peek() => " + cardAtTop);
        System.out.println("Current Stack => " + stackOfCards);

    }
}