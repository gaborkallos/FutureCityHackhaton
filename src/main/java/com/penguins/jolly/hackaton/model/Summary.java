package com.penguins.jolly.hackaton.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "distance",
        "trafficTime",
        "baseTime",
        "flags",
        "text",
        "travelTime",
        "_type"
})
public class Summary {

    @JsonProperty("distance")
    public Integer distance;
    @JsonProperty("trafficTime")
    public Integer trafficTime;
    @JsonProperty("baseTime")
    public Integer baseTime;
    @JsonProperty("flags")
    public List<String> flags = null;
    @JsonProperty("text")
    public String text;
    @JsonProperty("travelTime")
    public Integer travelTime;
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
