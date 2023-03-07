package com.example.dosen.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DosenDto {

    private Long id;
    private String nama;
    private String mataKuliah;
}
