package com.imen.athletes.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.imen.athletes.entities.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe, Long> {
}