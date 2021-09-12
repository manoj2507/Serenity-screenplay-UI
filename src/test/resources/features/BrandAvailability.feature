Feature: Check Presence of Brand

  Scenario Outline: Availability of Jeans Brand

    Given that "Manoj" wants to check the availability of "<Product>" Jeans
    When he tries to search the "<Brand>" brand in Myntra
    Then he should see the "<Brand>" brand available

    Examples:
    @Positive
  |Product|
  |Flying Machine|
  |Roadster|
  |SPYKAR|
  |Pepe Jeans|

