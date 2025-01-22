package com.alura.literalura.repository;

import com.alura.literalura.model.Authors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AutorRepository extends JpaRepository<Authors,Long> {
//    @Query("SELECT COUNT(b) > 0 FROM Authors b WHERE b.nombre = :nombre")
//    boolean existTeNombre(@Param("nombre") String nombre);

    @Query("SELECT COUNT(b) > 0 FROM Authors b WHERE b.nombre = :nombre")
    Optional<Authors> ExistNombre(String nombre);

    @Query("SELECT b FROM Authors b  ORDER BY b.id DESC")
    List<Authors> listaDeAutores();

}
