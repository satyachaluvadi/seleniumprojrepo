set projectLocation=C:\Users\satya\selenium-eclipse-workspace\SeleniumJenkinsIntegration
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml