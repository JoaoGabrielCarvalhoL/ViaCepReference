package br.com.carv.viacep.controller.impl;

import br.com.carv.viacep.controller.AddressController;
import br.com.carv.viacep.dto.response.AddressResponse;
import br.com.carv.viacep.service.AddressService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("address")
public class AddressControllerImpl implements AddressController {

    private final AddressService addressService;

    public AddressControllerImpl(AddressService addressService) {
        this.addressService = addressService;
    }

    @Override
    public ResponseEntity<AddressResponse> findAddressByCep(String cep) {
        return new ResponseEntity<AddressResponse>
                (this.addressService.findAddressByCep(cep),HttpStatus.OK );
    }
}
