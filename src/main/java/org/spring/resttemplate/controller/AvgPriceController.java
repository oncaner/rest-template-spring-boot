package org.spring.resttemplate.controller;

import lombok.RequiredArgsConstructor;
import org.spring.resttemplate.dto.response.AvgPriceDto;
import org.spring.resttemplate.service.BinanceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/avg-price")
public class AvgPriceController {

    private final BinanceService binanceService;

    @GetMapping
    public ResponseEntity<AvgPriceDto> getAvgPrice(@RequestParam("symbol") String symbol) {
        return ResponseEntity.ok(binanceService.getAvgPrice(symbol));
    }

}
