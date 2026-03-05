
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
 * PeriodsSet
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "periodList"
})
public class PeriodsSet {

    /**
     * Period identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Period identifier.")
    private String id;
    /**
     * List of identifiers of the weeks that belong to the set.
     * (Required)
     * 
     */
    @JsonProperty("periodList")
    @JsonPropertyDescription("List of identifiers of the weeks that belong to the set.")
    private List<String> periodList = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Period identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Period identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * List of identifiers of the weeks that belong to the set.
     * (Required)
     * 
     */
    @JsonProperty("periodList")
    public List<String> getPeriodList() {
        return periodList;
    }

    /**
     * List of identifiers of the weeks that belong to the set.
     * (Required)
     * 
     */
    @JsonProperty("periodList")
    public void setPeriodList(List<String> periodList) {
        this.periodList = periodList;
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
