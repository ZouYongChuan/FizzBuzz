package job.fizzbuzz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FizzbuzzApplicationTests {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void Stage1ItShouldReturnTheGivenNumberOf4() {
        assertEquals("4", fizzBuzz.toFizzBuzzStage1(4));
    }

    @Test
    public void Stage1ItShouldReturnFizzWhenTheGivenNumberIsAMultipleOf6() {
        assertEquals("Fizz", fizzBuzz.toFizzBuzzStage1(6));
    }

    @Test
    public void Stage1ItShouldReturnBuzzWhenTheGivenNumberIsAMultipleOf10() {
        assertEquals("Buzz", fizzBuzz.toFizzBuzzStage1(10));
    }

    @Test
    public void Stage1ItShouldReturnFizzBuzzWhenTheGivenNumberIsAMultipleOf3And5() {
        assertEquals("FizzBuzz", fizzBuzz.toFizzBuzzStage1(15));
    }

    @Test
    public void Stage2ItShouldReturnTheGivenNumberOf7() {
        assertEquals("7", fizzBuzz.toFizzBuzzStage2(7));
    }

    @Test
    public void Stage2ItShouldReturnFizzWhenTheGivenNumberIsAMultipleOf9() {
        assertEquals("Fizz", fizzBuzz.toFizzBuzzStage2(9));
    }

    @Test
    public void Stage2ItShouldReturnBuzzWhenTheGivenNumberIsAMultipleOf20() {
        assertEquals("Buzz", fizzBuzz.toFizzBuzzStage2(20));
    }

    @Test
    public void Stage2ItShouldReturnFizzBuzzWhenTheGivenNumberIsAMultipleOf3And5() {
        assertEquals("FizzBuzz", fizzBuzz.toFizzBuzzStage2(15));
    }

    @Test
    public void Stage2ItShouldReturnFizzBuzzWhenTheGivenNumberIsAMultipleOf3AndHasA5InIt() {
        assertEquals("FizzBuzz", fizzBuzz.toFizzBuzzStage2(51));
    }

    @Test
    public void Stage2ItShouldReturnFizzBuzzWhenTheGivenNumberIsAMultipleOf5AndHasA3InIt() {
        assertEquals("FizzBuzz", fizzBuzz.toFizzBuzzStage2(35));
    }

    @Test
    public void Stage2ItShouldReturnFizzBuzzWhenTheGivenNumberHasA5InItAndHasA3InIt() {
        assertEquals("FizzBuzz", fizzBuzz.toFizzBuzzStage2(53));
    }
}
