Country REST Web Service

- URL: /country
- Method: GET
- Port: 8083
- Controller: com.cognizant.spring_learn.controller.CountryController
- Method: getCountryIndia()
- Loads the "country" bean from country.xml and returns it as JSON

Sample Response:
{
  "code": "IN",
  "name": "India"
}

How it works:
- Controller method loads the bean using ClassPathXmlApplicationContext
- Bean is automatically converted to JSON using Jackson

How to run:
- mvn spring-boot:run
- Access http://localhost:8083/country in browser or Postman

Developer tools:
- Use Network tab in browser to see HTTP request/response headers
- In Postman, use Headers tab to view full header details
