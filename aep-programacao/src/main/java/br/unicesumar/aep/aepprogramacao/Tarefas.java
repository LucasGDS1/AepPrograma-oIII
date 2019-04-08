package br.unicesumar.aep.aepprogramacao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Tarefas {
	
	@Autowired
	private TarefaRepository tarefaRepository;
	private TarefaRepository studentRepository;
	
	@GetMapping("/tarefas")
	public List<Tarefa> consultaTarefa() {
		return tarefaRepository.findAll();
	}
	
	
	@GetMapping("/tarefas/{id}")
	public Tarefa consultaTarefa (@PathVariable long id) {
		Optional<Tarefa> tarefa = tarefaRepository.findById(id);
		
		if (!tarefa.isPresent())
			throw new RuntimeException("id-" + id);
			
		return tarefa.get();
	}
	
	@PostMapping("/tarefas/{id}")
	public Tarefa createTarefa (@RequestBody Tarefa tarefa) {
		Optional<Tarefa> novaTarefa = tarefaRepository.findById(tarefa.getId());
		
		if (novaTarefa.isPresent())
			throw new RuntimeException("id-" + tarefa.getId());
		
		tarefaRepository.save(tarefa);
		return tarefa;
	}
	
	@PutMapping("/tarefa/{id}")
	public ResponseEntity<Object> updateTarefa(@RequestBody Tarefa tarefa, @PathVariable long id) {
		
		Optional<Tarefa> tarefaOptional = tarefaRepository.findById(id);
		
		if (!tarefaOptional.isPresent())
			throw new RuntimeException("id-" + id);
		
		tarefa.setId(id);
		studentRepository.save(tarefa);
		return ResponseEntity.notFound().build();
				
	}
	
	@DeleteMapping("/students/{id}")
	public void studentDelete(@PathVariable long id) {
		studentRepository.deleteById(id);
	}
	
}
