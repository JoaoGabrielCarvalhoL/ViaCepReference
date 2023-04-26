package br.com.carv.viacep.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public record AddressResponse(
        @JsonProperty("cep")
        String zipCode,
        @JsonProperty("logradouro")
        String publicPlace,
        @JsonProperty("complemento")
        String complement,
        @JsonProperty("bairro")
        String neighborhood,
        @JsonProperty("localidade")
        String locality,
        @JsonProperty("uf")
        String federativeUnit,
        @JsonProperty("ibge")
        String BrazilianInstituteGeographyStatistics,
        @JsonProperty("gia")
        String gia,
        @JsonProperty("ddd")
        String DirectRemoteDialing,
        @JsonProperty("siafi")
        String IntegratedFinancialManagementSystemFederalGovernment

) implements Serializable {
}
