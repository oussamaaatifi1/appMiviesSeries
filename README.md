# MovieSeriesTV Backend Application

## Contexte du projet

La chaîne de télévision internationale MovieSeriesTV a sollicité la startup OroJacksonTech pour développer une application web permettant à son audience de visionner les films et séries produits par la chaîne. Le Product Owner a confié la mission de créer une application backend bien structurée et fonctionnelle. L'application devra être évolutive et facile à maintenir.

## Utilisateur User Stories

### Consultation de contenu

1. **Afficher la Liste des Films**
   - **En tant qu'utilisateur**, je veux voir une liste de tous les films disponibles avec leurs titres, dates de sortie, genres, réalisateurs et notes, afin de trouver rapidement un film à consulter ou à regarder.

2. **Afficher la Liste des Séries**
   - **En tant qu'utilisateur**, je veux voir une liste de toutes les séries disponibles avec leurs titres, dates de début et de fin, genres, créateurs et notes, afin de trouver rapidement une série à consulter ou à regarder.

### Gestion des Favoris

1. **Ajouter un Film ou une série aux Favoris**
   - **En tant qu'utilisateur**, je veux pouvoir ajouter un film ou une série à mes favoris, afin de le retrouver facilement plus tard.
   - **Critères d'acceptation** : 
     - Un bouton "Ajouter aux favoris" est disponible sur la page de chaque film.
     - Le film est ajouté à une liste de favoris personnelle après clic.

2. **Voir la Liste des Films ou Séries**
   - **En tant qu'utilisateur**, je veux voir une liste de tous les films et séries disponibles avec leurs titres, dates de sortie, genres, réalisateurs et notes, afin de trouver rapidement un film ou une série à consulter ou à regarder.
   - **Critères d'acceptation** :
     - La liste affiche tous les films avec les détails mentionnés.
     - Les films peuvent être triés par différents critères (titre, date de sortie, note).

3. **Voir les Détails d'un Film ou une Série**
   - **En tant qu'utilisateur**, je veux pouvoir cliquer sur un film ou une série pour voir ses détails complets, y compris la liste des acteurs et une bande-annonce (si disponible), afin d'obtenir des informations plus approfondies sur le film ou la série.
   - **Critères d'acceptation** :
     - Un clic sur un film ou une série affiche une page de détails avec toutes les informations pertinentes.
     - Les acteurs et la bande-annonce (si disponible) sont inclus dans les détails.

## Travail à faire

### Initialisation du Projet

1. Créer un nouveau projet Spring Boot en utilisant Spring Initializr avec les dépendances nécessaires : Spring Web, Spring Data JPA, Lombok, MySQL/PostgreSQL.
2. Configurer le fichier `application.properties` pour se connecter à la base de données (choisir entre MySQL et PostgreSQL).

### Définition des composants

1. **Définition des Modèles (Model)**
2. **Création des DAO/Repositories**
3. **Définition des DTO (Data Transfer Object)**
4. **Implémentation des Services**
5. **Création des Contrôleurs REST (REST Controller)**

### Tests des API avec Postman

1. Créer des collections de requêtes dans Postman pour tester chaque endpoint (afficher la liste des films, ajouter aux favoris, etc.).
2. Tester les différents cas d'utilisation (succès, erreur, etc.) et vérifier que les réponses sont conformes aux attentes.

## Structure du projet

├── src/
│ ├── main/
│ │ ├── java/com/orojacksontech/movieseriestv/
│ │ │ ├── controller/
│ │ │ ├── model/
│ │ │ ├── repository/
│ │ │ ├── service/
│ │ │ └── dto/
│ │ └── resources/
│ │ └── application.properties
│ └── test/
│ └── java/com/orojacksontech/movieseriestv/
├── .gitignore
├── pom.xml
└── README.md


## Configuration de la base de données (application.properties)

```properties
# Exemple pour MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/movieseriestv
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

# Exemple pour PostgreSQL
# spring.datasource.url=jdbc:postgresql://localhost:5432/movieseriestv
# spring.datasource.username=postgres
# spring.datasource.password=yourpassword
# spring.jpa.hibernate.ddl-auto=update
