import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        ArrayList<int> list1 = new ArrayList<int>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(50);
        list1.add(100);
        list1.add(30);
        System.out.println(max(list1));

    }
    public static Integer max(ArrayList<Integer>list){
        if(list.isEmpty()){
            return null;
        }
        return Collections.max(list);


    }
}