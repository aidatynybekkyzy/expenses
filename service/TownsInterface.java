package com.example.demoTownsPratice.service;

import com.example.demoTownsPratice.model.Towns;

import java.util.List;

public interface TownsInterface  {
    List<Towns> getAllThings ();
    Towns getThing (int id);
    Towns addThing(Towns towns);
}
