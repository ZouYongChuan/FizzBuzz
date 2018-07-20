package job.fizzbuzz.ServiceImpl;

import job.fizzbuzz.Service.FindFizzBuzz;
import org.springframework.stereotype.Service;

/***s
 * 实现Stage2显示单个结果的接口
 */
@Service
public class FindFizzBuzzAtStage2Impl implements FindFizzBuzz {
    private static class Holder {
        private static final FindFizzBuzzAtStage2Impl instance = new FindFizzBuzzAtStage2Impl();
    }

    private FindFizzBuzzAtStage2Impl() {
    }

    public static final FindFizzBuzzAtStage2Impl getInstance() {
        return Holder.instance;
    }

    public String find(int i) {
        if (i % 3 == 0 || String.valueOf(i).contains("3")) {
            if (i % 5 == 0 || String.valueOf(i).contains("5"))
                return "FizzBuzz";
            else
                return "Fizz";
        } else if (i % 5 == 0 || String.valueOf(i).contains("5")) {
            return "Buzz";
        } else {
            return String.valueOf(i);
        }
    }
}
