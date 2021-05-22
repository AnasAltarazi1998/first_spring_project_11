package app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import app.User;


public interface UserRepo extends CrudRepository<User,Integer> {
    
}
