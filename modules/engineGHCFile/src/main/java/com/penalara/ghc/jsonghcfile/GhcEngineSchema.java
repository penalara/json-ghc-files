
package com.penalara.ghc.jsonghcfile;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GhcEngineSchema
 * <p>
 * Schema with the structure of GHC Engine files
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "meta",
    "planningData",
    "results"
})
public class GhcEngineSchema {

    /**
     * IdFile
     * <p>
     * Indicates the id number of the file at the Penalara Server.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Indicates the id number of the file at the Penalara Server.")
    private Integer id;
    /**
     * FileMetadata
     * <p>
     * Information about the file.
     * (Required)
     * 
     */
    @JsonProperty("meta")
    @JsonPropertyDescription("Information about the file.")
    private FileMetadata meta;
    /**
     * PlanningGhcData
     * <p>
     * Schema of the object that contains the timetable planning data.
     * (Required)
     * 
     */
    @JsonProperty("planningData")
    @JsonPropertyDescription("Schema of the object that contains the timetable planning data.")
    private PlanningGhcData planningData;
    /**
     * EngineResults
     * <p>
     * Tables of the timetable that contain sections where the class units are located.
     * 
     */
    @JsonProperty("results")
    @JsonPropertyDescription("Tables of the timetable that contain sections where the class units are located.")
    private List<EngineOutputGHCSchema> results = new ArrayList<EngineOutputGHCSchema>();

    /**
     * IdFile
     * <p>
     * Indicates the id number of the file at the Penalara Server.
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * IdFile
     * <p>
     * Indicates the id number of the file at the Penalara Server.
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * FileMetadata
     * <p>
     * Information about the file.
     * (Required)
     * 
     */
    @JsonProperty("meta")
    public FileMetadata getMeta() {
        return meta;
    }

    /**
     * FileMetadata
     * <p>
     * Information about the file.
     * (Required)
     * 
     */
    @JsonProperty("meta")
    public void setMeta(FileMetadata meta) {
        this.meta = meta;
    }

    /**
     * PlanningGhcData
     * <p>
     * Schema of the object that contains the timetable planning data.
     * (Required)
     * 
     */
    @JsonProperty("planningData")
    public PlanningGhcData getPlanningData() {
        return planningData;
    }

    /**
     * PlanningGhcData
     * <p>
     * Schema of the object that contains the timetable planning data.
     * (Required)
     * 
     */
    @JsonProperty("planningData")
    public void setPlanningData(PlanningGhcData planningData) {
        this.planningData = planningData;
    }

    /**
     * EngineResults
     * <p>
     * Tables of the timetable that contain sections where the class units are located.
     * 
     */
    @JsonProperty("results")
    public List<EngineOutputGHCSchema> getResults() {
        return results;
    }

    /**
     * EngineResults
     * <p>
     * Tables of the timetable that contain sections where the class units are located.
     * 
     */
    @JsonProperty("results")
    public void setResults(List<EngineOutputGHCSchema> results) {
        this.results = results;
    }

}
