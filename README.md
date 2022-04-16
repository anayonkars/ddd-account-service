#run main class using following command on terminal
gradle run

curl --location --request POST 'http://localhost:8082/accounts' \
--header 'Content-Type: application/json' \
--data-raw '{
"addressRequest": {
"city": "pune"
}
}'


curl --location --request PUT 'http://localhost:8082/accounts/9e023622-76e0-4b79-85bc-c9931567f621/address' \
--header 'Content-Type: application/json' \
--data-raw '{
"city": "mumbai"
}'


