Calculator Project with Mockito Mocking

- ExternalApi.java defines an interface representing an external API.
- MyService.java depends on ExternalApi to fetch data.
- MyServiceTest.java uses Mockito to:
  - Create a mock of ExternalApi
  - Stub getData() to return "Mock Data"
  - Verify MyService fetches the mocked data correctly
- Build: mvn compile
- Test: mvn test
