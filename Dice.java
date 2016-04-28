package week11lab5;

public class Dice {
    static int sum = 0;
    
    public static int Throw(int dice){
        for (int i = 0; i < dice; i++){
            
            int roll = 1 + (int) (Math.random() * 6);
            
            System.out.println("Roll: " + roll);
            
            sum = sum + roll;
        }
        return sum;
    }
}
