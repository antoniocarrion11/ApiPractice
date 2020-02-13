package org.example.app;

import org.example.rest.DataRestResource;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class HelloApp extends Application{
    private Set<Object> singletons = new HashSet<Object>();

    public HelloApp(){
        singletons.add(new DataRestResource());
    }

    @Override
    public Set<Object> getSingletons(){
        return singletons;
    }
}
