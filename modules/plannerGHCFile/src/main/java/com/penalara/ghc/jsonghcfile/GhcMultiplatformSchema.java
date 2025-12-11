
package com.penalara.ghc.jsonghcfile;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GhcMultiplatformSchema
 * <p>
 * Schema with the structure of the GHC Multiplatform files
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "meta",
    "specifications"
})
public class GhcMultiplatformSchema {

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
     * Specifications
     * <p>
     * List of specification versions of the scheduling plan and the results associated with each one, if it has been resolved by the ghc engine.
     * (Required)
     * 
     */
    @JsonProperty("specifications")
    @JsonPropertyDescription("List of specification versions of the scheduling plan and the results associated with each one, if it has been resolved by the ghc engine.")
    private List<PlannerSpecification> specifications = new ArrayList<PlannerSpecification>();

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
     * Specifications
     * <p>
     * List of specification versions of the scheduling plan and the results associated with each one, if it has been resolved by the ghc engine.
     * (Required)
     * 
     */
    @JsonProperty("specifications")
    public List<PlannerSpecification> getSpecifications() {
        return specifications;
    }

    /**
     * Specifications
     * <p>
     * List of specification versions of the scheduling plan and the results associated with each one, if it has been resolved by the ghc engine.
     * (Required)
     * 
     */
    @JsonProperty("specifications")
    public void setSpecifications(List<PlannerSpecification> specifications) {
        this.specifications = specifications;
    }

}
