package exercise1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Quiz {
	private HashMap<Integer, String> ans = new HashMap<>();
	private HashMap<Integer, String> questions = new HashMap<>();
	private HashMap<Integer, List<String>> options = new HashMap<>();
	private List<String> rightAnsReply = new ArrayList<>(Arrays.asList("Excellent!","Good!","Keep up the good work!","Nice work!")) ;
	private List<String> wrongAnsReply = new ArrayList<>(Arrays.asList("No. Please try again", "Wrong. Try once more", "Don't give up!", "No. Keep trying.."));
	
	// create questions, options and answers
	public void createQuestions()
	{
		this.questions.put(0,"A variable that holds a whole number");
		this.questions.put(1,"A variable that holds words");
		this.questions.put(2,"A variable that holds true or false");
		this.questions.put(3,"Name the data type: 1.0");
		this.questions.put(4,"Name the data type: \"true\"");
		
		this.options.put(0, Arrays.asList("String","boolean","int","float","None of these"));
		this.options.put(1, Arrays.asList("String","boolean","int","float","None of these"));
		this.options.put(2, Arrays.asList("String","boolean","int","float","None of these"));
		this.options.put(3, Arrays.asList("double","boolean","int","String","None of these"));
		this.options.put(4, Arrays.asList("String","boolean","int","float","None of these"));
		
		this.ans.put(0,"int");
		this.ans.put(1,"String");
		this.ans.put(2,"boolean");
		this.ans.put(3,"double");
		this.ans.put(4,"String");
		
	}
	// check the answer of question
	public boolean checkAns(int questionId, String answer)
	{
		if(this.ans.get(questionId) == answer)
			return true;
		else return false;
	}

	// get all questions
	public HashMap<Integer, String> getQuestions() {
		return questions;
	}

	// get options
	public HashMap<Integer, List<String>> getOptions() {
		return options;
	}

	// get wrong ans reply
	
	public List<String> getWrongAnsReply() {
		return wrongAnsReply;
	}

	// get right ans reply
	public List<String> getRightAnsReply() {
		return rightAnsReply;
	}

}
