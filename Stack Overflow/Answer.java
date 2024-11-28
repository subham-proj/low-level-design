import java.util.List;

public class Answer implements Commentable {
    private String content;
    private List<Comment> comments;
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
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
