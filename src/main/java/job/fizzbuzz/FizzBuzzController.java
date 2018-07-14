package job.fizzbuzz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan
public class FizzBuzzController {
    private final FizzBuzz fizzBuzz;

    @Autowired
    public FizzBuzzController(FizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }

    /***
     * FizzBuzz调用的函数
     * @param stage stage输入1或者2用于判断使用stage1还是stage2,其他默认使用stage1
     * @param number number用于判断fizzbuzz的数字到多少
     * @return FizzBuzzResult
     */
    @RequestMapping("/fizzbuzz/{stage}/{number}")
    public String Stage1(@PathVariable("stage") int stage,@PathVariable("number") int number) {
        return fizzBuzz.Show(stage,number);
    }

}
