package demo.sbp.webservice.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.laxture.sbp.SpringBootPluginManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/extensions")
@Api(value = "Guidelines")
public class AppRestController {

    @Autowired
    private SpringBootPluginManager pluginManager;

    @GetMapping
    @ApiOperation(value = "Get all extensions currently enabled", produces = "application/json")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Get extensions call is Successful"),
            @ApiResponse(code = 500, message = "Get extensions call is Failed"),
            @ApiResponse(code = 404, message = "The API could not be found")})
    public ResponseEntity getAllExtensions() {
        return new ResponseEntity<String>("Test API Response", HttpStatus.OK);

    }
}
