@functionaTest
Feature: register into Application

@SmokeTest
Scenario: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "https://demo.opencart.com/" Site
Then click signin

Scenario: negative test validating login
Given Initialize the browser with chrome
And Navigate to "https://demo.opencart.com/" Site
Then capture sscreenshot

Scenario: positive test validating login
Given Initialize the browser with chrome
And Navigate to "https://demo.opencart.com/" Site
Then click login button

Scenario: Add to cart
Given Initialize the browser with chrome
And Navigate to "https://demo.opencart.com/" Site
Then Add to cart

Scenario: Order Placement with guest checkout
Given Initialize the browser with chrome
And Navigate to "https://demo.opencart.com/" Site
Then checkout with guest user





