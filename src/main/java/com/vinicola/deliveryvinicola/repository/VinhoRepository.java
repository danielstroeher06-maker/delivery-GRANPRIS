package com.vinicola.deliveryvinicola.repository;

import com.vinicola.deliveryvinicola.model.Vinho;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface VinhoRepository extends JpaRepository<Vinho, Long> {
    Optional <Vinho> findByNome(String nome);

}
