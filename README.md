#run main class using following command on terminal
gradle run


curl --location --request POST 'http://localhost:8082/accounts/' \
--header 'Content-Type: application/json' \
--data-raw '{
"addressRequest": {
"city": "pune"
},
"customerId": "4347654d-8442-433c-8b90-876d9cecad9e"
}'


curl --location --request PUT 'http://localhost:8082/accounts/1b889511-9dae-43b4-89dc-5ad066b488f7/address' \
--header 'Content-Type: application/json' \
--data-raw '{
"city": "mumbai"
}'


