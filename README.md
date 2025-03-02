Requirement:

Automate the Petstore Swagger API.

Backlogs
1. Automate User REST API (4/8 APIS) (POST/GET/PUT/DELETE)
2. Automate Store REST API
3. Automate pet REST API
4. Automate Remaining User REST API (Login/Logout/CreateWithArray/CreateWithList)

------------------------------
Design and Delviered:
1.  Creation of a new Maven Project:
2.  Adding required dependency in POM.xml
3.  Creating of folder structure
4.  Creation of Route file
5.  Creation of User class POJO class
6.  Creation of UserEndPoint Method
7.  Creation of testcases for the User Porject.
8.  Adding TestNG to the project
9. Creation of Extent Report
10.  Configuring Maven Plugin

---------------------------------------
How to Run the File:
There are multiple way to run this project:
1. Using Eclipse. --> Right click on the testcase file and run via TestNg or. Go to POM.xml and right click and run via Maven Test
2. Runnning POM.xml directly on command promt using maven (https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
3. Running via jenkins. (https://www.jenkins.io/doc/tutorials/build-a-java-app-with-maven/)

---------------------------------------
Current State of the project:
1. Only backlog 1 is completed remaining is pending.

---------------------------------------
Furture Scope:
1. Data Driven Testing --> Currently only 1 off testing is done. Negative testing, Bulk testing etc are pending.
2. Planning to get user infromation and testcase details in form of excel.
3. Creation of testcase document from excel and automatically exceute the testcase based on the testcase mentioned in the excel.
4. Assetion of all the fiedls provided in the REST api and Responses.
