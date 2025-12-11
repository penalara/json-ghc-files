Este repositorio contiene los esquemas JSON utilizados por el motor y el planificador de horarios. 

Resumen de las carpetas y los archivos incluidos.

    C:.
    ├───common
    ├───engine
    └───planner

common
Esta carpeta contiene esquemas comunes que son utilizados tanto por el motor como por el planificador. Estos esquemas definen estructuras y tipos de datos compartidos entre ambos componentes.

engine
Esta sección se actualizará en el futuro para incluir detalles sobre los esquemas del motor.

planner

Esta carpeta contiene dos archivos JSON que definen la estructura de los datos de planificación de horarios:

    ghcMultiplatformSchema.json: Este esquema define la estructura general de los archivos multiplataforma de GHC. Incluye metadatos del archivo, especificaciones y resultados del motor.

    plannerSpecification.schema.json: Este esquema define los datos específicos de la planificación del horario.




AL SUBIR LOS CAMBIOS AL REPOSITORIO DE GIT

Leer  https://phabricator.penalara.com/w/projects/planificador/importador/compatibilidad_json/

En este archivo no cambia nada pero en el commit a subir hay que añadir el tag de la nueva version con texto : jsonGHC-x.x.x
Pasos: 
- Hacer el commit normal
- Sobre el commit añadir el tag, y pulsar el tic de 'Push Tag'
- Hacer Push

