//PRINT ALL THE NATURAL NUMBERS FROM 1 to N

public class Ques1{
    static void increasing(int n){
        if(n==1) {
            System.out.println(n);
            return;
        }    
        increasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        increasing(5);
    }
}