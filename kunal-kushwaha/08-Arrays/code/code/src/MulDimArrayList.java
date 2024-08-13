import java.util.ArrayList;
import java.util.Scanner;

public class MulDimArrayList {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList> list = new ArrayList<>();

//        Initialization
        for(int i = 0; i < 3; i++){
            list.add(new ArrayList());
        }

        System.out.println("Empty List: " +  list);

//        Add Elements
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                list.get(i).add(in.next());
            }
        }
//        Print Elements
        System.out.println("Complete List: " + list);
    }
}
