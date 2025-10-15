# 🏨 restful-booker-qa-tests

## 🚧 Projekt-Status: Work In Progress (WIP)

Dieses Repository befindet sich im aktiven Aufbau. Derzeit ist der Fokus auf die Validierung des grundlegenden API-Health-Checks gelegt. Die komplexeren Tests (z.B. Authentifizierung, CRUD-Operationen) sind in der Entwicklung und derzeit deaktiviert.

## 🎯 Zweck des Projekts

Dieses Repository dient als dedizierte **Quality Assurance (QA) Test-Suite** für die **Restful-Booker API Platform**.

Es demonstriert Best Practices im Bereich API-Automatisierung und gewährleistet die Funktionsfähigkeit und Stabilität der einzelnen Endpunkte.

## 🛠️ Technologien

Die Tests werden mit folgenden Technologien entwickelt und ausgeführt:

- **Java 17+**
- **Apache Maven** (Build-Management)
- **RestAssured** (HTTP-Client für API-Tests)
- **JUnit 5** (Test-Framework)

## ✅ Test-Übersicht

| Test-Szenario            | Endpunkt       | Status          | Anmerkung                                                                                             |
| :----------------------- | :------------- | :-------------- | :---------------------------------------------------------------------------------------------------- |
| **Basic Health Check**   | `GET /booking` | **🟢 Success**  | Verifiziert die Erreichbarkeit der Basis-Funktionalität.                                              |
| **Authentication Tests** | `POST /auth`   | **🟡 Disabled** | Tests sind vorhanden, aber vorübergehend deaktiviert (@Disabled) für den aktuellen Entwicklungsstand. |

## 🚀 Ausführung der Tests

Voraussetzung ist, dass die **Restful-Booker Platform** lokal auf **Port 3000** läuft.

1.  **Voraussetzung:** Navigiere zum Wurzelverzeichnis des Projekts.
2.  **Ausführung:** Starte die Tests mit Maven:

    ```bash
    mvn test
    ```
