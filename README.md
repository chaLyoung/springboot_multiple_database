### springboot multiple database
##

##### 1
open application-local.yml file
####
application.yml path -> src/main/resource/application-local.yml

####
find word "datasource" and insert your database information

####
if you at a first time in connection on db, check application-local.yml.
session: jdbc: initialize-schema: always