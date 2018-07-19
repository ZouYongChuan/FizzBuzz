package job.fizzbuzz.ServiceImpl;
import job.fizzbuzz.Service.ShowFizzBuzz;
import job.fizzbuzz.ServiceImpl.FindFizzBuzzAtStage1Impl;
import job.fizzbuzz.ServiceImpl.FindFizzBuzzAtStage2Impl;
import org.springframework.stereotype.Component;

@Component
public class ShowFizzBuzzImpl implements ShowFizzBuzz {
    private static FindFizzBuzzAtStage1Impl FindResultAtStage1=null;
    private static FindFizzBuzzAtStage2Impl FindResultAtStage2=null;
    public String Show(int stage,int n) {
        StringBuilder outPutString = new StringBuilder("Output:<br/>");
        switch (stage) {
            case 1:
                for (int i = 1; i <= n; ++i) {
                    outPutString.append(FindResultAtStage1.Find(i) + "</br>");
                }
                break;
            case 2:
                for (int i = 1; i <= n; ++i) {
                    FindResultAtStage2=new FindFizzBuzzAtStage2Impl();
                    outPutString.append(FindResultAtStage2.Find(i) + "</br>");
                }
                break;
            default:
                for (int i = 1; i <= n; ++i) {
                    outPutString.append(FindResultAtStage1.Find(i) + "</br>");
                }
        }
        return outPutString.toString();
    }
}
