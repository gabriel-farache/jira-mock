package dev.parodos.load_test_jira.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dev.parodos.load_test_jira.model.EntityProperty;
import dev.parodos.load_test_jira.model.FieldUpdateOperation;
import dev.parodos.load_test_jira.model.HistoryMetadata;
import dev.parodos.load_test_jira.model.IssueTransition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * Details of an issue update request.
 */

@Schema(name = "IssueUpdateDetails", description = "Details of an issue update request.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-30T10:10:58.593190739+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class IssueUpdateDetails {

  @Valid
  private Map<String, Object> fields = new HashMap<>();

  private HistoryMetadata historyMetadata;

  @Valid
  private List<@Valid EntityProperty> properties = new ArrayList<>();

  private IssueTransition transition;

  @Valid
  private Map<String, List<@Valid FieldUpdateOperation>> update = new HashMap<>();

  public IssueUpdateDetails fields(Map<String, Object> fields) {
    this.fields = fields;
    return this;
  }

  public IssueUpdateDetails putFieldsItem(String key, Object fieldsItem) {
    if (this.fields == null) {
      this.fields = new HashMap<>();
    }
    this.fields.put(key, fieldsItem);
    return this;
  }

  /**
   * List of issue screen fields to update, specifying the sub-field to update and its value for each field. This field provides a straightforward option when setting a sub-field. When multiple sub-fields or other operations are required, use `update`. Fields included in here cannot be included in `update`.
   * @return fields
   */
  
  @Schema(name = "fields", description = "List of issue screen fields to update, specifying the sub-field to update and its value for each field. This field provides a straightforward option when setting a sub-field. When multiple sub-fields or other operations are required, use `update`. Fields included in here cannot be included in `update`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fields")
  public Map<String, Object> getFields() {
    return fields;
  }

  public void setFields(Map<String, Object> fields) {
    this.fields = fields;
  }

  public IssueUpdateDetails historyMetadata(HistoryMetadata historyMetadata) {
    this.historyMetadata = historyMetadata;
    return this;
  }

  /**
   * Additional issue history details.
   * @return historyMetadata
   */
  @Valid 
  @Schema(name = "historyMetadata", description = "Additional issue history details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("historyMetadata")
  public HistoryMetadata getHistoryMetadata() {
    return historyMetadata;
  }

  public void setHistoryMetadata(HistoryMetadata historyMetadata) {
    this.historyMetadata = historyMetadata;
  }

  public IssueUpdateDetails properties(List<@Valid EntityProperty> properties) {
    this.properties = properties;
    return this;
  }

  public IssueUpdateDetails addPropertiesItem(EntityProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

  /**
   * Details of issue properties to be add or update.
   * @return properties
   */
  @Valid 
  @Schema(name = "properties", description = "Details of issue properties to be add or update.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("properties")
  public List<@Valid EntityProperty> getProperties() {
    return properties;
  }

  public void setProperties(List<@Valid EntityProperty> properties) {
    this.properties = properties;
  }

  public IssueUpdateDetails transition(IssueTransition transition) {
    this.transition = transition;
    return this;
  }

  /**
   * Details of a transition. Required when performing a transition, optional when creating or editing an issue.
   * @return transition
   */
  @Valid 
  @Schema(name = "transition", description = "Details of a transition. Required when performing a transition, optional when creating or editing an issue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transition")
  public IssueTransition getTransition() {
    return transition;
  }

  public void setTransition(IssueTransition transition) {
    this.transition = transition;
  }

  public IssueUpdateDetails update(Map<String, List<@Valid FieldUpdateOperation>> update) {
    this.update = update;
    return this;
  }

  public IssueUpdateDetails putUpdateItem(String key, List<@Valid FieldUpdateOperation> updateItem) {
    if (this.update == null) {
      this.update = new HashMap<>();
    }
    this.update.put(key, updateItem);
    return this;
  }

  /**
   * A Map containing the field field name and a list of operations to perform on the issue screen field. Note that fields included in here cannot be included in `fields`.
   * @return update
   */
  @Valid 
  @Schema(name = "update", description = "A Map containing the field field name and a list of operations to perform on the issue screen field. Note that fields included in here cannot be included in `fields`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("update")
  public Map<String, List<@Valid FieldUpdateOperation>> getUpdate() {
    return update;
  }

  public void setUpdate(Map<String, List<@Valid FieldUpdateOperation>> update) {
    this.update = update;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Object> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public IssueUpdateDetails putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueUpdateDetails issueUpdateDetails = (IssueUpdateDetails) o;
    return Objects.equals(this.fields, issueUpdateDetails.fields) &&
        Objects.equals(this.historyMetadata, issueUpdateDetails.historyMetadata) &&
        Objects.equals(this.properties, issueUpdateDetails.properties) &&
        Objects.equals(this.transition, issueUpdateDetails.transition) &&
        Objects.equals(this.update, issueUpdateDetails.update) &&
    Objects.equals(this.additionalProperties, issueUpdateDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, historyMetadata, properties, transition, update, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueUpdateDetails {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    historyMetadata: ").append(toIndentedString(historyMetadata)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    transition: ").append(toIndentedString(transition)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

