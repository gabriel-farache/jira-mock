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
 * Details about the operations available in this version.
 */

@Schema(name = "SimpleLink", description = "Details about the operations available in this version.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-30T10:10:58.593190739+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class SimpleLink {

  private String href;

  private String iconClass;

  private String id;

  private String label;

  private String styleClass;

  private String title;

  private Integer weight;

  public SimpleLink href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Get href
   * @return href
   */
  
  @Schema(name = "href", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public SimpleLink iconClass(String iconClass) {
    this.iconClass = iconClass;
    return this;
  }

  /**
   * Get iconClass
   * @return iconClass
   */
  
  @Schema(name = "iconClass", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("iconClass")
  public String getIconClass() {
    return iconClass;
  }

  public void setIconClass(String iconClass) {
    this.iconClass = iconClass;
  }

  public SimpleLink id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SimpleLink label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
   */
  
  @Schema(name = "label", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public SimpleLink styleClass(String styleClass) {
    this.styleClass = styleClass;
    return this;
  }

  /**
   * Get styleClass
   * @return styleClass
   */
  
  @Schema(name = "styleClass", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("styleClass")
  public String getStyleClass() {
    return styleClass;
  }

  public void setStyleClass(String styleClass) {
    this.styleClass = styleClass;
  }

  public SimpleLink title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public SimpleLink weight(Integer weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
   */
  
  @Schema(name = "weight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weight")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleLink simpleLink = (SimpleLink) o;
    return Objects.equals(this.href, simpleLink.href) &&
        Objects.equals(this.iconClass, simpleLink.iconClass) &&
        Objects.equals(this.id, simpleLink.id) &&
        Objects.equals(this.label, simpleLink.label) &&
        Objects.equals(this.styleClass, simpleLink.styleClass) &&
        Objects.equals(this.title, simpleLink.title) &&
        Objects.equals(this.weight, simpleLink.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, iconClass, id, label, styleClass, title, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleLink {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    iconClass: ").append(toIndentedString(iconClass)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    styleClass: ").append(toIndentedString(styleClass)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

