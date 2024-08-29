package org.spring.resttemplate.service;

import lombok.RequiredArgsConstructor;
import org.spring.resttemplate.dto.AvgPriceDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class BinanceService {

    private final RestTemplate restTemplate;

    @Value("${binance-base-url}")
    private String bitcoinBaseUrl;

    public AvgPriceDto getAvgPrice(String symbol) {
        AvgPriceDto avgPriceDto = restTemplate.getForObject(bitcoinBaseUrl + "?symbol=" + symbol, AvgPriceDto.class);
        Objects.requireNonNull(avgPriceDto).setSymbol(symbol);

        return avgPriceDto;
    }

}
