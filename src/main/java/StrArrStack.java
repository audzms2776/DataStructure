class StrArrStack {

    private String[] stackArray;
    private int maxSize;
    private int top = -1;

    StrArrStack(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new String[maxSize];
    }

    // 비어 있는 지 확인
    boolean isEmpty() {
        return top == -1;
    }

    // push 입력값을 리스트에 넣음
    // maxSize보다 크면 넣으면 안됨
    void push(String inputStr) {
        System.out.println("push");
        if (top + 1 < maxSize) {
            ++top;
            stackArray[top] = inputStr;
        } else {
            System.out.println("입력값 " + inputStr + " 최대 사이즈 초과");
        }
    }

    // pop함
    // 아무것도 없으면 내보낼 것이 없음
    String pop() {
        System.out.println("pop");
        String tempOut = "";

        if (!isEmpty()) {
            tempOut = stackArray[top];

            stackArray[top] = "";

            --top;
        } else {
            System.out.println("pop 없습니다");
        }

        return tempOut;
    }

    // pop이랑 같은데 내보내지는 않음
    String peek() {
        if (!isEmpty()) {
            System.out.println("peek");
            return stackArray[top];
        } else {
            return "";
        }
    }
}
