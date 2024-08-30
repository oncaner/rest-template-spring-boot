package org.spring.resttemplate.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AvgPriceDto {
    private Integer mins;
    private String price;
    private String symbol;
}
