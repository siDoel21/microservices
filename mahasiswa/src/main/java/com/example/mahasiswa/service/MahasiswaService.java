package com.example.mahasiswa.service;

import com.example.mahasiswa.dto.MahasiswaDto;
import com.example.mahasiswa.dto.MahasiswaReq;
import com.example.mahasiswa.model.Mahasiswa;
import com.example.mahasiswa.repository.MahasiswaRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class MahasiswaService {

    private final MahasiswaRepo mahasiswaRepo;

    public void saveMahasiswa(MahasiswaReq mahasiswaReq){
        Mahasiswa mahasiswa = Mahasiswa.builder()
                .nama(mahasiswaReq.getNama())
                .jurusan(mahasiswaReq.getJurusan())
                .build();

        mahasiswaRepo.save(mahasiswa);
    }

    public List<MahasiswaDto>getAllMahasiswa() {
        List<Mahasiswa> mahasiswas =mahasiswaRepo.findAll();
        return mahasiswas.stream().map(this::toDto).collect(Collectors.toList());
    }

    private MahasiswaDto toDto(Mahasiswa mahasiswa) {
        return MahasiswaDto.builder()
                .id(mahasiswa.getId())
                .nama(mahasiswa.getNama())
                .jurusan(mahasiswa.getJurusan())
                .build();
    }
}
