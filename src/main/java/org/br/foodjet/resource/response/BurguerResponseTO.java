package org.br.foodjet.resource.response;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

@Data
@RegisterForReflection
public class BurguerResponseTO {

    private Long id;
    private String name;
    private Double value;
}