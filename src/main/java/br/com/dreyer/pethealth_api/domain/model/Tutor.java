package br.com.dreyer.pethealth_api.domain.model;

import lombok.Builder;

@Builder
public record Tutor(
        Long id,
        String nome,
        String email,
        String celular,
        String endereco) {
}
