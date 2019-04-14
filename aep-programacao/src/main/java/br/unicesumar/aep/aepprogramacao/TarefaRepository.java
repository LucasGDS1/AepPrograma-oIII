package br.unicesumar.aep.aepprogramacao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa,
Long>{

	Optional<Tarefa> findById(Integer id);

	
}
