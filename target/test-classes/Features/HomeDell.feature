#Author: Mahdi hadj daoud

Feature: Dell Home page
Scenario: Selectionner un produit 
Given admin is on home page
When admin mousehover on menu "Ordinateurs et accessoires" and submenu "Ordinateurs portables"
And admin Click on produit "Ordinateurs portables XPS"
Then admin directed to the page produit 
