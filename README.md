# gradle-geb-saucelabs
an example geb test using gradle running in saucelabs environment


- Download the content in a folder
- Make sure export SAUCE_USERNAME=username and export SAUCE_ACCESS_KEY=youraccesskey  is set in Mac (setting up in windows may be different)
- In cmd go where build.gradle reside and run "gradle chromeMacTest --info"
- You should see test running in your saucelabs dashboard
