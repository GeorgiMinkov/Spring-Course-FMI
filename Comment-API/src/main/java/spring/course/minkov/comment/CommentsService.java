package spring.course.minkov.comment;

import java.util.List;

public interface CommentsService {
    public void addComment(Comment comment);
    public List<Comment> getAllComments();
    public List<Comment> getCommentsByEmail(String email);
}
