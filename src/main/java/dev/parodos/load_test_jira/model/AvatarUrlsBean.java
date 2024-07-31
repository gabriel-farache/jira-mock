package dev.parodos.load_test_jira.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AvatarUrlsBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-30T10:10:58.593190739+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class AvatarUrlsBean {

  private URI _16x16;

  private URI _24x24;

  private URI _32x32;

  private URI _48x48;

  public AvatarUrlsBean _16x16(URI _16x16) {
    this._16x16 = _16x16;
    return this;
  }

  /**
   * The URL of the item's 16x16 pixel avatar.
   * @return _16x16
   */
  @Valid 
  @Schema(name = "16x16", description = "The URL of the item's 16x16 pixel avatar.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("16x16")
  public URI get16x16() {
    return _16x16;
  }

  public void set16x16(URI _16x16) {
    this._16x16 = _16x16;
  }

  public AvatarUrlsBean _24x24(URI _24x24) {
    this._24x24 = _24x24;
    return this;
  }

  /**
   * The URL of the item's 24x24 pixel avatar.
   * @return _24x24
   */
  @Valid 
  @Schema(name = "24x24", description = "The URL of the item's 24x24 pixel avatar.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("24x24")
  public URI get24x24() {
    return _24x24;
  }

  public void set24x24(URI _24x24) {
    this._24x24 = _24x24;
  }

  public AvatarUrlsBean _32x32(URI _32x32) {
    this._32x32 = _32x32;
    return this;
  }

  /**
   * The URL of the item's 32x32 pixel avatar.
   * @return _32x32
   */
  @Valid 
  @Schema(name = "32x32", description = "The URL of the item's 32x32 pixel avatar.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("32x32")
  public URI get32x32() {
    return _32x32;
  }

  public void set32x32(URI _32x32) {
    this._32x32 = _32x32;
  }

  public AvatarUrlsBean _48x48(URI _48x48) {
    this._48x48 = _48x48;
    return this;
  }

  /**
   * The URL of the item's 48x48 pixel avatar.
   * @return _48x48
   */
  @Valid 
  @Schema(name = "48x48", description = "The URL of the item's 48x48 pixel avatar.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("48x48")
  public URI get48x48() {
    return _48x48;
  }

  public void set48x48(URI _48x48) {
    this._48x48 = _48x48;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvatarUrlsBean avatarUrlsBean = (AvatarUrlsBean) o;
    return Objects.equals(this._16x16, avatarUrlsBean._16x16) &&
        Objects.equals(this._24x24, avatarUrlsBean._24x24) &&
        Objects.equals(this._32x32, avatarUrlsBean._32x32) &&
        Objects.equals(this._48x48, avatarUrlsBean._48x48);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_16x16, _24x24, _32x32, _48x48);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvatarUrlsBean {\n");
    sb.append("    _16x16: ").append(toIndentedString(_16x16)).append("\n");
    sb.append("    _24x24: ").append(toIndentedString(_24x24)).append("\n");
    sb.append("    _32x32: ").append(toIndentedString(_32x32)).append("\n");
    sb.append("    _48x48: ").append(toIndentedString(_48x48)).append("\n");
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

