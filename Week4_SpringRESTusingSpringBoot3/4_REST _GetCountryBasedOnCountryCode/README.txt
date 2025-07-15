REST - Get Country By Code

Endpoint:
- GET /countries/{code}
- Port: 8083

Controller:
- com.cognizant.spring_learn.controller.CountryController
- Method: getCountry(String code)

Service:
- com.cognizant.spring_learn.service.CountryService
- Method: getCountry(String code)

How it works:
- Loads countryList bean from country.xml
- Finds country by code (case-insensitive)
- Returns Country object as JSON

Sample:
GET /countries/in

Response:
{
  "code": "IN",
  "name": "India"
}

How to run:
- mvn spring-boot:run
- Access in browser or Postman

Dev tools:
- Use Network tab to see request/response headers
- In Postman, use Headers tab to inspect full headers
