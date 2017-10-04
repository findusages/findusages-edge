## Build

```
mvn package
```

## Run with maven

```
mvn gatling:execute \
    -Dgatling.simulationClass=com.findusages.edge.simulation.MainSimulation
```

## Run with java

```
java -jar target/gatling-uber-executable-jar-1.0-SNAPSHOT.jar
```
