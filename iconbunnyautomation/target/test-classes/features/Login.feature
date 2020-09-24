Feature: Signup/Login to IconBunny

    @SignupSuccess
      Scenario Outline: Sign Up IconBunny
      Given I am on IconBunny Home page
      Then I Click Register my account
      Then I create my mail signup "<email>" and "<password>"
      Then I logout
      Examples:
        |email                            |password   |
        |testing@iconbunny.com            |Haider_123 |


   @SignupWrongPw
    Scenario Outline: Sign Up IconBunny Negative
    Given I am on IconBunny Home page
    Then I Click Register my account
    Then I create my mail signup "<email>" and "<password>" negative password

    Examples:
      |email                            |password   |
      |check@ymail.com            |1 |

  @SignupWrongEmail
    Scenario Outline: Sign Up IconBunny Negative email
    Given I am on IconBunny Home page
    Then I Click Register my account
    Then I create my mail signup "<email>" and "<password>" negative email

    Examples:
      |email                            |password   |
      |b                                 |asdadss12s2 |

    @AlreadySignedup
    Scenario Outline: Sign Up IconBunny
      Given I am on IconBunny Home page
      Then I Click Register my account
      Then I Enter "<email>" and "<password>" while signing up
      Examples:
        |email                            |password   |
        |SaqlainHaider@gmail.com           |Haider_123 |

  @LoginSuccess
  Scenario Outline: Login IconBunny
    Given I am on IconBunny Home page
    Then I Click Login my account
    Then I Enter  "<email>" and "<password>" credentials
    Then I Close Flyer
    Then I logout

    Examples:
      |email                            |password   |
      |SQASaqlain@ymail.com              |Haider_123 |

    @LoginFailureEmail
  Scenario Outline: Login IconBunny
    Given I am on IconBunny Home page
    Then I Click Login my account
    Then I Enter  "<email>" and "<password>" negative email

    Examples:
      |email                            |password   |
      |abc       |Haider_123 |

  @LoginInvalid
  Scenario Outline: Login IconBunny
    Given I am on IconBunny Home page
    Then I Click Login my account
    Then I Enter "<email>" or "<password>" invalid

    Examples:
      |email                            |password   |
      |abc@abc.com       |Haider_123 |

  @LoginPasswordEmpty
  Scenario Outline: Login IconBunny
    Given I am on IconBunny Home page
    Then I Click Login my account
    Then I Enter "<email>" "<password>" empty password

    Examples:
      |email                            |password   |
      |check@check.com       | |

  @LoginEmailEmpty
  Scenario Outline: Login IconBunny
    Given I am on IconBunny Home page
    Then I Click Login my account
    Then I Enter "<email>" "<password>" empty email

    Examples:
      |email                            |password   |
      |       |Haider_123 |

  @LoginGmail
  Scenario Outline: Login IconBunny
    Given I am on IconBunny Home page
    Then I Click Login my account
    Then I Click Signin with Google
    Then I close Gmailtab

    Examples:
      |email                            |password   |

   @test
   Scenario Outline: Login IconBunny
     Given I am on IconBunny Home page
     Then I Click Signin Button
     Then I click on Google Signin Button

     Examples:
       |email                            |password   |

   @MyAccount
   Scenario Outline: Login IconBunny
     Given I am on IconBunny Home page
     Then I Click Login my account
     Then I Enter  "<email>" and "<password>" credentials
     Then I Close Flyer
     Then I Click to go to my account
     Then I logout
     Examples:
       | email | password |
       |SQASaqlain@ymail.com            |Haider_123 |

  @MyAccountInformationEmail
  Scenario Outline: Login IconBunny
    Given I am on IconBunny Home page
    Then I Click Login my account
    Then I Enter  "<email>" and "<password>" credentials
    Then I Close Flyer
    Then I Click to go to my account Information email
    Then I logout
    Examples:
      | email | password |
      |SQASaqlain@checkmail.com            |Haider_123 |

  @MyAccountInformationPassword
  Scenario Outline: Login IconBunny
    Given I am on IconBunny Home page
    Then I Click Login my account
    Then I Enter  "<email>" and "<password>" credentials
    Then I Close Flyer
    Then I Click to go to my account Information password
    Then I logout
    Examples:
      | email | password |
      |SQASaqlain@ymail.com            |Haider_123 |

  @AddressBook
  Scenario Outline: Login IconBunny
    Given I am on IconBunny Home page
    Then I Click Login my account
    Then I Enter  "<email>" and "<password>" credentials
    Then I Close Flyer
    Then I Click to go to my address book
    Then I logout
    Examples:
      | email | password |
      |SQASaqlain@ymail.com            |Haider_123 |

  @NewspaperSubscription
  Scenario Outline: Login IconBunny
    Given I am on IconBunny Home page
    Then I Click Login my account
    Then I Enter  "<email>" and "<password>" credentials
    Then I Close Flyer
    Then I Click to go to newspaper
    Then I logout
    Examples:
      | email | password |
      |SQASaqlain@ymail.com            |Haider_123 |

  @AddToCart
  Scenario Outline: Login IconBunny
    Given I am on IconBunny Home page
    Then I Click Login my account
    Then I Enter  "<email>" and "<password>" credentials
    Then I Close Flyer
    Then I Click to add to cart
    Then I logout
    Examples:
      | email | password |
      |Saqlain123@gmail.com             |Haider_123 |

  @Checkout
  Scenario Outline: Login IconBunny
    Given I am on IconBunny Home page
    Then I Click Login my account
    Then I Enter  "<email>" and "<password>" credentials
    Then I Close Flyer
    Then I Click to Cart and Proceed to Checkout
    Then I am on IconBunny Home page
    Then I logout
    Examples:
      | email | password |
      |iconbunny@gmail.com           |Haider_123 |

  @RandomProductCheckout
  Scenario Outline: Login IconBunny
    Given I am on IconBunny Home page
    Then I Click Login my account
    Then I Enter  "<email>" and "<password>" credentials
    Then I Close Flyer
    Then I Click to Random Product
    Then I am on IconBunny Home page
    Then I logout
    Examples:
      | email | password |
      |testing@iconbunny.com            |Haider_123 |

  @RandomProductAddToCart
  Scenario Outline: Login IconBunny
    Given I am on IconBunny Home page
    Then I Click Login my account
    Then I Enter  "<email>" and "<password>" credentials
    Then I Close Flyer
    Then I Click Add to Cart for a Random Product
    Then I logout
    Examples:
      | email | password |
      |iconbunny@gmail.com           |Haider_123 |

  @RandomProductAddToCartAndRemove
  Scenario Outline: Login IconBunny
    Given I am on IconBunny Home page
    Then I Click Login my account
    Then I Enter  "<email>" and "<password>" credentials
    Then I Close Flyer
    Then I Click Add to Cart for a Random Product and Update Cart
    Then I logout
    Examples:
      | email | password |
      |testing@iconbunny.com            |Haider_123 |

  @RandomProductAddToCartANDUpdateItemsInCart
  Scenario Outline: Login IconBunny
    Given I am on IconBunny Home page
    Then I Click Login my account
    Then I Enter  "<email>" and "<password>" credentials
    Then I Close Flyer
    Then I Click Add to Cart for a Random Product and Increase Value of Item in Cart
    Then I logout
    Examples:
      | email | password |
      |SQASaqlain@ymail.com         |Haider_123 |


  @WishList
  Scenario Outline: Login IconBunny
    Given I am on IconBunny Home page
    Then I Click Login my account
    Then I Enter  "<email>" and "<password>" credentials
    Then I Close Flyer
    Then I Click to go to WishList
    Then I logout
    Examples:
      | email | password |
      |SQASaqlain@ymail.com            |Haider_123 |

  @RandomProductAddToWishList
  Scenario Outline: Login IconBunny
    Given I am on IconBunny Home page
    Then I Click Login my account
    Then I Enter  "<email>" and "<password>" credentials
    Then I Close Flyer
    Then I Click Add to WishList for a Random Product
    Then I logout
    Examples:
      | email | password |
      |iconbunny@gmail.com           |Haider_123 |

  @display
  Scenario Outline: Login IconBunny
    Given I am on IconBunny Home page
    Then I Click Login my account
    Then I Enter  "<email>" and "<password>" credentials
    Then I Close Flyer
    Then I display
    Then I logout
    Examples:
      | email | password |
      |SQASaqlain@ymail.com            |Haider_123 |

  @ButtonsVerification
  Scenario Outline: Login IconBunny
    Given I am on IconBunny Home page
    Then I Click Login my account
    Then I Enter  "<email>" and "<password>" credentials
    Then I Close Flyer
    Then I verify buttons
    Then I logout
    Examples:
      | email | password |
      |SQASaqlain@ymail.com            |Haider_123 |

  @OpenFile
  Scenario Outline: IconBunny
    Then I Open File and print URLS
    Examples:
      | email | password |
      |SQASaqlain@ymail.com            |Haider_123 |