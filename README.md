# MyWorkday - Task Management System

Ein intelligentes Task-Management-System für die Arbeitsplanung zwischen 9:00 und 17:00 Uhr.

## Projektstruktur

```
myworkday-monorepo/
├── backend/           # Spring Boot REST API
├── frontend/          # React Dashboard (wird in Übung 5 erstellt)
├── e2e-tests/         # Playwright End-to-End Tests (wird in Übung 7 erstellt)
├── docs/              # User Stories und Dokumentation
└── README.md          # Diese Datei
```

## Backend (Spring Boot)

### Funktionalitäten
- CRUD-Operationen für Tasks (`/tasks`)
- Intelligente Task-Empfehlung (`/nextTask`)
- H2 In-Memory-Datenbank
- JPA/Hibernate für Persistierung

### Task-Modell
```java
public class Task {
    private Long id;
    private String description;
    private Boolean isCompleted;
    private Effort maxEffortHrs;  // ONE_HOUR(1), TWO_HOURS(2), FOUR_HOURS(4)
}
```

### Starten des Backends
```bash
cd backend
./gradlew bootRun
```

API erreichbar unter: `http://localhost:8080`

## Frontend (React Dashboard)

*Wird in Übung 5 implementiert*

- Anzeige der nächsten empfohlenen Task
- Hintergrundbild von Flickr
- Task-Completion-Funktionalität

## End-to-End Tests (Playwright)

*Wird in Übung 7 implementiert*

- Automatisierte Browser-Tests
- User Journey Testing
- API-Integration Tests

## Entwicklung

### Voraussetzungen
- Java 11+ 
- Node.js 16+ (für Frontend und E2E-Tests)
- Git

### Lokale Entwicklung
```bash
# Backend starten
cd backend
./gradlew bootRun

# Frontend starten (nach Übung 5)
cd frontend  
npm start

# E2E-Tests ausführen (nach Übung 7)
cd e2e-tests
npm test
```

## Architektur

### Backend-Architektur
```
Controller → Service → Repository → Database
     ↓         ↓          ↓           ↓
TaskController → TaskService → TaskRepository → H2
```

### Intelligente Task-Empfehlung
1. **Optimale Zeit**: Größte Task die bis 17:00 Uhr schaffbar ist
2. **Fallback**: Kleinste verfügbare Task wenn keine optimal passt
3. **Leer-Zustand**: Entsprechende Antwort wenn alle Tasks erledigt

## User Stories

Siehe `docs/` Verzeichnis für detaillierte User Stories der Übungen 1-7.

## Schulungsübungen

- **Übung 1-2**: Backend-Grundlagen (Task CRUD, JPA)
- **Übung 3**: Service-Layer Integration
- **Übung 4**: Intelligente Task-Empfehlung
- **Übung 5**: React Frontend Dashboard
- **Übung 6**: Flickr-Integration und Styling
- **Übung 7+**: End-to-End Tests mit Playwright

## Technologie-Stack

### Backend
- Spring Boot 3.x
- Spring Data JPA
- H2 Database
- Gradle
- JUnit 5

### Frontend
- React 18
- Create React App
- Fetch API
- CSS3

### Testing
- JUnit (Backend)
- Playwright (E2E)
- Jest (Frontend Unit Tests)

## API-Endpunkte

### Tasks
- `GET /tasks` - Alle Tasks abrufen
- `POST /tasks` - Neue Task erstellen
- `GET /tasks/{id}` - Spezifische Task abrufen
- `PUT /tasks/{id}` - Task aktualisieren
- `DELETE /tasks/{id}` - Task löschen

### Intelligente Empfehlung
- `GET /nextTask` - Nächste empfohlene Task basierend auf aktueller Zeit

## Lizenz

MIT License - siehe LICENSE Datei.

## Entwickelt für

T-Systems Onsite Services GmbH - Onsite Academy  
Schulung: "Kollaborative KI-Programmierung"
