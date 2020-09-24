Feature: Automation of Mont5

  @SignupDirectly
   Scenario Outline: Sign Up Mont5
    Given I am on Mont5 Home page
    Then I Click create an account
    Then I create my mail signup "<email>" and "<password>"
    Then I logout

      Examples:
        |email                            |password   |
        |test@test.com            |test_123 |

  @SignupWrongPw
  Scenario Outline: Sign Up Mont5 Negative
    Given I am on Mont5 Home page
    Then I Click create an account
    Then I create my mail signup "<email>" and "<password>" negative password

    Examples:
      |email                            |password   |
      |haider@gmail.com            |1 |

  @SignupWrongEmail
  Scenario Outline: Sign Up Mont5 Negative email
    Given I am on Mont5 Home page
    Then I Click create an account
    Then I create my mail signup "<email>" and "<password>" negative email

    Examples:
      |email                            |password   |
      |b                                 |asdadss12s2 |

  @AlreadySignedup
  Scenario Outline: Sign Up Mont5
    Given I am on Mont5 Home page
    Then I Click create an account
    Then I Enter "<email>" and "<password>" while signing up
    Examples:
      |email                            |password   |
      |SaqlainHaider@gmail.com           |Haider_123 |

  @SignupFromLoginPage
  Scenario Outline: Sign Up Mont5
    Given I am on Mont5 Home page
    Then I Click Login my account
    Then I Click create an account button
    Then I create my mail signup "<email>" and "<password>"
    Then I logout

    Examples:
      |email                            |password   |
      |haiderali@gmail.com            |Haider_123 |

  @Login
  Scenario Outline: Login Mont5
    Given I am on Mont5 Home page
    Then I Click Login my account
    Then I Enter  "<email>" and "<password>" credentials
    Then I logout

    Examples:
      |email                            |password   |
      |haidersaqlain123@gmail.com            |Haider_1234 |

  @LoginFailureEmail
  Scenario Outline: Login Mont5 with wrong email
    Given I am on Mont5 Home page
    Then I Click Login my account
    Then I Enter  "<email>" and "<password>" negative email

    Examples:
      |email                            |password   |
      |abc       |Haider_123 |

  @LoginInvalid
  Scenario Outline: Login Mont5 with invalid details
    Given I am on Mont5 Home page
    Then I Click Login my account
    Then I Enter "<email>" or "<password>" invalid

    Examples:
      |email                            |password   |
      |something@test.com    |Haider_123 |

  @LoginPasswordEmpty
  Scenario Outline: Login Mont5 with empty password field
    Given I am on Mont5 Home page
    Then I Click Login my account
    Then I Enter "<email>" "<password>" empty password

    Examples:
      |email                            |password   |
      |check@check.com       | |

  @LoginEmailEmpty
  Scenario Outline: Login Mont5 with empty email field
    Given I am on Mont5 Home page
    Then I Click Login my account
    Then I Enter "<email>" "<password>" empty email

    Examples:
      |email                            |password   |
      |       |Haider_123 |

  @GoToMyAccount
  Scenario Outline: Go to My Account
    Given I am on Mont5 Home page
    Then I Click Login my account
    Then I Enter  "<email>" and "<password>" credentials
    Then I go to My Account details
    Then I logout

    Examples:
      |email                            |password   |
      |haider@gmail.com            |Haider_123 |

  @GoToMyAccountbyclickingMyaccountbuttonbeforeLogin
  Scenario Outline: Go to My Account
    Given I am on Mont5 Home page
    Then I go to My Account details
    Then I Enter  "<email>" and "<password>" credentials
    Then I logout

    Examples:
      |email                            |password   |
      |haider@gmail.com            |Haider_123 |

  @MyAccountOptions
  Scenario Outline: My Account Flow in Mont5
    Given I am on Mont5 Home page
    Then I go to My Account details
    Then I Enter  "<email>" and "<password>" credentials
    Then I Click to go to my account and open all respective options
    Then I logout
    Examples:
      | email | password |
      |saqlain@gmail.com           |Haider_123 |

  @MyAccountInformationEmail
  Scenario Outline: Change Email in Account Information Mont5
    Given I am on Mont5 Home page
    Then I go to My Account details
    Then I Enter  "<email>" and "<password>" credentials
    Then I Click to go to my account Information email
    Then I logout
    Examples:
      | email | password |
      |haider@gmail.com            |Haider_123 |

  @MyAccountInformationPassword
  Scenario Outline: Change password in Account Information Mont5
    Given I am on Mont5 Home page
    Then I go to My Account details
    Then I Enter  "<email>" and "<password>" credentials
    Then I Click to go to my account Information password
    Then I logout
    Examples:
      | email | password |
      |haidersaqlain123@gmail.com            |Haider_1234 |


  @AddressBook
  Scenario Outline: AddressBook Update in Mont5
    Given I am on Mont5 Home page
    Then I go to My Account details
    Then I Enter  "<email>" and "<password>" credentials
    Then I Click to go to my address book
    Then I logout
    Examples:
      | email | password |
      |test@test.com            |test_123 |

  @UpdateAddressBook
  Scenario Outline: AddressBook Update in Mont5
    Given I am on Mont5 Home page
    Then I go to My Account details
    Then I Enter  "<email>" and "<password>" credentials
    Then I Click to go to update my address book
    Then I logout
    Examples:
      | email | password |
      |saqlain@gmail.com             |Haider_123 |

  @NewspaperSubscription
  Scenario Outline: Newspaper Subscription in Mont5
    Given I am on Mont5 Home page
    Then I go to My Account details
    Then I Enter  "<email>" and "<password>" credentials
    Then I Click to go to newspaper
    Then I logout
    Examples:
      | email | password |
      |haidersaqlain123@gmail.com            |Haider_1234 |

  @RandomJacketProductAddtoCart
  Scenario Outline: Add Jacket to Cart Mont5
    Given I am on Mont5 Home page
    Then I Click Login my account
    Then I Enter  "<email>" and "<password>" credentials
    Then I Click to Random Jacket Product
    Then I am on Mont5 Home page
    Then I logout
    Examples:
      | email | password |
      |haidersaqlain123@gmail.com            |Haider_1234 |

  @RandomJacketProductCheckout
  Scenario Outline: Mont5 Checkout
    Given I am on Mont5 Home page
    Then I Click Login my account
    Then I Enter  "<email>" and "<password>" credentials
    Then I Click to add Random Jacket Product and Checkout
    Then I am on Mont5 Home page
    Then I logout
    Examples:
      | email | password |
      |saqlain@gmail.com             |Haider_123 |

  @RandomJacketProductUpdateCartCheckout
  Scenario Outline: Mont5 Checkout
    Given I am on Mont5 Home page
    Then I Click Login my account
    Then I Enter  "<email>" and "<password>" credentials
    Then I Click to add Random Jacket Product Update Cart and Checkout
    Then I am on Mont5 Home page
    Then I logout
    Examples:
      | email | password |
      |saqlain@gmail.com             |Haider_123 |

  @RandomBagsProductAddtoCart
  Scenario Outline: Add Bags to Cart Mont5
    Given I am on Mont5 Home page
    Then I Click Login my account
    Then I Enter  "<email>" and "<password>" credentials
    Then I Click to Random Bags Product
    Then I am on Mont5 Home page
    Then I logout
    Examples:
      | email | password |
      |haidersaqlain123@gmail.com            |Haider_1234 |

  @RandomBagProductCheckout
  Scenario Outline: Mont5 Checkout
    Given I am on Mont5 Home page
    Then I Click Login my account
    Then I Enter  "<email>" and "<password>" credentials
    Then I Click to add Random Bag Product and Checkout
    Then I am on Mont5 Home page
    Then I logout
    Examples:
      | email | password |
      |test@test.com            |test_123 |

  @RandomBagCategoryProductCheckout
  Scenario Outline: Mont5 Checkout
    Given I am on Mont5 Home page
    Then I Click Login my account
    Then I Enter  "<email>" and "<password>" credentials
    Then I Select a random category of Bags
    Then Proceed to checkout and redirect to paypal
    Then I am on Mont5 Home page
    Then I logout
    Examples:
      | email | password |
      |test@test.com            |test_123 |

  @Guest
  Scenario Outline: Guest Process to checkout
    Given I am on Mont5 Home page
    Then I Click to Random category
    Then I Click to Random product of that category

    Examples:
      | email | password |
      |haidersaqlain123@gmail.com            |Haider_1234 |
