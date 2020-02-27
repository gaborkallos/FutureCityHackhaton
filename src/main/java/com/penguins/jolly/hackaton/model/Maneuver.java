package com.penguins.jolly.hackaton.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "position",
        "instruction",
        "travelTime",
        "length",
        "id",
        "_type"
})
public class Maneuver {

    @JsonProperty("position")
    public Position position;
    @JsonProperty("instruction")
    public String instruction;
    @JsonProperty("travelTime")
    public Integer travelTime;
    @JsonProperty("length")
    public Integer length;
    @JsonProperty("id")
    public String id;
    @JsonProperty("_type")
    public String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
