package com.naumansoftwares.freshvotes.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.naumansoftwares.freshvotes.dao.UserDAO;
import com.naumansoftwares.freshvotes.domain.User;
import com.naumansoftwares.freshvotes.repository.UserRepo;

@Repository
public class UserDaoImpl implements UserDAO {

	@Autowired
	private UserRepo userRepo;

	
	@Override
	public User create(User user) {
		return userRepo.save(user);
	}


	@Override
	public User getById(Long id) {
		return userRepo.findById(id).get();
	}


	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public void deleteUser(Long id) {
		userRepo.deleteById(id);
	}

}
