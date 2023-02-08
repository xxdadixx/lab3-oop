package lab3;
import java.util.*;

public class lab3_2 {
	private String[] stack;
    private int size;
    private int top;
    
    public lab3_2(int size) {
    	  this.size = size;
    	  stack = new String[size];
    	  top = -1;
    	}
    
    // Method to add a value to the stack
    public void push(String value) {
        if (top == size - 1) {
            System.out.println("\n----| Stack: Overflow");
        } else {
            top++;
            stack[top] = value;
            System.out.println("\nPush: " + stack[top]);
        }
    }
    
    // Method to remove the top element from the stack
    public String pop() {
        if (top == -1) {
            System.out.println("----| NULL");
            return null;
        } else {
            String value = stack[top];
            top--;
            System.out.println("Pop");
            return value;
        }
    }
    
    // Method to check if the stack is empty
    public boolean isEmpty() {
    	  System.out.println("\nisEmpty");
    	  if (top == -1) {
    	    System.out.println("----| Yes");
    	    return true;
    	  } else {
    	    System.out.println("----| No");
    	    return false;
    	  }
    	}
    
    // Method to retrieve the top element of the stack
    public String top() {
    	System.out.println("\nTop");
        if (top == -1) {
        	System.out.println("----| NULL");
            return null;
        } else {
        	System.out.println("----| Top = " + stack[top]);
            return stack[top];
        }
    }
    
    // Method to check the current stack size
    public void checkStack() {
    	System.out.println("\nCheckStack");
    	  if (top == -1) {
    		  System.out.println("----| Stack : NULL");
    	  } else {
    	    for (int i = top; i >= 0; i--) {
    	      System.out.printf(stack[i]);
    	      if (i > 0) {
    	        System.out.print(", ");
    	      }
    	    }
    	  }
    }
    
    // Method to set the maximum size of the stack
    public void setStackSize(int size) {
    	System.out.println("SetStackSize("+size+")");
        this.size = size;
        stack = new String[size];
        top = -1;
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        lab3_2 stack = new lab3_2(10);  // Initialize stack with maximum size of 10

        while (true) {
            System.out.println("\nEnter a command (push, pop, isEmpty, top, checkStack, setStackSize, or exit): ");
            String input = sc.nextLine();

            switch (input) {
            case "push":
                System.out.println("Enter a value to push onto the stack: ");
                String value = sc.nextLine();
                stack.push(value);
                break;
            case "pop":
                stack.pop();
                break;
            case "isEmpty":
                stack.isEmpty();
                break;
            case "top":
                stack.top();
                break;
            case "checkStack":
                stack.checkStack();
                break;
            case "setStackSize":
                System.out.println("Enter a new stack size:");
                String sizeInput = sc.nextLine();
                int size = Integer.parseInt(sizeInput);
                stack.setStackSize(size);
                break;
            case "exit":
                sc.close();
                return;
            default:
                System.out.println("Invalid command. Please try again.");
                break;
            }
        }
    }
}
