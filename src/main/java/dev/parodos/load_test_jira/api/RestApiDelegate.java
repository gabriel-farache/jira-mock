package dev.parodos.load_test_jira.api;

import dev.parodos.load_test_jira.model.IssueBean;
import dev.parodos.load_test_jira.model.IssueUpdateDetails;
import dev.parodos.load_test_jira.model.StatusCategory;
import dev.parodos.load_test_jira.model.StatusDetails;
import dev.parodos.load_test_jira.model.TransitionIssue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

/**
 * A delegate to be called by the {@link RestApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-30T10:10:58.593190739+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public interface RestApiDelegate {
    final static Logger LOGGER = LoggerFactory.getLogger(RestApiDelegate.class);

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /rest/api/2/issue : Create issue
     * Creates an issue or, where the option to create subtasks is enabled in Jira, a subtask. A transition may be applied, to move the issue or subtask to a workflow step other than the default start step, and issue properties set.  The content of the issue or subtask is defined using &#x60;update&#x60; and &#x60;fields&#x60;. The fields that can be set in the issue or subtask are determined using the [ Get create issue metadata](#api-rest-api-3-issue-createmeta-get). These are the same fields that appear on the issue&#39;s create screen. Note that the &#x60;description&#x60;, &#x60;environment&#x60;, and any &#x60;textarea&#x60; type custom fields (multi-line text fields) take Atlassian Document Format content. Single line custom fields (&#x60;textfield&#x60;) accept a string and don&#39;t handle Atlassian Document Format content.  Creating a subtask differs from creating an issue as follows:   *  &#x60;issueType&#x60; must be set to a subtask issue type (use [ Get create issue metadata](#api-rest-api-3-issue-createmeta-get) to find subtask issue types).  *  &#x60;parent&#x60; must contain the ID or key of the parent issue.  In a next-gen project any issue may be made a child providing that the parent and child are members of the same project.  **[Permissions](#permissions) required:** *Browse projects* and *Create issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project in which the issue or subtask is created.
     *
     * @param issueUpdateDetails Input parameters for the action createIssue in BS (required)
     * @param updateHistory Whether the project in which the issue is created is added to the user&#39;s **Recently viewed** project list, as shown under **Projects** in Jira. When provided, the issue type and request type are added to the user&#39;s history for a project. These values are then used to provide defaults on the issue create screen. (optional, default to false)
     * @return Create Issue Response (status code 200)
     * @see RestApi#createIssue
     */
    default ResponseEntity<Object> createIssue(IssueUpdateDetails issueUpdateDetails,
        Boolean updateHistory) {
        IssueBean createdIssue = new IssueBean();
        createdIssue.id("LOADTEST-XXX");
        LOGGER.info("Creating issue: {}", issueUpdateDetails.toString());
        return ResponseEntity.ok().body(createdIssue);

    }

    /**
     * GET /rest/api/2/issue/{issueIdOrKey} : Get issue
     * Returns the details for an issue.  The issue is identified by its ID or key, however, if the identifier doesn&#39;t match an issue, a case-insensitive search and check for moved issues is performed. If a matching issue is found its details are returned, a 302 or other redirect is **not** returned. The issue key returned in the response is the key of the issue found.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @param issueIdOrKey The ID or key of the issue. (required)
     * @param fields A list of fields to return for the issue. This parameter accepts a comma-separated list. Use it to retrieve a subset of fields. Allowed values:   *  &#x60;*all&#x60; Returns all fields.  *  &#x60;*navigable&#x60; Returns navigable fields.  *  Any issue field, prefixed with a minus to exclude.  Examples:   *  &#x60;summary,comment&#x60; Returns only the summary and comments fields.  *  &#x60;-description&#x60; Returns all (default) fields except description.  *  &#x60;*navigable,-comment&#x60; Returns all navigable fields except comment.  This parameter may be specified multiple times. For example, &#x60;fields&#x3D;field1,field2&amp; fields&#x3D;field3&#x60;.  Note: All fields are returned by default. This differs from [Search for issues using JQL (GET)](#api-rest-api-2-search-get) and [Search for issues using JQL (POST)](#api-rest-api-2-search-post) where the default is all navigable fields. (optional)
     * @param fieldsByKeys Whether fields in &#x60;fields&#x60; are referenced by keys rather than IDs. This parameter is useful where fields have been added by a connect app and a field&#39;s key may differ from its ID. (optional, default to false)
     * @param expand Use [expand](#expansion) to include additional information about the issues in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;renderedFields&#x60; Returns field values rendered in HTML format.  *  &#x60;names&#x60; Returns the display name of each field.  *  &#x60;schema&#x60; Returns the schema describing a field type.  *  &#x60;transitions&#x60; Returns all possible transitions for the issue.  *  &#x60;editmeta&#x60; Returns information about how each field can be edited.  *  &#x60;changelog&#x60; Returns a list of recent updates to an issue, sorted by date, starting from the most recent.  *  &#x60;versionedRepresentations&#x60; Returns a JSON array for each version of a field&#39;s value, with the highest number representing the most recent version. Note: When included in the request, the &#x60;fields&#x60; parameter is ignored. (optional)
     * @param properties A list of issue properties to return for the issue. This parameter accepts a comma-separated list. Allowed values:   *  &#x60;*all&#x60; Returns all issue properties.  *  Any issue property key, prefixed with a minus to exclude.  Examples:   *  &#x60;*all&#x60; Returns all properties.  *  &#x60;*all,-prop1&#x60; Returns all properties except &#x60;prop1&#x60;.  *  &#x60;prop1,prop2&#x60; Returns &#x60;prop1&#x60; and &#x60;prop2&#x60; properties.  This parameter may be specified multiple times. For example, &#x60;properties&#x3D;prop1,prop2&amp; properties&#x3D;prop3&#x60;. (optional)
     * @param updateHistory Whether the project in which the issue is created is added to the user&#39;s **Recently viewed** project list, as shown under **Projects** in Jira. This also populates the [JQL issues search](#api-rest-api-2-search-get) &#x60;lastViewed&#x60; field. (optional, default to false)
     * @return Returned if the request is successful. (status code 200)
     *         or Returned if the authentication credentials are incorrect or missing. (status code 401)
     *         or Returned if the issue is not found or the user does not have permission to view it. (status code 404)
     * @see RestApi#getIssue
     */
    default ResponseEntity<IssueBean> getIssue(String issueIdOrKey,
        List<String> fields,
        Boolean fieldsByKeys,
        String expand,
        List<String> properties,
        Boolean updateHistory) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"schema\" : { \"key\" : { \"system\" : \"system\", \"configuration\" : { \"key\" : \"\" }, \"custom\" : \"custom\", \"type\" : \"type\", \"customId\" : 0, \"items\" : \"items\" } }, \"editmeta\" : \"\", \"fieldsToInclude\" : { \"excluded\" : [ \"excluded\", \"excluded\" ], \"actuallyIncluded\" : [ \"actuallyIncluded\", \"actuallyIncluded\" ], \"included\" : [ \"included\", \"included\" ] }, \"changelog\" : \"\", \"transitions\" : [ { \"hasScreen\" : true, \"isAvailable\" : true, \"expand\" : \"expand\", \"isGlobal\" : true, \"isInitial\" : true, \"looped\" : true, \"name\" : \"name\", \"id\" : \"id\", \"isConditional\" : true, \"to\" : \"\", \"fields\" : { \"key\" : { \"allowedValues\" : [ \"\", \"\" ], \"hasDefaultValue\" : true, \"schema\" : \"\", \"operations\" : [ \"operations\", \"operations\" ], \"configuration\" : { \"key\" : \"\" }, \"defaultValue\" : \"\", \"name\" : \"name\", \"autoCompleteUrl\" : \"autoCompleteUrl\", \"key\" : \"key\", \"required\" : true } } }, { \"hasScreen\" : true, \"isAvailable\" : true, \"expand\" : \"expand\", \"isGlobal\" : true, \"isInitial\" : true, \"looped\" : true, \"name\" : \"name\", \"id\" : \"id\", \"isConditional\" : true, \"to\" : \"\", \"fields\" : { \"key\" : { \"allowedValues\" : [ \"\", \"\" ], \"hasDefaultValue\" : true, \"schema\" : \"\", \"operations\" : [ \"operations\", \"operations\" ], \"configuration\" : { \"key\" : \"\" }, \"defaultValue\" : \"\", \"name\" : \"name\", \"autoCompleteUrl\" : \"autoCompleteUrl\", \"key\" : \"key\", \"required\" : true } } } ], \"renderedFields\" : { \"key\" : \"\" }, \"expand\" : \"expand\", \"names\" : { \"key\" : \"names\" }, \"operations\" : \"\", \"versionedRepresentations\" : { \"key\" : { \"key\" : \"\" } }, \"self\" : \"https://openapi-generator.tech\", \"id\" : \"id\", \"fields\" : { \"key\" : \"\" }, \"key\" : \"key\", \"properties\" : { \"key\" : \"\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        LOGGER.info("Get issue: {}", issueIdOrKey);

        IssueBean resp = new IssueBean();

        Map<String, Object> issueFields = new HashMap<>();
        StatusCategory statusCategory = new StatusCategory();
        StatusDetails statusDetails = new StatusDetails();

        statusDetails.name("Open");
        statusDetails.setStatusCategory(statusCategory);
        statusCategory.key("new");
        issueFields.put("status", statusDetails);
        resp.fields(issueFields);
        return ResponseEntity.ok().body(resp);

    }

    /**
     * GET /rest/api/2/issue/{issueIdOrKey}/transitions : Get issue transitions
     * Get issue transitions
     *
     * @param issueIdOrKey The ID or key of the issue. (required)
     * @return Transition Issue Response (status code 200)
     * @see RestApi#getIssueTransitions
     */
    default ResponseEntity<Object> getIssueTransitions(String issueIdOrKey) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /rest/api/2/issue/{issueIdOrKey}/transitions : Transition issue
     * Performs an issue transition and, if the transition has a screen, updates the fields from the transition screen.
     *
     * @param issueIdOrKey The ID or key of the issue. (required)
     * @param transitionIssue Input parameters for the action transitionIssue in BS (required)
     * @return Transition Issue Response (status code 200)
     * @see RestApi#transitionIssue
     */
    default ResponseEntity<Object> transitionIssue(String issueIdOrKey,
        TransitionIssue transitionIssue) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
