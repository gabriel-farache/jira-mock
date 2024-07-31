package dev.parodos.load_test_jira.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dev.parodos.load_test_jira.model.ChangeDetails;
import dev.parodos.load_test_jira.model.HistoryMetadata;
import dev.parodos.load_test_jira.model.UserDetails;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A log of changes made to issue fields. Changelogs related to workflow associations are currently being deprecated.
 */

@Schema(name = "Changelog", description = "A log of changes made to issue fields. Changelogs related to workflow associations are currently being deprecated.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-30T10:10:58.593190739+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class Changelog {

  private UserDetails author;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime created;

  private HistoryMetadata historyMetadata;

  private String id;

  @Valid
  private List<@Valid ChangeDetails> items = new ArrayList<>();

  public Changelog author(UserDetails author) {
    this.author = author;
    return this;
  }

  /**
   * The user who made the change.
   * @return author
   */
  @Valid 
  @Schema(name = "author", accessMode = Schema.AccessMode.READ_ONLY, description = "The user who made the change.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("author")
  public UserDetails getAuthor() {
    return author;
  }

  public void setAuthor(UserDetails author) {
    this.author = author;
  }

  public Changelog created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * The date on which the change took place.
   * @return created
   */
  @Valid 
  @Schema(name = "created", accessMode = Schema.AccessMode.READ_ONLY, description = "The date on which the change took place.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public Changelog historyMetadata(HistoryMetadata historyMetadata) {
    this.historyMetadata = historyMetadata;
    return this;
  }

  /**
   * The history metadata associated with the changed.
   * @return historyMetadata
   */
  @Valid 
  @Schema(name = "historyMetadata", accessMode = Schema.AccessMode.READ_ONLY, description = "The history metadata associated with the changed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("historyMetadata")
  public HistoryMetadata getHistoryMetadata() {
    return historyMetadata;
  }

  public void setHistoryMetadata(HistoryMetadata historyMetadata) {
    this.historyMetadata = historyMetadata;
  }

  public Changelog id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the changelog.
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the changelog.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Changelog items(List<@Valid ChangeDetails> items) {
    this.items = items;
    return this;
  }

  public Changelog addItemsItem(ChangeDetails itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * The list of items changed.
   * @return items
   */
  @Valid 
  @Schema(name = "items", accessMode = Schema.AccessMode.READ_ONLY, description = "The list of items changed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid ChangeDetails> getItems() {
    return items;
  }

  public void setItems(List<@Valid ChangeDetails> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Changelog changelog = (Changelog) o;
    return Objects.equals(this.author, changelog.author) &&
        Objects.equals(this.created, changelog.created) &&
        Objects.equals(this.historyMetadata, changelog.historyMetadata) &&
        Objects.equals(this.id, changelog.id) &&
        Objects.equals(this.items, changelog.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, created, historyMetadata, id, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Changelog {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    historyMetadata: ").append(toIndentedString(historyMetadata)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

