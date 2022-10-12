Running by tags
MAVEN mvn clean verify -Dwebdriver.driver=chrome -Denvironment=staging
Maven: mvn verify -Dcucumber.options="--tags '@login or @foo'" mvn verify -Dcucumber.options="--tags @login"