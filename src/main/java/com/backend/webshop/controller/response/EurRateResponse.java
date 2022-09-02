package com.backend.webshop.controller.response;

import com.backend.webshop.model.HnbRate;
import lombok.Data;

@Data
public class EurRateResponse {

    private HnbRate[] hnbRateForEur;
}
