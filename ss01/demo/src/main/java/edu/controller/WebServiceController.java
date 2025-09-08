package edu.controller;

import edu.model.WebService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class WebServiceController {

    @GetMapping("/web-services")
    public List<WebService> getWebServices() {
        return Arrays.asList(
                new WebService("REST", "Representational State Transfer"),
                new WebService("SOAP", "Simple Object Access Protocol"),
                new WebService("GraphQL", "Query language for APIs")
        );
    }
}

