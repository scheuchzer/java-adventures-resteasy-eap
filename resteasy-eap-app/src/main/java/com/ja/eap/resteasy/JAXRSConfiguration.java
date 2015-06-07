package com.ja.eap.resteasy;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Configures a JAX-RS endpoint. Delete this class, if you are not exposing
 * JAX-RS resources in your application.
 *
 * @author airhacks.com
 */
@ApplicationPath("resources")
public class JAXRSConfiguration extends Application {

	@Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> impls = new HashSet<>();
        // resources
        impls.add(PingResource.class);
        return impls;
    }
}
