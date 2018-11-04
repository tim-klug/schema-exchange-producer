# Producer for the schema

This project is part of a case study, where the schema for exchanged data is shared through the schema registry.

## Getting started

### The schema registry

I'm using the schema registry from landoop. Use the following command to start the registry. Don't use the `--net=host` parameter. This option is not working on Win and Mac at the moment. 

```bash
docker run --rm -p 2181:2181 -p 3030:3030 -p 8081-8083:8081-8083 \
       -p 9581-9585:9581-9585 -p 9092:9092 -e ADV_HOST=localhost \
       landoop/fast-data-dev
```

### Create the Avro file

I will place all Avro files under `code/avro`.

Example:

```json
{
  "namespace": "com.github.timklug.schemaexchangeproducer.models",
  "type": "record",
  "name": "User",
  "fields": [
    {
      "name": "name",
      "type": "string"
    },
    {
      "name": "firstname",
      "type": "string"
    },
    {
      "name": "age",
      "type": "int"
    }
  ]
}
```

### Create Pojo classes

Run `mvn install` to generate all files.

### Upload the Avro file to the schema registry

```bash
mvn schema-registry:register
```

[Reference Confluent](https://docs.confluent.io/current/schema-registry/docs/maven-plugin.html)