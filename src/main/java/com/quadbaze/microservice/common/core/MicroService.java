package com.quadbaze.microservice.common.core;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Olatunji O. Longe: Created on (06/08/2018)
 */
public enum MicroService {

    CONFIG(Route.Config.SERVICE_NAME, Route.Config.ENTRY_PATH),
    DISCOVERY(Route.Discovery.SERVICE_NAME, Route.Discovery.ENTRY_PATH),
    GATEWAY(Route.Gateway.SERVICE_NAME, Route.Gateway.ENTRY_PATH),
    CLIENT(Route.Client.SERVICE_NAME, Route.Client.ENTRY_PATH),
    SEARCH(Route.Search.SERVICE_NAME, Route.Search.ENTRY_PATH);

    private final String serviceName;
    private final String entryPath;

    MicroService(String serviceName, String entryPath){
        this.serviceName = serviceName;
        this.entryPath = entryPath;
    }

    public final String getServiceName() {
        return serviceName;
    }

    public final String getEntryPath() {
        return entryPath;
    }

    public final String uri(String path) {
        return path != null ? (path.startsWith("/") ? entryPath + path : entryPath +"/"+ path) : "no-path";
    }

    public static final List<String> routes(){
        return Arrays.asList(MicroService.values()).stream().map(microservice -> microservice.entryPath).collect(Collectors.toList());
    }

    public static final List<String> routePatterns(){
        return Arrays.asList(MicroService.values()).stream().map(microservice -> microservice.entryPath+"/**").collect(Collectors.toList());
    }

    public String toString(){
        return String.format("Service-Name: %s (Entry-Path = %s)", getServiceName(), getEntryPath());
    }

}
