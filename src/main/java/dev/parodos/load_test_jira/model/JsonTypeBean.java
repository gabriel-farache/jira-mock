package dev.parodos.load_test_jira.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The schema of a field.
 */

@Schema(name = "JsonTypeBean", description = "The schema of a field.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-30T10:10:58.593190739+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class JsonTypeBean {

  @Valid
  private Map<String, Object> _configuration = new HashMap<>();

  private String custom;

  private Long customId;

  private String items;

  private String system;

  private String type;

  public JsonTypeBean() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JsonTypeBean(String type) {
    this.type = type;
  }

  public JsonTypeBean _configuration(Map<String, Object> _configuration) {
    this._configuration = _configuration;
    return this;
  }

  public JsonTypeBean putConfigurationItem(String key, Object _configurationItem) {
    if (this._configuration == null) {
      this._configuration = new HashMap<>();
    }
    this._configuration.put(key, _configurationItem);
    return this;
  }

  /**
   * If the field is a custom field, the configuration of the field.
   * @return _configuration
   */
  
  @Schema(name = "configuration", accessMode = Schema.AccessMode.READ_ONLY, description = "If the field is a custom field, the configuration of the field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configuration")
  public Map<String, Object> getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(Map<String, Object> _configuration) {
    this._configuration = _configuration;
  }

  public JsonTypeBean custom(String custom) {
    this.custom = custom;
    return this;
  }

  /**
   * If the field is a custom field, the URI of the field.
   * @return custom
   */
  
  @Schema(name = "custom", accessMode = Schema.AccessMode.READ_ONLY, description = "If the field is a custom field, the URI of the field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom")
  public String getCustom() {
    return custom;
  }

  public void setCustom(String custom) {
    this.custom = custom;
  }

  public JsonTypeBean customId(Long customId) {
    this.customId = customId;
    return this;
  }

  /**
   * If the field is a custom field, the custom ID of the field.
   * @return customId
   */
  
  @Schema(name = "customId", accessMode = Schema.AccessMode.READ_ONLY, description = "If the field is a custom field, the custom ID of the field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customId")
  public Long getCustomId() {
    return customId;
  }

  public void setCustomId(Long customId) {
    this.customId = customId;
  }

  public JsonTypeBean items(String items) {
    this.items = items;
    return this;
  }

  /**
   * When the data type is an array, the name of the field items within the array.
   * @return items
   */
  
  @Schema(name = "items", accessMode = Schema.AccessMode.READ_ONLY, description = "When the data type is an array, the name of the field items within the array.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public String getItems() {
    return items;
  }

  public void setItems(String items) {
    this.items = items;
  }

  public JsonTypeBean system(String system) {
    this.system = system;
    return this;
  }

  /**
   * If the field is a system field, the name of the field.
   * @return system
   */
  
  @Schema(name = "system", accessMode = Schema.AccessMode.READ_ONLY, description = "If the field is a system field, the name of the field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("system")
  public String getSystem() {
    return system;
  }

  public void setSystem(String system) {
    this.system = system;
  }

  public JsonTypeBean type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The data type of the field.
   * @return type
   */
  
  @Schema(name = "type", accessMode = Schema.AccessMode.READ_ONLY, description = "The data type of the field.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonTypeBean jsonTypeBean = (JsonTypeBean) o;
    return Objects.equals(this._configuration, jsonTypeBean._configuration) &&
        Objects.equals(this.custom, jsonTypeBean.custom) &&
        Objects.equals(this.customId, jsonTypeBean.customId) &&
        Objects.equals(this.items, jsonTypeBean.items) &&
        Objects.equals(this.system, jsonTypeBean.system) &&
        Objects.equals(this.type, jsonTypeBean.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_configuration, custom, customId, items, system, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonTypeBean {\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    customId: ").append(toIndentedString(customId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

