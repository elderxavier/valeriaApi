package br.com.elderxavier.apivaleria.dao;

import br.com.elderxavier.apivaleria.model.UsuariosAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosAdminDao extends JpaRepository<UsuariosAdmin, Long>{
    //UsuariosAdmin findById(int id);
    
}
