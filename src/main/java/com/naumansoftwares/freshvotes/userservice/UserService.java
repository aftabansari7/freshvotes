package com.naumansoftwares.freshvotes.userservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.naumansoftwares.freshvotes.domain.User;

@Service
public interface UserService {
	User create(User user);
	User getById(Long id);
	List<User> getAll();
	void deleteUser(Long id);

}
