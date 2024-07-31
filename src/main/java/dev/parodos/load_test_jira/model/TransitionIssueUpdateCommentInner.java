package dev.parodos.load_test_jira.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import dev.parodos.load_test_jira.model.TransitionIssueUpdateCommentInnerAdd;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TransitionIssueUpdateCommentInner
 */

@JsonTypeName("TransitionIssue_update_comment_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-30T10:10:58.593190739+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class TransitionIssueUpdateCommentInner {

  private TransitionIssueUpdateCommentInnerAdd add;

  public TransitionIssueUpdateCommentInner add(TransitionIssueUpdateCommentInnerAdd add) {
    this.add = add;
    return this;
  }

  /**
   * Get add
   * @return add
   */
  @Valid 
  @Schema(name = "add", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("add")
  public TransitionIssueUpdateCommentInnerAdd getAdd() {
    return add;
  }

  public void setAdd(TransitionIssueUpdateCommentInnerAdd add) {
    this.add = add;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransitionIssueUpdateCommentInner transitionIssueUpdateCommentInner = (TransitionIssueUpdateCommentInner) o;
    return Objects.equals(this.add, transitionIssueUpdateCommentInner.add);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransitionIssueUpdateCommentInner {\n");
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
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

