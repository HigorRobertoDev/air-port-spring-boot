# Aplicação para cadastro de Aeroportos

Para iniciar a aplicação, aconselho executar o arquivo Dockerfile.yml para subir um banco de dados MySql.

## Comando Docker

```bash
docker-compose -f Dockerfile.yml up
```

O arquivo save-air-port-in-batch.json contem uma lista dos aeroportos do pais, facilitando a inclusão dos registros na aplicação.