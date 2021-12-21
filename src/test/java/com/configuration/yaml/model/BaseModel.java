package com.configuration.yaml.model;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.LinkedHashMap;
import java.util.Map;

public class BaseModel {
    private boolean active;
    private Map<String, Object> properties = new LinkedHashMap<>();
    public BaseModel() {
    }

    public boolean isActive() {
        return active;
    }

    @JsonAnySetter
    void setProperties(String key, Object value) {
        properties.put(key, value);
    }

    @JsonAnyGetter
    public Map<String, Object> getProperties() {
        return properties;
    }

}
