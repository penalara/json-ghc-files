
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
 * Teacher
 * <p>
 * Object with personal information and teachers' preferences.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "shortName",
    "fullName",
    "exKey",
    "associationIdentifier",
    "overlappedAssessment",
    "frameTemplate",
    "generalSettings",
    "periodSettings"
})
public class Teacher {

    /**
     * Identifier of the teacher.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Identifier of the teacher.")
    private String id;
    /**
     * Short name of the teacher.
     * 
     */
    @JsonProperty("shortName")
    @JsonPropertyDescription("Short name of the teacher.")
    private String shortName;
    /**
     * Complete name of the teacher.
     * 
     */
    @JsonProperty("fullName")
    @JsonPropertyDescription("Complete name of the teacher.")
    private String fullName;
    /**
     * External key of the teacher
     * 
     */
    @JsonProperty("exKey")
    @JsonPropertyDescription("External key of the teacher")
    private String exKey;
    /**
     * Group or association of teachers who should have similar check-in and check-out times, if possible. This is useful for teachers who share transport.
     * 
     */
    @JsonProperty("associationIdentifier")
    @JsonPropertyDescription("Group or association of teachers who should have similar check-in and check-out times, if possible. This is useful for teachers who share transport.")
    private String associationIdentifier;
    /**
     * Number of overlapped evaluation sessions.The engine only process it into account when the SourceModule is 'je'
     * 
     */
    @JsonProperty("overlappedAssessment")
    @JsonPropertyDescription("Number of overlapped evaluation sessions.")
    private Integer overlappedAssessment = 1;
    /**
     * FrameTemplate
     * <p>
     * Templates with frame sections assignment preferences.
     * 
     */
    @JsonProperty("frameTemplate")
    @JsonPropertyDescription("Templates with frame sections assignment preferences.")
    private List<SectionPreference> frameTemplate = new ArrayList<SectionPreference>();
    /**
     * GeneralSettings
     * <p>
     * Strict and measurable teacher's conditions for the timetable. If there are not single periods, these conditions are the default, but can be specified individually for each period in the 'periodSettings' tag.
     * 
     */
    @JsonProperty("generalSettings")
    @JsonPropertyDescription("Strict and measurable teacher's conditions for the timetable. If there are not single periods, these conditions are the default, but can be specified individually for each period in the 'periodSettings' tag.")
    private GeneralSettings generalSettings;
    /**
     * PeriodsSettings
     * <p>
     * Strict and measurable teacher's conditions customized by week/period
     * 
     */
    @JsonProperty("periodSettings")
    @JsonPropertyDescription("Strict and measurable teacher's conditions customized by week/period")
    private List<PeriodSetting> periodSettings = new ArrayList<PeriodSetting>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Identifier of the teacher.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Identifier of the teacher.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Short name of the teacher.
     * 
     */
    @JsonProperty("shortName")
    public String getShortName() {
        return shortName;
    }

    /**
     * Short name of the teacher.
     * 
     */
    @JsonProperty("shortName")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * Complete name of the teacher.
     * 
     */
    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    /**
     * Complete name of the teacher.
     * 
     */
    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * External key of the teacher
     * 
     */
    @JsonProperty("exKey")
    public String getExKey() {
        return exKey;
    }

    /**
     * External key of the teacher
     * 
     */
    @JsonProperty("exKey")
    public void setExKey(String exKey) {
        this.exKey = exKey;
    }

    /**
     * Group or association of teachers who should have similar check-in and check-out times, if possible. This is useful for teachers who share transport.
     * 
     */
    @JsonProperty("associationIdentifier")
    public String getAssociationIdentifier() {
        return associationIdentifier;
    }

    /**
     * Group or association of teachers who should have similar check-in and check-out times, if possible. This is useful for teachers who share transport.
     * 
     */
    @JsonProperty("associationIdentifier")
    public void setAssociationIdentifier(String associationIdentifier) {
        this.associationIdentifier = associationIdentifier;
    }

    /**
     * Number of overlapped evaluation sessions.The engine only process it into account when the SourceModule is 'je'
     * 
     */
    @JsonProperty("overlappedAssessment")
    public Integer getOverlappedAssessment() {
        return overlappedAssessment;
    }

    /**
     * Number of overlapped evaluation sessions.The engine only process it into account when the SourceModule is 'je'
     * 
     */
    @JsonProperty("overlappedAssessment")
    public void setOverlappedAssessment(Integer overlappedAssessment) {
        this.overlappedAssessment = overlappedAssessment;
    }

    /**
     * FrameTemplate
     * <p>
     * Templates with frame sections assignment preferences.
     * 
     */
    @JsonProperty("frameTemplate")
    public List<SectionPreference> getFrameTemplate() {
        return frameTemplate;
    }

    /**
     * FrameTemplate
     * <p>
     * Templates with frame sections assignment preferences.
     * 
     */
    @JsonProperty("frameTemplate")
    public void setFrameTemplate(List<SectionPreference> frameTemplate) {
        this.frameTemplate = frameTemplate;
    }

    /**
     * GeneralSettings
     * <p>
     * Strict and measurable teacher's conditions for the timetable. If there are not single periods, these conditions are the default, but can be specified individually for each period in the 'periodSettings' tag.
     * 
     */
    @JsonProperty("generalSettings")
    public GeneralSettings getGeneralSettings() {
        return generalSettings;
    }

    /**
     * GeneralSettings
     * <p>
     * Strict and measurable teacher's conditions for the timetable. If there are not single periods, these conditions are the default, but can be specified individually for each period in the 'periodSettings' tag.
     * 
     */
    @JsonProperty("generalSettings")
    public void setGeneralSettings(GeneralSettings generalSettings) {
        this.generalSettings = generalSettings;
    }

    /**
     * PeriodsSettings
     * <p>
     * Strict and measurable teacher's conditions customized by week/period
     * 
     */
    @JsonProperty("periodSettings")
    public List<PeriodSetting> getPeriodSettings() {
        return periodSettings;
    }

    /**
     * PeriodsSettings
     * <p>
     * Strict and measurable teacher's conditions customized by week/period
     * 
     */
    @JsonProperty("periodSettings")
    public void setPeriodSettings(List<PeriodSetting> periodSettings) {
        this.periodSettings = periodSettings;
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
