# contact-backend

### **by Roger Pouncey** 

A CRUD back end built using Java, SpringBoot, Hibernate, and H2.


Email: rpounceyjr@gmail.com

## **Table of Contents** 

#### i. [Usage](#usage)

#### ii. [Testing and Further Development](#testing)

#### iii. [Questions](#questions)



## **Usage** <a name="usage"></a>
This CRUD back end is used to store user data which consists of a user's name, address, phone number(s), and email address.  Models for the contacts were broken up into UserName, Address, and Phone, with all of these being embedded in the Contact model (and Phone creating its own table).  Contact data is in JSON format and is stored in an H2 database.  Users are able to GET data for all contacts through the "/contacts" endpoint, or to retrieve data for a particular user through "/contacts/{id}."  Users can also make PUT and DELETE requests for an individual user at the "/contacts/{id}" endpoint (Postman was used as the client during development).  Tabular data can be viewed through the H2 console at "/h2-console" with the JDBC URL being jdbc:h2:mem:contact.  Basic validation for model properties was done using annotations.

## **Testing and Further Development** <a name="testing"></a>
While basic validation was done, no unit testing was written for this project.  However, it was not for lack of trying.  This is my first time truly working with Java, and the learning curve for some of aspects of the process proved difficult for the short time I had to complete this. I learned a lot, but there were limitations to what I could accomplish in less than a week.  I am familiar with JavaScript testing libraries and am confident I could write good tests given a litte more time and guidance.  In the end, I decided to forego tests in favor of punctuality.  Given the time to create tests, I would like to have tested responses from database queries with a mock object to make sure the data I received was correct.  I also would like to have done more testing to validate fields, such as testing for proper formatting of phone numbers.  I'm disappointed I was unable to complete the tests, but am happy to have learned so much about Java.  It was an enjoyable process.

## **Questions** <a name="questions"></a>

Questions about this app can be addressed to Roger Pouncey, either through GitHub or via the above email address.
