# start
docker-compose up -d
# check list
docker ps -f name=sleipnir 

# install mysql client
apt-get update 
apt install mysql-client-core-8.0

# connect db0  & db1
export MYSQL_PWD=odin123
mysql -h 127.0.0.1 -P 3306 -u root db0
mysql -h 127.0.0.1 -P 3307 -u root db1