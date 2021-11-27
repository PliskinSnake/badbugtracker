package com.dmitrii.silin.badbugtracker.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.net.InetAddress;
import java.net.UnknownHostException;


@RestController
@RequestMapping("/host")
public class HostController {


    @RequestMapping(value = "/ip", method = RequestMethod.GET)
    public String getIp() throws UnknownHostException {
        return InetAddress.getLocalHost().getHostAddress();
    }

    @RequestMapping(value = "/hostname", method = RequestMethod.GET)
    public String getName() throws UnknownHostException {
        return InetAddress.getLocalHost().getHostName();
    }

}
