Feature: Perform edit operation on My Profile of firstcry application

  Scenario Outline: Verify the user is able to login and add child details
    Given The user is in the firstcry home page1
    When The user clicks on login1
    And The user enter the mobile num
    Then click on continue1
    And click on submit link1
    Then click on My Account1
    And click on My Profile1
    And click on child details1
    And enter the <childName>
    And enter date of birth1
    And select a gender
    And enter the child <weight> and child <height>
    When click on save button
    Then child details successfully saved

    Examples: 
      | childName | weight | height |
      | Mili      |      5 |     60 |
