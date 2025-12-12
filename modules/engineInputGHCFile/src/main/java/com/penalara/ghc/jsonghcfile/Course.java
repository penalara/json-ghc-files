
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
 * Course
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "fullName",
    "exKey",
    "courseSubjects"
})
public class Course {

    /**
     * Course identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Course identifier.")
    private String id;
    /**
     * Full name of the course.
     * 
     */
    @JsonProperty("fullName")
    @JsonPropertyDescription("Full name of the course.")
    private String fullName;
    /**
     * External key of the course
     * 
     */
    @JsonProperty("exKey")
    @JsonPropertyDescription("External key of the course")
    private String exKey;
    /**
     * List of subjects assigned to the course.
     * 
     */
    @JsonProperty("courseSubjects")
    @JsonPropertyDescription("List of subjects assigned to the course.")
    private List<CourseSubject> courseSubjects = new ArrayList<CourseSubject>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Course identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Course identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Full name of the course.
     * 
     */
    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    /**
     * Full name of the course.
     * 
     */
    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * External key of the course
     * 
     */
    @JsonProperty("exKey")
    public String getExKey() {
        return exKey;
    }

    /**
     * External key of the course
     * 
     */
    @JsonProperty("exKey")
    public void setExKey(String exKey) {
        this.exKey = exKey;
    }

    /**
     * List of subjects assigned to the course.
     * 
     */
    @JsonProperty("courseSubjects")
    public List<CourseSubject> getCourseSubjects() {
        return courseSubjects;
    }

    /**
     * List of subjects assigned to the course.
     * 
     */
    @JsonProperty("courseSubjects")
    public void setCourseSubjects(List<CourseSubject> courseSubjects) {
        this.courseSubjects = courseSubjects;
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
