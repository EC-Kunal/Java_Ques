// THERE ARE n STONES NUMBERED 0,1,2....n-1. FOR EACH i(0<=i<n), THE HEIGHT OF THE STONE IS hi. THERE IS A FROG 
// WHO IS INITIALLY AT STONE 0. HE WILL REPEAT THE ACTION SOME NUMBER OF TIMES TO REACH STONE n-1.
// --> IF A FROG IS CURRENTLY ON STONE i, JUMP TO STONE (i+1) OR (i+2)
// --> HERE, A COST OF |hi-hj| IS INCURRED, WHERE j IS THE STONE TO LAND ON.
// 
// FIND THE MINIMUM POSSIBLE  TOTAL COST INCURRED BEFORE THE FROG REACHES STONE (n-1)


public class Ques20{
    static int frogJump(int[] h, int idx){
        if(idx==h.length-1){
            return 0;
        }
        
        int op1 = Math.abs(h[idx] - h[idx+1]) + frogJump(h, idx+1);
        if(idx==h.length-2){
            return op1;
        }
        int op2 = Math.abs(h[idx]  - h[idx+2]) + frogJump(h, idx+2);

        return Math.min(op1, op2);
    }
    public static void main(String[] args) {
        int []arr = {10,30,40,20};
        System.out.println(frogJump(arr, 0));
        
    }
}