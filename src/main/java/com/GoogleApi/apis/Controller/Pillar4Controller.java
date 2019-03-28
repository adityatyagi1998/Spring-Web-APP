package com.GoogleApi.apis.Controller;

import com.GoogleApi.apis.repository.Pillar4Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/*
 This is the controller for Pillars(Different components in the projects page). Here we take the request from the
 dropdown , fetch the data from the sql database and send the values corresponding values back to the data base.
 The findonebypillar method is defined in Pillarrepository  which has a query request which returns the desired
 column from the sql table.
 */
@RestController
public class Pillar4Controller {
    @Autowired
    Pillar4Repo obj;

    @ResponseBody
    @GetMapping("/pillar4")
    public int setscore(@RequestParam String pillar)
    {
        return obj.findOneByPillar4(pillar);
    }
}
