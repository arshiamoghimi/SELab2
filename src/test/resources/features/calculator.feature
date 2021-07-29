@tag
Feature: Calculator

  Scenario Outline: calculate an operation
    Given Two input values <first> and <second>, and an operation <opt>
    When I perform the operation
    Then I expect the result <result>
    Examples:
      | first | second | opt | result |
      | 6     | 2      | *   | 12     |
      | 6     | 2      | /   | 3      |
      | 6     | 2      | ^   | 36     |
