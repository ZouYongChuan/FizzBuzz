package job.fizzbuzz.ServiceImpl;

import job.fizzbuzz.Service.FindFizzBuzz;

public class FindFizzBuzzAtStage1Impl implements FindFizzBuzz {

    private static class Holder {
        private static final FindFizzBuzzAtStage1Impl Instance = new FindFizzBuzzAtStage1Impl();
    }
    private FindFizzBuzzAtStage1Impl (){}
    public static final FindFizzBuzzAtStage1Impl getInstance() {
        return Holder.Instance;
    }
    public String Find(int i) {
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
