Feature: Search and Place the order of the product

Scenario: Search Experience for product search in both home and Offers Page

Given User is on GreenCart Landing Page
When User Searched with shortName "Tom" and Extracted resultes of the product
Then User searched for same shortname "Tom" in offers page
And check is both products are same or not

