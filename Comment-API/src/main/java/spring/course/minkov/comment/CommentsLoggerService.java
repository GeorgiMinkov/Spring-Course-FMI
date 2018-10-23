package spring.course.minkov.comment;

public interface CommentsLoggerService {
    void dumpAllComments();
    void dumpCommentsByAuthor(String authorEmail);
    CommentsService getCommentsService();
    void setCommentsService(CommentsService supplier);
}
