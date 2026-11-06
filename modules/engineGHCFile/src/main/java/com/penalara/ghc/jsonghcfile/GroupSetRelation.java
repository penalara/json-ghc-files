
package com.penalara.ghc.jsonghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GroupSetRelation
 * <p>
 * Relationship between group sets represented by Group objects with includedGroups.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "alias",
    "expression"
})
public class GroupSetRelation {

    /**
     * Group set relationship identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Group set relationship identifier.")
    private Integer id;
    /**
     * Optional name used to identify the group set relationship.
     * 
     */
    @JsonProperty("alias")
    @JsonPropertyDescription("Optional name used to identify the group set relationship.")
    private String alias;
    /**
     * GroupSetRelationExpression
     * <p>
     * Expression that indicates whether its referenced group sets or nested expressions can be scheduled simultaneously.
     * (Required)
     * 
     */
    @JsonProperty("expression")
    @JsonPropertyDescription("Expression that indicates whether its referenced group sets or nested expressions can be scheduled simultaneously.")
    private GroupSetRelationExpression expression;

    /**
     * Group set relationship identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * Group set relationship identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Optional name used to identify the group set relationship.
     * 
     */
    @JsonProperty("alias")
    public String getAlias() {
        return alias;
    }

    /**
     * Optional name used to identify the group set relationship.
     * 
     */
    @JsonProperty("alias")
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * GroupSetRelationExpression
     * <p>
     * Expression that indicates whether its referenced group sets or nested expressions can be scheduled simultaneously.
     * (Required)
     * 
     */
    @JsonProperty("expression")
    public GroupSetRelationExpression getExpression() {
        return expression;
    }

    /**
     * GroupSetRelationExpression
     * <p>
     * Expression that indicates whether its referenced group sets or nested expressions can be scheduled simultaneously.
     * (Required)
     * 
     */
    @JsonProperty("expression")
    public void setExpression(GroupSetRelationExpression expression) {
        this.expression = expression;
    }

}
