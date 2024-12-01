package br.com.dreyer.pethealth_api.domain.model;

import lombok.Builder;

import java.time.LocalDate;
import java.util.List;

@Builder
public record Pet(
        Long id,
        String nome,
        Long tutorId,
        LocalDate dataNascimento,
        List<Medicamento> medicamentos) {
}
