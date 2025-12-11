
package com.penalara.ghc.jsonghcfile;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * StablePeriods
 * <p>
 * The allocation of the class unit of the session is the same in each period.Only one property must be specified.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "stableTiming",
    "variableTiming",
    "stableTimingList"
})
public class StablePeriods {

    /**
     * StableTiming
     * <p>
     * It contains the fixed way of allocating time across the days of the period.
     * 
     */
    @JsonProperty("stableTiming")
    @JsonPropertyDescription("It contains the fixed way of allocating time across the days of the period.")
    private List<Integer> stableTiming = new ArrayList<Integer>();
    /**
     * VariableTiming
     * <p>
     * It defines the allocating time as a total of time, maximum and minimun range of sections per day.
     * 
     */
    @JsonProperty("variableTiming")
    @JsonPropertyDescription("It defines the allocating time as a total of time, maximum and minimun range of sections per day.")
    private VariableTiming variableTiming;
    /**
     * StableTimingList
     * <p>
     * It contains an array of 'StableTiming' distributions.
     * 
     */
    @JsonProperty("stableTimingList")
    @JsonPropertyDescription("It contains an array of 'StableTiming' distributions.")
    private List<List<Integer>> stableTimingList = new ArrayList<List<Integer>>();

    /**
     * StableTiming
     * <p>
     * It contains the fixed way of allocating time across the days of the period.
     * 
     */
    @JsonProperty("stableTiming")
    public List<Integer> getStableTiming() {
        return stableTiming;
    }

    /**
     * StableTiming
     * <p>
     * It contains the fixed way of allocating time across the days of the period.
     * 
     */
    @JsonProperty("stableTiming")
    public void setStableTiming(List<Integer> stableTiming) {
        this.stableTiming = stableTiming;
    }

    /**
     * VariableTiming
     * <p>
     * It defines the allocating time as a total of time, maximum and minimun range of sections per day.
     * 
     */
    @JsonProperty("variableTiming")
    public VariableTiming getVariableTiming() {
        return variableTiming;
    }

    /**
     * VariableTiming
     * <p>
     * It defines the allocating time as a total of time, maximum and minimun range of sections per day.
     * 
     */
    @JsonProperty("variableTiming")
    public void setVariableTiming(VariableTiming variableTiming) {
        this.variableTiming = variableTiming;
    }

    /**
     * StableTimingList
     * <p>
     * It contains an array of 'StableTiming' distributions.
     * 
     */
    @JsonProperty("stableTimingList")
    public List<List<Integer>> getStableTimingList() {
        return stableTimingList;
    }

    /**
     * StableTimingList
     * <p>
     * It contains an array of 'StableTiming' distributions.
     * 
     */
    @JsonProperty("stableTimingList")
    public void setStableTimingList(List<List<Integer>> stableTimingList) {
        this.stableTimingList = stableTimingList;
    }

}
