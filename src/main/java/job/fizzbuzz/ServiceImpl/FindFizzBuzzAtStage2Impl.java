package job.fizzbuzz.ServiceImpl;

import job.fizzbuzz.Service.FindFizzBuzz;

public class FindFizzBuzzAtStage2Impl implements FindFizzBuzz {
    public String Find(int i) {
        if (i % 3 == 0 | String.valueOf(i).contains("3")) {
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
