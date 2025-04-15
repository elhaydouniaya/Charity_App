# 🌍 Charity_App

Une plateforme caritative en ligne développée avec **Spring Boot**, **Thymeleaf** et **MySQL**, qui met en relation les donateurs et les associations à travers des campagnes de dons transparentes et accessibles.

---

## 📌 Fonctionnalités principales

- 🔍 Consultation des campagnes de dons actives
- 🧩 Gestion des organisations caritatives
- 🧑‍💻 Interface utilisateur dynamique avec **Thymeleaf**
- 💾 Base de données relationnelle (**MySQL**)
- 📦 Architecture MVC, DTOs, pagination
- 🎨 Interface soignée avec Bootstrap

---

## 🧠 Architecture technique

- **Backend** : Spring Boot (Java)
- **Frontend** : Thymeleaf + HTML/CSS
- **Base de données** : MySQL
- **ORM** : Spring Data JPA
- **Architecture** : MVC, DTOs, services découplés

---

## 🗃️ Base de données (Schéma)

| Table        | Description                       |
|--------------|-----------------------------------|
| `users`      | Donateurs / administrateurs       |
| `organisations` | Organisations caritatives     |
| `campaigns`  | Campagnes de dons                 |
| `donations`  | Historique des dons               |

---

## 🚀 Lancer le projet

### 1. Prérequis :
- Java 17+
- Maven
- MySQL installé

### 2. Création de la base :
```sql
CREATE DATABASE charity_db;
