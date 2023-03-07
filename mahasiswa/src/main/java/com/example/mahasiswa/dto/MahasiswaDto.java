package com.example.mahasiswa.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MahasiswaDto {

    private Long id;
    private String nama;
    private String jurusan;
}
