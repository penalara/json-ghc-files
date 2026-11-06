
package com.penalara.ghc.jsonghcfile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * GroupSetRelationExpression
 * <p>
 * Expression that indicates whether its referenced group sets or nested expressions can be scheduled simultaneously.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "operator",
    "refGroupSet",
    "nestedRelationExpressions"
})
public class GroupSetRelationExpression {

    /**
     * Relationship between the referenced group sets. COMPATIBLE allows their included groups to be scheduled simultaneously; EXCLUSIVE prevents them from coinciding.
     * (Required)
     * 
     */
    @JsonProperty("operator")
    @JsonPropertyDescription("Relationship between the referenced group sets. COMPATIBLE allows their included groups to be scheduled simultaneously; EXCLUSIVE prevents them from coinciding.")
    private GroupSetRelationExpression.Operator operator;
    /**
     * GroupSetRelationMembers
     * <p>
     * List of group set identifiers.
     * 
     */
    @JsonProperty("refGroupSet")
    @JsonPropertyDescription("List of group set identifiers.")
    private List<String> refGroupSet = new ArrayList<String>();
    /**
     * NestedRelationExpressions
     * <p>
     * Nested expressions that relate other group sets or group set relationship expressions.
     * 
     */
    @JsonProperty("nestedRelationExpressions")
    @JsonPropertyDescription("Nested expressions that relate other group sets or group set relationship expressions.")
    private List<GroupSetRelationExpression> nestedRelationExpressions = new ArrayList<GroupSetRelationExpression>();

    /**
     * Relationship between the referenced group sets. COMPATIBLE allows their included groups to be scheduled simultaneously; EXCLUSIVE prevents them from coinciding.
     * (Required)
     * 
     */
    @JsonProperty("operator")
    public GroupSetRelationExpression.Operator getOperator() {
        return operator;
    }

    /**
     * Relationship between the referenced group sets. COMPATIBLE allows their included groups to be scheduled simultaneously; EXCLUSIVE prevents them from coinciding.
     * (Required)
     * 
     */
    @JsonProperty("operator")
    public void setOperator(GroupSetRelationExpression.Operator operator) {
        this.operator = operator;
    }

    /**
     * GroupSetRelationMembers
     * <p>
     * List of group set identifiers.
     * 
     */
    @JsonProperty("refGroupSet")
    public List<String> getRefGroupSet() {
        return refGroupSet;
    }

    /**
     * GroupSetRelationMembers
     * <p>
     * List of group set identifiers.
     * 
     */
    @JsonProperty("refGroupSet")
    public void setRefGroupSet(List<String> refGroupSet) {
        this.refGroupSet = refGroupSet;
    }

    /**
     * NestedRelationExpressions
     * <p>
     * Nested expressions that relate other group sets or group set relationship expressions.
     * 
     */
    @JsonProperty("nestedRelationExpressions")
    public List<GroupSetRelationExpression> getNestedRelationExpressions() {
        return nestedRelationExpressions;
    }

    /**
     * NestedRelationExpressions
     * <p>
     * Nested expressions that relate other group sets or group set relationship expressions.
     * 
     */
    @JsonProperty("nestedRelationExpressions")
    public void setNestedRelationExpressions(List<GroupSetRelationExpression> nestedRelationExpressions) {
        this.nestedRelationExpressions = nestedRelationExpressions;
    }


    /**
     * Relationship between the referenced group sets. COMPATIBLE allows their included groups to be scheduled simultaneously; EXCLUSIVE prevents them from coinciding.
     * 
     */
    public enum Operator {

        COMPATIBLE("COMPATIBLE"),
        EXCLUSIVE("EXCLUSIVE");
        private final String value;
        private final static Map<String, GroupSetRelationExpression.Operator> CONSTANTS = new HashMap<String, GroupSetRelationExpression.Operator>();

        static {
            for (GroupSetRelationExpression.Operator c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Operator(String value) {
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
        public static GroupSetRelationExpression.Operator fromValue(String value) {
            GroupSetRelationExpression.Operator constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
