package com.example.exemplo01;

import java.util.List;

public interface PessoaService {
	List<Pessoa>listar();
	Pessoa listarId(int id);
	Pessoa add(Pessoa p);
	Pessoa edit(Pessoa p);
	Pessoa delete(int id); 
	
}
