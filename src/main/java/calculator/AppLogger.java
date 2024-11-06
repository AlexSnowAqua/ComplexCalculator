package calculator;

import java.util.logging.Logger;

public class AppLogger {
    private static final Logger logger = Logger.getLogger(AppLogger.class.getName());

    // Метод для логирования информации
    public static void logInfo(String message) {
        logger.info(message);
    }

    // Метод для логирования предупреждений
    public static void logWarning(String message) {
        logger.warning(message);
    }

    // Метод для логирования ошибок
    public static void logError(String message) {
        logger.severe(message);
    }
}

