Feature:Get a Bank Loan
   Background:
     Given Open browser
     | Chrome|
     | Firefox|
       And navigate to the site 
      
       @smoke
       Scenario Outline: Buy a home
       When user will on mortgage menu
       And user will on Mortgage Calculator
       And user will submit necessary information 
       And user will verify monthly mortgage
       Then verify sucsessful massage for order
       
       Examples:
       |count|
       |1|
       |1|
 