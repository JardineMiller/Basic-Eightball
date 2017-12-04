import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class EightBallTest {
    EightBall eightBall;

    @Before
    public void before() {
        eightBall = new EightBall();
        eightBall.addAnswer("It's doubtful");
        eightBall.addAnswer("Not looking likely");
        eightBall.addAnswer("Yes, definitely");
    }

    @Test
    public void hasAnswer() {
        assertEquals(3, eightBall.getWordCount());
    }

    @Test
    public void canAddWord() {
        assertEquals(3, eightBall.getWordCount());
    }

    @Test
    public void canRandomiseAnswer() {
        eightBall.getAnswer();
        System.out.println(eightBall.getAnswer());
        assertNotNull(eightBall.getAnswer());
    }

    @Test
    public void canRemoveAnswer() {
        eightBall.removeAnswer("Not looking likely");
        assertEquals(2, eightBall.getWordCount());
    }
}
