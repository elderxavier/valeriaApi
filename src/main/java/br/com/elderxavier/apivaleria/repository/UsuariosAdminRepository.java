package br.com.elderxavier.apivaleria.repository;

import br.com.elderxavier.apivaleria.model.UsuariosAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosAdminRepository extends JpaRepository<UsuariosAdmin, Long>{
    //UsuariosAdmin findById(int id);
    
}
