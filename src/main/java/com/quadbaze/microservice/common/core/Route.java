package com.quadbaze.microservice.common.core;

/**
 * @author Olatunji O. Longe: Created on (04/07/2018)
 */
public final class Route {

    public static final class Config {
        public static final String SERVICE_NAME = "microservice-config";
        public static final String ENTRY_PATH = "/config";
    }

    public static final class Discovery {
        public static final String SERVICE_NAME = "microservice-discovery";
        public static final String ENTRY_PATH = "/discovery";
    }

    public static final class Gateway {
        public static final String SERVICE_NAME = "microservice-gateway";
        public static final String ENTRY_PATH = "/gateway";
    }

    public static final class Client {
        public static final String SERVICE_NAME = "microservice-client";
        public static final String ENTRY_PATH = "/client";
    }

    public static final class Search {
        public static final String SERVICE_NAME = "microservice-search";
        public static final String ENTRY_PATH = "/search";
    }

}
