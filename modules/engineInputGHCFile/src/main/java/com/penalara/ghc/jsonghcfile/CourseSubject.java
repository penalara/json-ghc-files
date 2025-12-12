
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
 * CourseSubject
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "numHours",
    "refSubject"
})
public class CourseSubject {

    /**
     * Number of hours that this subject is taught. By default, it is 1.
     * (Required)
     * 
     */
    @JsonProperty("numHours")
    @JsonPropertyDescription("Number of hours that this subject is taught. By default, it is 1.")
    private Integer numHours;
    /**
     * Subject of the course.
     * (Required)
     * 
     */
    @JsonProperty("refSubject")
    @JsonPropertyDescription("Subject of the course.")
    private String refSubject;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Number of hours that this subject is taught. By default, it is 1.
     * (Required)
     * 
     */
    @JsonProperty("numHours")
    public Integer getNumHours() {
        return numHours;
    }

    /**
     * Number of hours that this subject is taught. By default, it is 1.
     * (Required)
     * 
     */
    @JsonProperty("numHours")
    public void setNumHours(Integer numHours) {
        this.numHours = numHours;
    }

    /**
     * Subject of the course.
     * (Required)
     * 
     */
    @JsonProperty("refSubject")
    public String getRefSubject() {
        return refSubject;
    }

    /**
     * Subject of the course.
     * (Required)
     * 
     */
    @JsonProperty("refSubject")
    public void setRefSubject(String refSubject) {
        this.refSubject = refSubject;
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
