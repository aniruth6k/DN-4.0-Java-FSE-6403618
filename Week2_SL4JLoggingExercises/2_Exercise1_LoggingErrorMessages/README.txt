Calculator Project with SLF4J Logging

- LoggingExample.java demonstrates using SLF4J with Logback.
- Logs messages at:
  - ERROR level
  - WARN level
- Dependencies added in pom.xml:
  - slf4j-api (1.7.30)
  - logback-classic (1.2.3)
- Build: mvn compile
- Run: mvn exec:java -Dexec.mainClass="com.example.LoggingExample"
