package dev.parodos.load_test_jira.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dev.parodos.load_test_jira.model.SimpleLink;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Details a link group, which defines issue operations.
 */

@Schema(name = "LinkGroup", description = "Details a link group, which defines issue operations.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-30T10:10:58.593190739+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class LinkGroup {

  @Valid
  private List<@Valid LinkGroup> groups = new ArrayList<>();

  private SimpleLink header;

  private String id;

  @Valid
  private List<@Valid SimpleLink> links = new ArrayList<>();

  private String styleClass;

  private Integer weight;

  public LinkGroup groups(List<@Valid LinkGroup> groups) {
    this.groups = groups;
    return this;
  }

  public LinkGroup addGroupsItem(LinkGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups
   * @return groups
   */
  @Valid 
  @Schema(name = "groups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groups")
  public List<@Valid LinkGroup> getGroups() {
    return groups;
  }

  public void setGroups(List<@Valid LinkGroup> groups) {
    this.groups = groups;
  }

  public LinkGroup header(SimpleLink header) {
    this.header = header;
    return this;
  }

  /**
   * Get header
   * @return header
   */
  @Valid 
  @Schema(name = "header", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("header")
  public SimpleLink getHeader() {
    return header;
  }

  public void setHeader(SimpleLink header) {
    this.header = header;
  }

  public LinkGroup id(String id) {
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

  public LinkGroup links(List<@Valid SimpleLink> links) {
    this.links = links;
    return this;
  }

  public LinkGroup addLinksItem(SimpleLink linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
   */
  @Valid 
  @Schema(name = "links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("links")
  public List<@Valid SimpleLink> getLinks() {
    return links;
  }

  public void setLinks(List<@Valid SimpleLink> links) {
    this.links = links;
  }

  public LinkGroup styleClass(String styleClass) {
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

  public LinkGroup weight(Integer weight) {
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
    LinkGroup linkGroup = (LinkGroup) o;
    return Objects.equals(this.groups, linkGroup.groups) &&
        Objects.equals(this.header, linkGroup.header) &&
        Objects.equals(this.id, linkGroup.id) &&
        Objects.equals(this.links, linkGroup.links) &&
        Objects.equals(this.styleClass, linkGroup.styleClass) &&
        Objects.equals(this.weight, linkGroup.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, header, id, links, styleClass, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkGroup {\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    styleClass: ").append(toIndentedString(styleClass)).append("\n");
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

