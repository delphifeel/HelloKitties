package com.logicify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by pavel on 4/10/15.
 */

@Controller
@RequestMapping(value = "/")
public class About {
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.HEAD})
    public String render(ModelMap model) {
        model.put("data", "Hello");

        return "about";
    }
}
