import java.util.ArrayList;
import java.util.List;

public class StackOverflow {
    private static StackOverflow instance;
    private static List<User> users;
    
    private StackOverflow() {
        users = new ArrayList<>();
    }
    
    public synchronized StackOverflow getInstance() {
        if (instance == null) {
            instance = new StackOverflow();
        }
        return instance;
    }
    
    public static void addUser(User user) {
        users.add(user);
    }
    
    public static void addQuestion(User user, Question question) {
        user.addQuestion(question);
    }
    
    public static void addAnswer(User user, Question question, Answer answer) {
        int index = user.getQuestion(question.getQuestionNumber());
        if (index != -1) {
            user.addAnswer(index, answer);
        }
        
        System.out.println("Question does not exist to add an answer");
    }
}
