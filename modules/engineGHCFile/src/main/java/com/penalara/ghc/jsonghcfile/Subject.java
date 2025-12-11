
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
 * Subject
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "shortName",
    "fullName",
    "exKey",
    "isStudentMentoring",
    "technicalTeacher",
    "frameTemplate"
})
public class Subject {

    /**
     * Subject identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Subject identifier.")
    private String id;
    /**
     * Short name of the subject.
     * 
     */
    @JsonProperty("shortName")
    @JsonPropertyDescription("Short name of the subject.")
    private String shortName;
    /**
     * Complete name of the subject.
     * 
     */
    @JsonProperty("fullName")
    @JsonPropertyDescription("Complete name of the subject.")
    private String fullName;
    /**
     * External key of the subject
     * 
     */
    @JsonProperty("exKey")
    @JsonPropertyDescription("External key of the subject")
    private String exKey;
    /**
     * It indicates whether the subject is a tutorial.
     * 
     */
    @JsonProperty("isStudentMentoring")
    @JsonPropertyDescription("It indicates whether the subject is a tutorial.")
    private Boolean isStudentMentoring = false;
    /**
     * It indicates whether the subject is teach by technical teacher.
     * 
     */
    @JsonProperty("technicalTeacher")
    @JsonPropertyDescription("It indicates whether the subject is teach by technical teacher.")
    private Boolean technicalTeacher = false;
    /**
     * FrameTemplate
     * <p>
     * Templates with frame sections assignment preferences.
     * 
     */
    @JsonProperty("frameTemplate")
    @JsonPropertyDescription("Templates with frame sections assignment preferences.")
    private List<SectionPreference> frameTemplate = new ArrayList<SectionPreference>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Subject identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Subject identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Short name of the subject.
     * 
     */
    @JsonProperty("shortName")
    public String getShortName() {
        return shortName;
    }

    /**
     * Short name of the subject.
     * 
     */
    @JsonProperty("shortName")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * Complete name of the subject.
     * 
     */
    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    /**
     * Complete name of the subject.
     * 
     */
    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * External key of the subject
     * 
     */
    @JsonProperty("exKey")
    public String getExKey() {
        return exKey;
    }

    /**
     * External key of the subject
     * 
     */
    @JsonProperty("exKey")
    public void setExKey(String exKey) {
        this.exKey = exKey;
    }

    /**
     * It indicates whether the subject is a tutorial.
     * 
     */
    @JsonProperty("isStudentMentoring")
    public Boolean getIsStudentMentoring() {
        return isStudentMentoring;
    }

    /**
     * It indicates whether the subject is a tutorial.
     * 
     */
    @JsonProperty("isStudentMentoring")
    public void setIsStudentMentoring(Boolean isStudentMentoring) {
        this.isStudentMentoring = isStudentMentoring;
    }

    /**
     * It indicates whether the subject is teach by technical teacher.
     * 
     */
    @JsonProperty("technicalTeacher")
    public Boolean getTechnicalTeacher() {
        return technicalTeacher;
    }

    /**
     * It indicates whether the subject is teach by technical teacher.
     * 
     */
    @JsonProperty("technicalTeacher")
    public void setTechnicalTeacher(Boolean technicalTeacher) {
        this.technicalTeacher = technicalTeacher;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
