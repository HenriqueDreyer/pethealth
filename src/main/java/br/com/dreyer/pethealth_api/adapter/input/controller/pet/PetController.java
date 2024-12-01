package br.com.dreyer.pethealth_api.adapter.input.controller.pet;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/pets")
public class PetController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> buscarPetsUsuario(@RequestAttribute("X-USER-ID-HEADER") Long userId) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
