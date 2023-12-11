package com.ecoplus.babyonroad.controladores;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecoplus.babyonroad.entidades.Plan;
import com.ecoplus.babyonroad.excepciones.ResourceNotFoundException;
import com.ecoplus.babyonroad.repositorios.PlanRepositorio;

@RestController
@RequestMapping("/lista_planes")
@CrossOrigin(origins = "http://localhost:4200")
public class PlanController {

	@Autowired
	private PlanRepositorio plan_repositorio;

	@GetMapping("/todos")
	public List<Plan> listar_todos_planes() {
		return plan_repositorio.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Plan> listar_plan_id(@PathVariable Long id) {
		Plan plan = plan_repositorio.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No existe el plan con id:" + id));
		return ResponseEntity.ok(plan);
	}

	@PostMapping("/nuevo")
	public Plan guardarPlan(@RequestBody Plan plan) {
		return plan_repositorio.save(plan);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Plan> actualizar_plan(@PathVariable Long id, @RequestBody Plan datos_plan) {
		Plan plan = plan_repositorio.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No existe el plan con id:" + id));
		
		plan.setNombre(datos_plan.getNombre());
		plan.setPrecio(datos_plan.getPrecio());
		plan.setDescripcion(datos_plan.getDescripcion());
		
		Plan plan_actualizado = plan_repositorio.save(plan);
		
		return ResponseEntity.ok(plan_actualizado);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Map<String, Boolean>> actualizar_plan(@PathVariable Long id){
		Plan plan = plan_repositorio.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No existe el emplado con id:" + id));
			
		plan_repositorio.delete(plan);
		
		Map<String, Boolean> respuesta = new HashMap<>();
		respuesta.put("eliminar",Boolean.TRUE);
		return ResponseEntity.ok(respuesta);
	}


}
