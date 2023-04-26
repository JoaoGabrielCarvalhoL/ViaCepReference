package br.com.carv.viacep.service.impl;

import br.com.carv.viacep.dto.response.AddressResponse;
import br.com.carv.viacep.feign.AddressFeign;
import br.com.carv.viacep.service.AddressService;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class AddressServiceImpl implements AddressService {
    private final Logger logger = Logger.getLogger(AddressServiceImpl.class.getCanonicalName());
    private final AddressFeign addressFeign;

    public AddressServiceImpl(AddressFeign addressFeign) {
        this.addressFeign = addressFeign;
    }

    @Override
    public AddressResponse findAddressByCep(String cep) {
        logger.info("Getting Address by ViaCep.");
        return this.addressFeign.findAddressByCep(cep);
    }
}
