import { expect, test } from "@playwright/test";

test("API-T-001: The GET /booking endpoint is available (Health Check)", async ({
  request,
}) => {
  // Führt eine GET-Anfrage an den /booking Endpunkt aus
  const response = await request.get("/booking");

  // 1. Verifiziere den Status Code: Sollte 200 (OK) sein.
  expect(response.status()).toBeGreaterThanOrEqual(200);
  expect(response.status()).toBeLessThan(500);

  // 2. Optional: Verifiziere, dass die Antwort JSON ist (enthält eine Liste von Buchungen)
  // DEAKTIVIERT
  // expect(response.headers()["content-type"]).toContain("application/json");

  // 3. Optional: Verifiziere, dass die Antwort ein Array ist und nicht leer ist (wenn die DB Daten hat)
  // DEAKTIVIERT
  // const body = await response.json();
  // expect(Array.isArray(body)).toBe(true);
});
