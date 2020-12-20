# Copying local code to AWS/ElasticBeansTalk
$ mvn clean install -DskipTests=true
- create a Java app on AWS/ElasticBeansTalk
	- Configuration/Software: Port numbers should match
	- Configuration/Database: Enter username & password
- Upload and Deploy jar file
- Copy Url
- Postman: Url/api/employees

# Moving code from TEST Environment to PROD environment
- ElasticBeansTalk / Clone Environment > name: ..-PROD
- Change code & generate new jar file
- Upload the new jar file to the TEST environment and make the tests
- ElasticBeansTalk > Swap environment URL's
