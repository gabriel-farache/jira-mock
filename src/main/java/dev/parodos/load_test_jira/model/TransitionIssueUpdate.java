package dev.parodos.load_test_jira.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import dev.parodos.load_test_jira.model.TransitionIssueUpdateCommentInner;
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
 * TransitionIssueUpdate
 */

@JsonTypeName("TransitionIssue_update")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-30T10:10:58.593190739+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class TransitionIssueUpdate {

  @Valid
  private List<@Valid TransitionIssueUpdateCommentInner> comment = new ArrayList<>();

  public TransitionIssueUpdate comment(List<@Valid TransitionIssueUpdateCommentInner> comment) {
    this.comment = comment;
    return this;
  }

  public TransitionIssueUpdate addCommentItem(TransitionIssueUpdateCommentInner commentItem) {
    if (this.comment == null) {
      this.comment = new ArrayList<>();
    }
    this.comment.add(commentItem);
    return this;
  }

  /**
   * Get comment
   * @return comment
   */
  @Valid 
  @Schema(name = "comment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public List<@Valid TransitionIssueUpdateCommentInner> getComment() {
    return comment;
  }

  public void setComment(List<@Valid TransitionIssueUpdateCommentInner> comment) {
    this.comment = comment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransitionIssueUpdate transitionIssueUpdate = (TransitionIssueUpdate) o;
    return Objects.equals(this.comment, transitionIssueUpdate.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransitionIssueUpdate {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

