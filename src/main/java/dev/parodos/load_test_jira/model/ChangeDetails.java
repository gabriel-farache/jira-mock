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

/**
 * A change item.
 */

@Schema(name = "ChangeDetails", description = "A change item.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-30T10:10:58.593190739+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class ChangeDetails {

  private String field;

  private String fieldId;

  private String fieldtype;

  private String from;

  private String fromString;

  private String to;

  private String toString;

  public ChangeDetails field(String field) {
    this.field = field;
    return this;
  }

  /**
   * The name of the field changed.
   * @return field
   */
  
  @Schema(name = "field", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of the field changed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("field")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public ChangeDetails fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

  /**
   * The ID of the field changed.
   * @return fieldId
   */
  
  @Schema(name = "fieldId", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the field changed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fieldId")
  public String getFieldId() {
    return fieldId;
  }

  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }

  public ChangeDetails fieldtype(String fieldtype) {
    this.fieldtype = fieldtype;
    return this;
  }

  /**
   * The type of the field changed.
   * @return fieldtype
   */
  
  @Schema(name = "fieldtype", accessMode = Schema.AccessMode.READ_ONLY, description = "The type of the field changed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fieldtype")
  public String getFieldtype() {
    return fieldtype;
  }

  public void setFieldtype(String fieldtype) {
    this.fieldtype = fieldtype;
  }

  public ChangeDetails from(String from) {
    this.from = from;
    return this;
  }

  /**
   * The details of the original value.
   * @return from
   */
  
  @Schema(name = "from", accessMode = Schema.AccessMode.READ_ONLY, description = "The details of the original value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("from")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public ChangeDetails fromString(String fromString) {
    this.fromString = fromString;
    return this;
  }

  /**
   * The details of the original value as a string.
   * @return fromString
   */
  
  @Schema(name = "fromString", accessMode = Schema.AccessMode.READ_ONLY, description = "The details of the original value as a string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fromString")
  public String getFromString() {
    return fromString;
  }

  public void setFromString(String fromString) {
    this.fromString = fromString;
  }

  public ChangeDetails to(String to) {
    this.to = to;
    return this;
  }

  /**
   * The details of the new value.
   * @return to
   */
  
  @Schema(name = "to", accessMode = Schema.AccessMode.READ_ONLY, description = "The details of the new value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("to")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public ChangeDetails toString(String toString) {
    this.toString = toString;
    return this;
  }

  /**
   * The details of the new value as a string.
   * @return toString
   */
  
  @Schema(name = "toString", accessMode = Schema.AccessMode.READ_ONLY, description = "The details of the new value as a string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("toString")
  public String getToString() {
    return toString;
  }

  public void setToString(String toString) {
    this.toString = toString;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeDetails changeDetails = (ChangeDetails) o;
    return Objects.equals(this.field, changeDetails.field) &&
        Objects.equals(this.fieldId, changeDetails.fieldId) &&
        Objects.equals(this.fieldtype, changeDetails.fieldtype) &&
        Objects.equals(this.from, changeDetails.from) &&
        Objects.equals(this.fromString, changeDetails.fromString) &&
        Objects.equals(this.to, changeDetails.to) &&
        Objects.equals(this.toString, changeDetails.toString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, fieldId, fieldtype, from, fromString, to, toString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeDetails {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    fieldtype: ").append(toIndentedString(fieldtype)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    fromString: ").append(toIndentedString(fromString)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    toString: ").append(toIndentedString(toString)).append("\n");
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

