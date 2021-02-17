# Automated QA - Data Test App

## Getting Started

Kindly follow these instructions to set up this repo on your local machine

### Installation

1. Download and install Google Chrome [here](https://www.google.com/chrome)

2. Download and install the Java SDK [here](http://www.oracle.com/technetwork/java/javase/downloads/index.html)

2. Download and install the latest version of "Eclipse IDE for Java Developers" [here](http://www.eclipse.org/downloads/) 

3. Clone the repository using `git clone https://github.com/kelvin-bonni/data-test-app.git`

4. Download and extract the Selenium Webdriver for Java Client Driver into a known location [here](https://selenium.dev/downloads/)

5. Open the project in eclipse and import the Selenium drivers

> Here's how : 
>1. Right-click on "data-test-app" and select Properties.
>2. On the Properties dialog, click on "Java Build Path".
>3. Click on the Libraries tab
>4. Click on "Add External JARs.."
>5. In the pop-up, navigate to the location of the Selenium extracted folder
>6. Select the client-combined-x.xxx.xx and client-combined-x.xxx.xx-sources jar files and every jar file in the libs folder, and click 'Open'
>7. Click on the 'Apply and Close' button

>NB: MacOS users must install chromedriver manually using brew - `brew install chromedriver`

Finally, run the TestClass application