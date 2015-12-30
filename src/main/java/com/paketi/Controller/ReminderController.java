package com.paketi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Root-World on 30.12.2015.
 */
@Controller
@RequestMapping("/reminder")
public class ReminderController {
    @ResponseBody
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getReminder(ModelMap model){
        return "My Reminder";
    }
}
