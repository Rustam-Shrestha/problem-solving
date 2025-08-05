import java.util.HashSet;

public class SingleNumberOptimal {
    public int singleNumber(int[] nums) {
        int singleNum=0;
        for(int num:nums){
            singleNum = singleNum^num;
        }
        return singleNum;
    }


}
