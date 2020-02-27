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
        "linkId",
        "mappedPosition",
        "originalPosition",
        "type",
        "spot",
        "sideOfStreet",
        "mappedRoadName",
        "label",
        "shapeIndex",
        "source"
})
public class End {

    @JsonProperty("linkId")
    public String linkId;
    @JsonProperty("mappedPosition")
    public MappedPosition__ mappedPosition;
    @JsonProperty("originalPosition")
    public OriginalPosition__ originalPosition;
    @JsonProperty("type")
    public String type;
    @JsonProperty("spot")
    public Double spot;
    @JsonProperty("sideOfStreet")
    public String sideOfStreet;
    @JsonProperty("mappedRoadName")
    public String mappedRoadName;
    @JsonProperty("label")
    public String label;
    @JsonProperty("shapeIndex")
    public Integer shapeIndex;
    @JsonProperty("source")
    public String source;
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