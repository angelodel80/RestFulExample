/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.lc.restful.example;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author angelo
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
     * Do not modify addRestResourceClasses() method. It is automatically
     * populated with all resources defined in the project. If required, comment
     * out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(it.cnr.ilc.lc.restful.example.CorporaResource.class);
        resources.add(it.cnr.ilc.lc.restful.example.GenericResource.class);
        resources.add(it.cnr.ilc.lc.restful.example.ItemClientResource.class);
        resources.add(it.cnr.ilc.lc.restful.example.ItemClientsResource.class);
        resources.add(it.cnr.ilc.lc.restful.example.ItemResource.class);
        resources.add(it.cnr.ilc.lc.restful.example.ItemsResource.class);
        resources.add(it.cnr.ilc.lc.restful.example.TextSentenceResource.class);
        resources.add(it.cnr.ilc.lc.restful.example.TextsResource.class);
        resources.add(it.cnr.ilc.lc.restful.example.TextsSentenceResource.class);
        resources.add(it.cnr.ilc.lc.restful.example.virtualdatasystem.RepositoryResource.class);
        resources.add(provider.MyJacksonJsonProvider.class);
    }

}
