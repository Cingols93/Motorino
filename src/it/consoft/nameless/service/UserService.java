package it.consoft.nameless.service;

import it.consoft.nameless.model.User;

public interface UserService {

	User saveUser(User user);

	User getUserById(int id);

	User update(User user);

	User delete(int id);
	
	User getUserByUsernameAndPassword(String username, String password);

}

