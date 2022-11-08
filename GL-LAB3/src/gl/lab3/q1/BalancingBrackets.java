package gl.lab3.q1;

import java.util.*;   

  
public class BalancingBrackets{   
   
 
 public static boolean balancedParenthesis(String inputStr) {   
       
  
     Stack stack = new Stack();   
       
    
     char[] charArray = inputStr.toCharArray();   
       
    
     for (int i = 0; i < charArray.length; i++) {   
           
   
         char current = charArray[i];   
           
        
         if (current == '{' || current == '[' || current == '(') {   
             // push current to stack   
             stack.push(current);   
             continue;   
         }   
         
         if (stack.isEmpty()) {    
             return false;   
         }   
           
        
         char popChar;   
         switch (current) {   
             case ')':   
             popChar = (char) stack.pop();   
             if (popChar == '{' || popChar == '[')   
                 return false;   
             break;   
             case '}':   
             popChar = (char) stack.pop();   
             if (popChar == '(' || popChar == '[')   
                 return false;   
             break;   
             case ']':   
             popChar = (char) stack.pop();   
             if (popChar == '(' || popChar == '{')   
                 return false;   
             break;   
         }   
     }   
     return (stack.isEmpty());   
 }   
   
 public static void main(String[] args) {   
       
     String inputStr;   
       
      
     Scanner sc = new Scanner(System.in);   
       
     System.out.println("Enter input string to check:");   
       
     inputStr = sc.nextLine();   
       
     // call balancedParenthesis() method to check whether input string is balanced of not   
     if (balancedParenthesis(inputStr))   
         System.out.println("The entered String has Balanced Brackets.");   
     else   
         System.out.println("The entered Strings do not contain Balanced Brackets.");   
 }   
}  
