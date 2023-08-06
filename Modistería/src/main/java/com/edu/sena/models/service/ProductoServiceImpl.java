package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.edu.sena.models.entity.Producto;
import com.edu.sena.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
    ProductoRepository productoRepository;
    
    
	@Override
	public Optional<Producto> findById(Integer id) {
		
		return productoRepository.findById(id);
	}

	@Override
	public List<Producto> findAll() {
		
		return productoRepository.findAll();
	}

	@Override
	public Producto save(Producto p) {
		
		return productoRepository.save(p);
	}

	@Override
	public void deleteById(Integer id) {
	
		productoRepository.deleteById(id);
		
	}

}
