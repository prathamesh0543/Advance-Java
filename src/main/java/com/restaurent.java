
package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

    @Component
    public class restaurent {

        String restaurantName = "Morya";
        String location = "Tasgaon";


        @Autowired
        chef c;

        public String serveFood()
        {
            return c.cookfood() + " restaurant name is " + restaurantName + " which is at " + location;
        }
    }

