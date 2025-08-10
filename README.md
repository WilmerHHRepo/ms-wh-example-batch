# ms-wh-example-batch

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: <https://quarkus.io/>.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at <http://localhost:8080/q/dev/>.

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.jar.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/ms-wh-example-batch-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult <https://quarkus.io/guides/maven-tooling>.

## Related Guides

- Messaging - Kafka Connector ([guide](https://quarkus.io/guides/kafka-getting-started)): Connect to Kafka with Reactive Messaging



## CONFIGURACION DE JEKINS


✅ 1. Crear un Personal Access Token (PAT) en GitHub
🔹 Pasos:
Ve a https://github.com/settings/tokens

Click en "Generate new token" → Fine-grained o Classic (se recomienda Classic para Jenkins)

Selecciona:

Repo (leer/clonar repositorios)

Workflow (opcional si usas GitHub Actions)

Elige la expiración (o sin expiración si es de confianza)

Guarda el token que se genera → ¡No se puede recuperar luego!



✅ 2. Agregar el token de GitHub en Jenkins como credencial
🔹 Pasos:
En Jenkins, ve a:
Manage Jenkins → Credentials → (Global) → Add Credentials

Tipo: Secret text

Pega el token de GitHub como valor

ID: github-token (o cualquier nombre que recuerdes)

Description: GitHub Personal Token








![img.png](img.png)

### EN CASO NO SE ACTUALICE MV


![img_1.png](img_1.png)




```shell script


docker exec -it -u 0 nombre_o_id_contenedor_jenkins bash
apt-get update
apt-get install maven -y
apt-get install -y wget

# RUN apt-get update && apt-get install -y wget&& rm -rf /var/lib/apt/lists/*



# 1. Ir a /opt
cd /opt

# 2. Descargar Maven 3.9.11
#wget https://dlcdn.apache.org/maven/maven-3/3.9.6/binaries/apache-maven-3.9.6-bin.tar.gz
wget https://dlcdn.apache.org/maven/maven-3/3.9.11/binaries/apache-maven-3.9.11-bin.tar.gz

# 3. Extraer
tar -xvzf apache-maven-3.9.11-bin.tar.gz

# 4. Crear enlace simbólico para usarlo como mvn
ln -s /opt/apache-maven-3.9.11/bin/mvn /usr/bin/mvn

# 5. Verificar
mvn -v

### DETERMINAR POR DEFAULT UNA NUEVA VERSION DE MVN DE FORMA MANUAL 

# Opción 1 – Sobrescribir el enlace
# Si no te importa eliminar el binario anterior:

rm -f /usr/bin/mvn
ln -s /opt/apache-maven-3.9.11/bin/mvn /usr/bin/mvn

# Eso eliminará el mvn viejo y creará el enlace simbólico al nuevo.

# Opción 2 – Priorizar en el PATH (más limpio)

# En vez de tocar /usr/bin, simplemente asegúrate de que la nueva ruta de Maven esté antes en el PATH:
# BASH
export PATH=/opt/apache-maven-3.9.11/bin:$PATH



```

