# User API Spec

## Register User

[//]: # (// define)
Endpoint : POST /api/users

Request Body : 

```json
{
  "username" : "aap",
  "password" : "aap24",
  "name" : "Andika Abadi Pamungkas"
  
}
```


Response Body (Success) : 

```json
{
  "data" : "OK"
  
}
```
Response Body (Gagal) :

```json
{
  "errors" : "Username must not blank, ???"
  
}
```

## Login User

Endpoint : POST /api/auth/login

Request Body :

```json
{
  "username" : "aap",
  "password" : "aap24"
  
}
```

Response Body (Success) :
//miliseconds
```json
{
  "data" : {
    "token" : "TOKEN", 
    "expiredAt" : 34234234234234 
  }
  
}
```
Response Body (Failed, 401) :

```json
{
  "errors" : "Username or Password is wrong!"
}
```

## Get User

Endpoint : GET /api/users/current

[//]: # (ketika sudah login perlu memiliki atau request header dalam melakukan segalanya)
Request Header : 

- X-API-TOKEN : Token (Mandatory)

Response Body (Success) :

```json
{
  "data" : {
    "username" : "aap", 
    "name" : "Andika Abadi Pamungkas"
  }
  
}
```
Response Body (Failed, 401) :

```json
{
  "errors" : "Unauthorized!"
}
```

## Update User

Endpoint : PATCH /api/users/current

[//]: # (ketika sudah login perlu memiliki atau request header dalam melakukan segalanya)
Request Header :

- X-API-TOKEN : Token (Mandatory)

[//]: # (name > put if only want to update name
password : put if only wanto update password)
Request Body :
```json
{
  "name" : "Andika Abadi Pamungkas", 
  "password": "new password"
  
}
```

Response Body (Success) :

```json
{
  "data" : {
    "username" : "aap", 
    "name" : "Andika Abadi Pamungkas"
  }
  
}
```
Response Body (Failed, 401) :

```json
{
  "errors" : "Unauthorized!"
}
```


## Logout User


Endpoint : DELETE /api/auth/logout

[//]: # (ketika sudah login dan logout perlu memiliki atau request header dalam melakukan segalanya)
Request Header :

- X-API-TOKEN : Token (Mandatory)

  Response Body (Success) :

```json
{
  "data" : "OK"
  }
 ```
}