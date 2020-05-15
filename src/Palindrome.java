import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class Palindrome {
    public static void main(String[] args) {
        String string1 = "Able was I ere I saw Elba".toLowerCase();
        //add comment
        String[] arr =string1.split("");
//        System.out.println(Arrays.toString(arr));
        Stack<String> stack = new Stack<>();
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(arr.length);
        for (int i = 0; i <arr.length ; i++) {
            stack.push(arr[i]);
            queue.add(arr[i]);
        }
        String string2="";
        String string3="";
        while (!stack.empty()){
            string2+=stack.pop();
        }
        while (!queue.isEmpty()){
            string3+=queue.poll();
        }
        System.out.println(string2);
        System.out.println(string3);
        if(string2.compareTo(string3)==0){
            System.out.println("The String is Palindrome");
        }else {
            System.out.println("it is not Palindrome");
        }


    }
}
