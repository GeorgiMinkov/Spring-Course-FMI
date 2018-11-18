package gm.course.spring.DEMO.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Document(collection = "courses")
public class Course {
    @Id
    @NotEmpty
    private String id;

    @DBRef(lazy = true)
    List<User> users;
}
