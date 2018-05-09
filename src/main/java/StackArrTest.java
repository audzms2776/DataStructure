public class StackArrTest {
    public static void main(String args[]) {

        StrArrStack strArrStack = new StrArrStack(5);

        strArrStack.push("hello");
        strArrStack.push("hello2");
        strArrStack.push("hello3");
        strArrStack.push("hello4");
        strArrStack.push("hello5");

        System.out.println(strArrStack.pop());
        strArrStack.push("hello6");
        System.out.println(strArrStack.pop());
        strArrStack.push("hello6");
        System.out.println(strArrStack.pop());
        System.out.println(strArrStack.pop());

        System.out.println(strArrStack.peek());
        System.out.println(strArrStack.peek());
        System.out.println(strArrStack.isEmpty());

    }
}
