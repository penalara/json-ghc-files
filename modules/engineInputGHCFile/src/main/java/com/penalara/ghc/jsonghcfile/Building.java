
package com.penalara.ghc.jsonghcfile;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Building
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "fullName",
    "distances"
})
public class Building {

    /**
     * Building identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Building identifier.")
    private String id;
    /**
     * Building full name.
     * 
     */
    @JsonProperty("fullName")
    @JsonPropertyDescription("Building full name.")
    private String fullName;
    /**
     * Distances
     * <p>
     * Distance in minutes to another school building.
     * 
     */
    @JsonProperty("distances")
    @JsonPropertyDescription("Distance in minutes to another school building.")
    private List<Distance> distances = new ArrayList<Distance>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Building identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Building identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Building full name.
     * 
     */
    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    /**
     * Building full name.
     * 
     */
    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Distances
     * <p>
     * Distance in minutes to another school building.
     * 
     */
    @JsonProperty("distances")
    public List<Distance> getDistances() {
        return distances;
    }

    /**
     * Distances
     * <p>
     * Distance in minutes to another school building.
     * 
     */
    @JsonProperty("distances")
    public void setDistances(List<Distance> distances) {
        this.distances = distances;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
