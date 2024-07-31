package dev.parodos.load_test_jira.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Details of user or system associated with a issue history metadata item.
 */

@Schema(name = "HistoryMetadataParticipant", description = "Details of user or system associated with a issue history metadata item.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-30T10:10:58.593190739+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class HistoryMetadataParticipant {

  private String avatarUrl;

  private String displayName;

  private String displayNameKey;

  private String id;

  private String type;

  private String url;

  public HistoryMetadataParticipant avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

  /**
   * The URL to an avatar for the user or system associated with a history record.
   * @return avatarUrl
   */
  
  @Schema(name = "avatarUrl", description = "The URL to an avatar for the user or system associated with a history record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avatarUrl")
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public HistoryMetadataParticipant displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name of the user or system associated with a history record.
   * @return displayName
   */
  
  @Schema(name = "displayName", description = "The display name of the user or system associated with a history record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public HistoryMetadataParticipant displayNameKey(String displayNameKey) {
    this.displayNameKey = displayNameKey;
    return this;
  }

  /**
   * The key of the display name of the user or system associated with a history record.
   * @return displayNameKey
   */
  
  @Schema(name = "displayNameKey", description = "The key of the display name of the user or system associated with a history record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayNameKey")
  public String getDisplayNameKey() {
    return displayNameKey;
  }

  public void setDisplayNameKey(String displayNameKey) {
    this.displayNameKey = displayNameKey;
  }

  public HistoryMetadataParticipant id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the user or system associated with a history record.
   * @return id
   */
  
  @Schema(name = "id", description = "The ID of the user or system associated with a history record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HistoryMetadataParticipant type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the user or system associated with a history record.
   * @return type
   */
  
  @Schema(name = "type", description = "The type of the user or system associated with a history record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public HistoryMetadataParticipant url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The URL of the user or system associated with a history record.
   * @return url
   */
  
  @Schema(name = "url", description = "The URL of the user or system associated with a history record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
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
    public HistoryMetadataParticipant putAdditionalProperty(String key, Object value) {
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
    HistoryMetadataParticipant historyMetadataParticipant = (HistoryMetadataParticipant) o;
    return Objects.equals(this.avatarUrl, historyMetadataParticipant.avatarUrl) &&
        Objects.equals(this.displayName, historyMetadataParticipant.displayName) &&
        Objects.equals(this.displayNameKey, historyMetadataParticipant.displayNameKey) &&
        Objects.equals(this.id, historyMetadataParticipant.id) &&
        Objects.equals(this.type, historyMetadataParticipant.type) &&
        Objects.equals(this.url, historyMetadataParticipant.url) &&
    Objects.equals(this.additionalProperties, historyMetadataParticipant.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarUrl, displayName, displayNameKey, id, type, url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryMetadataParticipant {\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    displayNameKey: ").append(toIndentedString(displayNameKey)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    
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

