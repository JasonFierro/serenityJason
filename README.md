Running by tags
MAVEN mvn clean verify -Dwebdriver.driver=chrome -Denvironment=staging
Maven: mvn verify -Dcucumber.options="--tags '@login or @foo'" mvn verify -Dcucumber.options="--tags @login"
Maven: mvn verify -Dcucumber.options="--tags '@pagoLoginTarjeta or @pagoSinLoginTarjeta'" mvn verify -Dcucumber.options="--tags @login"

mvn clean test -Dtags="@pagoSinLoginTarjeta or @pagoLoginTarjeta"
mvn test -Dcucumber.filter.tags='@pagoSinLoginTarjeta and @pagoLoginTarjeta'

mvn test "-DargLine=-Dcucumber.filter.tags='@pagoSinLoginTarjeta and not @pagoLoginTarjeta'"
mvn verify "-DargLine=-Dcucumber.filter.tags='@pagoSinLoginTarjeta or @pagoLoginTarjeta'"

mvn test -Dcucumber.options=“ruta del archivo de características” + “número de línea del escenario”
Ej : mvn test -Dcucumber.options= “ src/test/resources/funcitonalTests/End2EndTest.feature:5"

mvn test -Dcucumber.options=“--tags @tag Name”
ej: mvn test -Dcucumber.options= “-- tags @Smoke”

prueba mvn -Dcucumber.filter.tags=“@Smoke”

prueba mvn -Dcucumber.options=“src/prueba/recursos/pruebasfuncionales/End2End_Tests.feature”

mvn test -Dcucumber.options=“Algo” -Dcucumber.options=”Algo” -Dcucumber.options=“Algo”
Ej: mvn test -Dcucumber.options=“src/test/resources/funcionalTests/End2End_Tests.feature” -Dcucumber.options=“- -tags @Smoke ”
prueba mvn -Dcucumber.options=“src/test/resources/funcionalTests/End2End_Tests.feature” -Dcucumber.filter.tags=“@Smoke”


mvn verify -Dcucumber.filter.tags="@smoke and @dev"