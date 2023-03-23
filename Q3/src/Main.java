import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(9);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        sortt(list);

    }
    public static void sortt(ArrayList<Integer>list){
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}