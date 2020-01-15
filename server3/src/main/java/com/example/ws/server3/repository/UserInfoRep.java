package com.example.ws.server3.repository;

import com.example.ws.server3.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRep extends JpaRepository<UserInfo,Long> {
}
