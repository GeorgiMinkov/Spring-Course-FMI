package spring.course.minkov.comment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CommentsServiceImpl implements CommentsService {
    private List<Comment> comments = new ArrayList<>();

    @Override
    public void addComment(Comment comment) {
        comments.add(comment);
    }

    @Override
    public List<Comment> getAllComments() {
        return comments;
    }

    @Override
    public List<Comment> getCommentsByEmail(String email) {
        return comments.stream().filter(el -> el.getEmail()
                .equals(email)).collect(Collectors.toList());
    }
}
