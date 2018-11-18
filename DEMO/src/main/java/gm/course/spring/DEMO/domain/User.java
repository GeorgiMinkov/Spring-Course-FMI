package gm.course.spring.DEMO.domain;

import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Document(collection = "users")
public class User {
    @Id
    private String id;

    @NonNull // check what is NonNull anotation
    private String pseudonim;

    @NonNull
    @NotEmpty
    private String fn;

    @NonNull
    @NotEmpty
    private String name;

    @Email
    @NotEmpty
    private String email;
}
