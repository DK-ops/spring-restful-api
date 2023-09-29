# Address API Spec

## Create Address

Endpoint : POST /api/contacts/{idContact}/addresses

Request Header :
- X-API-TOKEN : Token (Mandatory)

Request Body :

```json
{
  "street" : "Jalan",
  "city" : "kota",
  "province" : "provinsi ",
  "country" : "negara",
  "postal code" : "413"
}
```

Response Body (Success) :

```json
{
  "data" : {
    "id" : "random string",
    "street" : "Jalan",
    "city" : "kota",
    "province" : "provinsi ",
    "country" : "negara",
    "postal code" : "413"
  }
}
```
Response Body (Failed) :

```json
{
  "errors" : "gagal mmendapatkan alamat, itdka ada kontak, unauthorized, dll"
}
```
## Update Address

Endpoint : PUT /api/contacts/{idContact}/addresses/{idAddress}

Request Header :
- X-API-TOKEN : Token (Mandatory)

Request Body :

```json
{
  "street" : "Jalan",
  "city" : "kota",
  "province" : "provinsi ",
  "country" : "negara",
  "postal code" : "413"
}
```

Response Body (Success) :

```json
{
  "data" : {
    "id" : "random string",
    "street" : "Jalan",
    "city" : "kota",
    "province" : "provinsi ",
    "country" : "negara",
    "postal code" : "413"
  }
}
```
Response Body (Failed) :

```json
{
  "errors" : "gagal mmendapatkan alamat, itdka ada kontak, unauthorized, dll"
}
```
## Get Address

Endpoint : GET /api/contacts/{idContact}/addresses/{idAddress}

Request Header :
- X-API-TOKEN : Token (Mandatory)

Response Body (Success) :

```json
{
  "data" : {
    "id" : "random string",
    "street" : "Jalan",
    "city" : "kota",
    "province" : "provinsi ",
    "country" : "negara",
    "postal code" : "413"
  }
}
```
Response Body (Failed) :

```json
{
  "errors" : "gagal mmendapatkan alamat, itdka ada kontak, unauthorized, dll"
}
```
## Remove Address

Endpoint : DELETE /api/contacts/{idContact}/addresses/{idAddress}

Request Header :
- X-API-TOKEN : Token (Mandatory)

Response Body (Success) :

```json
{
  "data" : "OK"
  }

```
Response Body (Failed) :

```json
{
  "errors" : "gagal menghapus, dll"
}
```
## List Address

Endpoint : GET /api/contacts/{idContact}/addresses

Request Header :
- X-API-TOKEN : Token (Mandatory)

Response Body (Success) :

```json
{
  "data" : [{
    "id" : "random string",
    "street" : "Jalan",
    "city" : "kota",
    "province" : "provinsi ",
    "country" : "negara",
    "postal code" : "413"
  }
    ]
}
```
Response Body (Failed) :

```json
{
  "errors" : "Contact not found"
}
```