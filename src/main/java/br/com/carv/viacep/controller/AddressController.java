package br.com.carv.viacep.controller;

import br.com.carv.viacep.dto.response.AddressResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface AddressController {
    @GetMapping("/{cep}")
    ResponseEntity<AddressResponse> findAddressByCep(@PathVariable("cep") String cep);
}
