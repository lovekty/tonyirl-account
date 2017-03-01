package me.tony.tonyirl.passport.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by tony on 2017/2/28.
 */
@Controller
public class LoginController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginPage() {
        LOGGER.info("visit login page");
        return "login/login";
    }
}
