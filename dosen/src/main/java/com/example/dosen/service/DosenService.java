package com.example.dosen.service;

import com.example.dosen.dto.DosenDto;
import com.example.dosen.dto.DosenReq;
import com.example.dosen.model.Dosen;
import com.example.dosen.repository.DosenRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class DosenService {
    private final DosenRepo dosenRepo;

    public void saveDosen(DosenReq dosenReq) {
        Dosen dosen = Dosen.builder()
                .nama(dosenReq.getNama())
                .mataKuliah(dosenReq.getMataKuliah())
                .build();

        dosenRepo.save(dosen);
//        log.info();
    }

    public List<DosenDto> getAllDosen() {
        List<Dosen> dosens = dosenRepo.findAll();
        return dosens.stream().map(this::toDto).collect(Collectors.toList());
    }

    private DosenDto toDto(Dosen dosen) {
        return DosenDto.builder()
                .id(dosen.getId())
                .nama(dosen.getNama())
                .mataKuliah(dosen.getMataKuliah())
                .build();
    }
}
