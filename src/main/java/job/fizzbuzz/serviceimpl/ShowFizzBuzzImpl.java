package job.fizzbuzz.serviceimpl;
import job.fizzbuzz.service.ShowFizzBuzz;
import org.springframework.stereotype.Component;

/***
 * @author zou
 * 实现Stage1跟Stage2显示全部结果的接口
 */
@Component
public class ShowFizzBuzzImpl implements ShowFizzBuzz {
    FindFizzBuzzAtStage1Impl findResultAtStage1 = FindFizzBuzzAtStage1Impl.getInstance();
    FindFizzBuzzAtStage2Impl findResultAtStage2 = FindFizzBuzzAtStage2Impl.getInstance();

    @Override
    public String show(int stage, int n) {
        StringBuilder outPutString = new StringBuilder("Output:<br/>");
        switch (stage) {
            case 1:
                for (int i = 1; i <= n; ++i) {
                    outPutString.append(findResultAtStage1.find(i) + "</br>");
                }
                break;
            case 2:
                for (int i = 1; i <= n; ++i) {
                    outPutString.append(findResultAtStage2.find(i) + "</br>");
                }
                break;
            default:
                for (int i = 1; i <= n; ++i) {
                    outPutString.append(findResultAtStage1.find(i) + "</br>");
                }
        }
        return outPutString.toString();
    }
}
