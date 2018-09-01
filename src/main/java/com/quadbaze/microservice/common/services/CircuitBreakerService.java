package com.quadbaze.microservice.common.services;

import com.quadbaze.microservice.common.core.MicroService;
import com.quadbaze.microservice.common.logging.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Olatunji O. Longe: Created on (05/08/2018)
 */

@Service
public class CircuitBreakerService {

    @Autowired
    private LoggerService LOGGER;

    public final String logConnectionException(Throwable throwable, MicroService microservice){
        final String message = String.format("Could not contact (%s) microservice", microservice.getServiceName());
        LOGGER.error(message, throwable);
        return message;
    }

}
