import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        System.out.println("+++ Linear Search in Strings +++");
        String str = "Rishabh";
        char target = 'R';
        boolean ans = search(str, target);
        System.out.println(ans);

        System.out.println(Arrays.toString(str.toCharArray()));
    }

    //Search the target and return the True or False.
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }

        //FOR LOOP METHOD
//        for(int index = 0; index < str.length(); index++){
//            char ch = str.charAt(index);
//            if(ch == target){
//                return true;
//            }
//        }

        //FOR EACH METHOD
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }

        return false;
    }
}
