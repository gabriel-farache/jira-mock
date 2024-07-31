package dev.parodos.load_test_jira.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
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
 * Details of an operation to perform on a field.
 */

@Schema(name = "FieldUpdateOperation", description = "Details of an operation to perform on a field.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-30T10:10:58.593190739+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class FieldUpdateOperation {

  private JsonNullable<Object> add = JsonNullable.<Object>undefined();

  private JsonNullable<Object> copy = JsonNullable.<Object>undefined();

  private JsonNullable<Object> edit = JsonNullable.<Object>undefined();

  private JsonNullable<Object> remove = JsonNullable.<Object>undefined();

  private JsonNullable<Object> set = JsonNullable.<Object>undefined();

  public FieldUpdateOperation add(Object add) {
    this.add = JsonNullable.of(add);
    return this;
  }

  /**
   * The value to add to the field.
   * @return add
   */
  
  @Schema(name = "add", example = "triaged", description = "The value to add to the field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("add")
  public JsonNullable<Object> getAdd() {
    return add;
  }

  public void setAdd(JsonNullable<Object> add) {
    this.add = add;
  }

  public FieldUpdateOperation copy(Object copy) {
    this.copy = JsonNullable.of(copy);
    return this;
  }

  /**
   * The field value to copy from another issue.
   * @return copy
   */
  
  @Schema(name = "copy", example = "{\"issuelinks\":{\"sourceIssues\":[{\"key\":\"FP-5\"}]}}", description = "The field value to copy from another issue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("copy")
  public JsonNullable<Object> getCopy() {
    return copy;
  }

  public void setCopy(JsonNullable<Object> copy) {
    this.copy = copy;
  }

  public FieldUpdateOperation edit(Object edit) {
    this.edit = JsonNullable.of(edit);
    return this;
  }

  /**
   * The value to edit in the field.
   * @return edit
   */
  
  @Schema(name = "edit", example = "{\"originalEstimate\":\"1w 1d\",\"remainingEstimate\":\"4d\"}", description = "The value to edit in the field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("edit")
  public JsonNullable<Object> getEdit() {
    return edit;
  }

  public void setEdit(JsonNullable<Object> edit) {
    this.edit = edit;
  }

  public FieldUpdateOperation remove(Object remove) {
    this.remove = JsonNullable.of(remove);
    return this;
  }

  /**
   * The value to removed from the field.
   * @return remove
   */
  
  @Schema(name = "remove", example = "blocker", description = "The value to removed from the field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("remove")
  public JsonNullable<Object> getRemove() {
    return remove;
  }

  public void setRemove(JsonNullable<Object> remove) {
    this.remove = remove;
  }

  public FieldUpdateOperation set(Object set) {
    this.set = JsonNullable.of(set);
    return this;
  }

  /**
   * The value to set in the field.
   * @return set
   */
  
  @Schema(name = "set", example = "A new summary", description = "The value to set in the field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("set")
  public JsonNullable<Object> getSet() {
    return set;
  }

  public void setSet(JsonNullable<Object> set) {
    this.set = set;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldUpdateOperation fieldUpdateOperation = (FieldUpdateOperation) o;
    return equalsNullable(this.add, fieldUpdateOperation.add) &&
        equalsNullable(this.copy, fieldUpdateOperation.copy) &&
        equalsNullable(this.edit, fieldUpdateOperation.edit) &&
        equalsNullable(this.remove, fieldUpdateOperation.remove) &&
        equalsNullable(this.set, fieldUpdateOperation.set);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(add), hashCodeNullable(copy), hashCodeNullable(edit), hashCodeNullable(remove), hashCodeNullable(set));
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
    sb.append("class FieldUpdateOperation {\n");
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
    sb.append("    copy: ").append(toIndentedString(copy)).append("\n");
    sb.append("    edit: ").append(toIndentedString(edit)).append("\n");
    sb.append("    remove: ").append(toIndentedString(remove)).append("\n");
    sb.append("    set: ").append(toIndentedString(set)).append("\n");
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

