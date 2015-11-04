package com.example.Joe.myapplication.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import java.util.logging.Logger;

import javax.inject.Named;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myClassApi",
        version = "v1",
        resource = "myClass",
        namespace = @ApiNamespace(
                ownerDomain = "backend.myapplication.Joe.example.com",
                ownerName = "backend.myapplication.Joe.example.com",
                packagePath = ""
        )
)
public class MyClassEndpoint {

    private static final Logger logger = Logger.getLogger(MyClassEndpoint.class.getName());

    /**
     * This method gets the <code>MyClass</code> object associated with the specified <code>id</code>.
     *
     * @param id The id of the object to be returned.
     * @return The <code>MyClass</code> associated with <code>id</code>.
     */
    @ApiMethod(name = "getMyClass")
    public MyClass getMyClass(@Named("id") Long id) {
        // TODO: Implement this function
        logger.info("Calling getMyClass method");
        return null;
    }

    /**
     * This inserts a new <code>MyClass</code> object.
     *
     * @param myClass The object to be added.
     * @return The object to be added.
     */
    @ApiMethod(name = "insertMyClass")
    public MyClass insertMyClass(MyClass myClass) {
        // TODO: Implement this function
        logger.info("Calling insertMyClass method");
        return myClass;
    }
}