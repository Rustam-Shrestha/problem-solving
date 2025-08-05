import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(int curr=1;curr<=n;curr++){
            if(curr%3==0&&curr%5==0){
                list.add("FizzBuzz");
            }else if(curr%3==0){
                list.add("Fizz");
            }else if(curr%5==0){
                list.add("Buzz");
            }else{
                list.add(curr+"");
            }
        }
        return list;
    }
}
