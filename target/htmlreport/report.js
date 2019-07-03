$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/skeleton/scenario4add.feature");
formatter.feature({
  "name": "test the search product",
  "description": "Description: Alex an elite user of TestMe app purchase most of his products from testmeapp.Being an elite user he gets lot of rewards and offers.One day Alex logins in testme app and use search functionality.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "login with valid user conditions",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user go to  login page in testme application",
  "keyword": "Given "
});
formatter.step({
  "name": "users will enter the un as \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "users will enter the pwd as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click Submit button in login",
  "keyword": "And "
});
formatter.step({
  "name": "verifies the login success",
  "keyword": "Then "
});
formatter.step({
  "name": "user selects the search product as \"Head\"",
  "keyword": "And "
});
formatter.step({
  "name": "clicks on the find button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "AlexUser",
        "Alex@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "login with valid user conditions",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user go to  login page in testme application",
  "keyword": "Given "
});
formatter.match({
  "location": "secnario4add.user_go_to_login_page_in_testme_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users will enter the un as \"AlexUser\"",
  "keyword": "When "
});
formatter.match({
  "location": "secnario4add.users_will_enter_the_un_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users will enter the pwd as \"Alex@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "secnario4add.users_will_enter_the_pwd_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Submit button in login",
  "keyword": "And "
});
formatter.match({
  "location": "secnario4add.click_Submit_button_in_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verifies the login success",
  "keyword": "Then "
});
formatter.match({
  "location": "secnario4add.verifies_the_login_success()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the search product as \"Head\"",
  "keyword": "And "
});
formatter.match({
  "location": "secnario4add.user_selects_the_search_product_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on the find button",
  "keyword": "Then "
});
formatter.match({
  "location": "secnario4add.clicks_on_the_find_button()"
});
formatter.result({
  "status": "passed"
});
});