
@zomatoapp
Feature: User lauch zomato application and login. User search nearby restaurant. Upload profile avtar 
 
  @tag1
  Scenario: Login zomato mobile application 
    Given I launch zomato app on android mobile
    When I click on Continue with google
    Then I logged successfully zomato
    
  @tag2
  Scenario: I search nearby location restaurant 
  Given  I navigate to search field and serach nearby restaurant 
  Then   I search nearby restaurant successfully and print restaurant name
  And I close the search history
  And I navigate to option and click on profile
  When I update the profile avatar