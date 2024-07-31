package dev.parodos.load_test_jira.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dev.parodos.load_test_jira.model.JsonTypeBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The metadata describing an issue field.
 */

@Schema(name = "FieldMetadata", description = "The metadata describing an issue field.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-30T10:10:58.593190739+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class FieldMetadata {

  @Valid
  private List<Object> allowedValues = new ArrayList<>();

  private String autoCompleteUrl;

  @Valid
  private Map<String, Object> _configuration = new HashMap<>();

  private JsonNullable<Object> defaultValue = JsonNullable.<Object>undefined();

  private Boolean hasDefaultValue;

  private String key;

  private String name;

  @Valid
  private List<String> operations = new ArrayList<>();

  private Boolean required;

  private JsonTypeBean schema;

  public FieldMetadata() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FieldMetadata(String key, String name, List<String> operations, Boolean required, JsonTypeBean schema) {
    this.key = key;
    this.name = name;
    this.operations = operations;
    this.required = required;
    this.schema = schema;
  }

  public FieldMetadata allowedValues(List<Object> allowedValues) {
    this.allowedValues = allowedValues;
    return this;
  }

  public FieldMetadata addAllowedValuesItem(Object allowedValuesItem) {
    if (this.allowedValues == null) {
      this.allowedValues = new ArrayList<>();
    }
    this.allowedValues.add(allowedValuesItem);
    return this;
  }

  /**
   * The list of values allowed in the field.
   * @return allowedValues
   */
  
  @Schema(name = "allowedValues", accessMode = Schema.AccessMode.READ_ONLY, description = "The list of values allowed in the field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowedValues")
  public List<Object> getAllowedValues() {
    return allowedValues;
  }

  public void setAllowedValues(List<Object> allowedValues) {
    this.allowedValues = allowedValues;
  }

  public FieldMetadata autoCompleteUrl(String autoCompleteUrl) {
    this.autoCompleteUrl = autoCompleteUrl;
    return this;
  }

  /**
   * The URL that can be used to automatically complete the field.
   * @return autoCompleteUrl
   */
  
  @Schema(name = "autoCompleteUrl", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL that can be used to automatically complete the field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autoCompleteUrl")
  public String getAutoCompleteUrl() {
    return autoCompleteUrl;
  }

  public void setAutoCompleteUrl(String autoCompleteUrl) {
    this.autoCompleteUrl = autoCompleteUrl;
  }

  public FieldMetadata _configuration(Map<String, Object> _configuration) {
    this._configuration = _configuration;
    return this;
  }

  public FieldMetadata putConfigurationItem(String key, Object _configurationItem) {
    if (this._configuration == null) {
      this._configuration = new HashMap<>();
    }
    this._configuration.put(key, _configurationItem);
    return this;
  }

  /**
   * The configuration properties.
   * @return _configuration
   */
  
  @Schema(name = "configuration", accessMode = Schema.AccessMode.READ_ONLY, description = "The configuration properties.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configuration")
  public Map<String, Object> getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(Map<String, Object> _configuration) {
    this._configuration = _configuration;
  }

  public FieldMetadata defaultValue(Object defaultValue) {
    this.defaultValue = JsonNullable.of(defaultValue);
    return this;
  }

  /**
   * The default value of the field.
   * @return defaultValue
   */
  
  @Schema(name = "defaultValue", accessMode = Schema.AccessMode.READ_ONLY, description = "The default value of the field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultValue")
  public JsonNullable<Object> getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(JsonNullable<Object> defaultValue) {
    this.defaultValue = defaultValue;
  }

  public FieldMetadata hasDefaultValue(Boolean hasDefaultValue) {
    this.hasDefaultValue = hasDefaultValue;
    return this;
  }

  /**
   * Whether the field has a default value.
   * @return hasDefaultValue
   */
  
  @Schema(name = "hasDefaultValue", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the field has a default value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasDefaultValue")
  public Boolean getHasDefaultValue() {
    return hasDefaultValue;
  }

  public void setHasDefaultValue(Boolean hasDefaultValue) {
    this.hasDefaultValue = hasDefaultValue;
  }

  public FieldMetadata key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of the field.
   * @return key
   */
  
  @Schema(name = "key", accessMode = Schema.AccessMode.READ_ONLY, description = "The key of the field.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public FieldMetadata name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the field.
   * @return name
   */
  
  @Schema(name = "name", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of the field.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FieldMetadata operations(List<String> operations) {
    this.operations = operations;
    return this;
  }

  public FieldMetadata addOperationsItem(String operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<>();
    }
    this.operations.add(operationsItem);
    return this;
  }

  /**
   * The list of operations that can be performed on the field.
   * @return operations
   */
  
  @Schema(name = "operations", accessMode = Schema.AccessMode.READ_ONLY, description = "The list of operations that can be performed on the field.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operations")
  public List<String> getOperations() {
    return operations;
  }

  public void setOperations(List<String> operations) {
    this.operations = operations;
  }

  public FieldMetadata required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Whether the field is required.
   * @return required
   */
  
  @Schema(name = "required", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the field is required.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("required")
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public FieldMetadata schema(JsonTypeBean schema) {
    this.schema = schema;
    return this;
  }

  /**
   * The data type of the field.
   * @return schema
   */
  @Valid 
  @Schema(name = "schema", accessMode = Schema.AccessMode.READ_ONLY, description = "The data type of the field.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("schema")
  public JsonTypeBean getSchema() {
    return schema;
  }

  public void setSchema(JsonTypeBean schema) {
    this.schema = schema;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldMetadata fieldMetadata = (FieldMetadata) o;
    return Objects.equals(this.allowedValues, fieldMetadata.allowedValues) &&
        Objects.equals(this.autoCompleteUrl, fieldMetadata.autoCompleteUrl) &&
        Objects.equals(this._configuration, fieldMetadata._configuration) &&
        equalsNullable(this.defaultValue, fieldMetadata.defaultValue) &&
        Objects.equals(this.hasDefaultValue, fieldMetadata.hasDefaultValue) &&
        Objects.equals(this.key, fieldMetadata.key) &&
        Objects.equals(this.name, fieldMetadata.name) &&
        Objects.equals(this.operations, fieldMetadata.operations) &&
        Objects.equals(this.required, fieldMetadata.required) &&
        Objects.equals(this.schema, fieldMetadata.schema);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedValues, autoCompleteUrl, _configuration, hashCodeNullable(defaultValue), hasDefaultValue, key, name, operations, required, schema);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldMetadata {\n");
    sb.append("    allowedValues: ").append(toIndentedString(allowedValues)).append("\n");
    sb.append("    autoCompleteUrl: ").append(toIndentedString(autoCompleteUrl)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    hasDefaultValue: ").append(toIndentedString(hasDefaultValue)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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

