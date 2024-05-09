# CRUD: Create Read Update Delete 
Azioni che si devono poter svolgere su una base dati.
### Nel DB:
- Film(DB): id, titolo, anno, rating, regista
## In Java:
- ### Film:
*variabili*: id(int), titolo (String), anno (int), rating (int), regista (String) 

|Nome |Tipo Valore|           
|----|-----------|            
|id|int|                     
|titolo|String|
|anno|int|
|rating|int|
|regista|String|

*metodi*:  getters, setters e ToString

|Nome metodo|Restituisce|
|-----------|-----------|
|Getters|void|
|Setters|void|
|ToString|void|


- ### Connessione:
*variabili*: URL (String), USER (String), PASS (String), conn (Connection) 
  
| Nome    | Tipo Valore |
  |---------|-------------|
  | URL     | String      |
  | USER    | String      |
  | PASS    | String      |
  | conn    | Connection  |

*metodi*: connetti() (void), getConn() (Connection)

| Nome metodo | Restituisce |
|-------------|-------------|
| connetti()  | void        |
| getConn()   | Connection  |

- ### FilmDAO
*variabili*: miaConn (Connessione), statement (Statement), risultati (ResultSet) 
  
 | Nome      | Tipo Valore |
  |-----------|-------------|
  | miaConn   | Connection  |
  | statement | Statement   |
  | risultati | ResultSet   |

*metodi*:  getters, setters, ToString, getFilms() (ArrayList), addFilm(Film f) (void)

|Nome metodo|Restituisce|
|-----------|-----------|
|Getters|void|
|Setters|void|
|ToString|void|
|getFilms()|ArrayList|
|addFilm(Film f)|void|
