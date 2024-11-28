import java.util.ArrayList;
import java.util.List;

public class Question implements Commentable{
    private int questionNumber;
    private List<String> keywords;
    private List<Tags> tags;
    private User user;
    private String content;
    private List<Comment> comments;
    private List<Answer> answers;
    
    public Question(User author, String content){
        user = author;
        this.content = content;
        keywords = new ArrayList<>();
        tags = new ArrayList<>();
        comments = new ArrayList<>();
        answers = new ArrayList<>();
    }
    
    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }
    
    public void addAnswer(Answer answer) {
        answers.add(answer);
    }
    
    public int getQuestionNumber() {
        return questionNumber;
    }
    
    public List<String> getKeywords() {
        return keywords;
    }
    
    public List<Tags> getTags() {
        return tags;
    }
    
    public User getUser() {
        return user;
    }
    
    public String getContent() {
        return content;
    }
    
    public List<Answer> getAnswers() {
        return answers;
    }
    
    @Override
    public void addComment(Comment comment) {
        comments.add(comment);
    }
    
    @Override
    public List<Comment> getComment() {
        return comments;
    }
}
