package com.configuration.yaml.model;

import lombok.Data;

@Data
public class EnvironmentModel {

    private BaseModel integrate;
    private BaseModel test;
    private BaseModel stag;


}
