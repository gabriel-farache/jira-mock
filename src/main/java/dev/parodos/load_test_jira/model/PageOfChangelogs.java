package dev.parodos.load_test_jira.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dev.parodos.load_test_jira.model.Changelog;
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
 * A page of changelogs.
 */

@Schema(name = "PageOfChangelogs", description = "A page of changelogs.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-30T10:10:58.593190739+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class PageOfChangelogs {

  @Valid
  private List<@Valid Changelog> histories = new ArrayList<>();

  private Integer maxResults;

  private Integer startAt;

  private Integer total;

  public PageOfChangelogs histories(List<@Valid Changelog> histories) {
    this.histories = histories;
    return this;
  }

  public PageOfChangelogs addHistoriesItem(Changelog historiesItem) {
    if (this.histories == null) {
      this.histories = new ArrayList<>();
    }
    this.histories.add(historiesItem);
    return this;
  }

  /**
   * The list of changelogs.
   * @return histories
   */
  @Valid 
  @Schema(name = "histories", accessMode = Schema.AccessMode.READ_ONLY, description = "The list of changelogs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("histories")
  public List<@Valid Changelog> getHistories() {
    return histories;
  }

  public void setHistories(List<@Valid Changelog> histories) {
    this.histories = histories;
  }

  public PageOfChangelogs maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  /**
   * The maximum number of results that could be on the page.
   * @return maxResults
   */
  
  @Schema(name = "maxResults", accessMode = Schema.AccessMode.READ_ONLY, description = "The maximum number of results that could be on the page.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxResults")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public PageOfChangelogs startAt(Integer startAt) {
    this.startAt = startAt;
    return this;
  }

  /**
   * The index of the first item returned on the page.
   * @return startAt
   */
  
  @Schema(name = "startAt", accessMode = Schema.AccessMode.READ_ONLY, description = "The index of the first item returned on the page.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startAt")
  public Integer getStartAt() {
    return startAt;
  }

  public void setStartAt(Integer startAt) {
    this.startAt = startAt;
  }

  public PageOfChangelogs total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * The number of results on the page.
   * @return total
   */
  
  @Schema(name = "total", accessMode = Schema.AccessMode.READ_ONLY, description = "The number of results on the page.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageOfChangelogs pageOfChangelogs = (PageOfChangelogs) o;
    return Objects.equals(this.histories, pageOfChangelogs.histories) &&
        Objects.equals(this.maxResults, pageOfChangelogs.maxResults) &&
        Objects.equals(this.startAt, pageOfChangelogs.startAt) &&
        Objects.equals(this.total, pageOfChangelogs.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(histories, maxResults, startAt, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageOfChangelogs {\n");
    sb.append("    histories: ").append(toIndentedString(histories)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

