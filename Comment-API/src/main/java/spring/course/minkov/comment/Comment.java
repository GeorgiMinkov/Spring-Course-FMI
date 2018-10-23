package spring.course.minkov.comment;

import java.time.LocalDateTime;

public class Comment {
    private String text;
    private String email;
    private LocalDateTime commentDate = LocalDateTime.now();

    public String getEmail() {
        return email;
    }
}
