package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    // Lista todos os produtos
    @GetMapping
    public List<Product> listAll() {
        return repository.findAll();
    }

    // Cria um novo produto
    @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product product) {
        System.out.println("Recebido: " + product.getName());
        Product savedProduct = repository.save(product);
        return ResponseEntity.ok(savedProduct);
    }

    // Busca produto por ID
    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable Long id) {
        System.out.println("Buscando produto com ID: " + id);
        return repository.findById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

}
