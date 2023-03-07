package com.example.dosen.repository;

import com.example.dosen.model.Dosen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DosenRepo extends JpaRepository<Dosen,Long> {
}
