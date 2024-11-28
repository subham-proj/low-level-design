import java.util.List;

public interface Commentable {
    void addComment(Comment comment);
    public List<Comment> getComment();
}
