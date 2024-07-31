package dev.parodos.load_test_jira.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dev.parodos.load_test_jira.model.FieldMetadata;
import dev.parodos.load_test_jira.model.StatusDetails;
import java.util.HashMap;
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
 * Details of an issue transition.
 */

@Schema(name = "IssueTransition", description = "Details of an issue transition.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-30T10:10:58.593190739+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class IssueTransition {

  private String expand;

  @Valid
  private Map<String, FieldMetadata> fields = new HashMap<>();

  private Boolean hasScreen;

  private String id;

  private Boolean isAvailable;

  private Boolean isConditional;

  private Boolean isGlobal;

  private Boolean isInitial;

  private Boolean looped;

  private String name;

  private StatusDetails to;

  public IssueTransition expand(String expand) {
    this.expand = expand;
    return this;
  }

  /**
   * Expand options that include additional transition details in the response.
   * @return expand
   */
  
  @Schema(name = "expand", accessMode = Schema.AccessMode.READ_ONLY, description = "Expand options that include additional transition details in the response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expand")
  public String getExpand() {
    return expand;
  }

  public void setExpand(String expand) {
    this.expand = expand;
  }

  public IssueTransition fields(Map<String, FieldMetadata> fields) {
    this.fields = fields;
    return this;
  }

  public IssueTransition putFieldsItem(String key, FieldMetadata fieldsItem) {
    if (this.fields == null) {
      this.fields = new HashMap<>();
    }
    this.fields.put(key, fieldsItem);
    return this;
  }

  /**
   * Details of the fields associated with the issue transition screen. Use this information to populate `fields` and `update` in a transition request.
   * @return fields
   */
  @Valid 
  @Schema(name = "fields", accessMode = Schema.AccessMode.READ_ONLY, description = "Details of the fields associated with the issue transition screen. Use this information to populate `fields` and `update` in a transition request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fields")
  public Map<String, FieldMetadata> getFields() {
    return fields;
  }

  public void setFields(Map<String, FieldMetadata> fields) {
    this.fields = fields;
  }

  public IssueTransition hasScreen(Boolean hasScreen) {
    this.hasScreen = hasScreen;
    return this;
  }

  /**
   * Whether there is a screen associated with the issue transition.
   * @return hasScreen
   */
  
  @Schema(name = "hasScreen", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether there is a screen associated with the issue transition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasScreen")
  public Boolean getHasScreen() {
    return hasScreen;
  }

  public void setHasScreen(Boolean hasScreen) {
    this.hasScreen = hasScreen;
  }

  public IssueTransition id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the issue transition. Required when specifying a transition to undertake.
   * @return id
   */
  
  @Schema(name = "id", description = "The ID of the issue transition. Required when specifying a transition to undertake.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IssueTransition isAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
    return this;
  }

  /**
   * Whether the transition is available to be performed.
   * @return isAvailable
   */
  
  @Schema(name = "isAvailable", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the transition is available to be performed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isAvailable")
  public Boolean getIsAvailable() {
    return isAvailable;
  }

  public void setIsAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

  public IssueTransition isConditional(Boolean isConditional) {
    this.isConditional = isConditional;
    return this;
  }

  /**
   * Whether the issue has to meet criteria before the issue transition is applied.
   * @return isConditional
   */
  
  @Schema(name = "isConditional", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the issue has to meet criteria before the issue transition is applied.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isConditional")
  public Boolean getIsConditional() {
    return isConditional;
  }

  public void setIsConditional(Boolean isConditional) {
    this.isConditional = isConditional;
  }

  public IssueTransition isGlobal(Boolean isGlobal) {
    this.isGlobal = isGlobal;
    return this;
  }

  /**
   * Whether the issue transition is global, that is, the transition is applied to issues regardless of their status.
   * @return isGlobal
   */
  
  @Schema(name = "isGlobal", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the issue transition is global, that is, the transition is applied to issues regardless of their status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isGlobal")
  public Boolean getIsGlobal() {
    return isGlobal;
  }

  public void setIsGlobal(Boolean isGlobal) {
    this.isGlobal = isGlobal;
  }

  public IssueTransition isInitial(Boolean isInitial) {
    this.isInitial = isInitial;
    return this;
  }

  /**
   * Whether this is the initial issue transition for the workflow.
   * @return isInitial
   */
  
  @Schema(name = "isInitial", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether this is the initial issue transition for the workflow.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isInitial")
  public Boolean getIsInitial() {
    return isInitial;
  }

  public void setIsInitial(Boolean isInitial) {
    this.isInitial = isInitial;
  }

  public IssueTransition looped(Boolean looped) {
    this.looped = looped;
    return this;
  }

  /**
   * Get looped
   * @return looped
   */
  
  @Schema(name = "looped", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("looped")
  public Boolean getLooped() {
    return looped;
  }

  public void setLooped(Boolean looped) {
    this.looped = looped;
  }

  public IssueTransition name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the issue transition.
   * @return name
   */
  
  @Schema(name = "name", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of the issue transition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IssueTransition to(StatusDetails to) {
    this.to = to;
    return this;
  }

  /**
   * Details of the issue status after the transition.
   * @return to
   */
  @Valid 
  @Schema(name = "to", accessMode = Schema.AccessMode.READ_ONLY, description = "Details of the issue status after the transition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("to")
  public StatusDetails getTo() {
    return to;
  }

  public void setTo(StatusDetails to) {
    this.to = to;
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
    public IssueTransition putAdditionalProperty(String key, Object value) {
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
    IssueTransition issueTransition = (IssueTransition) o;
    return Objects.equals(this.expand, issueTransition.expand) &&
        Objects.equals(this.fields, issueTransition.fields) &&
        Objects.equals(this.hasScreen, issueTransition.hasScreen) &&
        Objects.equals(this.id, issueTransition.id) &&
        Objects.equals(this.isAvailable, issueTransition.isAvailable) &&
        Objects.equals(this.isConditional, issueTransition.isConditional) &&
        Objects.equals(this.isGlobal, issueTransition.isGlobal) &&
        Objects.equals(this.isInitial, issueTransition.isInitial) &&
        Objects.equals(this.looped, issueTransition.looped) &&
        Objects.equals(this.name, issueTransition.name) &&
        Objects.equals(this.to, issueTransition.to) &&
    Objects.equals(this.additionalProperties, issueTransition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, fields, hasScreen, id, isAvailable, isConditional, isGlobal, isInitial, looped, name, to, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTransition {\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    hasScreen: ").append(toIndentedString(hasScreen)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
    sb.append("    isConditional: ").append(toIndentedString(isConditional)).append("\n");
    sb.append("    isGlobal: ").append(toIndentedString(isGlobal)).append("\n");
    sb.append("    isInitial: ").append(toIndentedString(isInitial)).append("\n");
    sb.append("    looped: ").append(toIndentedString(looped)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    
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

