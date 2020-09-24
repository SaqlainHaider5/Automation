$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Signup/Login to IconBunny",
  "description": "",
  "id": "signup/login-to-iconbunny",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 151,
  "name": "Login IconBunny",
  "description": "",
  "id": "signup/login-to-iconbunny;login-iconbunny",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 150,
      "name": "@AddressBook"
    }
  ]
});
formatter.step({
  "line": 152,
  "name": "I am on IconBunny Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 153,
  "name": "I Click Login my account",
  "keyword": "Then "
});
formatter.step({
  "line": 154,
  "name": "I Enter  \"\u003cemail\u003e\" and \"\u003cpassword\u003e\" credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 155,
  "name": "I Close Flyer",
  "keyword": "Then "
});
formatter.step({
  "line": 156,
  "name": "I Click to go to my address book",
  "keyword": "Then "
});
formatter.step({
  "line": 157,
  "name": "I logout",
  "keyword": "Then "
});
formatter.examples({
  "line": 158,
  "name": "",
  "description": "",
  "id": "signup/login-to-iconbunny;login-iconbunny;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 159,
      "id": "signup/login-to-iconbunny;login-iconbunny;;1"
    },
    {
      "cells": [
        "SQASaqlain@ymail.com",
        "Haider_123"
      ],
      "line": 160,
      "id": "signup/login-to-iconbunny;login-iconbunny;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 160,
  "name": "Login IconBunny",
  "description": "",
  "id": "signup/login-to-iconbunny;login-iconbunny;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 150,
      "name": "@AddressBook"
    }
  ]
});
formatter.step({
  "line": 152,
  "name": "I am on IconBunny Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 153,
  "name": "I Click Login my account",
  "keyword": "Then "
});
formatter.step({
  "line": 154,
  "name": "I Enter  \"SQASaqlain@ymail.com\" and \"Haider_123\" credentials",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 155,
  "name": "I Close Flyer",
  "keyword": "Then "
});
formatter.step({
  "line": 156,
  "name": "I Click to go to my address book",
  "keyword": "Then "
});
formatter.step({
  "line": 157,
  "name": "I logout",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStep.iAmOnIconBunnyHomePage()"
});
formatter.result({
  "duration": 14046594400,
  "status": "passed"
});
formatter.match({
  "location": "dashboardSteps.iClickLoginMyAccount()"
});
formatter.result({
  "duration": 3332615100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SQASaqlain@ymail.com",
      "offset": 10
    },
    {
      "val": "Haider_123",
      "offset": 37
    }
  ],
  "location": "dashboardSteps.iEnterAndCredentials(String,String)"
});
formatter.result({
  "duration": 4300868100,
  "status": "passed"
});
formatter.match({
  "location": "dashboardSteps.iCloseFlyer()"
});
formatter.result({
  "duration": 10698555500,
  "status": "passed"
});
formatter.match({
  "location": "dashboardSteps.iClickToGoToMyAddressBook()"
});
formatter.result({
  "duration": 16496143100,
  "status": "passed"
});
formatter.match({
  "location": "loginStep.iLogout()"
});
formatter.result({
  "duration": 1319029100,
  "status": "passed"
});
});