package com.cloudtechmasters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@RestController
public class CourseController {
    private static final Logger logger = LoggerFactory.getLogger(CourseController.class);
//create one endpoint
    @GetMapping("/")
    public List<String> getCricketphotos(){
        logger.info("added for failing sonar build");
        return Arrays.asList("Cricket Photo Galleries" );
    }

}
