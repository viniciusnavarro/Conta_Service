package com.example.Conta_Service_2025.repository;

import com.example.Conta_Service_2025.model.Pix;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface PixRepository extends JpaRepository<Pix, UUID> {

    Optional<Pix> findByIdempotencia(final String idempotencia);

}
