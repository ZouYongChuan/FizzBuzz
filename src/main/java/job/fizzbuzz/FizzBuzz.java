package job.fizzbuzz;

import org.springframework.stereotype.Component;

@Component
public class FizzBuzz {
    public String Show(int stage,int n) {
        StringBuilder MyStringBuilder = new StringBuilder("Output:<br/>");
        switch (stage) {
            case 1:
                for (int i = 1; i <= n; ++i) {
                    MyStringBuilder.append(toFizzBuzzStage1(i) + "</br>");
                }
                break;
            case 2:
                for (int i = 1; i <= n; ++i) {
                    MyStringBuilder.append(toFizzBuzzStage2(i) + "</br>");
                }
                break;
            default:
                for (int i = 1; i <= n; ++i) {
                    MyStringBuilder.append(toFizzBuzzStage1(i) + "</br>");
                }
        }
        return MyStringBuilder.toString();
    }

    public String toFizzBuzzStage1(int i) {
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

    public String toFizzBuzzStage2(int i) {
        if (i % 3 == 0||String.valueOf(i).contains("3")) {
            if (i % 5 == 0||String.valueOf(i).contains("5"))
                return "FizzBuzz";
            else
                return "Fizz";
        } else if (i % 5 == 0||String.valueOf(i).contains("5")) {
            return "Buzz";
        } else {
            return String.valueOf(i);
        }
    }
}
