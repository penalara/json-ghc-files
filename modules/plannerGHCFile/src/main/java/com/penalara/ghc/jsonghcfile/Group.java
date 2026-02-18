
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
 * Group
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
    "refFrame",
    "frameTemplate",
    "numStudents",
    "freeAfternoons",
    "notGaps",
    "gapsAlwaysInNonPreferred",
    "refCourse",
    "includedGroups",
    "refTeacher",
    "refClassroom",
    "refAlternativeClassRoomSet"
})
public class Group {

    /**
     * Group identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Group identifier.")
    private String id;
    /**
     * Short name of the group.
     * 
     */
    @JsonProperty("shortName")
    @JsonPropertyDescription("Short name of the group.")
    private String shortName;
    /**
     * Complete name of the group.
     * 
     */
    @JsonProperty("fullName")
    @JsonPropertyDescription("Complete name of the group.")
    private String fullName;
    /**
     * External key of the subject
     * 
     */
    @JsonProperty("exKey")
    @JsonPropertyDescription("External key of the subject")
    private String exKey;
    /**
     * Group's frame identifier.
     * (Required)
     * 
     */
    @JsonProperty("refFrame")
    @JsonPropertyDescription("Group's frame identifier.")
    private String refFrame;
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
     * Number of students in the group.
     * 
     */
    @JsonProperty("numStudents")
    @JsonPropertyDescription("Number of students in the group.")
    private Integer numStudents;
    /**
     * Stric number of free afternoons for the group.
     * 
     */
    @JsonProperty("freeAfternoons")
    @JsonPropertyDescription("Stric number of free afternoons for the group.")
    private Integer freeAfternoons;
    /**
     * ConditionType
     * <p>
     * Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("notGaps")
    @JsonPropertyDescription("Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.")
    private ConditionType notGaps;
    /**
     * This indicates whether the engine should be in the positions marked as non-preferred in the template for free intervals or gaps.
     * 
     */
    @JsonProperty("gapsAlwaysInNonPreferred")
    @JsonPropertyDescription("This indicates whether the engine should be in the positions marked as non-preferred in the template for free intervals or gaps.")
    private Boolean gapsAlwaysInNonPreferred;
    /**
     * Course identifier to which the group belongs.
     * 
     */
    @JsonProperty("refCourse")
    @JsonPropertyDescription("Course identifier to which the group belongs.")
    private String refCourse;
    /**
     * Allows to indicate its a circunstancial group, formed by oficial groups to recibe optional or main subjects.
     * 
     */
    @JsonProperty("includedGroups")
    @JsonPropertyDescription("Allows to indicate its a circunstancial group, formed by oficial groups to recibe optional or main subjects.")
    private List<String> includedGroups = new ArrayList<String>();
    /**
     * Id of the tutor teacher assigned to the group
     * 
     */
    @JsonProperty("refTeacher")
    @JsonPropertyDescription("Id of the tutor teacher assigned to the group")
    private String refTeacher;
    /**
     * Id of the classroom assigned to the group
     * 
     */
    @JsonProperty("refClassroom")
    @JsonPropertyDescription("Id of the classroom assigned to the group")
    private String refClassroom;
    /**
     * Id of the set of alternative classrooms assigned to the group.
     * 
     */
    @JsonProperty("refAlternativeClassRoomSet")
    @JsonPropertyDescription("Id of the set of alternative classrooms assigned to the group.")
    private String refAlternativeClassRoomSet;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Group identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Group identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Short name of the group.
     * 
     */
    @JsonProperty("shortName")
    public String getShortName() {
        return shortName;
    }

    /**
     * Short name of the group.
     * 
     */
    @JsonProperty("shortName")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * Complete name of the group.
     * 
     */
    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    /**
     * Complete name of the group.
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
     * Group's frame identifier.
     * (Required)
     * 
     */
    @JsonProperty("refFrame")
    public String getRefFrame() {
        return refFrame;
    }

