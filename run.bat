set projectLocation=C:\Users\generic1\Desktop\SureshClassWorkspace\Rfw01
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testNg.xml
