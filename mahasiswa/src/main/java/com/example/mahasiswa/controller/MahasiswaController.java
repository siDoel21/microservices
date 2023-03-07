package com.example.mahasiswa.controller;

import com.example.mahasiswa.dto.MahasiswaDto;
import com.example.mahasiswa.dto.MahasiswaReq;
import com.example.mahasiswa.service.MahasiswaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mahasiswa")
@RequiredArgsConstructor
public class MahasiswaController {
    private final MahasiswaService mahasiswaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveMahasiswa(@RequestBody MahasiswaReq mahasiswaReq) {
        mahasiswaService.saveMahasiswa(mahasiswaReq);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<MahasiswaDto> getAllMahasiswa() {
        return mahasiswaService.getAllMahasiswa();
    }
}
