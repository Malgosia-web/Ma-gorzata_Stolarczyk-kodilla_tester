Feature:  Is a number Fizz or Buzz? Or maybe both...

  Scenario Outline: My number is or isn't divisible by 3 or 5 or both?
    Given My number is <number>
    When I check the number
    Then It should be <answer>
    Examples:
      | number | answer |
      | 3 | "Fizz" |
      | 6  | "Fizz" |
      | 5  | "Buzz" |
      | 10 | "Buzz" |
      | 15  | "FizzBuzz" |
      | 30  | "FizzBuzz" |
      | 4  | "None" |
      | 8  | "None" |