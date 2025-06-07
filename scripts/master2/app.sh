curl http://127.0.0.1:8080/master2/heartbeat
curl http://127.0.0.1:8080/master2/heartbeat/status

curl http://127.0.0.1:8080/master2/order/get?orderId=1138139711731138561


# query user orders
curl --location 'http://127.0.0.1:8080/master2/order/get?userId=123&accountId=123'
curl --location 'http://127.0.0.1:8080/master2/order/getbyOrderId?orderId=1138162368061112320'


# create orders
curl --location 'http://127.0.0.1:8080/master2/order/create' \
--header 'Content-Type: application/json' \
--data '{
    "accountId" : 123,
    "userId" : 123
}'


