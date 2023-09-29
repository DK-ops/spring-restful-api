# Contact API Spec

## Create Contact
Request Header :

- X-API-TOKEN : Token (Mandatory)

Endpoint : POST /api/contacts

Request Body:

```json
{
  "firstName" : "Andika Abadi",
  "lastName" : "Pamungkas",
  "email": "244.aap@gmail.com",
  "phone": "0812329321"
}
```

Response Body (success) : 

```json
{
  "data": {
    "id" : "random-string",
    "firstName" : "Andika Abadi",
    "lastName" : "Pamungkas",
    "email": "244.aap@gmail.com",
    "phone": "0812329321"
  }
}
```

Response Body (Failed) : 
```json
{
  "errors" : "Email invalid, dll"
}
```

## Update Contact

Request Header :

- X-API-TOKEN : Token (Mandatory)

Endpoint : PUT /api/contacts/{idContact}

Request Body:

```json
{
  "firstName" : "Andika Abadi",
  "lastName" : "Pamungkas",
  "email": "244.aap@gmail.com",
  "phone": "0812329321"
}
```

Response Body (success) :

```json
{
  "data": {
    "id": "random-string",
    "firstName": "Andika Abadi",
    "lastName": "Pamungkas",
    "email": "244.aap@gmail.com",
    "phone": "0812329321"
  }
}
```

Response Body (Failed) :
```json
{
  "errors" : "Email invalid, dll"
}
```

## Get Contact

Request Header :

- X-API-TOKEN : Token (Mandatory)

Endpoint : GET /api/contacts/{idContact}


Response Body (success) :
```json
{
  "data": {
    "id" : "random-string",
    "firstName" : "Andika Abadi",
    "lastName" : "Pamungkas",
    "email": "244.aap@gmail.com",
    "phone": "0812329321"
  }
}
```

Response Body (Failed, 404) :
```json
{
  "errors" : "contact not found, dll"
}
```
## Search Contact

Request Header :

- X-API-TOKEN : Token (Mandatory)

Endpoint : GET /api/contacts

Query Parameters : 

- name : String, contact first name or last name, using like query, optional
- phone: String, contact phone, using like query, optional
- email : String, contact email, using like query, optional'
- page : INteger, start from 0, deafult 0 

[//]: # (kklo mau ada pagination / halaman)
- size : Integer, default 10

Response Body (success) :

```json
{
  "data": [
    {
      "id": "random-string",
      "firstName": "Andika Abadi",
      "lastName": "Pamungkas",
      "email": "244.aap@gmail.com",
      "phone": "0812329321"
    }
  ],
  "paging" : {
    "currentPage": 0,
    "totalPage": 10,
    "size": 10
  }
}
```

Response Body (Failed) :
```json
{
  "errors" : "unauthorized"
}
```

## Remove Contact

Request Header :

- X-API-TOKEN : Token (Mandatory)

Endpoint : DELETE /api/contacts/{idContact}

Response Body (success) :

```json
{
  "data" : "OK"
}
```

Response Body (Failed) : 
```json
{
  "errors" : "contact not found, dll"
}
```
