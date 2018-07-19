package job.fizzbuzz.ServiceImpl;

import job.fizzbuzz.Service.FindFizzBuzz;

public class FindFizzBuzzAtStage1Impl implements FindFizzBuzz {
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
