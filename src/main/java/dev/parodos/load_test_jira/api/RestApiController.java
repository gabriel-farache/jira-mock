package dev.parodos.load_test_jira.api;

import dev.parodos.load_test_jira.model.IssueBean;
import dev.parodos.load_test_jira.model.IssueUpdateDetails;
import dev.parodos.load_test_jira.model.TransitionIssue;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-30T10:10:58.593190739+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
@Controller
@RequestMapping("${openapi.jIRAActionsForBS.base-path:}")
public class RestApiController implements RestApi {

    private final RestApiDelegate delegate;

    public RestApiController(@Autowired(required = false) RestApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new RestApiDelegate() {});
    }

    @Override
    public RestApiDelegate getDelegate() {
        return delegate;
    }

}
