package com.codewithhimakar.fullstackbackend.repository;

import com.codewithhimakar.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {

}
