package com.naumansoftwares.freshvotes.userserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naumansoftwares.freshvotes.dao.UserDAO;
import com.naumansoftwares.freshvotes.domain.User;
import com.naumansoftwares.freshvotes.userservice.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	@Override
	public User create(User user) {
		return userDAO.create(user);
	}

	@Override
	public User getById(Long id) {
		// TODO Auto-generated method stub
		return userDAO.getById(id);
	}

	@Override
	public List<User> getAll() {
	
		return userDAO.getAll();
	}

	@Override
	public void deleteUser(Long id) {
		userDAO.deleteUser(id);
		
	}
	
	
}
