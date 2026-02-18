
package com.penalara.ghc.jsonghcfile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


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
    "technicalTeacher",
    "type",
    "refClassroom",
    "refAlternativeClassRoomSet",
    "refColorInResult",
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
     * It indicates whether the subject is teach by technical teacher.
     * 
     */
    @JsonProperty("technicalTeacher")
    @JsonPropertyDescription("It indicates whether the subject is teach by technical teacher.")
    private Boolean technicalTeacher = false;
    /**
     * Type of the subject
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of the subject")
    private Subject.Type type;
    /**
     * Id of the classroom assigned to teach the subject.
     * 
     */
    @JsonProperty("refClassroom")
    @JsonPropertyDescription("Id of the classroom assigned to teach the subject.")
    private String refClassroom;
    /**
     * Id of the set of alternative classrooms assigned to schedule the subject.
     * 
     */
    @JsonProperty("refAlternativeClassRoomSet")
    @JsonPropertyDescription("Id of the set of alternative classrooms assigned to schedule the subject.")
    private String refAlternativeClassRoomSet;
    /**
     * Color's code used to represent the subject in the result.
     * 
     */
    @JsonProperty("refColorInResult")
    @JsonPropertyDescription("Color's code used to represent the subject in the result.")
    private String refColorInResult;
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
     * Type of the subject
     * 
     */
    @JsonProperty("type")
    public Subject.Type getType() {
        return type;
    }

    /**
     * Type of the subject
     * 
     */
    @JsonProperty("type")
    public void setType(Subject.Type type) {
        this.type = type;
    }

    /**
     * Id of the classroom assigned to teach the subject.
     * 
     */
    @JsonProperty("refClassroom")
    public String getRefClassroom() {
        return refClassroom;
    }

    /**
     * Id of the classroom assigned to teach the subject.
     * 
     */
    @JsonProperty("refClassroom")
    public void setRefClassroom(String refClassroom) {
        this.refClassroom = refClassroom;
    }

    /**
     * Id of the set of alternative classrooms assigned to schedule the subject.
     * 
     */
    @JsonProperty("refAlternativeClassRoomSet")
    public String getRefAlternativeClassRoomSet() {
        return refAlternativeClassRoomSet;
    }

    /**
     * Id of the set of alternative classrooms assigned to schedule the subject.
     * 
     */
    @JsonProperty("refAlternativeClassRoomSet")
    public void setRefAlternativeClassRoomSet(String refAlternativeClassRoomSet) {
        this.refAlternativeClassRoomSet = refAlternativeClassRoomSet;
    }

    /**
     * Color's code used to represent the subject in the result.
     * 
     */
    @JsonProperty("refColorInResult")
    public String getRefColorInResult() {
        return refColorInResult;
    }

    /**
     * Color's code used to represent the subject in the result.
     * 
     */
    @JsonProperty("refColorInResult")
    public void setRefColorInResult(String refColorInResult) {
        this.refColorInResult = refColorInResult;
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


    /**
     * Type of the subject
     * 
     */
    public enum Type {

        CORE("core"),
        SPECIFIC("specific"),
        ELECTIVE("elective"),
        MENTORING("mentoring");
        private final String value;
        private final static Map<String, Subject.Type> CONSTANTS = new HashMap<String, Subject.Type>();

        static {
            for (Subject.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Subject.Type fromValue(String value) {
            Subject.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
