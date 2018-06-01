# redesigned-invention
A simple service for SoapUI :)

## Incase you want to set it up :)
- Make a local copy of the repo
- Import project into the Eclipse EE IDE
- Change build source of project and map it to your jre build
- Open Xamp and start the servers
- Import the sql file 
	- Incase you change the name of the database and user namesreflect the same in the `Authorization.java`
- Create Web Service using `com.service.BankService.java`
- Use the WSDL url for your SoapUI
	- You need to have both Eclipse's Tomcat and Xamp's Apache&MySQL servers on when the soapUI fetches the response :expressionless:

## Versions of softwares used
Software | Versions
-------- | --------
Java JDK | 1.8.0_171
Java JRE | 1.8.0_171
Eclipse EE | Oxygen 
Apache TomCat | 7.0.47
Xamp | 7.2.5

## Functions available so far
Service Name | Functionality
-------------|-------------
getAllCustomerData | Kinda reundant to mention -.-
getAllAccountData | Lost motive to fill
getAllTransactionData | Should fill later
getCustomerDataByID | *sigh
getAccountDataByID | 
getTransactionDataByID | 
doDeposit | 
doWithdraw | 
fundsTransfer |

Added Lot more ... Will make list when I have time *sigh 
Created a small UI