Feature: Application Login 

@RegressionTest 
Scenario: Homepage default Login 
	Given User is on Bank Login Page 
	When User is login with correct Username "john" and password "1234" 
	Then Homepage is populated 
	And Cards displayed are "true" 
	
@MobileTest 
Scenario: Homepage default Login 
	Given User is on Bank Login Page 
	When User is login with correct Username "John" and password "Doe" 
	Then Homepage is populated 
	And Cards displayed are "false" 
	
@MobileTest 
Scenario: Homepage default Login 
	Given User is on Bank Login Page 
	When User is Signup with following details 
		| vivek | darji | 1/4/85 | Male | 5708500829 |
	Then Homepage is populated 
	And Cards displayed are "false" 
@SanityTest 
Scenario Outline: Homepage default login 
	Given User is on Bank Login Page 
	When User is login with username <Username> and pswd <Password> 
	Then Homepage is populated 
	And Cards displayed are "true" 
	
	Examples: 
		|Username| Password|
		|user1   |pass1    |
		|user2   |pass2    |
		|user3   |pass3    |
		|user4   |pass4    |
		|user5   |pass5    |