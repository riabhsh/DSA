//List of all 3 Digit Prime numbers

public class Question2 {
    public static void main(String[] args) {
        System.out.println("+++ List of all the 3 Digit Armstrong Numbers +++");
        ThreeDigArms();
    }

    static void ThreeDigArms() {
    for(int i = 100; i < 1000; i++){
        if(isArmStrong(i) == true){
            System.out.print(i + " ");
        }
    }
    }

    static boolean isArmStrong(int realNum){
        int temp = realNum;
        int rem = 0, sum = 0;
        while(temp > 0){
            rem = temp % 10;
            temp = temp / 10;
            sum = sum + rem*rem*rem;
        }

        return sum == realNum;

    }
}
