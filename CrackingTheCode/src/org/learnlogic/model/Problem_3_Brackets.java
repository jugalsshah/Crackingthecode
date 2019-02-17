package org.learnlogic.model;

import java.util.Stack;

public class Problem_3_Brackets {

	/**
	 * Method to determine whether the string matching closing bracket or not
	 * 1) ")[](" return false
	 * 2) "[(){()}]" return true
	 */
    public static boolean isBalanced(String s) { 
    	
	    if (s.isEmpty()){
	    	return true;
	    }
	
	    Stack<Character> stack = new Stack<Character>();
	    for (int i = 0; i < s.length(); i++){
	        char curr = s.charAt(i);
	        if (curr == '{' || curr == '(' || curr == '['){
	            stack.push(curr);
	        }
	
	        if (curr == '}' || curr == ')' || curr == ']'){
	            if (stack.isEmpty()){
	            	return false;
	            }
	            char last = stack.peek();
	            if (curr == '}' && last == '{' || curr == ')' && last == '(' || curr == ']'
	            		&& last == '['){
	            	stack.pop();
	            }               
	            else{
	            	return false;
	            } 
	        }
	    }
	    return stack.isEmpty();
    }
}
