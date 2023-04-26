package br.com.carv.viacep.feign;

import br.com.carv.viacep.dto.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws/", name = "viacep")
public interface AddressFeign {

    @GetMapping("{cep}/json")
    AddressResponse findAddressByCep(@PathVariable("cep") String cep);
}
