package br.com.dreyer.pethealth_api.domain.model;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public record Medicamento(
        Long id,
        TipoMedicamento tipo,
        String nome,
        String fabricante,
        String nomeVeterinario,
        String crvVeterinario,
        LocalDate dataAdministracao,
        LocalDate proximaAdministracao) {
}
