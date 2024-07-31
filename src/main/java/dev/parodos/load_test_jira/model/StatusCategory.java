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
 * A status category.
 */

@Schema(name = "StatusCategory", description = "A status category.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-30T10:10:58.593190739+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class StatusCategory {

  private String colorName;

  private Long id;

  private String key;

  private String name;

  private String self;

  public StatusCategory colorName(String colorName) {
    this.colorName = colorName;
    return this;
  }

  /**
   * The name of the color used to represent the status category.
   * @return colorName
   */
  
  @Schema(name = "colorName", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of the color used to represent the status category.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("colorName")
  public String getColorName() {
    return colorName;
  }

  public void setColorName(String colorName) {
    this.colorName = colorName;
  }

  public StatusCategory id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the status category.
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the status category.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public StatusCategory key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of the status category.
   * @return key
   */
  
  @Schema(name = "key", accessMode = Schema.AccessMode.READ_ONLY, description = "The key of the status category.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public StatusCategory name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the status category.
   * @return name
   */
  
  @Schema(name = "name", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of the status category.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StatusCategory self(String self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the status category.
   * @return self
   */
  
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the status category.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
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
    public StatusCategory putAdditionalProperty(String key, Object value) {
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
    StatusCategory statusCategory = (StatusCategory) o;
    return Objects.equals(this.colorName, statusCategory.colorName) &&
        Objects.equals(this.id, statusCategory.id) &&
        Objects.equals(this.key, statusCategory.key) &&
        Objects.equals(this.name, statusCategory.name) &&
        Objects.equals(this.self, statusCategory.self) &&
    Objects.equals(this.additionalProperties, statusCategory.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colorName, id, key, name, self, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusCategory {\n");
    sb.append("    colorName: ").append(toIndentedString(colorName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    
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

