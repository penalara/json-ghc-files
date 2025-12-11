# engineOutputGHCFile


EngineOutputGHCFile is a project from Peñalara.  Peñalara is a Spanish company with more than 20 years of experience. We provide the reference software for the creation of school timetables around the world. More information about at [Peñalara Website](https://www.penalara.com)

Maven project which contains the specification of the Json format of output file it may got from the new PeñalaraGHC's timetable engine.

The projects contains:

 - Java POJO classes.
 - Markdown Documentation about classes structure.



Check the [Reference Documentation about the Schema which origins the POJO classes](doc/README.md)



### Get POJO Classes as Maven Dependency

You can add this code to your pom.xml to get the Java Class to serialize/deserialize the GHC-Engine output json .

        <dependency>
        	<groupId>com.penalara.ghc</groupId>
        	<artifactId>engineOutputGHCFile</artifactId>
        	<version>1.0.4</version>
        </dependency>
