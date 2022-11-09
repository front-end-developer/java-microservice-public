# Microservices (Spring)

Use pgadmin on docker use the port you set in docker: 

http://localhost:5050/browser/


Test with postman:

- POST `http://localhost:8080/api/v1/customers`
- with body: 
 {
    "firstName": "mark",
    "lastName": "mark",
    "email": "mark@test.com"
}
