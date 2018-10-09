package br.com.elderxavier.apivaleria.repository;

import br.com.elderxavier.apivaleria.model.ProdutoTipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoTipoRepository extends JpaRepository<ProdutoTipo, Long>{ 
    
}
