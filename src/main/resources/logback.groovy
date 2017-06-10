import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.ConsoleAppender
import ch.qos.logback.core.FileAppender
import ch.qos.logback.classic.filter.ThresholdFilter

import static ch.qos.logback.classic.Level.DEBUG
import static ch.qos.logback.classic.Level.INFO

appender("STDOUT", ConsoleAppender) {
  encoder(PatternLayoutEncoder) {
    pattern = "%d{HH:mm:ss.SSS} [%thread] %-5level %logger{5} - %msg%n"
  }
}
appender("STDOUT-FILTERED", ConsoleAppender) {
  filter(ThresholdFilter) {
    level = "ERROR"
  }
  encoder(PatternLayoutEncoder) {
    pattern = "%d{HH:mm:ss.SSS} [%thread] %-5level %logger{5} - %msg%n"
  }
}
appender("FILE", FileAppender) {
  file = "database.log"
  encoder(PatternLayoutEncoder) {
    pattern = "%-5relative %-5level %logger{35} - %msg%n"
  }
}

logger("com.lordofthejars.foo", INFO)
root(DEBUG, ["FILE","STDOUT-FILTERED"])