    /**
     * Group's frame identifier.
     * (Required)
     * 
     */
    @JsonProperty("refFrame")
    public void setRefFrame(String refFrame) {
        this.refFrame = refFrame;
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
     * Number of students in the group.
     * 
     */
    @JsonProperty("numStudents")
    public Integer getNumStudents() {
        return numStudents;
    }

    /**
     * Number of students in the group.
     * 
     */
    @JsonProperty("numStudents")
    public void setNumStudents(Integer numStudents) {
        this.numStudents = numStudents;
    }

    /**
     * Stric number of free afternoons for the group.
     * 
     */
    @JsonProperty("freeAfternoons")
    public Integer getFreeAfternoons() {
        return freeAfternoons;
    }

    /**
     * Stric number of free afternoons for the group.
     * 
     */
    @JsonProperty("freeAfternoons")
    public void setFreeAfternoons(Integer freeAfternoons) {
        this.freeAfternoons = freeAfternoons;
    }

    /**
     * ConditionType
     * <p>
     * Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("notGaps")
    public ConditionType getNotGaps() {
        return notGaps;
    }

    /**
     * ConditionType
     * <p>
     * Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("notGaps")
    public void setNotGaps(ConditionType notGaps) {
        this.notGaps = notGaps;
    }

    /**
     * This indicates whether the engine should be in the positions marked as non-preferred in the template for free intervals or gaps.
     * 
     */
    @JsonProperty("gapsAlwaysInNonPreferred")
    public Boolean getGapsAlwaysInNonPreferred() {
        return gapsAlwaysInNonPreferred;
    }

    /**
     * This indicates whether the engine should be in the positions marked as non-preferred in the template for free intervals or gaps.
     * 
     */
    @JsonProperty("gapsAlwaysInNonPreferred")
    public void setGapsAlwaysInNonPreferred(Boolean gapsAlwaysInNonPreferred) {
        this.gapsAlwaysInNonPreferred = gapsAlwaysInNonPreferred;
    }

    /**
     * Course identifier to which the group belongs.
     * 
     */
    @JsonProperty("refCourse")
    public String getRefCourse() {
        return refCourse;
    }

    /**
     * Course identifier to which the group belongs.
     * 
     */
    @JsonProperty("refCourse")
    public void setRefCourse(String refCourse) {
        this.refCourse = refCourse;
    }

    /**
     * Allows to indicate its a circunstancial group, formed by oficial groups to recibe optional or main subjects.
     * 
     */
    @JsonProperty("includedGroups")
    public List<String> getIncludedGroups() {
        return includedGroups;
    }

    /**
     * Allows to indicate its a circunstancial group, formed by oficial groups to recibe optional or main subjects.
     * 
     */
    @JsonProperty("includedGroups")
    public void setIncludedGroups(List<String> includedGroups) {
        this.includedGroups = includedGroups;
    }

    /**
     * Id of the tutor teacher assigned to the group
     * 
     */
    @JsonProperty("refTeacher")
    public String getRefTeacher() {
        return refTeacher;
    }

    /**
     * Id of the tutor teacher assigned to the group
     * 
     */
    @JsonProperty("refTeacher")
    public void setRefTeacher(String refTeacher) {
        this.refTeacher = refTeacher;
    }

    /**
     * Id of the classroom assigned to the group
     * 
     */
    @JsonProperty("refClassroom")
    public String getRefClassroom() {
        return refClassroom;
    }

    /**
     * Id of the classroom assigned to the group
     * 
     */
    @JsonProperty("refClassroom")
    public void setRefClassroom(String refClassroom) {
        this.refClassroom = refClassroom;
    }

    /**
     * Id of the set of alternative classrooms assigned to the group.
     * 
     */
    @JsonProperty("refAlternativeClassRoomSet")
    public String getRefAlternativeClassRoomSet() {
        return refAlternativeClassRoomSet;
    }

    /**
     * Id of the set of alternative classrooms assigned to the group.
     * 
     */
    @JsonProperty("refAlternativeClassRoomSet")
    public void setRefAlternativeClassRoomSet(String refAlternativeClassRoomSet) {
        this.refAlternativeClassRoomSet = refAlternativeClassRoomSet;
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
