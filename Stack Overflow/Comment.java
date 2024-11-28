public class Comment {
    private final User user;
    private final String content;
    
    public Comment(User user, String content) {
        this.user = user;
        this.content = content;
    }
    
    public User getUser() {
        return user;
    }
    
    public String getContent() {
        return content;
    }
}
