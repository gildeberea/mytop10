package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import app.domain.User;
import app.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserRestController {

	@Autowired
	UserRepository userRepository;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		return new ResponseEntity<List<User>>(userRepository.findAll(), HttpStatus.OK);
	}

	@RequestMapping(value="/{lastName}", method = RequestMethod.GET)
	public ResponseEntity<List<User>> findByLastName(@PathVariable String lastName) {
		return new ResponseEntity<List<User>>(userRepository.findByLastName(lastName), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<User> save(@RequestBody(required = true) User user) {
		user = userRepository.insert(user);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<User> update(@RequestBody(required = true) User user) {
		user = userRepository.save(user);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<User> delete(@PathVariable String id) {
		userRepository.delete(id);
		return new ResponseEntity<User>(HttpStatus.OK);
	}
}
