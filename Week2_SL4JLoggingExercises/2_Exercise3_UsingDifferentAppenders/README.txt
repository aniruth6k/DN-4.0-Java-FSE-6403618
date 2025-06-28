Calculator Project with SLF4J Multiple Appenders

- AppendersExample.java demonstrates using SLF4J with Logback.
- logback.xml configures:
  - ConsoleAppender (logs to console)
  - FileAppender (logs to app.log)
- Logs messages at:
  - DEBUG level
  - INFO level
  - WARN level
  - ERROR level
- Dependencies in pom.xml:
  - slf4j-api (1.7.30)
  - logback-classic (1.2.3)
- Build: mvn compile
- Run: mvn exec:java -Dexec.mainClass="com.example.AppendersExample"
