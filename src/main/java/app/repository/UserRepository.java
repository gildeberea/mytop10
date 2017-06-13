package app.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import app.domain.User;

public interface UserRepository extends MongoRepository<User, String> {
	List<User> findByLastName(@Param("lastName") String lastName);
}