package com.backend.webshop.service;

import com.backend.webshop.configuration.ApplicationConfiguration;
import com.backend.webshop.model.HnbRate;
import com.backend.webshop.service.exception.HnbRateServiceException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class HnbRateServiceImpl implements RateService{

    private final RestTemplate restTemplate;
    private final ApplicationConfiguration applicationConfiguration;

    public BigDecimal getRateForEur() {
        URL url = null;
        try {
            url = new URL(applicationConfiguration.getEurUrl());
        } catch (MalformedURLException e) {
            throw new HnbRateServiceException("Could not get rate service url");
        }

        ResponseEntity<HnbRate[]> eurRateResponse = restTemplate.getForEntity(url.toString(), HnbRate[].class);
        HnbRate eurRateResponseBody = Objects.requireNonNull(eurRateResponse.getBody())[0];

        String eurBuyingRateString = eurRateResponseBody.getExchangeRatePurchasing();
        String eurBuyingRateStringCleaned = eurBuyingRateString.replace(",", ".");

        return new BigDecimal(eurBuyingRateStringCleaned);
    }
}
