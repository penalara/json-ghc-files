# EngineInputGHCFile

EngineInputGHCFile is a project from Peñalara.  Peñalara is a Spanish company with more than 20 years of experience. We provide the reference software for the creation of school timetables around the world. More information about at [Peñalara Website](https://www.penalara.com)

Maven project with Json Schema which contains the specification of the Json formant to make a entry file for the new PeñalaraGHC's timetable engine.

The projects contains:

 -   Json Schema specification.
 - Simple Json example.
 - Plugin for automatic generation of Java POJO classes.
 - Java POJO classes.
 - Markdown Documentation about the file structure.





Check the [Reference Documentation about Schema](schema-doc/README.md)

### Get POJO Classes as Maven Dependency

You can add this code to your pom.xml to get the Java Class to serialize/deserialize the GHC-Engine input json .

        <dependency>
        	<groupId>com.penalara.ghc</groupId>
        	<artifactId>engineInputGHCFile</artifactId>
        	<version>1.2.0</version>
        </dependency>

