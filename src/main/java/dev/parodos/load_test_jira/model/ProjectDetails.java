package dev.parodos.load_test_jira.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import dev.parodos.load_test_jira.model.AvatarUrlsBean;
import dev.parodos.load_test_jira.model.UpdatedProjectCategory;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Details about a project.
 */

@Schema(name = "ProjectDetails", description = "Details about a project.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-30T10:10:58.593190739+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class ProjectDetails {

  private AvatarUrlsBean avatarUrls;

  private String id;

  private String key;

  private String name;

  private UpdatedProjectCategory projectCategory;

  /**
   * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.
   */
  public enum ProjectTypeKeyEnum {
    SOFTWARE("software"),
    
    SERVICE_DESK("service_desk"),
    
    BUSINESS("business");

    private String value;

    ProjectTypeKeyEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProjectTypeKeyEnum fromValue(String value) {
      for (ProjectTypeKeyEnum b : ProjectTypeKeyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ProjectTypeKeyEnum projectTypeKey;

  private String self;

  private Boolean simplified;

  public ProjectDetails avatarUrls(AvatarUrlsBean avatarUrls) {
    this.avatarUrls = avatarUrls;
    return this;
  }

  /**
   * The URLs of the project's avatars.
   * @return avatarUrls
   */
  @Valid 
  @Schema(name = "avatarUrls", accessMode = Schema.AccessMode.READ_ONLY, description = "The URLs of the project's avatars.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avatarUrls")
  public AvatarUrlsBean getAvatarUrls() {
    return avatarUrls;
  }

  public void setAvatarUrls(AvatarUrlsBean avatarUrls) {
    this.avatarUrls = avatarUrls;
  }

  public ProjectDetails id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the project.
   * @return id
   */
  
  @Schema(name = "id", description = "The ID of the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProjectDetails key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of the project.
   * @return key
   */
  
  @Schema(name = "key", accessMode = Schema.AccessMode.READ_ONLY, description = "The key of the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ProjectDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the project.
   * @return name
   */
  
  @Schema(name = "name", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProjectDetails projectCategory(UpdatedProjectCategory projectCategory) {
    this.projectCategory = projectCategory;
    return this;
  }

  /**
   * The category the project belongs to.
   * @return projectCategory
   */
  @Valid 
  @Schema(name = "projectCategory", accessMode = Schema.AccessMode.READ_ONLY, description = "The category the project belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectCategory")
  public UpdatedProjectCategory getProjectCategory() {
    return projectCategory;
  }

  public void setProjectCategory(UpdatedProjectCategory projectCategory) {
    this.projectCategory = projectCategory;
  }

  public ProjectDetails projectTypeKey(ProjectTypeKeyEnum projectTypeKey) {
    this.projectTypeKey = projectTypeKey;
    return this;
  }

  /**
   * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.
   * @return projectTypeKey
   */
  
  @Schema(name = "projectTypeKey", accessMode = Schema.AccessMode.READ_ONLY, description = "The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectTypeKey")
  public ProjectTypeKeyEnum getProjectTypeKey() {
    return projectTypeKey;
  }

  public void setProjectTypeKey(ProjectTypeKeyEnum projectTypeKey) {
    this.projectTypeKey = projectTypeKey;
  }

  public ProjectDetails self(String self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the project details.
   * @return self
   */
  
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the project details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public ProjectDetails simplified(Boolean simplified) {
    this.simplified = simplified;
    return this;
  }

  /**
   * Whether or not the project is simplified.
   * @return simplified
   */
  
  @Schema(name = "simplified", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether or not the project is simplified.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("simplified")
  public Boolean getSimplified() {
    return simplified;
  }

  public void setSimplified(Boolean simplified) {
    this.simplified = simplified;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectDetails projectDetails = (ProjectDetails) o;
    return Objects.equals(this.avatarUrls, projectDetails.avatarUrls) &&
        Objects.equals(this.id, projectDetails.id) &&
        Objects.equals(this.key, projectDetails.key) &&
        Objects.equals(this.name, projectDetails.name) &&
        Objects.equals(this.projectCategory, projectDetails.projectCategory) &&
        Objects.equals(this.projectTypeKey, projectDetails.projectTypeKey) &&
        Objects.equals(this.self, projectDetails.self) &&
        Objects.equals(this.simplified, projectDetails.simplified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarUrls, id, key, name, projectCategory, projectTypeKey, self, simplified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectDetails {\n");
    sb.append("    avatarUrls: ").append(toIndentedString(avatarUrls)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectCategory: ").append(toIndentedString(projectCategory)).append("\n");
    sb.append("    projectTypeKey: ").append(toIndentedString(projectTypeKey)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    simplified: ").append(toIndentedString(simplified)).append("\n");
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

