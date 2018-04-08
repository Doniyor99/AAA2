$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Search.feature");
formatter.feature({
  "line": 2,
  "name": "Search in Etsy.com",
  "description": "",
  "id": "search-in-etsy.com",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Search an item on etsy",
  "description": "",
  "id": "search-in-etsy.com;search-an-item-on-etsy",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on Etsy",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchStepDefinitions.i_am_on_Etsy()"
});
formatter.result({
  "duration": 5633997064,
  "status": "passed"
});
});