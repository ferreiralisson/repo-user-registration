package com.example.userregistrationservice.repository;

import com.example.userregistrationservice.model.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
    @Query("SELECT us FROM Usuario us LEFT JOIN FETCH Endereco en ON en.id = us.id")
    public List<Usuario> getAllWithEnderecos();
}
