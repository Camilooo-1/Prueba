package com.code.demo.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.code.demo.modelo.via;

@Repository
public interface Ivia extends JpaRepository<via, Integer> {

}
