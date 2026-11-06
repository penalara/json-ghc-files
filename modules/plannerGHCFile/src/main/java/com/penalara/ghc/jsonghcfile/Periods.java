
package com.penalara.ghc.jsonghcfile;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Periods
 * <p>
 * Weeks or periods with different assignments which contains the timetable.If there are no defined periods, the engine will create a single period with all the days of the timetable.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "followedPeriods",
    "periodsList",
    "periodSets"
})
public class Periods {

    /**
     * FollowedPeriods
     * <p>
     * It indicates whether periods or weeks consider the last day of the previous period or week as consecutive days with the first day of the following period or week.
     * 
     */
    @JsonProperty("followedPeriods")
    @JsonPropertyDescription("It indicates whether periods or weeks consider the last day of the previous period or week as consecutive days with the first day of the following period or week.")
    private Boolean followedPeriods = false;
    /**
     * PeriodsList
     * <p>
     * List of periods.
     * (Required)
     * 
     */
    @JsonProperty("periodsList")
    @JsonPropertyDescription("List of periods.")
    private List<Period> periodsList = new ArrayList<Period>();
    /**
     * PeriodsSets
     * <p>
     * List of sets of periods, which are groupings of multiple periods to make it easier to assign periods to sessions in batches, and many of them overlap by sharing several weeks in common.
     * 
     */
    @JsonProperty("periodSets")
    @JsonPropertyDescription("List of sets of periods, which are groupings of multiple periods to make it easier to assign periods to sessions in batches, and many of them overlap by sharing several weeks in common.")
    private List<PeriodsSet> periodSets = new ArrayList<PeriodsSet>();

    /**
     * FollowedPeriods
     * <p>
     * It indicates whether periods or weeks consider the last day of the previous period or week as consecutive days with the first day of the following period or week.
     * 
     */
    @JsonProperty("followedPeriods")
    public Boolean getFollowedPeriods() {
        return followedPeriods;
    }

    /**
     * FollowedPeriods
     * <p>
     * It indicates whether periods or weeks consider the last day of the previous period or week as consecutive days with the first day of the following period or week.
     * 
     */
    @JsonProperty("followedPeriods")
    public void setFollowedPeriods(Boolean followedPeriods) {
        this.followedPeriods = followedPeriods;
    }

    /**
     * PeriodsList
     * <p>
     * List of periods.
     * (Required)
     * 
     */
    @JsonProperty("periodsList")
    public List<Period> getPeriodsList() {
        return periodsList;
    }

    /**
     * PeriodsList
     * <p>
     * List of periods.
     * (Required)
     * 
     */
    @JsonProperty("periodsList")
    public void setPeriodsList(List<Period> periodsList) {
        this.periodsList = periodsList;
    }

    /**
     * PeriodsSets
     * <p>
     * List of sets of periods, which are groupings of multiple periods to make it easier to assign periods to sessions in batches, and many of them overlap by sharing several weeks in common.
     * 
     */
    @JsonProperty("periodSets")
    public List<PeriodsSet> getPeriodSets() {
        return periodSets;
    }

    /**
     * PeriodsSets
     * <p>
     * List of sets of periods, which are groupings of multiple periods to make it easier to assign periods to sessions in batches, and many of them overlap by sharing several weeks in common.
     * 
     */
    @JsonProperty("periodSets")
    public void setPeriodSets(List<PeriodsSet> periodSets) {
        this.periodSets = periodSets;
    }

}
