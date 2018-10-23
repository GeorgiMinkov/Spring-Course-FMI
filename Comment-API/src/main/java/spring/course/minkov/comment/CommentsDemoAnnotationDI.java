package spring.course.minkov.comment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CommentsDemoAnnotationDI {
    public static void main(String...args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("spring.course.minkov.comment");

        CommentsService supplier = context.getBean(CommentsService.class);

        for (int comment = 0; comment < 6; ++comment) {
            supplier.addComment(context.getBean(Comment.class));
        }

        CommentsLoggerService logger = context.getBean(CommentsLoggerService.class);

        logger.dumpAllComments();

        System.out.println("Comments from some@gmail.com");
        logger.dumpCommentsByAuthor("some@gmail.com");
    }

}
