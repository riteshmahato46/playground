package com.prototype.playground.controllers;

import com.prototype.playground.PlaygroundConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private static final Logger Logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(PlaygroundConstants.HOME_REST_ENDPOINT)
    public String Home()
    {
        Logger.debug("Home controller hit");
        return "Hello Home Boi";
    }
}