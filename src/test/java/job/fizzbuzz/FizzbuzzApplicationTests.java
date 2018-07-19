package job.fizzbuzz;

import job.fizzbuzz.ServiceImpl.FindFizzBuzzAtStage1Impl;
import job.fizzbuzz.ServiceImpl.FindFizzBuzzAtStage2Impl;
import job.fizzbuzz.ServiceImpl.FizzBuzzImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FizzbuzzApplicationTests {

    private final FindFizzBuzzAtStage1Impl findFizzBuzzAtStage1 = new FindFizzBuzzAtStage1Impl();
    private final FindFizzBuzzAtStage2Impl findFizzBuzzAtStage2 = new FindFizzBuzzAtStage2Impl();

    /***
     *stage1中的方法输入4，应当返回4
     */
    @Test
    public void Stage1ItShouldReturnTheGivenNumberOf4() {
        assertEquals("4", findFizzBuzzAtStage1.Find(4));
    }

    @Test
    public void Stage1ItShouldReturnFizzWhenTheGivenNumberIsAMultipleOf6() {
        assertEquals("Fizz", findFizzBuzzAtStage1.Find(6));
    }

    @Test
    public void Stage1ItShouldReturnBuzzWhenTheGivenNumberIsAMultipleOf10() {
        assertEquals("Buzz", findFizzBuzzAtStage1.Find(10));
    }

    @Test
    public void Stage1ItShouldReturnFizzBuzzWhenTheGivenNumberIsAMultipleOf3And5() {
        assertEquals("FizzBuzz", findFizzBuzzAtStage1.Find(15));
    }

    @Test
    public void Stage2ItShouldReturnTheGivenNumberOf7() {
        assertEquals("7", findFizzBuzzAtStage2.Find(7));
    }

    @Test
    public void Stage2ItShouldReturnFizzWhenTheGivenNumberIsAMultipleOf9() {
        assertEquals("Fizz", findFizzBuzzAtStage2.Find(9));
    }

    @Test
    public void Stage2ItShouldReturnBuzzWhenTheGivenNumberIsAMultipleOf20() {
        assertEquals("Buzz", findFizzBuzzAtStage2.Find(20));
    }

    @Test
    public void Stage2ItShouldReturnFizzBuzzWhenTheGivenNumberIsAMultipleOf3And5() {
        assertEquals("FizzBuzz", findFizzBuzzAtStage2.Find(15));
    }

    @Test
    public void Stage2ItShouldReturnFizzBuzzWhenTheGivenNumberIsAMultipleOf3AndHasA5InIt() {
        assertEquals("FizzBuzz", findFizzBuzzAtStage2.Find(51));
    }

    @Test
    public void Stage2ItShouldReturnFizzBuzzWhenTheGivenNumberIsAMultipleOf5AndHasA3InIt() {
        assertEquals("FizzBuzz", findFizzBuzzAtStage2.Find(35));
    }

    @Test
    public void Stage2ItShouldReturnFizzBuzzWhenTheGivenNumberHasA5InItAndHasA3InIt() {
        assertEquals("FizzBuzz", findFizzBuzzAtStage2.Find(53));
    }
}
