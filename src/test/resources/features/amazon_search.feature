#visit amazons website then
  #Search For Books, Printer, Computer, Cell Phone, Bag
  #Verifiythe result part if it contains our test data

@amazon_search
  Feature: Amazon Search

    Scenario Outline: TC_01_Amazon_Search
      Given  user is on amazon page
      And user searchs for "<item>"
      Then user verifies result "<item>"

      Examples:
        | item       |
        | 1984       |
        | Printer    |
        | Computer   |
        | Cell Phone |
        | Bag        |
