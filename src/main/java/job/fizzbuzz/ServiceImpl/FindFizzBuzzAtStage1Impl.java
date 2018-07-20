package job.fizzbuzz.ServiceImpl;

import job.fizzbuzz.Service.FindFizzBuzz;
import org.springframework.stereotype.Service;

/***
 * 实现Stage1显示单个结果的接口
 */
@Service
public class FindFizzBuzzAtStage1Impl implements FindFizzBuzz {

    private static class Holder {
        private static final FindFizzBuzzAtStage1Impl instance = new FindFizzBuzzAtStage1Impl();
    }

    private FindFizzBuzzAtStage1Impl() {
    }

    public static final FindFizzBuzzAtStage1Impl getInstance() {
        return Holder.instance;
    }

    @Override
    public String find(int i) {
        if (i % 3 == 0) {
            if (i % 5 == 0)
                return "FizzBuzz";
            else
                return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(i);
        }
    }
}