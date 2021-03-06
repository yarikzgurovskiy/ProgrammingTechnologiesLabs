Scenario: Expression without saving
Given evaluator
When evaluate [[1,2,3],[1,2,3],[1,2,3]]^T
Then should equal [[1.00, 1.00, 1.00], [2.00, 2.00, 2.00], [3.00, 3.00, 3.00]]

Scenario: Divide on rank
Given evaluator
When evaluate A = [[1,2,3],[1,2,3],[1,2,3]]
When evaluate C = A / rankA
Then should equal [[1.00, 2.00, 3.00], [1.00, 2.00, 3.00], [1.00, 2.00, 3.00]]

Scenario: Expression contains matrices in the invalid string format
Given evaluator

When evaluate [[7,-5,[-4,3]]^T / 3
Then should equal Syntax error occurred

When evaluate [[7,-5],[-4,3]]^T / rank([[1,2],[3,4)
Then should equal Syntax error occurred

When evaluate 5^T
Then should equal TRANSPOSE OF NON MATRIX

When evaluate rank(5)
Then should equal RANK OF NON MATRIX

When evaluate [[4]] / [[4, 4]]
Then should equal One operand should be matrix, another should be a number

Scenario: Expression contains matrix in string format; the expression is calculated without saving the result
Given evaluator
When evaluate [[1,2, 3],[1,2, 3], [1,2, 3]]^T / rank[[1.4, 2.8, 3.6],[1, 2, 3]]
Then should equal [[0.50, 0.50, 0.50], [1.00, 1.00, 1.00], [1.50, 1.50, 1.50]]

Scenario: Expression contains matrix in string format; the expression is computed and the result is stored in the repository
Given evaluator
When evaluate A = [[1,2, 3],[1,2, 3], [1,2, 3]]^T / rank[[1.4, 2.8, 3.6],[1, 2, 3]]
And evaluate A
Then should equal [[0.50, 0.50, 0.50], [1.00, 1.00, 1.00], [1.50, 1.50, 1.50]]

Scenario: Expression get matrix from the repository; the expression is calculated without saving the result
Given evaluator
When evaluate A = [[1,2, 3],[1,2, 3], [1,2, 3]]^T
And evaluate r = rank[[1.4, 2.8, 3.6],[1, 2, 3]]
And evaluate A / r
Then should equal [[0.50, 0.50, 0.50], [1.00, 1.00, 1.00], [1.50, 1.50, 1.50]]

Scenario: Expression get matrix from the repository; the expression is calculated and the result is stored in the repository
Given evaluator
When evaluate A = [[1,2, 3],[1,2, 3], [1,2, 3]]^T
And evaluate r = rank[[1.4, 2.8, 3.6],[1, 2, 3]]
And evaluate R = A / r
And evaluate R
Then should equal [[0.50, 0.50, 0.50], [1.00, 1.00, 1.00], [1.50, 1.50, 1.50]]

Scenario: Expression trying to get matrix that is not in the cache
Given evaluator
When evaluate W^T / rank(X)
Then should equal Variable is not defined