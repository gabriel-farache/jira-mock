package dev.parodos.load_test_jira.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * IncludedFields
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-30T10:10:58.593190739+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class IncludedFields {

  @Valid
  private Set<String> actuallyIncluded = new LinkedHashSet<>();

  @Valid
  private Set<String> excluded = new LinkedHashSet<>();

  @Valid
  private Set<String> included = new LinkedHashSet<>();

  public IncludedFields actuallyIncluded(Set<String> actuallyIncluded) {
    this.actuallyIncluded = actuallyIncluded;
    return this;
  }

  public IncludedFields addActuallyIncludedItem(String actuallyIncludedItem) {
    if (this.actuallyIncluded == null) {
      this.actuallyIncluded = new LinkedHashSet<>();
    }
    this.actuallyIncluded.add(actuallyIncludedItem);
    return this;
  }

  /**
   * Get actuallyIncluded
   * @return actuallyIncluded
   */
  
  @Schema(name = "actuallyIncluded", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actuallyIncluded")
  public Set<String> getActuallyIncluded() {
    return actuallyIncluded;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setActuallyIncluded(Set<String> actuallyIncluded) {
    this.actuallyIncluded = actuallyIncluded;
  }

  public IncludedFields excluded(Set<String> excluded) {
    this.excluded = excluded;
    return this;
  }

  public IncludedFields addExcludedItem(String excludedItem) {
    if (this.excluded == null) {
      this.excluded = new LinkedHashSet<>();
    }
    this.excluded.add(excludedItem);
    return this;
  }

  /**
   * Get excluded
   * @return excluded
   */
  
  @Schema(name = "excluded", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("excluded")
  public Set<String> getExcluded() {
    return excluded;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setExcluded(Set<String> excluded) {
    this.excluded = excluded;
  }

  public IncludedFields included(Set<String> included) {
    this.included = included;
    return this;
  }

  public IncludedFields addIncludedItem(String includedItem) {
    if (this.included == null) {
      this.included = new LinkedHashSet<>();
    }
    this.included.add(includedItem);
    return this;
  }

  /**
   * Get included
   * @return included
   */
  
  @Schema(name = "included", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("included")
  public Set<String> getIncluded() {
    return included;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setIncluded(Set<String> included) {
    this.included = included;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncludedFields includedFields = (IncludedFields) o;
    return Objects.equals(this.actuallyIncluded, includedFields.actuallyIncluded) &&
        Objects.equals(this.excluded, includedFields.excluded) &&
        Objects.equals(this.included, includedFields.included);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actuallyIncluded, excluded, included);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludedFields {\n");
    sb.append("    actuallyIncluded: ").append(toIndentedString(actuallyIncluded)).append("\n");
    sb.append("    excluded: ").append(toIndentedString(excluded)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
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

