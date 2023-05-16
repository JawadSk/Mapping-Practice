# Mapping-Practice

## Frameworks and Language used:
* Spring
* Spring boot
* My-Sql
* Java

## Data Flow

## Controller

### Student

* getAllStudent
* addStudent
* deleteStudentById
* updateStudent

### Address

* getAllAddress
* addAddress
* deleteAddressById
* updateAddress

### Book

* getAllBook
* addBook
* deleteBookById
* updateBook

### Course

* getAllCourse
* addCourse
* deleteCourseById
* updateCourse

### Laptop

* getAllLaptop
* addLaptop
* deleteLaptopById
* updateLaptop

## Service

### Student

* getAllStudent
* addStudent
* deleteStudentById
* updateStudent

### Address

* getAllAddress
* addAddress
* deleteAddressById
* updateAddress

### Book

* getAllBook
* addBook
* deleteBookById
* updateBook

### Course

* getAllCourse
* addCourse
* deleteCourseById
* updateCourse

### Laptop

* getAllLaptop
* addLaptop
* deleteLaptopById
* updateLaptop

## Repository

### Student

* IStudentRepository

### Address

* IAddressRepository

### Laptop

* ILaptopRepository

### Course

* ICourseRepository

### Book

* IBookRepository

## Model
### Student

* id
* name
* age
* phoneNumber
* department
* address
* 
### Address

* addressId
* landmark
* zipcode
* district
* state
* country

### Book

* id
* title
* Author
* description
* price
* Student

### Course

* id
* title
* description
* duration
* studentList

### Laptop

* id
* name
* brand
* price
* student

## Project Summary

* This API is a Spring Boot project that is about building a robust backend for my Instagram clone. Where user can signup, signin, and update their details. Also user can create posts, and view all their pots all these operations requeired authentication which improves security, and password is also saved using encryption algorithm. In this project request is sent from the client on HTTP in JSON format or from path variable with server side validations and verified with authentication stored in object then response is sent back from the server by JSON format to the client.
