package br.com.carv.viacep.service;

import br.com.carv.viacep.dto.response.AddressResponse;

public interface AddressService {

    AddressResponse findAddressByCep(final String cep);
}
