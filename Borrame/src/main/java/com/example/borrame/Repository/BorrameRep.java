package com.example.borrame.Repository;

import com.example.borrame.entidad.BorrameUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BorrameRep extends JpaRepository<BorrameUser, Integer> {
    List<BorrameUser> findAll();
}
