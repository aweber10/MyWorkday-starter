# MyWorkday Starter

Ein Starter-Projekt für ein Task-Management-System. Das Backend stellt eine REST-API bereit, das Frontend zeigt ein Dashboard zur Task-Verwaltung.

## Projektstruktur

```
myworkday-starter/
├── backend/           # Spring Boot REST API
├── frontend/          # React Dashboard  
├── e2e-tests/         # End-to-End Tests
└── README.md          # Diese Datei
```

## Schnellstart

### Backend starten
```bash
cd backend
./gradlew bootRun
```
Backend läuft unter: `http://localhost:8080`

### Frontend starten
```bash
cd frontend
npm install
npm start
```
Frontend läuft unter: `http://localhost:3000`

## Vorhandene Features

### Backend (Spring Boot)
- ✅ CRUD-Operationen für Tasks (`/tasks`)
- ✅ H2 In-Memory-Datenbank
- ✅ JPA/Hibernate Setup
- ✅ Task-Modell mit Effort-Enum (ONE_HOUR, TWO_HOURS, FOUR_HOURS)

### Frontend (React)
- ✅ React-App mit Create React App
- ✅ API-Proxy für Backend-Zugriff (konfiguriert in package.json)
- ✅ Basic Dashboard-Komponente

## Noch zu implementieren

### Backend
- **Intelligente Task-Empfehlung**: `/nextTask` Endpoint für optimale Arbeitsplanung
- **Erweiterte Geschäftslogik**: Task-Auswahl basierend auf Arbeitszeit (9:00-17:00)

### Frontend
- **Task-Dashboard**: Anzeige der nächsten empfohlenen Task
- **Task-Completion**: Tasks als erledigt markieren
- **Hintergrundbild-Integration**: Dynamische Bilder von externen APIs
- **UI/UX-Verbesserungen**: Styling und Benutzerfreundlichkeit

### Testing
- **End-to-End Tests**: Automatisierte Browser-Tests mit Playwright

## API-Proxy (Frontend ↔ Backend)

Das React-Frontend ist bereits für CORS-freie Backend-Kommunikation konfiguriert:
- **Proxy in package.json**: `"proxy": "http://localhost:8080"`
- **API-Aufrufe**: Verwende relative URLs wie `/tasks` statt `http://localhost:8080/tasks`

## Voraussetzungen

- Java 11+
- Node.js 16+
- Git
