// GIVEN A STRING CONTAINING DIGITS FROM 2-9 INCLUSIVE, RETURN ALL POSSIBLE LETTER COMBINATIONS THAT THE NUMBER
// COULD REPRESENT. RETURN THE ANSWER IN ANY ORDER
// INPUT--> "25"
// OUTPUT--> aj ak al bj bk bl cj ck cl

public class Ques21 {
    static void combinations(String dig,String[] kp, String res){
        if(dig.length()==0){
            System.out.println(res + " ");
            return;
        }
       int num =  dig.charAt(0) - '0';
        String curr = kp[num];
        for(int i=0;i<curr.length();i++){
            combinations(dig.substring(1), kp, res+ curr.charAt(i));
        }
        

    }
    public static void main(String[] args) {
        String[] kp = {"","" ,"abc" ,"def", "ghi","jkl","mno","pqrs","tuv","wxyz"};
        String dig = "25";
        combinations(dig, kp, "");
        
    }
}
