package com.produto.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produto.models.Produto;
import com.produto.repository.ProdutoRepository;

@RestController
@RequestMapping(value = "/api")
public class ProdutoResources {
	@Autowired
	private ProdutoRepository crud;
    
    @GetMapping("/produto/{id}")
    public Produto restProduto(@PathVariable("id") long id){
    	return crud.findById(id);
    }
    
    @PostMapping("/produto")
    public Produto restSave(@RequestBody Produto produto) {
    	return crud.save(produto);
    }
    
    @DeleteMapping("produto/{id}")
    public void restDelete(@PathVariable("id") long id) {
    	crud.delete(crud.findById(id));
    }
    
    @PutMapping("/produto")
    public Produto restUpdate(@RequestBody Produto produto) {
    	return crud.save(produto);
    }
    
    @GetMapping("/produtos")
    public List<Produto> restRead(){
    	return crud.findAll();
    }
}
