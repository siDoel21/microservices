package com.example.mahasiswa.repository;

import com.example.mahasiswa.model.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MahasiswaRepo extends JpaRepository<Mahasiswa, Long> {
}
