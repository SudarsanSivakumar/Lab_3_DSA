package main;

import java.util.Stack;

public class BalancingBrackets {
    private String input;

    public BalancingBrackets(String input) {
        this.input = input;
    }
    public void checkBalance() {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.empty()) {
                    System.out.println("The entered String has Unbalanced Brackets");
                    return;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    System.out.println("The entered String has Unbalanced Brackets");
                    return;
                }
            }
        }
        if (stack.empty()) {
            System.out.println("The entered String has Balanced Brackets");
        } else {
            System.out.println("The entered String has Unbalanced Brackets");
        }
    }
}