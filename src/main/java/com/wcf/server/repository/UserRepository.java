package com.wcf.server.repository;

import com.wcf.server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsernameAndDeletedIsFalse(String username);

    Optional<User> findByNameAndDeletedIsFalse(String name);

    Optional<User> findByIdAndDeletedIsFalse(long id);

    List<User> findAll();

    List<User> findAllByDeletedIsFalse();
}