import java.util.List;

public class User {
    private final String name;
    private final int userId;
    
    List<Question> questions;
    
    public User(String name, int userId) {
        this.name = name;
        this.userId = userId;
    }
    
    public String getName() {
        return name;
    }
    
    public int getUserId() {
        return userId;
    }
    
    public void addQuestion(Question question) {
        questions.add(question);
    }
    
    public int getQuestion(int questionNumber) {
        for (int i = 0; i < questions.size(); i++) {
            if (questions.get(i).getQuestionNumber() == questionNumber) {
                return i;
            }
        }
        
        return -1;
    }
    
    public void addAnswer(int index, Answer answer) {
        questions.get(index).addAnswer(answer);
        System.out.println("New answer added successfully!");
    }
    
}
