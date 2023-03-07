package com.example.dosen.controller;

import com.example.dosen.dto.DosenDto;
import com.example.dosen.dto.DosenReq;
import com.example.dosen.service.DosenService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dosen")
@RequiredArgsConstructor
public class DosenController {
    private final DosenService dosenService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveDosen(@RequestBody DosenReq dosenReq) {
        dosenService.saveDosen(dosenReq);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<DosenDto> getAllDosen() {
        return dosenService.getAllDosen();
    }
}
