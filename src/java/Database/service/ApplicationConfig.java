/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author T410
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(Database.service.LeagueFacadeREST.class);
        resources.add(Database.service.StartinglineupFacadeREST.class);
        resources.add(Database.service.TeamFacadeREST.class);
        resources.add(Database.service.UseraccountsFacadeREST.class);
    }
    
}
