public class StackNodeTest {
    public static void main(String[] args) {
        StrNodeStack strNodeStack = new StrNodeStack();

        strNodeStack.push("hello1");
        strNodeStack.push("hello2");
        strNodeStack.push("hello3");

        System.out.println(strNodeStack.pop());
        System.out.println(strNodeStack.pop());
        System.out.println(strNodeStack.pop());
        System.out.println(strNodeStack.pop());

        System.out.println(strNodeStack.peek());
    }
}
