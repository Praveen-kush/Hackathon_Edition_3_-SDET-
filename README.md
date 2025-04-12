# 🧪 End-to-End Manual Testing on Demoblaze

## 📌 Objective

This project focuses on performing comprehensive manual testing of the e-commerce web application: [https://demoblaze.com/](https://demoblaze.com/). The goal is to ensure the functionality, usability, and reliability of the application across multiple user scenarios.

---

## ✅ Scope of Testing

We aim to test the application thoroughly using various testing techniques including:

- ✅ Functional Testing  
- 🎨 UI Testing  
- 🔐 Field Validations  
- ❌ Negative Test Cases  
- 🔄 Edge Case Testing  
- 📱 Responsive Testing *(Optional)*  

---

## 📋 Deliverables

1. **500+ Test Cases**
   - Created in **Excel** or **Google Sheets**
   - Covers all major modules (Homepage, Product Categories, Product Details, Cart, Signup, Login, Contact, etc.)

2. **Bug Report Document**
   - Minimum 50 bugs identified
   - Includes Bug ID, Title, Description, Severity, Priority, Steps to Reproduce, Expected vs Actual Result, and Screenshots.

3. **JIRA Integration (Optional but Recommended)**
   - All test cases and bugs logged in JIRA.
   - Linked test cases with bug reports for traceability.

---

## 🛠️ Tools & Technologies

| Tool              | Purpose                     |
|-------------------|-----------------------------|
| Demoblaze         | Application Under Test      |
| Excel/Google Sheets | Test Case Management        |
| JIRA (Optional)   | Bug & Test Case Tracking    |
| Browser Developer Tools | Responsive & UI Testing     |

---

## 📁 Folder Structure


---

## 🚀 Getting Started

1. Visit [https://demoblaze.com/](https://demoblaze.com/) and explore all features.
2. Use the provided test case template to record scenarios, steps, expected results, and outcomes.
3. Validate UI components, fields, links, and actions.
4. Log bugs using the bug report template or in JIRA.
5. If using JIRA:
   - Create a new project.
   - Upload all test cases and bugs.
   - Assign priorities and link defects.

---

## 📞 Contact

For any queries or clarifications, reach out to:

**Tester:** *Praveen Kumar Kushwaha, Vikash Chaudhary*  
**Email:** *praveenkushwaha0468@gmail.com*  
**LinkedIn:** *https://www.linkedin.com/in/praveen-kushwaha-7ab85821a*  

---


# 🔄 Trello API Testing (CRUD)

## 📌 Objective

This project focuses on performing **end-to-end API testing** on Trello’s Board endpoints using both **Postman** and **Rest Assured (Java)**. The goal is to verify CRUD operations on Boards and validate response behaviors under both valid and invalid scenarios.

🔗 Trello API Docs: [https://developer.atlassian.com/cloud/trello/rest/](https://developer.atlassian.com/cloud/trello/rest/)

---

## 🧪 Scope of Testing

### ✅ Core Operations:
- **Create** a new Trello Board
- **Read** Board details using board ID
- **Update** Board name
- **Delete** the Board

### 🛡️ Validation Checks:
- HTTP **status codes** for all operations
- JSON **response body** validation
- **Schema validation** (if applicable)
- **Error handling** for:
  - Invalid API key or token
  - Unauthorized access
  - Invalid Board IDs

---

## 🔐 Authentication

Trello uses API Key and Token for authentication.

### Steps to Generate:
1. Log in to Trello.
2. Visit: [https://trello.com/app-key](https://trello.com/app-key)
3. Copy your **API Key** and click the link to generate a **Token**.

> Pass both `key` and `token` as query parameters in each request.

---

## 🧰 Tools & Tech Stack

| Tool          | Purpose                      |
|---------------|------------------------------|
| Postman       | Manual API Testing           |
| Rest Assured  | Automated API Testing (Java) |
| Trello API    | Application Under Test       |
| Maven/Gradle  | Dependency Management        |
| TestNG/JUnit  | Test Execution Reports       |

---

## 📁 Folder Structure


---

## 🚀 Getting Started

### 🔄 Using Postman
1. Import the `Trello_Board_CRUD_Collection.json`.
2. Set your `key` and `token` as variables in the Postman environment.
3. Run requests in order: Create → Read → Update → Delete.
4. Validate status codes and response data.

### 🧪 Using Rest Assured
1. Clone the repo and navigate to `rest-assured/`.
2. Add your API key & token in a properties file or as constants.
3. Run the test class `TrelloBoardTest.java` using TestNG or JUnit.
4. Check console/logs for results and assertions.

---

## ⚠️ Error Handling Scenarios

| Scenario                        | Expected Status | Message/Error       |
|---------------------------------|------------------|----------------------|
| Missing API key/token           | 401 Unauthorized | "invalid key/token"  |
| Invalid board ID                | 400/404          | "board not found"    |
| Invalid HTTP method             | 405              | "method not allowed" |

---

## 📝 Author

**Name:** *Praveen Kumar Kushwaha*  
**Email:** *praveenkushwaha0468@gmail.com*  
**LinkedIn:** *https://www.linkedin.com/in/praveen-kushwaha-7ab85821a*  

---

## 📎 References

- [Trello REST API Docs](https://developer.atlassian.com/cloud/trello/rest/)
- [OAuth Tokens for Trello](https://trello.com/app-key)

---

# ♿ Accessibility Testing on Tutorialsninja

## 🎯 Objective

This project is all about making the web more inclusive by testing accessibility on the e-commerce site:  
🔗 [https://tutorialsninja.com/demo/](https://tutorialsninja.com/demo/)

Using automated tools like **Axe**, **Lighthouse**, or **WAVE**, we’re identifying issues that could impact users with disabilities and suggesting ways to fix them. 💪

---

## 🧪 What We're Testing

We'll be scanning and testing the site for:

- 🖼️ **Missing alt text** on images
- 🎨 **Color contrast** issues between text and backgrounds
- ⌨️ **Keyboard navigation** challenges
- 🔖 **ARIA** (Accessible Rich Internet Applications) label problems

All findings will be documented with clear screenshots, severity ratings, and suggestions for developers to fix 'em up.

---

## 🛠️ Tools Used

| Tool         | Purpose                        |
|--------------|--------------------------------|
| Axe DevTools | Chrome/Firefox extension to scan for WCAG violations |
| Lighthouse   | Built-in Chrome tool for accessibility auditing |
| WAVE         | Web accessibility evaluation tool |
| Screenshot Tools | To capture issue visuals |

*Pick any one or mix it up!*

---

## 📁 Folder Structure


---

## 📌 How to Get Started

1. Open [https://tutorialsninja.com/demo/](https://tutorialsninja.com/demo/) in your browser.
2. Launch any accessibility tool:
   - **Axe** via extension
   - **Lighthouse** via Chrome DevTools (📱Audits tab)
   - **WAVE** via browser or online tool
3. Run scans on multiple pages (Home, Product Page, Cart, Checkout, etc.)
4. Document each issue with:
   - Screenshot 📸
   - Issue description
   - Severity (Low/Medium/High/Critical)
   - Suggested fix 🛠️

---

## 🐞 Bug Report Includes:

| Field             | Description                                 |
|------------------|---------------------------------------------|
| Bug ID            | Unique ID for each issue                   |
| Page Name/URL     | Where the issue was found                  |
| Description       | What went wrong                            |
| Screenshot        | Visual proof                               |
| Severity          | Low / Medium / High / Critical             |
| Suggested Fix     | What devs can do to solve it               |

---

## 📎 References

- [WCAG Guidelines](https://www.w3.org/WAI/standards-guidelines/wcag/)
- [Axe DevTools](https://www.deque.com/axe/devtools/)
- [Google Lighthouse](https://developers.google.com/web/tools/lighthouse)
- [WAVE Tool](https://wave.webaim.org/)

---

## 🙌 Author

**Name:** *Praveen Kumar Kushwaha*  
**Email:** *praveenkushwaha468@gmail.com*  
**Role:** Accessibility Tester  

---

Let's make the web accessible for *everyone*. 

---

# 🔐 Login Page Automation Using POM & Cucumber

## 🎯 Objective

Automate the login functionality of the website  
🔗 [https://the-internet.herokuapp.com/login](https://the-internet.herokuapp.com/login)  
using **Selenium Java** with **Page Object Model (POM)** design pattern and **Cucumber BDD** integration.

---

## 🧰 Tools & Tech Stack

| Tool/Tech     | Purpose                                 |
|---------------|------------------------------------------|
| Selenium      | Browser automation                       |
| Java          | Core programming language                |
| Cucumber      | Behavior-Driven Development (BDD)        |
| JUnit/TestNG  | Test execution framework                 |
| Maven         | Dependency management & build tool       |
| Extent/Allure | Test reporting                           |

---

## 📁 Project Structure


---

## 🌐 Test Scenarios Covered

| Scenario ID | Description                               | Expected Result                 |
|-------------|-------------------------------------------|----------------------------------|
| TC01        | Successful login with valid credentials   | Redirect to secure area         |
| TC02        | Login with invalid username               | Display error message           |
| TC03        | Login with invalid password               | Display error message           |
| TC04        | Submit with blank username                | Show validation / error         |
| TC05        | Submit with blank password                | Show validation / error         |

---

## 📝 Feature File (Gherkin Syntax)

```gherkin
Feature: Login functionality

  Scenario: Valid login
    Given User is on the login page
    When User enters valid username and password
    Then User should be logged in successfully

  Scenario: Invalid login
    Given User is on the login page
    When User enters invalid credentials
    Then An error message should be displayed

  Scenario: Blank field validation
    Given User is on the login page
    When User submits without entering credentials
    Then Validation messages should appear



