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
 * A project category.
 */

@Schema(name = "UpdatedProjectCategory", description = "A project category.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-30T10:10:58.593190739+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class UpdatedProjectCategory {

  private String description;

  private String id;

  private String name;

  private String self;

  public UpdatedProjectCategory description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The name of the project category.
   * @return description
   */
  
  @Schema(name = "description", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of the project category.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpdatedProjectCategory id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the project category.
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the project category.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UpdatedProjectCategory name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The description of the project category.
   * @return name
   */
  
  @Schema(name = "name", accessMode = Schema.AccessMode.READ_ONLY, description = "The description of the project category.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdatedProjectCategory self(String self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the project category.
   * @return self
   */
  
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the project category.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatedProjectCategory updatedProjectCategory = (UpdatedProjectCategory) o;
    return Objects.equals(this.description, updatedProjectCategory.description) &&
        Objects.equals(this.id, updatedProjectCategory.id) &&
        Objects.equals(this.name, updatedProjectCategory.name) &&
        Objects.equals(this.self, updatedProjectCategory.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatedProjectCategory {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

