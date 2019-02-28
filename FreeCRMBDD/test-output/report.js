$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/lenovo/workspace/FreeCRMBDD/src/main/java/Features/facebook.feature");
formatter.feature({
  "line": 2,
  "name": "Facebook login",
  "description": "",
  "id": "facebook-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "login to facebook",
  "description": "",
  "id": "facebook-login;login-to-facebook",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@executeThis"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "home page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_opens_browser()"
});
formatter.result({
  "duration": 88559256311,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_is_on_login_page()"
});
formatter.result({
  "duration": 54110412826,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_enters_username_and_password()"
});
formatter.result({
  "duration": 149223127703,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.home_page_is_displayed()"
});
formatter.result({
  "duration": 142344,
  "status": "passed"
});
});