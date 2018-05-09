class StrNodeStack {

    private StrNode top;

    class StrNode {
        String data;
        StrNode nextNode;

        StrNode(String data) {
            this.data = data;
            nextNode = null;
        }
    }

    private StrNode newNode(String inputStr) {
        return new StrNode(inputStr);
    }

    private boolean isEmpty() {
        return top == null;
    }

    void push(String inputStr) {
        StrNode tempNode = newNode(inputStr);

        if (isEmpty()) {
            top = tempNode;
        } else {
            tempNode.nextNode = top;
            top = tempNode;
        }
    }

    String pop() {
        if (isEmpty()) {
            return null;
        } else {
            String outStr = top.data;
            StrNode oldNode = top;

            top = top.nextNode;
            oldNode.nextNode = null;

            return outStr;
        }
    }

    String peek() {
        if (isEmpty()) {
            return null;
        } else {
            return top.data;
        }
    }
}
