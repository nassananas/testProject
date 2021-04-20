package com.company;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CatRepository extends JpaRepository<Cat, Integer> {
    Optional<Cat> findById(Integer id);
}
