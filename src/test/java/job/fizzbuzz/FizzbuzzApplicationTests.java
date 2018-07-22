package job.fizzbuzz;

import job.fizzbuzz.serviceimpl.FindFizzBuzzAtStage1Impl;
import job.fizzbuzz.serviceimpl.FindFizzBuzzAtStage2Impl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FizzbuzzApplicationTests {

    FindFizzBuzzAtStage1Impl FindFizzBuzzAtStage1=FindFizzBuzzAtStage1Impl.getInstance();
    FindFizzBuzzAtStage2Impl FindFizzBuzzAtStage2=FindFizzBuzzAtStage2Impl.getInstance();

    /***
     * @author zou
     *stage1中的方法,输入4，应当返回4
     */
    @Test
    public void Stage1ItShouldReturnTheGivenNumberOf4() {
        assertEquals("4", FindFizzBuzzAtStage1.find(4));
    }

    /***
     * @author zou
     *stage1中的方法,输入6，应当返回Fizz
     */
    @Test
    public void Stage1ItShouldReturnFizzWhenTheGivenNumberIsAMultipleOf6() {
        assertEquals("Fizz", FindFizzBuzzAtStage1.find(6));
    }

    /***
     * @author zou
     *stage1中的方法,输入10，应当返回Buzz
     */
    @Test
    public void Stage1ItShouldReturnBuzzWhenTheGivenNumberIsAMultipleOf10() {
        assertEquals("Buzz", FindFizzBuzzAtStage1.find(10));
    }

    /***
     * @author zou
     *stage1中的方法,输入15，应当返回FizzBuzz
     */
    @Test
    public void Stage1ItShouldReturnFizzBuzzWhenTheGivenNumberIsAMultipleOf3And5() {
        assertEquals("FizzBuzz", FindFizzBuzzAtStage1.find(15));
    }

    /***
     * @author zou
     *stage2中的方法,输入7，应当返回7
     */
    @Test
    public void Stage2ItShouldReturnTheGivenNumberOf7() {
        assertEquals("7", FindFizzBuzzAtStage2.find(7));
    }

    /***
     * @author zou
     *stage2中的方法,输入9，应当返回Fizz
     */
    @Test
    public void Stage2ItShouldReturnFizzWhenTheGivenNumberIsAMultipleOf9() {
        assertEquals("Fizz", FindFizzBuzzAtStage2.find(9));
    }

    /***
     * @author zou
     *stage2中的方法,输入20，应当返回Buzz
     */
    @Test
    public void Stage2ItShouldReturnBuzzWhenTheGivenNumberIsAMultipleOf20() {
        assertEquals("Buzz", FindFizzBuzzAtStage2.find(20));
    }

    /***
     * @author zou
     *stage2中的方法,输入15，应当返回FizzBuzz
     */
    @Test
    public void Stage2ItShouldReturnFizzBuzzWhenTheGivenNumberIsAMultipleOf3And5() {
        assertEquals("FizzBuzz", FindFizzBuzzAtStage2.find(15));
    }

    /***
     * @author zou
     *stage2中的方法,输入51，应当返回FizzBuzz
     */
    @Test
    public void Stage2ItShouldReturnFizzBuzzWhenTheGivenNumberIsAMultipleOf3AndHasA5InIt() {
        assertEquals("FizzBuzz", FindFizzBuzzAtStage2.find(51));
    }

    /***
     * @author zou
     *stage2中的方法,输入35，应当返回FizzBuzz
     */
    @Test
    public void Stage2ItShouldReturnFizzBuzzWhenTheGivenNumberIsAMultipleOf5AndHasA3InIt() {
        assertEquals("FizzBuzz", FindFizzBuzzAtStage2.find(35));
    }

    /***
     * @author zou
     *stage2中的方法,输入53，应当返回FizzBuzz
     */
    @Test
    public void Stage2ItShouldReturnFizzBuzzWhenTheGivenNumberHasA5InItAndHasA3InIt() {
        assertEquals("FizzBuzz", FindFizzBuzzAtStage2.find(53));
    }
}
