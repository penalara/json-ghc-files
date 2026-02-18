
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
 * Period
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "alias",
    "lastDay",
    "dayAliases"
})
public class Period {

    /**
     * Period identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Period identifier.")
    private String id;
    /**
     * Identifier assigned to the period based on how it corresponds to the dates in a calendar. It is an interval that indicates which actual calendar day the first and the last day correspond to.
     * 
     */
    @JsonProperty("alias")
    @JsonPropertyDescription("Identifier assigned to the period based on how it corresponds to the dates in a calendar. It is an interval that indicates which actual calendar day the first and the last day correspond to.")
    private String alias;
    /**
     * The end day of the period (included).
     * (Required)
     * 
     */
    @JsonProperty("lastDay")
    @JsonPropertyDescription("The end day of the period (included).")
    private Integer lastDay;
    /**
     * AliasDayList
     * <p>
     * Alias for each day of the period. It is an optional definition.
     * 
     */
    @JsonProperty("dayAliases")
    @JsonPropertyDescription("Alias for each day of the period. It is an optional definition.")
    private List<AliasDayDeifinition> dayAliases = new ArrayList<AliasDayDeifinition>();
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
     * Identifier assigned to the period based on how it corresponds to the dates in a calendar. It is an interval that indicates which actual calendar day the first and the last day correspond to.
     * 
     */
    @JsonProperty("alias")
    public String getAlias() {
        return alias;
    }

    /**
     * Identifier assigned to the period based on how it corresponds to the dates in a calendar. It is an interval that indicates which actual calendar day the first and the last day correspond to.
     * 
     */
    @JsonProperty("alias")
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * The end day of the period (included).
     * (Required)
     * 
     */
    @JsonProperty("lastDay")
    public Integer getLastDay() {
        return lastDay;
    }

    /**
     * The end day of the period (included).
     * (Required)
     * 
     */
    @JsonProperty("lastDay")
    public void setLastDay(Integer lastDay) {
        this.lastDay = lastDay;
    }

    /**
     * AliasDayList
     * <p>
     * Alias for each day of the period. It is an optional definition.
     * 
     */
    @JsonProperty("dayAliases")
    public List<AliasDayDeifinition> getDayAliases() {
        return dayAliases;
    }

    /**
     * AliasDayList
     * <p>
     * Alias for each day of the period. It is an optional definition.
     * 
     */
    @JsonProperty("dayAliases")
    public void setDayAliases(List<AliasDayDeifinition> dayAliases) {
        this.dayAliases = dayAliases;
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
