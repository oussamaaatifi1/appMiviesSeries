package com.app.appmoviesseries.repository;


import com.app.appmoviesseries.entity.Favorite;
import com.app.appmoviesseries.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
}