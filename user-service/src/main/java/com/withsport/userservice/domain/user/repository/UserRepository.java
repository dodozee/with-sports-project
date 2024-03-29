package com.withsport.userservice.domain.user.repository;

import com.withsport.userservice.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findByEmail(String email);

    Optional<User> findByNickname(String nickname);
    boolean existsByEmail(String email);

    List<User> findUserByNicknameContaining(String nickname);
}
