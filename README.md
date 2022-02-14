# SpringBoot-for-PostgreSql-

* First step : Adding postgresql username and password to file path: /resources/aplication.properties
* And then add next to database connection source url the database_name where is your table exist.


## About hibernate ddl auto (../application.properties)
* ...validate(if dB exist and columns called with  existing name.)
* ...update(if dB doesn't exist and dB needs to build while Framework working.)

## Base url
* http://localhost:8080/api/users

## Listing all users
### GET Method
* http://localhost:8080/api/users/all

## Adding  user
### POST Method
* http://localhost:8080/api/users/add

## Update a user
### PUT Method
* This feature not added yet.

## Delete a user
### DELETE Method
* This feature not added yet.
