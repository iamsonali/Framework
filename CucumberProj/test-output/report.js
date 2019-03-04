$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/lenovo/workspace/CucumberProj/src/main/java/Features/facebook.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook login",
  "description": "",
  "id": "facebook-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "login to facebook",
  "description": "",
  "id": "facebook-login;login-to-facebook",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@executeThis"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "home page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_opens_browser()"
});
formatter.result({
  "duration": 23125451077,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_is_on_login_page()"
});
formatter.result({
  "duration": 15024088084,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_enters_username_and_password()"
});
formatter.result({
  "duration": 24358342723,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.home_page_is_displayed()"
});
formatter.result({
  "duration": 28112,
  "status": "passed"
});
});