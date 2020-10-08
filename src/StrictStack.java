import java.util.*;
import java.lang.*;

class StrictStack<T> {



    private LinkedList<T> stack = new LinkedList<>();

     //method to perform pushing /adding to the stack
     void push(T obj){
         stack.add(obj);
     }

     //method to return top of stack
    T top(){
         T element = stack.getLast();
//         System.out.println("The top item on the stack is :"+ element);
         return element;
    }

    void pop(){
         stack.removeLast();
    }


    //get the size of the stack
    int size(){
         int sizes = stack.size();
         return sizes;
    }

    public static void main(String args[]){
         StrictStack<String> elem = new StrictStack<>();
         elem.push("Quame");
         elem.push("God");
         elem.push("Come");
         elem.push("My");


        // System.out.println("Behold the top element on the Stack :" + elem.top());
         System.out.println("Size of initial array:" + elem.size());

         //remove the last element and delete
         elem.pop();
         System.out.println("Behold the new element on top of the stack :"+ elem.top());
        System.out.println("Size of new array:" + elem.size());

    }
}
