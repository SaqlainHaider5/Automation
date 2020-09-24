$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Automation of Mont5",
  "description": "",
  "id": "automation-of-mont5",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 257,
  "name": "Mont5 Checkout",
  "description": "",
  "id": "automation-of-mont5;mont5-checkout",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 256,
      "name": "@RandomBagCategoryProductCheckout"
    }
  ]
});
formatter.step({
  "line": 258,
  "name": "I am on Mont5 Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 259,
  "name": "I Click Login my account",
  "keyword": "Then "
});
formatter.step({
  "line": 260,
  "name": "I Enter  \"\u003cemail\u003e\" and \"\u003cpassword\u003e\" credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 261,
  "name": "I Select a random category of Bags",
  "keyword": "Then "
});
formatter.step({
  "line": 262,
  "name": "Proceed to checkout and redirect to paypal",
  "keyword": "Then "
});
formatter.step({
  "line": 263,
  "name": "I am on Mont5 Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 264,
  "name": "I logout",
  "keyword": "Then "
});
formatter.examples({
  "line": 265,
  "name": "",
  "description": "",
  "id": "automation-of-mont5;mont5-checkout;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 266,
      "id": "automation-of-mont5;mont5-checkout;;1"
    },
    {
      "cells": [
        "test@test.com",
        "test_123"
      ],
      "line": 267,
      "id": "automation-of-mont5;mont5-checkout;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 267,
  "name": "Mont5 Checkout",
  "description": "",
  "id": "automation-of-mont5;mont5-checkout;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 256,
      "name": "@RandomBagCategoryProductCheckout"
    }
  ]
});
formatter.step({
  "line": 258,
  "name": "I am on Mont5 Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 259,
  "name": "I Click Login my account",
  "keyword": "Then "
});
formatter.step({
  "line": 260,
  "name": "I Enter  \"test@test.com\" and \"test_123\" credentials",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 261,
  "name": "I Select a random category of Bags",
  "keyword": "Then "
});
formatter.step({
  "line": 262,
  "name": "Proceed to checkout and redirect to paypal",
  "keyword": "Then "
});
formatter.step({
  "line": 263,
  "name": "I am on Mont5 Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 264,
  "name": "I logout",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 12
    }
  ],
  "location": "loginStep.iAmOnMontHomePage(int)"
});
formatter.result({
  "duration": 10871860000,
  "status": "passed"
});
formatter.match({
  "location": "dashboardSteps.iClickLoginMyAccount()"
});
formatter.result({
  "duration": 6730199700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@test.com",
      "offset": 10
    },
    {
      "val": "test_123",
      "offset": 30
    }
  ],
  "location": "dashboardSteps.iEnterAndCredentials(String,String)"
});
formatter.result({
  "duration": 12080571400,
  "status": "passed"
});
formatter.match({
  "location": "dashboardSteps.iSelectARandomCategoryOfBags()"
});
formatter.result({
  "duration": 44071688700,
  "status": "passed"
});
formatter.match({
  "location": "dashboardSteps.proceedToCheckoutAndRedirectToPaypal()"
});
formatter.result({
  "duration": 59918138700,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[3]/div/button\"}\n  (Session info: chrome\u003d85.0.4183.121)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027SAQLAIN-PC\u0027, ip: \u0027192.168.1.202\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_60\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.121, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\Dell\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:51813}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: dad3bb43f793ec7ef6735da9e40837cd\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[3]/div/button}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat pages.DashboardPage.proceedToCheckoutAndRedirectToPaypal(DashboardPage.java:905)\r\n\tat steps.dashboardSteps.proceedToCheckoutAndRedirectToPaypal(dashboardSteps.java:184)\r\n\tat ✽.Then Proceed to checkout and redirect to paypal(Login.feature:262)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 12
    }
  ],
  "location": "loginStep.iAmOnMontHomePage(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginStep.iLogout()"
});
formatter.result({
  "status": "skipped"
});
});