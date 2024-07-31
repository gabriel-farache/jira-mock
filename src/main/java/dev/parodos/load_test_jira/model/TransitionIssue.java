package dev.parodos.load_test_jira.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dev.parodos.load_test_jira.model.TransitionIssueTransition;
import dev.parodos.load_test_jira.model.TransitionIssueUpdate;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TransitionIssue
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-30T10:10:58.593190739+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class TransitionIssue {

  private TransitionIssueTransition transition;

  private TransitionIssueUpdate update;

  public TransitionIssue transition(TransitionIssueTransition transition) {
    this.transition = transition;
    return this;
  }

  /**
   * Get transition
   * @return transition
   */
  @Valid 
  @Schema(name = "transition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transition")
  public TransitionIssueTransition getTransition() {
    return transition;
  }

  public void setTransition(TransitionIssueTransition transition) {
    this.transition = transition;
  }

  public TransitionIssue update(TransitionIssueUpdate update) {
    this.update = update;
    return this;
  }

  /**
   * Get update
   * @return update
   */
  @Valid 
  @Schema(name = "update", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("update")
  public TransitionIssueUpdate getUpdate() {
    return update;
  }

  public void setUpdate(TransitionIssueUpdate update) {
    this.update = update;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransitionIssue transitionIssue = (TransitionIssue) o;
    return Objects.equals(this.transition, transitionIssue.transition) &&
        Objects.equals(this.update, transitionIssue.update);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transition, update);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransitionIssue {\n");
    sb.append("    transition: ").append(toIndentedString(transition)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
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

