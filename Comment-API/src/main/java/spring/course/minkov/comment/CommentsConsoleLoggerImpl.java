package spring.course.minkov.comment;

public class CommentsConsoleLoggerImpl implements CommentsLoggerService {
    private CommentsService supplier;

    @Override
    public void dumpAllComments() {
        supplier.getAllComments().forEach(System.out::println);
    }

    @Override
    public void dumpCommentsByAuthor(String authorEmail) {
        supplier.getCommentsByEmail(authorEmail).forEach(System.out::println);
    }

    @Override
    public CommentsService getCommentsService() {
        return supplier;
    }

    @Override
    public void setCommentsService(CommentsService supplier) {
        this.supplier = supplier;
    }
}
