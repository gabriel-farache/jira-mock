package dev.parodos.load_test_jira.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dev.parodos.load_test_jira.model.HistoryMetadataParticipant;
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
 * Details of issue history metadata.
 */

@Schema(name = "HistoryMetadata", description = "Details of issue history metadata.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-30T10:10:58.593190739+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class HistoryMetadata {

  private String activityDescription;

  private String activityDescriptionKey;

  private HistoryMetadataParticipant actor;

  private HistoryMetadataParticipant cause;

  private String description;

  private String descriptionKey;

  private String emailDescription;

  private String emailDescriptionKey;

  @Valid
  private Map<String, String> extraData = new HashMap<>();

  private HistoryMetadataParticipant generator;

  private String type;

  public HistoryMetadata activityDescription(String activityDescription) {
    this.activityDescription = activityDescription;
    return this;
  }

  /**
   * The activity described in the history record.
   * @return activityDescription
   */
  
  @Schema(name = "activityDescription", description = "The activity described in the history record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityDescription")
  public String getActivityDescription() {
    return activityDescription;
  }

  public void setActivityDescription(String activityDescription) {
    this.activityDescription = activityDescription;
  }

  public HistoryMetadata activityDescriptionKey(String activityDescriptionKey) {
    this.activityDescriptionKey = activityDescriptionKey;
    return this;
  }

  /**
   * The key of the activity described in the history record.
   * @return activityDescriptionKey
   */
  
  @Schema(name = "activityDescriptionKey", description = "The key of the activity described in the history record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityDescriptionKey")
  public String getActivityDescriptionKey() {
    return activityDescriptionKey;
  }

  public void setActivityDescriptionKey(String activityDescriptionKey) {
    this.activityDescriptionKey = activityDescriptionKey;
  }

  public HistoryMetadata actor(HistoryMetadataParticipant actor) {
    this.actor = actor;
    return this;
  }

  /**
   * Details of the user whose action created the history record.
   * @return actor
   */
  @Valid 
  @Schema(name = "actor", description = "Details of the user whose action created the history record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actor")
  public HistoryMetadataParticipant getActor() {
    return actor;
  }

  public void setActor(HistoryMetadataParticipant actor) {
    this.actor = actor;
  }

  public HistoryMetadata cause(HistoryMetadataParticipant cause) {
    this.cause = cause;
    return this;
  }

  /**
   * Details of the cause that triggered the creation the history record.
   * @return cause
   */
  @Valid 
  @Schema(name = "cause", description = "Details of the cause that triggered the creation the history record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cause")
  public HistoryMetadataParticipant getCause() {
    return cause;
  }

  public void setCause(HistoryMetadataParticipant cause) {
    this.cause = cause;
  }

  public HistoryMetadata description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the history record.
   * @return description
   */
  
  @Schema(name = "description", description = "The description of the history record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public HistoryMetadata descriptionKey(String descriptionKey) {
    this.descriptionKey = descriptionKey;
    return this;
  }

  /**
   * The description key of the history record.
   * @return descriptionKey
   */
  
  @Schema(name = "descriptionKey", description = "The description key of the history record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("descriptionKey")
  public String getDescriptionKey() {
    return descriptionKey;
  }

  public void setDescriptionKey(String descriptionKey) {
    this.descriptionKey = descriptionKey;
  }

  public HistoryMetadata emailDescription(String emailDescription) {
    this.emailDescription = emailDescription;
    return this;
  }

  /**
   * The description of the email address associated the history record.
   * @return emailDescription
   */
  
  @Schema(name = "emailDescription", description = "The description of the email address associated the history record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emailDescription")
  public String getEmailDescription() {
    return emailDescription;
  }

  public void setEmailDescription(String emailDescription) {
    this.emailDescription = emailDescription;
  }

  public HistoryMetadata emailDescriptionKey(String emailDescriptionKey) {
    this.emailDescriptionKey = emailDescriptionKey;
    return this;
  }

  /**
   * The description key of the email address associated the history record.
   * @return emailDescriptionKey
   */
  
  @Schema(name = "emailDescriptionKey", description = "The description key of the email address associated the history record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emailDescriptionKey")
  public String getEmailDescriptionKey() {
    return emailDescriptionKey;
  }

  public void setEmailDescriptionKey(String emailDescriptionKey) {
    this.emailDescriptionKey = emailDescriptionKey;
  }

  public HistoryMetadata extraData(Map<String, String> extraData) {
    this.extraData = extraData;
    return this;
  }

  public HistoryMetadata putExtraDataItem(String key, String extraDataItem) {
    if (this.extraData == null) {
      this.extraData = new HashMap<>();
    }
    this.extraData.put(key, extraDataItem);
    return this;
  }

  /**
   * Additional arbitrary information about the history record.
   * @return extraData
   */
  
  @Schema(name = "extraData", description = "Additional arbitrary information about the history record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extraData")
  public Map<String, String> getExtraData() {
    return extraData;
  }

  public void setExtraData(Map<String, String> extraData) {
    this.extraData = extraData;
  }

  public HistoryMetadata generator(HistoryMetadataParticipant generator) {
    this.generator = generator;
    return this;
  }

  /**
   * Details of the system that generated the history record.
   * @return generator
   */
  @Valid 
  @Schema(name = "generator", description = "Details of the system that generated the history record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("generator")
  public HistoryMetadataParticipant getGenerator() {
    return generator;
  }

  public void setGenerator(HistoryMetadataParticipant generator) {
    this.generator = generator;
  }

  public HistoryMetadata type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the history record.
   * @return type
   */
  
  @Schema(name = "type", description = "The type of the history record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
    public HistoryMetadata putAdditionalProperty(String key, Object value) {
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
    HistoryMetadata historyMetadata = (HistoryMetadata) o;
    return Objects.equals(this.activityDescription, historyMetadata.activityDescription) &&
        Objects.equals(this.activityDescriptionKey, historyMetadata.activityDescriptionKey) &&
        Objects.equals(this.actor, historyMetadata.actor) &&
        Objects.equals(this.cause, historyMetadata.cause) &&
        Objects.equals(this.description, historyMetadata.description) &&
        Objects.equals(this.descriptionKey, historyMetadata.descriptionKey) &&
        Objects.equals(this.emailDescription, historyMetadata.emailDescription) &&
        Objects.equals(this.emailDescriptionKey, historyMetadata.emailDescriptionKey) &&
        Objects.equals(this.extraData, historyMetadata.extraData) &&
        Objects.equals(this.generator, historyMetadata.generator) &&
        Objects.equals(this.type, historyMetadata.type) &&
    Objects.equals(this.additionalProperties, historyMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityDescription, activityDescriptionKey, actor, cause, description, descriptionKey, emailDescription, emailDescriptionKey, extraData, generator, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryMetadata {\n");
    sb.append("    activityDescription: ").append(toIndentedString(activityDescription)).append("\n");
    sb.append("    activityDescriptionKey: ").append(toIndentedString(activityDescriptionKey)).append("\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionKey: ").append(toIndentedString(descriptionKey)).append("\n");
    sb.append("    emailDescription: ").append(toIndentedString(emailDescription)).append("\n");
    sb.append("    emailDescriptionKey: ").append(toIndentedString(emailDescriptionKey)).append("\n");
    sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
    sb.append("    generator: ").append(toIndentedString(generator)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    
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

