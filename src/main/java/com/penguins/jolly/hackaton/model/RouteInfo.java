package com.penguins.jolly.hackaton.model;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import java.util.HashMap;
import java.util.Map;

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

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RouteInfo {




    @JsonProperty("linkId")
    public String linkId;
    /*
   /// @JsonProperty("mappedPosition")
    public MappedPosition mappedPosition;
    @JsonProperty("originalPosition")
    public OriginalPosition originalPosition;
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
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();*/
}
