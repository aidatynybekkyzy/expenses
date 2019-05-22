package com.example.demoTownsPratice.service;

import com.example.demoTownsPratice.model.Towns;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TownsService implements TownsInterface {
private static List<Towns> towns = new ArrayList<>();
static {
    towns.add(new Towns(1,"Бишкек"));
    towns.add(new Towns(2,"Алматы"));
    towns.add(new Towns(3,"Ташкент"));
}

        public Towns getThing(int id){
            return
                    towns.stream().filter(p -> p.getId()==id)
                            .findFirst().get();
        }

       public List<Towns> getAllThings(){
            return towns;
        }

        @Override
        public Towns addThing(Towns town) {
            towns.add(town);
            return town;
        }
    }


