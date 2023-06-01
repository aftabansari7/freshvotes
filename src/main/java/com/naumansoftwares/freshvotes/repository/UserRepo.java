package com.naumansoftwares.freshvotes.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.naumansoftwares.freshvotes.domain.User;

@Repository
public interface UserRepo extends ListCrudRepository<User, Long> {

}
