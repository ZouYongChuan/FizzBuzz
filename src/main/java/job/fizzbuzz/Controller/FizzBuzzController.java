package job.fizzbuzz.Controller;

import job.fizzbuzz.ServiceImpl.ShowFizzBuzzImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan
public class FizzBuzzController {
    private final ShowFizzBuzzImpl fizzBuzz;

    @Autowired
    public FizzBuzzController(ShowFizzBuzzImpl fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }

    /***
     * 查找FizzBuzz结果
     * @param stage stage输入1或者2用于判断使用stage1还是stage2,其他默认使用stage1
     * @param number number用于判断fizzbuzz的数字到多少
     * @return FizzBuzzResult
     */
    @RequestMapping("/fizzbuzz/{stage}/{number}")
    public String FindFizzBuzzWithStageAndNum(@PathVariable("stage") int stage, @PathVariable("number") int number) {
        return fizzBuzz.show(stage, number);
    }
}
