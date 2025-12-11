
package com.penalara.ghc.jsonghcfile;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PlannerSpecification
 * <p>
 * GHC scheduling plan specification, which may or may not contain results depending on whether it was executed in the ghc engine.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "modifiedDate",
    "planningData",
    "results"
})
public class PlannerSpecification {

    /**
     * PlanningModificationDate
     * <p>
     * Planning modification date
     * (Required)
     * 
     */
    @JsonProperty("modifiedDate")
    @JsonPropertyDescription("Planning modification date")
    private Date modifiedDate;
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
     * PlanningModificationDate
     * <p>
     * Planning modification date
     * (Required)
     * 
     */
    @JsonProperty("modifiedDate")
    public Date getModifiedDate() {
        return modifiedDate;
    }

    /**
     * PlanningModificationDate
     * <p>
     * Planning modification date
     * (Required)
     * 
     */
    @JsonProperty("modifiedDate")
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
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
