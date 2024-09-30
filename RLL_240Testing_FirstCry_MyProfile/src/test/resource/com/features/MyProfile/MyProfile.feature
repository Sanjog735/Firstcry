Feature: Perform edit operation on My Profile of firstcry application

  @MyAccount
  Scenario: Verify the user is able to click on My Account
    Given user open the FirstCry website
    When The user clicks on loginBtn
    And The user enters his mobile number
    And click on continue btn
    And click on submit btn
    When click On MyAccount link
    Then The user is able click on MyAccount

  @MyProfile
  Scenario: Verify the user is able to click on My Profile
    Given user Open the FirstCry website
    When user clicks on loginBtn
    And user enters his mobile number
    And user click on continue btn
    And user click on submit btn
    And user click On MyAccount link
    When user click on MyProfile
    Then The user is able click on MyProfile

  Scenario Outline: Verify the user is able to edit the profile
    Given user Open the FirstCry website link
    When user clicks on loginbtn
    And user enters his mobile Number
    And user click on continue Btn
    And user click on submit Btn
    And user click On myAccount link
    And user click on myProfile
    And user click on edit icon of My Profile
    And user enters the name <Amar>
    And user clicks on radio button
    And user clicks on I am expecting another child checkbox
    And user selects a due date
    When user clicks on save button
    Then Users profile should be updated

    Examples: 
      | name |
      | Amar |
  #@EditMyProfileNull
  #Scenario: Edit My Profile with Null Value
    #Given user is on the MyProfile section
    #And click on edit icon of My Profile
    #And do not enter any name
    #And click on A Dad radio button
    #And do not click on I am expecting another child checkbox
    #And do not set a due date
    #When click on save btn
    #Then Users profile should not be updated
#
  #@EditMyContactSuccess
  #Scenario Outline: Update My Contact
    #Given user is on the MyProfile section
    #And click on edit icon of My Contact
    #And update the <mobile number>
    #And provide otp sended on mobile
    #And provide otp sended on registered email
    #When click on VerifySave button
    #Then users mobile number should updated
#
    #Examples: 
      #| mobileNumber |
      #|   8917355469 |
#
  #@EditMyContactNull
  #Scenario: Update My Contact with Null Value
    #Given user is on the MyProfile section
    #And click on edit icon of My Contact
    #And update the mobile number
    #And provide otp sended on mobile
    #And provide otp sended on registered email
    #When click on VerifySave button
    #Then users mobile number should not updated
#
  #@EditMyContactRetry5
  #Scenario Outline: Update My Contact Simoltanoiusly for 5 times
    #Given user is on the MyProfie section
    #And click on edit icon of My Contact
    #And update the <mobile number>
    #And do not provide otp and will not give you an otp after entering your number 5 times
    #When click on VerifySave button
    #Then users mobile number should not updated
#
    #Examples: 
      #| mobileNumber |
      #|   8917355469 |
#
  #@AddChild
  #Scenario Outline: Add child details
    #Given user is on the MyProfie section
    #And click on child details
    #And enter <child name>
    #And enter <date of birth>
    #And select a gender
    #And enter <weight>
    #And enter <height>
    #When click on save button
    #Then child details successfully saved
#
    #Examples: 
      #| childName | childDOB   | weight | height |
      #| Mili      | 02/01/2024 |      5 |     60 |
#
  #@AddChildNull
  #Scenario: Add child details with null values
    #Given user is on the MyProfie section2
    #And click on child details2
    #And do not enter child name2
    #And do not enter date of birth2
    #And select a gender2
    #And do not enter weight2
    #And do not enter height2
    #When click on save button2
    #Then child details should not saved
#
  #@AddAddressDetails
  #Scenario Outline: Add MyAddress Book
    #Given user is on the MyProfie section
    #And click on My Address Book
    #And enter <name>
    #And enter <house number>
    #And enter <street address>
    #And enter <landmark>
    #And enter <pincode>
    #And enter <mobile number>
    #And enter <telephone number>
    #When click on save button
    #Then users address  details successfully saved
#
    #Examples: 
      #| name   | houseNumber | streetAddress | landMark | pinCode | mobileNumber | telNumber  |
      #| Raghav | A1          | Pune          | kharadi  |  411014 |   8745874584 | 8569585896 |
#
  #@AddAddressDetailsNull
  #Scenario: Add MyAddress Book
    #Given user is on the MyProfie section
    #And click on My Address Book
    #And do not enter name
    #And do not enter house number
    #And do not enter street address
    #And do not enter landmark
    #And do not enter pincode
    #And do not enter mobile number
    #And do not enter telephone number
    #When click on save button
    #Then users address details should not saved 
