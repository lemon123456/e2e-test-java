$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sample.feature");
formatter.feature({
  "line": 1,
  "name": "Gradle-Cucumber integration",
  "description": "",
  "id": "gradle-cucumber-integration",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Just a failing scenario",
  "description": "",
  "id": "gradle-cucumber-integration;just-a-failing-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I run a failing step",
  "keyword": "When "
});
formatter.match({
  "location": "SampleSteps.I_run_a_failing_step()"
});
formatter.result({
  "duration": 87946254,
  "status": "passed"
});
formatter.uri("search.feature");
formatter.feature({
  "line": 2,
  "name": "Performing a Google Search",
  "description": "\nAs a user on the google search page\nI want to search for WebdriverIO\nBecause I want to learn more about it",
  "id": "performing-a-google-search",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@search"
    }
  ]
});
formatter.background({
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "I am on the search page",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchSteps.i_am_on_the_search_page()"
});
formatter.result({
  "duration": 3680995720,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Performing a search",
  "description": "",
  "id": "performing-a-google-search;performing-a-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I enter \"webdriverIO\" into the search box",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click the search button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "webdriverIO",
      "offset": 9
    }
  ],
  "location": "SearchSteps.i_enter_into_the_search_box(String)"
});
formatter.result({
  "duration": 2113479329,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.i_click_the_search_button()"
});
formatter.result({
  "duration": 1514570969,
  "status": "passed"
});
});