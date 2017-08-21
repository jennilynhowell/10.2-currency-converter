# 10.2-currency-converter
TIY Week 10, Day 2: Currency converter

#### Objectives  
This assignment should reinforce the object oriented programming methods we covered in class and you should feel more familiar in the following after:

##### Writing cleaner and more readable code.
Thinking with objects rather than primitive data types.
Demonstrating the Single Responsibility & Open / Closed principles of object oriented programming.
Description  
There are many currencies around the world. When travelers are moving between countries they commonly have to convert their money to another currency to ensure they can buy the goods they require. However since we're dealing with money we need to make sure that our software does precisely what we say it does with 0 room for error.

##### Currency Conversion  
A small example of a currency conversion is converting USD (united states dollars) to EUR (euro). To convert your dollars to euros you would want to multiply by the current euro -> usd rate. As of the time of this writing the Euro was worth 0.9 to the USD 1.0. That is the equivalent of saying "If I gave you 1 USD you would give me back 9/10th of a Euro".

##### Normal Mode  
Create a Money class that can store it's own amount and currency symbol.
Provide methods to convert between whatever currency is provided to USD, JPY, EUR, BTC.
Implement the conversion rates for USD, JPY, EUR, and BTC.
Hard Mode  
Create a JUnit Test project and provide tests for all conversion methods.

##### Conversion rates  
Make sure your conversion rates are as close to current as possible. Be as accurate as possible but don't stress if the value of the bitcoin drops the day after your assignment is due.

http://www.xe.com/currencyconverter/convert/
