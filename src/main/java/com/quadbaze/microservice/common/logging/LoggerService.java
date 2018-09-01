package com.quadbaze.microservice.common.logging;

import org.slf4j.Logger;

/**
 * Created by Olatunji O. Longe on 10/16/17.
 */
public interface LoggerService {
    Logger getLogger();

    void info(String message);
    void info(String message, Throwable ex);
    
    void warn(String message);
    void warn(String message, Throwable ex);

    void error(String message);
    void error(String message, Throwable ex);

    void trace(String message);
    void trace(String message, Throwable ex);
}
