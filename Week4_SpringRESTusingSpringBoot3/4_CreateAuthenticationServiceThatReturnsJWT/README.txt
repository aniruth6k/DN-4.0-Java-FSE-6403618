JWT Authentication Service

- URL: /authenticate
- Method: GET
- Port: 8090

Usage:
curl -u user:pwd http://localhost:8090/authenticate

Response:
{"token":"<JWT>"}

How it works:
- Reads Authorization header (Basic)
- Decodes username:password
- Validates hardcoded user/pwd
- Generates and returns JWT

Dependencies:
- io.jsonwebtoken (jjwt)
- spring-boot-starter-security
