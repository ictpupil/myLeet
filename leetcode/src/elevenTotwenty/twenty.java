package elevenTotwenty;

import java.util.Stack;

public class twenty {

	public boolean isValid(String s) {
		Stack stack = new Stack();
        char ano = ' ';
        for(int i = 0;i<s.length();i++) {
        	if(s.charAt(i) == ')') ano = '(';
        	else if(s.charAt(i) == '}') ano = '{';
        	else if(s.charAt(i) == ']') ano = '[';
            else ano = ' ';
        	if(!stack.empty()&&(char)stack.peek() == ano) {
        		stack.pop();
        		continue;
        	}
        	stack.push(s.charAt(i));
        }
        if(stack.empty())return true;
        else return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
