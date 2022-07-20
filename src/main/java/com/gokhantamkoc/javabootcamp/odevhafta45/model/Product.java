package com.gokhantamkoc.javabootcamp.odevhafta45.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class Product {
    private long id;
    private String name;
    private String description;

    public String toString() {
        return String.format("%d %s", this.id, this.name);
    }
}
