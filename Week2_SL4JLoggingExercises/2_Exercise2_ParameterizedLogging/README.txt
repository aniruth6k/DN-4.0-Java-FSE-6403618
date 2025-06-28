Calculator Project with SLF4J Parameterized Logging

- ParameterizedLoggingExample.java demonstrates using SLF4J with Logback.
- Shows parameterized logging with:
  - Placeholders in log messages
  - Arguments passed to fill placeholders
- Logs messages at:
  - INFO level
  - WARN level
  - ERROR level
- Dependencies in pom.xml:
  - slf4j-api (1.7.30)
  - logback-classic (1.2.3)
- Build: mvn compile
- Run: mvn exec:java -Dexec.mainClass="com.example.ParameterizedLoggingExample"
