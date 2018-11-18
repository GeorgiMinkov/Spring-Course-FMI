package gm.course.spring.DEMO.dao;

import gm.course.spring.DEMO.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends MongoRepository<User, String> {
}
