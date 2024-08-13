import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> rishabhsList = new ArrayList<>(10); //here Integer is a Wrapper Class
        rishabhsList.add(65);
        rishabhsList.add(54);
        rishabhsList.add(81);
        rishabhsList.add(87);
        rishabhsList.add(98);
        rishabhsList.add(45);
        System.out.println(rishabhsList);

//        System.out.println(rishabhsList.contains(87)); // for checking if the element exist or not.
//        rishabhsList.set(0, 66);
//        System.out.println(rishabhsList);
//        rishabhsList.remove(4);
//        System.out.println(rishabhsList);


        //Get Items at any Index
        for (int i = 0; i < rishabhsList.size(); i++){
            System.out.print(rishabhsList.get(i) + " "); //Pass index here, list[index] Syntax Still not work here
        }


    }
}
