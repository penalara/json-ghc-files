
package com.penalara.ghc.jsonghcfile;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AliasDayDeifinition
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dayId",
    "alias"
})
public class AliasDayDeifinition {

    /**
     * Identifier of the day of the week, it is unique across all weeks.
     * (Required)
     * 
     */
    @JsonProperty("dayId")
    @JsonPropertyDescription("Identifier of the day of the week, it is unique across all weeks.")
    private Integer dayId;
    /**
     * Header to identify the day in the results table and the frame column.
     * (Required)
     * 
     */
    @JsonProperty("alias")
    @JsonPropertyDescription("Header to identify the day in the results table and the frame column.")
    private String alias;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Identifier of the day of the week, it is unique across all weeks.
     * (Required)
     * 
     */
    @JsonProperty("dayId")
    public Integer getDayId() {
        return dayId;
    }

    /**
     * Identifier of the day of the week, it is unique across all weeks.
     * (Required)
     * 
     */
    @JsonProperty("dayId")
    public void setDayId(Integer dayId) {
        this.dayId = dayId;
    }

    /**
     * Header to identify the day in the results table and the frame column.
     * (Required)
     * 
     */
    @JsonProperty("alias")
    public String getAlias() {
        return alias;
    }

    /**
     * Header to identify the day in the results table and the frame column.
     * (Required)
     * 
     */
    @JsonProperty("alias")
    public void setAlias(String alias) {
        this.alias = alias;
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
