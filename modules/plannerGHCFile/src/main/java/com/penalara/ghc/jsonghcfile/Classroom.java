
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
 * Classroom
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "shortName",
    "fullName",
    "isDedicated",
    "exKey",
    "capacity",
    "frameTemplate",
    "refBuilding",
    "fullDay"
})
public class Classroom {

    /**
     * Identifier name of the classroom.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Identifier name of the classroom.")
    private String id;
    /**
     * Short name of the classroom
     * 
     */
    @JsonProperty("shortName")
    @JsonPropertyDescription("Short name of the classroom")
    private String shortName;
    /**
     * Complete name of the classroom.
     * 
     */
    @JsonProperty("fullName")
    @JsonPropertyDescription("Complete name of the classroom.")
    private String fullName;
    /**
     * Indicates if the classroom is of a special-dedicated type, or is it a general purpose classroom
     * 
     */
    @JsonProperty("isDedicated")
    @JsonPropertyDescription("Indicates if the classroom is of a special-dedicated type, or is it a general purpose classroom")
    private Boolean isDedicated;
    /**
     * External key of the classroom
     * 
     */
    @JsonProperty("exKey")
    @JsonPropertyDescription("External key of the classroom")
    private String exKey;
    /**
     * The maximum number of students the classroom can hold.
     * 
     */
    @JsonProperty("capacity")
    @JsonPropertyDescription("The maximum number of students the classroom can hold.")
    private Integer capacity;
    /**
     * BannedFrameTemplate
     * <p>
     * Template with only banned preferences.It is used when the element cannot have non-preferred sections.
     * 
     */
    @JsonProperty("frameTemplate")
    @JsonPropertyDescription("Template with only banned preferences.")
    private List<BannedSectionPreference> frameTemplate = new ArrayList<BannedSectionPreference>();
    /**
     * Building identifier where the class is located.
     * 
     */
    @JsonProperty("refBuilding")
    @JsonPropertyDescription("Building identifier where the class is located.")
    private String refBuilding;
    /**
     * This indicates whether the classroom should be booked all day after holding a subject.
     * 
     */
    @JsonProperty("fullDay")
    @JsonPropertyDescription("This indicates whether the classroom should be booked all day after holding a subject.")
    private Boolean fullDay = false;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Identifier name of the classroom.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Identifier name of the classroom.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Short name of the classroom
     * 
     */
    @JsonProperty("shortName")
    public String getShortName() {
        return shortName;
    }

    /**
     * Short name of the classroom
     * 
     */
    @JsonProperty("shortName")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * Complete name of the classroom.
     * 
     */
    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    /**
     * Complete name of the classroom.
     * 
     */
    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Indicates if the classroom is of a special-dedicated type, or is it a general purpose classroom
     * 
     */
    @JsonProperty("isDedicated")
    public Boolean getIsDedicated() {
        return isDedicated;
    }

    /**
     * Indicates if the classroom is of a special-dedicated type, or is it a general purpose classroom
     * 
     */
    @JsonProperty("isDedicated")
    public void setIsDedicated(Boolean isDedicated) {
        this.isDedicated = isDedicated;
    }

    /**
     * External key of the classroom
     * 
     */
    @JsonProperty("exKey")
    public String getExKey() {
        return exKey;
    }

    /**
     * External key of the classroom
     * 
     */
    @JsonProperty("exKey")
    public void setExKey(String exKey) {
        this.exKey = exKey;
    }

    /**
     * The maximum number of students the classroom can hold.
     * 
     */
    @JsonProperty("capacity")
    public Integer getCapacity() {
        return capacity;
    }

    /**
     * The maximum number of students the classroom can hold.
     * 
     */
    @JsonProperty("capacity")
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    /**
     * BannedFrameTemplate
     * <p>
     * Template with only banned preferences.It is used when the element cannot have non-preferred sections.
     * 
     */
    @JsonProperty("frameTemplate")
    public List<BannedSectionPreference> getFrameTemplate() {
        return frameTemplate;
    }

    /**
     * BannedFrameTemplate
     * <p>
     * Template with only banned preferences.It is used when the element cannot have non-preferred sections.
     * 
     */
    @JsonProperty("frameTemplate")
    public void setFrameTemplate(List<BannedSectionPreference> frameTemplate) {
        this.frameTemplate = frameTemplate;
    }

    /**
     * Building identifier where the class is located.
     * 
     */
    @JsonProperty("refBuilding")
    public String getRefBuilding() {
        return refBuilding;
    }

    /**
     * Building identifier where the class is located.
     * 
     */
    @JsonProperty("refBuilding")
    public void setRefBuilding(String refBuilding) {
        this.refBuilding = refBuilding;
    }

    /**
     * This indicates whether the classroom should be booked all day after holding a subject.
     * 
     */
    @JsonProperty("fullDay")
    public Boolean getFullDay() {
        return fullDay;
    }

    /**
     * This indicates whether the classroom should be booked all day after holding a subject.
     * 
     */
    @JsonProperty("fullDay")
    public void setFullDay(Boolean fullDay) {
        this.fullDay = fullDay;
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
