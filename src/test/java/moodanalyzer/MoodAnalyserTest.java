package moodanalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/*
 * @Welcome -The  program implements an application to test the possible cases using junit tests.
 * @author  -deepak
 * @version -1.0
 * @since   -2021-09-28
 */
public class MoodAnalyserTest {
    /*
     * UC1-TC1.1 return sad if given Msg:"I am sad"
     */
    @Test
    public void givenMessage_whenSad_ShouldReturnSad() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am Sad");
        String actual = moodAnalyzer.analyseMood();
        String expected = "SAD";
        Assertions.assertEquals(expected, actual);
    }
    /*
     * UC1-TC1.1(Repeat) return SAD if given Msg:"I am SAD" Refactor :pass String
     * using constructor
     */

    @Test
    public void givenMessage_whenSAD_ShouldReturnSAD() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am SAD");
        String actual = moodAnalyzer.analyseMood();
        String expected = "SAD";
        Assertions.assertEquals(expected, actual);
    }
    /*
     * UC1-TC1.2(Repeat) return Happy if given Msg:"I am happy" Refactor :pass
     * String using constructor
     */

    @Test
    public void givenMessage_whenHappy_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am Happy");
        String actual = moodAnalyzer.analyseMood();
        String expected = "HAPPY";
        Assertions.assertEquals(expected, actual);
    }

    /*
     * UC3-TC3.1 return Happy if given String :NULL Refactor :pass String using
     * constructor
     */
    @Test
    public void givenMessage_whenNull_ShouldThrowMoodAnalysisException() {
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
            moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.exceptionType);
        }
    }

    /*
     * UC3-TC3.2 return Happy if given String :" " Refactor :pass String using
     * constructor
     */
    @Test
    public void givenMessage_whenEmpty_ShouldThrowMoodAnalysisException() {
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
            moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            System.out.println("here");
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
        }
    }
}
