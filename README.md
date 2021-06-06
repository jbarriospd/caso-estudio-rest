# CASO DE ESTUDIO

En este repositorio presentamos la estructura de carpetas que se deberian realizar en una arquitectura rest en un projecto Java con Spring boot, en donde podemos ver que en clase ClientesRestController se construye el endpoint /api/clientes y su metodo get.

```md
.
└── Caso-de-estudio
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    └── src
        ├── main
        │   ├── java
        │   │   └── co
        │   │       └── edu
        │   │           └── poli
        │   │               └── caso
        │   │                   ├── CaseApplication.java
        │   │                   ├── ServletInitializer.java
        │   │                   ├── rest
        │   │                   │   └── ClientesRestController.java
        │   │                   ├── dto
        │   │                   │   └── ClientesDTO.java
        │   │                   ├── entidades
        │   │                   │   └── Clientes.java
        │   │                   ├── repositorios
        │   │                   │   └── ClientesRepository.java
        │   │                   ├── servicios
        │   │                   │   ├── Clientes.java
        │   │                   │   └── impl
        │   │                   │       └── ClientesServiceImpl.java
        │   │                   └── vistas
        │   │                       └── ClientesVista.java
        │   └── resources
        │       └── application.properties
        └── test
            └── java
                └── co
                    └── edu
                        └── caso
                            └── estudiantes
                                └── CaseApplicationTests.java
 ```
