# 📝 Testkonzeption: Restful Booker Plattform

## 1. Testziele

Das Hauptziel dieses QA-Projekts ist die Validierung der Qualität der Restful Booker Plattform und die Etablierung einer **CI/CD-fähigen, vereinheitlichten Testautomatisierung** mit Playwright.

- **Funktionsfähigkeit:** Sicherstellung der Funktionsfähigkeit der zentralen Business-Workflows (Zimmerbuchung, Login, Nachrichtenmanagement).
- **Wartbarkeit:** Etablierung einer stabilen, unabhängigen und wartbaren Automatisierungshülle in **TypeScript**.
- **CI-Effizienz:** **Effiziente CI-Integration** durch Nutzung von GitHub Actions Service Containern zur optimalen Ausführung der Tests.

---

## 2. Testebenen (Scope)

Das Testprojekt nutzt **Playwright** als das **einheitliche Framework** für alle Testebenen, wodurch der Technologie-Stack vereinfacht wird.

| Ebene                         | Fokus                                                                                          | Tool/Technik                                                                     |
| :---------------------------- | :--------------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------- |
| **API-Tests**                 | Kernfunktionalität und Business-Logik der Microservices (Auth, Booking, Room).                 | **Playwright API Testing** (TypeScript)                                          |
| **E2E/UI-Tests**              | Benutzerfreundlichkeit und End-to-End-Workflow über das Frontend (`http://localhost`).         | **Playwright E2E Testing** (TypeScript)                                          |
| **Deployment/CI-Validierung** | Sicherstellen, dass die Plattform-Umgebung korrekt hochfährt und alle Dienste erreichbar sind. | **GitHub Actions Service Container** (mit Health Checks) & **`wait-on`** Utility |

---

## 3. Technologie-Stack

Der neue Stack basiert vollständig auf der Node.js-Umgebung, um eine nahtlose Integration von API- und UI-Tests zu gewährleisten.

| Bereich             | Technologie              | Anmerkung                                                       |
| :------------------ | :----------------------- | :-------------------------------------------------------------- |
| **Test Framework**  | **Playwright**           | Einheitliche Plattform für API und E2E-Tests.                   |
| **Sprache**         | **TypeScript / Node.js** | Moderne, typsichere Basis für wartbaren Code.                   |
| **Paketmanagement** | **npm**                  | Paketverwaltung (`npm ci`) und Skript-Runner.                   |
| **CI/CD-Engine**    | **GitHub Actions**       | Automatische Ausführung der Tests (mit **Service Containern**). |
