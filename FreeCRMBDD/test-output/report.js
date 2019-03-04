$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("facebook.feature");
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
  "duration": 20097310382,
  "error_message": "java.lang.NullPointerException: null value in entry: url\u003dnull\r\n\tat com.google.common.collect.CollectPreconditions.checkEntryNotNull(CollectPreconditions.java:32)\r\n\tat com.google.common.collect.SingletonImmutableBiMap.\u003cinit\u003e(SingletonImmutableBiMap.java:42)\r\n\tat com.google.common.collect.ImmutableBiMap.of(ImmutableBiMap.java:70)\r\n\tat com.google.common.collect.ImmutableMap.of(ImmutableMap.java:123)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:273)\r\n\tat com.qa.util.TestBase.initialization(TestBase.java:54)\r\n\tat glue.StepDef.user_opens_browser(StepDef.java:61)\r\n\tat ✽.Given user opens browser(facebook.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDef.user_is_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDef.user_enters_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDef.home_page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
});