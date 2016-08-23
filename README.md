# gradle-geb-saucelabs
an example geb test using gradle running in saucelabs environment


- Download the content in a folder
- Make sure export SAUCE_USERNAME=username and export SAUCE_ACCESS_KEY=youraccesskey  is set in Mac (setting up in windows may be different)
- In cmd go where build.gradle reside and run "gradle chromeMacTest --info"
- You should see test running in your saucelabs dashboard
- You can also use this set up  with jenkins by installing Gradle plugin in Jenkins and configuring like below
  - In Jenkins-->Manage jenkins --> configure systems provide Gradle installation details (mainly GRADLE_HOME)
  - Set up a freestyle project in jenkins
  - In above project configuration invoke Gradle and mention Tasks as chromeMacTest and Root Build script as your path to build.gradle
  - Then when you do "build now" in jenkins , if everything is setup correctly, in Jenkins console ,you should see 
    
   BUILD SUCCESSFUL

   Total time: 2 mins 15.33 secs
