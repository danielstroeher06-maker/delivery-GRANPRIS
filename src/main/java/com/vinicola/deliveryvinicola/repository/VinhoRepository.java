package com.vinicola.deliveryvinicola.repository;

import com.vinicola.deliveryvinicola.model.Vinho;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VinhoRepository extends JpaRepository<Vinho, Long> {
    List<Vinho> findByNome(String nome);

}
