$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/Orangelogin.feature");
formatter.feature({
  "name": "To Check OrangeHRM login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To verify login functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To launch the Application on the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefinitions.LoginSteps.to_launch_the_Application_on_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter username and password and click on loginbutton",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdefinitions.LoginSteps.enter_username_and_password_and_click_on_loginbutton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.LoginSteps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});