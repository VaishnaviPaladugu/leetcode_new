package com.vaishnavi.study.dsAndAlgo.Stacks;

import com.vaishnavi.study.dsAndAlgo.Queue.MyQueue;

public class Main {
    public static void main(String args[]) {
//        Stack myStack = new Stack(2);
//        myStack.push(1);
//
//        // (2) Items - Returns 1 Node
//        System.out.println(myStack.pop().value);
//        // (1) Item - Returns 2 Node
//        System.out.println(myStack.pop().value);
//        // (0) Items - Returns null
//        System.out.println(myStack.pop());
//
//        StackArrayList myList = new StackArrayList();
//        myList.push(4);
//        myList.push('c');
//        myList.push("devil");
//        myList.printStack();
//        System.out.println("______________________________");
//        myList.pop();
//        myList.printStack();
//        myList.push("devil");
//        myList.printStack();

//

        testAndPrint("()", true);
        testAndPrint("()()", true);
        testAndPrint("(())", true);
        testAndPrint("()()()", true);
        testAndPrint("(()())", true);
        testAndPrint(")()(", false);
        testAndPrint(")(", false);
        testAndPrint("(()", false);
        testAndPrint("))", false);
        testAndPrint("(", false);
        testAndPrint(")", false);

        StackArrayList<Integer> stack = new StackArrayList<>();
        stack.push(6);
        stack.push(1);
        stack.push(8);
        stack.push(2);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();

        MyQueue queue = new MyQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println("Dequeued element:" +queue.dequeue());
        System.out.println("Dequeued element:" +queue.dequeue());
        System.out.println("Dequeued element:" +queue.dequeue());
        System.out.println("Dequeued element:" +queue.dequeue());
        System.out.println("Dequeued element:" +queue.dequeue());
    }

    private static void sortStack(StackArrayList<Integer> stack) {
        if(stack.isEmpty()) return;
        StackArrayList<Integer> stack2 = new StackArrayList<Integer>();
        int curr;
        stack2.push(stack.pop());
        while(!stack.isEmpty()) {
            if(stack.peek() >= stack2.peek()) {
                stack2.push(stack.pop());
                continue;
            }
            curr = stack.pop();
            while(!stack2.isEmpty()) {
                if (curr >= stack2.peek()) break;
                stack.push(stack2.pop());
            }
            stack2.push(curr);
        }
        while (!stack2.isEmpty()) {
            stack.push(stack2.pop());
        }
    }

    public static void testAndPrint(String testStr, boolean expected) {
        // Run the test and store the result
        boolean result = isBalancedParentheses(testStr);

        // Print the test string, expected result, and actual result
        System.out.println("Test String: " + testStr);
        System.out.println("EXPECTED: " + expected);
        System.out.println("RESULT: " + result);

        // Check if the test passed or failed
        if (result == expected) {
            System.out.println("STATUS: PASS");
        } else {
            System.out.println("STATUS: FAIL");
        }

        // Print a separator for better readability
        System.out.println("--------------");
    }

    private static boolean isBalancedParentheses(String testStr) {
        if(testStr.isEmpty())
            return false;
        StackArrayList<Character> list = new StackArrayList<>();
        for(int i = 0 ; i < testStr.length() ; i++) {
            if(testStr.charAt(i) == '(')
            {
                list.push('(');
            }
            if(testStr.charAt(i) == ')') {
                if(list.isEmpty()) {
                    return false;
                }
                if(list.peek() == '(') {
                    list.pop();
                }
            }
        }
        if (list.size() > 0) {
            return false;
        }
        return true;
    }

    private static String reverseString(String myString) {
        if(myString.length() == 0)
            return null;
        StackArrayList<Character> list = new StackArrayList<Character>();
        for(int i = 0 ; i < myString.length() ; i++) {
            list.push(myString.charAt(i));
        }
        StringBuilder output = new StringBuilder();
        while(!list.isEmpty()) {
            output.append(list.pop());
        }
        return output.toString();
    }





}
