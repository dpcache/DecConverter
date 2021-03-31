#Machine Assignment 2A

Write a program that receives a real number in decimal (base 10) and converts it into any base (e.g., 2, 8, 16, 60). 
This base must be accepted as the First command line argument. Restrict your expected input to numbers in the domain 0 to (inclusive) to 1 (exclusive).


##Installation For Window------------------------

Make sure Java is installed on your machine.

Extract the zip file, and navigate to extracted MA02DecConverter folder. 

To creat the application use these commands in the CMD.exe (Command Prompt).
	.\gradlew build 
or 
	.\gradlew clean build 


Once the build is complete run the following command to start the converstion of Base10 to any base.

	java -jar .\build\libs\MA02DecConverter.jar "Anybase" "Arguments"

Example: java -jar .\build\libs\MA02DecConverter.jar 16 0.5 -0.5 0.25 0.015
Example Output:
	Base 10: 0.5
	Base 16: 0.8

	Base 10: -0.5
	Base 16: -0.8

	Base 10: 0.25
	Base 16: 0.4

	Base 10: 0.015
	Base 16: 0.03(13)70(10)3(12)



##Installation For Unix------------------------

Make sure Java is installed on your machine.

Extract the zip file, and navigate to extracted MA02DecConverter folder. 

To creat the application use these commands in BASH (Command Prompt).
	./gradlew build 
or 
	./gradlew clean build 


Once the build is complete run the following command to start the converstion of Base10 to any base.

	java -jar ./build/libs/MA02DecConverter.jar "Anybase" "Arguments"


Example: java -jar ./build/libs/MA02DecConverter.jar 2 0.5 -0.5 0.25 0.015
Example Output:
	Base 10: 0.5
	Base 2: 0.1

	Base 10: -0.5
	Base 2: -0.1

	Base 10: 0.25
	Base 2: 0.01

	Base 10: 0.015
	Base 2: 0.000000111101011100001010001111


Example: java -jar ./build/libs/MA02DecConverter.jar 16 0.5 -0.5 0.25 0.015
Example Output:
	Base 10: 0.5
	Base 16: 0.8

	Base 10: -0.5
	Base 16: -0.8

	Base 10: 0.25
	Base 16: 0.4

	Base 10: 0.015
	Base 16: 0.03(13)70(10)3(12)


