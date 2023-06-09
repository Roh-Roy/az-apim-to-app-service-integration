Sample code to integrate APIM with Azure App Service


1)Create a APIM in Azure portal

2)Create a Spring Boot app perhaps from Spring Initializer

3)Add dummy controller and some endpoints like in this repo

4)Test the app in local and try to publish it to Azure App Service using following commands :- 

a)**az login** from IDE terminal

b) **mvn com.microsoft.azure:azure-webapp-maven-plugin:2.11.0:config**   --- and select your app service configurations and make sure details are added in pom.xml

c)  **mvn package azure-webapp:deploy**  --- Deploy to Azure

5) Make sure the app in running in Azure and try to hit the url/ip from your browser. We can get these details from overview of App Service

6) Go to APIM and on left panel click on APIs, then Add API and you will get various options. I selected App Service as I created that.

7) Select the app servie and wait for it to be added

8) By default you can various HTTP verbs like get/ post etc but those just point to your base url of the App Service

9) Before adding various particular operations as per our controller, we need to click on the APIs---> Search our API which we added and click on it

10)We can see various options such as design(where we add operations)/settings/test etc and these are specefic to each endpoints of our entire added API

11) Go to settings tab and under subcriptions uncheck the subcriptions required so that we can access the endpoints via APIM endpoint without providing subcription key.

12) Save it and try to run your urls in browser like this https://apim-explore.azure-api.net/test, https://apim-explore.azure-api.net/api/employees/21321/2312312 etc
