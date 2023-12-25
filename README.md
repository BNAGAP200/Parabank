
Parabank Automation Test Suite
Project Overview
This automation test suite is designed to validate the functionality of the Parabank web application using Selenium and TestNG. The project follows the Page Object Model (POM) design pattern to enhance code maintainability and readability.

Project Structure
The project is organized into two main packages: AccountServices and ParabankReg.

AccountServices Package
CheckingLinksTest.java: This test class verifies the functionality related to checking links in the Account Services section.

ListofservicesTest.java: The test class focuses on testing the list of services provided by the Account Services.

AccountServices2: This package contains additional test classes for Account Services.

ClickallLinksTest.java: This class tests the functionality of clicking all links in the Account Services section.

FooterLinks: This package contains test classes related to footer links.

FooterAllLinksClicks.java: This class tests the clicking functionality of all links in the footer.
ParabankLogin: This package is dedicated to testing the login functionality of the Parabank application.

ForgetLoginInfoTest.java: Verifies the forget login information feature.

LoginInvalidTest.java: Tests invalid login scenarios.

LoginTest.java: Validates the login functionality.

ProfileVerifyTestPage.java: This class focuses on verifying the user profile page.

ParabankReg Package
FillingValidDataTest.java: Tests the registration process by filling valid data.

RegPage.java: Contains page objects and methods related to the registration page.

RegPageNoDataTest.java: Verifies the behavior when attempting to register without providing any data.
