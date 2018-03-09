package it.consoft.nameless.service;

import it.consoft.nameless.model.User;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

public interface UserService {

	User saveUser(User user);

	User getUserById(int id);

	User update(User user);

	User delete(int id);

	User getUserByUsernameAndPassword(String username, String password);

}
