# Spring Feign Client Sample

The project is an example of using Feign client with SOAP Web Service. 

## Requirements

Java 11+

IntelliJ IDEA / Netbeans / Eclipse

## Usage

```python

1) Start project

2) Call APIs:
    
   Convert number to words:
   curl --location --request POST 'http://localhost:9080/feign-soap-client/api/v1/conversions/words' \
    --header 'Content-Type: application/json' \
    --data-raw '{
        "number": 550
    }'
   
   Convert number to dollars:
   curl --location --request POST 'http://localhost:9080/feign-soap-client/api/v1/conversions/dollars' \
    --header 'Content-Type: application/json' \
    --data-raw '{
        "number": 1
    }'

3) To regenerate soap objects execute (not necessary, just for knowledge):
   ./gradlew wsdl2java
   
```
## Documentation

[Swagger](http://localhost:9080/feign-soap-client/swagger-ui/index.html)

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)