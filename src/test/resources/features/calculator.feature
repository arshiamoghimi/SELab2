@tag
Feature: Calculator

  Scenario: perform multiplication
    Given Two input values 6 and 2, and an operation *
    When I perform the operation
    Then I expect the result 12

  Scenario: perform division
    Given Two input values 6 and 2, and an operation /
    When I perform the operation
    Then I expect the result 3

  Scenario: perform power
    Given Two input values 6 and 2, and an operation ^
    When I perform the operation
    Then I expect the result 36

  Scenario Outline: calculate an operation
    Given Two input values <first> and <second>, and an operation <opt>
    When I perform the operation
    Then I expect the result <result>
    Examples:
      | first | second | opt | result |
      | 6     | 2      | *   | 12     |
      | 6     | 2      | /   | 3      |
      | 6     | 2      | ^   | 36     |
