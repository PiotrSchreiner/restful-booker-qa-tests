# 🏨 restful-booker-qa-tests

## 🚧 Projekt-Status: Work In Progress (WIP)

Dieses Repository befindet sich im aktiven Aufbau und wurde auf das Playwright-Framework migriert. Derzeit liegt der Fokus auf der Implementierung robuster **End-to-End (E2E)** und **API-Tests** in einem einheitlichen Stack.

## 🎯 Zweck des Projekts

Dieses Repository dient als dedizierte **Quality Assurance (QA) Test-Suite** für die **Restful-Booker API Platform**.

Es demonstriert die Implementierung der **Test-Pyramide**, wobei **API- und E2E-Tests** im selben Playwright/Node.js-Ökosystem implementiert werden.

## 🛠️ Technologien

Die Tests werden mit folgenden Technologien entwickelt und ausgeführt:

- **Node.js**
- **Playwright** (Für E2E- und API-Tests)
- **TypeScript** (Für robuste und wartbare Tests)
- **npm** (Package Management)

## ✅ Test-Übersicht (Initialer Zustand)

| Test-Szenario          | Typ | Status     | Anmerkung                                                      |
| :--------------------- | :-- | :--------- | :------------------------------------------------------------- |
| **Basic Health Check** | API | 🟡 Pending | Erster Test, der mit Playwright-API-Tests implementiert wird.  |
| **Authentication**     | API | 🟡 Pending | Erstellung des Tokens für CRUD-Operationen.                    |
| **Login-Prozess**      | E2E | 🟡 Pending | UI-Interaktionstests zur Verifizierung der Benutzeroberfläche. |

## 🚀 Ausführung der Tests

Voraussetzung ist, dass die **Restful-Booker Platform** lokal auf **Port 3000** läuft.

1.  **Voraussetzung:** Installieren Sie die Abhängigkeiten:
    ```bash
    npm install
    ```
2.  **Ausführung:** Starten Sie alle konfigurierten Tests:

    ```bash
    npx playwright test
    ```
