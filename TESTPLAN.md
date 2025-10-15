# Testkonzeption: Restful Booker Plattform

## 1. Testziele

Das Hauptziel dieses QA-Projekts ist die Validierung der Qualität der Restful Booker Plattform und die Etablierung einer CI/CD-fähigen Testautomatisierung.

- Sicherstellung der Funktionsfähigkeit der zentralen Business-Workflows (Zimmerbuchung, Login, Nachrichtenmanagement).
- Etablierung einer stabilen, unabhängigen und wartbaren Automatisierungshülle.
- Demonstration der QA-Fähigkeiten in den Bereichen Testdesign, Automatisierung und CI-Integration.

## 2. Testebenen (Scope)

Das Testprojekt wird folgende Ebenen umfassen:

| Ebene                      | Fokus                                                                                          | Tool/Technik                                     |
| :------------------------- | :--------------------------------------------------------------------------------------------- | :----------------------------------------------- |
| **API-Tests**              | Kernfunktionalität und Business-Logik der Microservices (Auth, Booking, Room).                 | Java/RestAssured oder ähnliches                  |
| **UI-Tests**               | Benutzerfreundlichkeit und End-to-End-Workflow über das Frontend (`http://localhost`).         | Selenium/Cypress/Playwright                      |
| **Deployment-Validierung** | Sicherstellen, dass die Plattform-Umgebung korrekt hochfährt und alle Dienste erreichbar sind. | Docker Compose Healthchecks / einfache API-Pings |
