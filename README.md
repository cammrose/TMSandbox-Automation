# TradeMe Sandbox Automation

This is my Test Automation implementation for automating the TradeMe Sandbox website. This has been done using Java and Selenium as well as Cucumber for tests in BDD style.
My implementation covers the first task of the test which requires a Web UI test, but it doesn't cover the second or third tests. I do have some brief API automation 
knowledge which was taught to me by Enhance, but haven't had enough in order for me to do the API tasks.

For the first task I was required to query any existing Used Car listing and confirm some details on the listing. Although, since there were no user car listings on the 
TradeMe Sandbox website it was changed to a book listing instead. The four details from a book listing that I have queried are the title, listing expiry, price and seller.

## Project Instructions 

Download the code from the GitHub repository. The code can either be run through an IDE such as IntelliJ or Eclipse or it can be run directly through the command line. </br>
If there are any issue with running the framework I have provided a screen recording which shows the automation running as well as the HTML report after completion.

### Required software
- Java SDK 9 </br>
- Google Chrome (Version 95.0.4638.54) - If a different verison of Chrome is used, the 'chromedriver' executable can be replaced by the version that matches the users Chrome Version </br>
- Apache Maven (Version 3.8.3) </br>

### Windows Set Up
Search for and open environment settings. </br>
Add new environment variables called JAVA_HOME and assign it to the location of the java SDK install. </br>
Add the following to the system PATH variable: 
- %JAVA_HOME% 
- %JAVA_HOME%\bin 
- location of Maven install with \bin eg C:\Program Files\apache-maven-3.6.3\bin 

### Mac Set Up
Create a file in your root directory called .bash_profile </br>
Edit the file and add the following info:
- export JAVA_HOME=$(/usr/libexec/java_home) 
- export M2_HOME=/Users/<yourhomedirectory>/apache-maven-3.6.3
- export PATH=$PATH:$JAVA_HOME/bin:$M2_HOME/

### Loading in IntelliJ
- Select Import Project
- Select the directory of the project.
- Import the project as a Maven project 
- Continue through the importation dialogues. You will not need to change anything else. If the Select your SDK screen does not show Java 9 then you have not installed the SDK correctly. 
- When you have successfully imported the project there will be a short time while Maven downloads the dependencies 

### Running in IntelliJ
- Click on the maven tab on the far right hand side, open up the heirarchy and naviagate to TMSandboxAutomation -> Lifecycle. From there you will see 'verify', right-click and select 'Run Maven Build'. Running the project this way will ensure the HTML reports are generated.
- If the HTML reports aren't required, the test can just can just be run by right-clicking on the scenario in the feature file and selecting run from there.

### Running through command line
- CD into the root directory of the project
- Run command 'mvn clean verify' (Running this command will generate the HTML reports with it.

### HTML Reports
To view the HTML reports after the test has executed navigate to the project in the Finder/File Explorer. In the target folder, you will find HTML files which can be opened and viewed in a browser which will display the test results.

</br></br>

If there are any issues with running the framework or have any questions about the implementation, feel free to get in touch!
