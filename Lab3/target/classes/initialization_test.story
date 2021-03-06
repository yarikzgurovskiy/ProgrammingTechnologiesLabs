Scenario: Save matrix
Given evaluator
When evaluate A = [[1,2,4], [4, 5, 6]]
Then should equal [[1.00, 2.00, 4.00], [4.00, 5.00, 6.00]]

Scenario: Input matrix in invalid format
Given evaluator
When evaluate [[2,44, 3,444, ], [6,45, 2,5]]
Then should equal Syntax error occurred

When evaluate [[4]
Then should equal Syntax error occurred

Scenario: Input matrix with invalid name
Given evaluator
When evaluate 2 = [[5,8]]
Then should equal Syntax error occurred
When evaluate  _ = [[5,8]]
Then should equal Syntax error occurred

Scenario: Error with matrix division
Given evaluator
When evaluate [[5]] / [[4]]
Then should equal One operand should be matrix, another should be a number

Scenario: Error input of jagged Matrix
Given evaluator
When evaluate B = [[2,44, 3,444, 4,6], [6,45, 2,5]]
Then should equal All rows must have the same length.

Scenario: Get matrix that exists in the cache
Given evaluator
When evaluate A = [[1,2,3],[1,2,3],[1,2,3]]
And evaluate A
Then should equal [[1.00, 2.00, 3.00], [1.00, 2.00, 3.00], [1.00, 2.00, 3.00]]

Scenario: Unexisting name of Matrix
Given evaluator
When evaluate Z
Then should equal Variable is not defined

Scenario: Save calculation of matrix
Given evaluator
When evaluate B = [[3, 5], [3, 7]]
And evaluate B = B^T
And evaluate B
Then should equal [[3.00, 3.00], [5.00, 7.00]]