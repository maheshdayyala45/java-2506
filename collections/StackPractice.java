package collections;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<String> books=new Stack<>();
        books.add("red");
        books.add("white");
        books.push("black");

         System.out.println((books));
        // System.out.println(books.push("blue"));
        //   System.out.println(books.pop());
        //   System.out.println(books.peek());
          System.out.println(books.search("red"));
          System.out.println(books.indexOf("red"));
          System.out.println(books.empty());
          System.out.println(books.contains("white"));

    }
}
