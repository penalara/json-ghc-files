
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
 * Department
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "fullName",
    "messageToDepartment",
    "isNew",
    "exKey",
    "email",
    "refTeacher",
    "refSubjects"
})
public class Department {

    /**
     * Department identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Department identifier.")
    private String id;
    /**
     * Full name of the department.
     * 
     */
    @JsonProperty("fullName")
    @JsonPropertyDescription("Full name of the department.")
    private String fullName;
    /**
     * Message that will be shown to the Department in the desiderata capture program.
     * 
     */
    @JsonProperty("messageToDepartment")
    @JsonPropertyDescription("Message that will be shown to the Department in the desiderata capture program.")
    private String messageToDepartment;
    /**
     * Boolean that indicates if the Department has been newly created in the desiderata capture module.
     * 
     */
    @JsonProperty("isNew")
    @JsonPropertyDescription("Boolean that indicates if the Department has been newly created in the desiderata capture module.")
    private Boolean isNew;
    /**
     * Identifier of the Department in external application or academic manager.
     * 
     */
    @JsonProperty("exKey")
    @JsonPropertyDescription("Identifier of the Department in external application or academic manager.")
    private String exKey;
    /**
     * It is an email type that is associated with the Department
     * 
     */
    @JsonProperty("email")
    @JsonPropertyDescription("It is an email type that is associated with the Department")
    private String email;
    /**
     * Identifier of the list of teachers who are in this department
     * 
     */
    @JsonProperty("refTeacher")
    @JsonPropertyDescription("Identifier of the list of teachers who are in this department")
    private List<String> refTeacher = new ArrayList<String>();
    /**
     * Identifier of the list of subjects who are in this department
     * 
     */
    @JsonProperty("refSubjects")
    @JsonPropertyDescription("Identifier of the list of subjects who are in this department")
    private List<String> refSubjects = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Department identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Department identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Full name of the department.
     * 
     */
    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    /**
     * Full name of the department.
     * 
     */
    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Message that will be shown to the Department in the desiderata capture program.
     * 
     */
    @JsonProperty("messageToDepartment")
    public String getMessageToDepartment() {
        return messageToDepartment;
    }

    /**
     * Message that will be shown to the Department in the desiderata capture program.
     * 
     */
    @JsonProperty("messageToDepartment")
    public void setMessageToDepartment(String messageToDepartment) {
        this.messageToDepartment = messageToDepartment;
    }

    /**
     * Boolean that indicates if the Department has been newly created in the desiderata capture module.
     * 
     */
    @JsonProperty("isNew")
    public Boolean getIsNew() {
        return isNew;
    }

    /**
     * Boolean that indicates if the Department has been newly created in the desiderata capture module.
     * 
     */
    @JsonProperty("isNew")
    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    /**
     * Identifier of the Department in external application or academic manager.
     * 
     */
    @JsonProperty("exKey")
    public String getExKey() {
        return exKey;
    }

    /**
     * Identifier of the Department in external application or academic manager.
     * 
     */
    @JsonProperty("exKey")
    public void setExKey(String exKey) {
        this.exKey = exKey;
    }

    /**
     * It is an email type that is associated with the Department
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * It is an email type that is associated with the Department
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Identifier of the list of teachers who are in this department
     * 
     */
    @JsonProperty("refTeacher")
    public List<String> getRefTeacher() {
        return refTeacher;
    }

    /**
     * Identifier of the list of teachers who are in this department
     * 
     */
    @JsonProperty("refTeacher")
    public void setRefTeacher(List<String> refTeacher) {
        this.refTeacher = refTeacher;
    }

    /**
     * Identifier of the list of subjects who are in this department
     * 
     */
    @JsonProperty("refSubjects")
    public List<String> getRefSubjects() {
        return refSubjects;
    }

    /**
     * Identifier of the list of subjects who are in this department
     * 
     */
    @JsonProperty("refSubjects")
    public void setRefSubjects(List<String> refSubjects) {
        this.refSubjects = refSubjects;
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
