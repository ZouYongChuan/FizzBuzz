package job.fizzbuzz.ServiceImpl;
import job.fizzbuzz.ServiceImpl.FindFizzBuzzAtStage1Impl;
import job.fizzbuzz.ServiceImpl.FindFizzBuzzAtStage2Impl;
import org.springframework.stereotype.Component;

@Component
public class FizzBuzzImpl {
    public String Show(int stage,int n) {
        StringBuilder MyStringBuilder = new StringBuilder("Output:<br/>");
        switch (stage) {
            case 1:
                FindFizzBuzzAtStage1Impl FindResultAtStage1 =new FindFizzBuzzAtStage1Impl();
                for (int i = 1; i <= n; ++i) {
                    MyStringBuilder.append(FindResultAtStage1.Find(i) + "</br>");
                }
                break;
            case 2:
                FindFizzBuzzAtStage2Impl FindResultAtStage2 =new FindFizzBuzzAtStage2Impl();
                for (int i = 1; i <= n; ++i) {
                    MyStringBuilder.append(FindResultAtStage2.Find(i) + "</br>");
                }
                break;
            default:
                FindFizzBuzzAtStage1Impl FindResultAtStageDefault =new FindFizzBuzzAtStage1Impl();
                for (int i = 1; i <= n; ++i) {
                    MyStringBuilder.append(FindResultAtStageDefault.Find(i) + "</br>");
                }
        }
        return MyStringBuilder.toString();
    }
}
