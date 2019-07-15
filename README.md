#MiniTweet

Built With

    Maven - Dependency Management
    JDK - Java™ Platform, Standard Edition Development Kit
    Spring Boot - Framework to ease the bootstrapping and development of new Spring Applications
    MySQL - Open-Source Relational Database Management System
    git - Free and Open-Source distributed version control system
    JSP - Java Server Pages (JSP) is a server-side programming technology that enables the creation of dynamic, platform-independent method for building Web-based applications.

To-Do

    Bootstrap - CSS
    Web - HTML, JavaScript (jQuery)
    User should be able to register to login to the system
    User should be able to login to the system. And logout from the system.
    User should be able to post minitweets if logged in.
    User should be able to edit and delete own minitweets. But cannot do this for other’s minitweets.
    User should be able to see others and his own tweets in home page. Pagination is a plus.
    User should be able to edit his own profile information (not others) except email and username.Also can see his or her      minitweet list.
    
Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the main method in the com.twitterapp.main.TwitterAppApplication class from your IDE( I used Spring Tool Suite (STS) ). Make sure you have install JDK 1.8 or higher .
Download the zip or clone the Git repository. Unzip the zip file (if you downloaded one) Open Command Prompt and Change directory (cd) to folder containing pom.xml 
    Open Eclipse 
    File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip Select the project Choose the Spring Boot Application file (search for @SpringBootApplication) Right Click on the file and Run as Java Application

    Or Open STS
        File -> Import -> Git -> Prject From Git -> Clone URI -> cloned url
    Choose Porject Folder and right click and then Run as Spring Boot Application
    
Alternatively you can use the Spring Boot Maven plugin like so:

    mvn spring-boot:run


packages

    models — to hold our entities;

    repositories — to communicate with the database;

    services — to hold our business logic;

    controllers — to listen to the client;

    resources/application.properties - It contains application-wide properties. Spring reads the properties defined in this file to configure your application. You can define server’s default port, server’s context path, database URLs etc, in this file.

    pom.xml - contains all the project dependencies

Resources

    HTTP Status Codes
    Bootstrap w3schools
    Common application properties
