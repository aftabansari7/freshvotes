package com.naumansoftwares.freshvotes.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.naumansoftwares.freshvotes.domain.User;

@Repository
public interface UserDAO {
	User create(User user);

	User getById(Long id);

	List<User> getAll();

	void deleteUser(Long id);
	

}
