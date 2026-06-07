package com.prog4.ejercicio10.repository;

import com.prog4.ejercicio10.model.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long> {
}
