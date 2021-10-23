package moodanalyzer;
/*
 * @Welcome -The  program implements an application of junit tests and Exception Handling.
 * @author  -deepak
 * @version -1.0
 * @since   -2021-09-28
 */

public class MoodAnalyzer {

	private String message;

	// constructor
	public MoodAnalyzer() {
	}

	// parameterised constructor
	public MoodAnalyzer(String message) {
		this.message = message;
	}

	/*
	 * throws exception from class MoodAnalysisException using Enum
	 */
	public String analyseMood() throws MoodAnalysisException {
		try {
			if (message == "")
				throw new MoodAnalysisException("Invalid message", MoodAnalysisException.ExceptionType.ENTERED_EMPTY);
			if (message.toLowerCase().contains("sad"))
				return "SAD";
			return "HAPPY";
		} catch (NullPointerException e) {
			throw new MoodAnalysisException("Invalid message", MoodAnalysisException.ExceptionType.ENTERED_NULL);
		}
	}
}
