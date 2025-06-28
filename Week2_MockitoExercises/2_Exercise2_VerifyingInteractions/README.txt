Calculator Project with Mockito Interaction Verification

- ExternalApi.java defines an interface representing an external API.
- MyService.java depends on ExternalApi to fetch data.
- MyServiceTest.java uses Mockito to:
  - Create a mock of ExternalApi
  - Stub getData() to return "Mock Data"
- MyServiceVerifyTest.java uses Mockito to:
  - Create a mock of ExternalApi
  - Call MyService.fetchData()
  - Verify that getData() was called on the mock
- Build: mvn compile
- Test: mvn test
