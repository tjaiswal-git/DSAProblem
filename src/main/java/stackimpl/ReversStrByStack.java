package stackimpl;

import java.util.Stack;

public class ReversStrByStack {

    private String revString(String actualStr)
    {
        Stack<Character> stack = new Stack<>();
        char[] chars = actualStr.toCharArray();
        for(char c:chars)
        {
            stack.push(c);
        }
        for(int i = 0;i<actualStr.length();i++)
        {
            chars[i] = stack.pop();
        }
        return new String(chars);
    }
    public static void main(String args[])
    {
        ReversStrByStack reversStrByStack = new ReversStrByStack();
        System.out.println(reversStrByStack.revString("tarun"));
    }
}
