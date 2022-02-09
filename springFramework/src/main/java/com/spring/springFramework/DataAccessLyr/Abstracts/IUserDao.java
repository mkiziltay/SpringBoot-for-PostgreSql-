package com.spring.springFramework.DataAccessLyr.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.springFramework.Entities.Concretes.User;

@Repository
public interface IUserDao extends JpaRepository<User, Integer>{

}
