# **Skupomat Pro** – System Zarządzania Punktem Skupu (SaaS)

### **Cel projektu**
Projekt ma na celu **całkowitą cyfryzację** procesów logistycznych i dokumentacyjnych w punktach skupu płodów rolnych. System rozwiązuje realne problemy regionów rolniczych, takie jak **ręczne rozliczanie opakowań** oraz brak integracji z nowymi systemami podatkowymi.

---

### **Kluczowe funkcjonalności (W fazie rozwoju)**
* 📑 **Integracja z API KSeF**: Automatyczne generowanie i wysyłka e-faktur w formacie **XML (FA2)** do rządowego środowiska testowego.
* 📦 **Gospodarka Opakowaniami**: Moduł śledzenia salda **kartonów zwrotnych** w czasie rzeczywistym, zintegrowany z wystawianiem dokumentów zakupu.
* 📅 **Zarządzanie Kolejkami**: System rezerwacji **slotów czasowych** dla dostawców, mający na celu optymalizację przepustowości punktu skupu.
* 📱 **Panel Mobilny**: Responsywny interfejs dla rolników z podglądem **aktualnych cen skupu** oraz historią faktur w formacie **PDF**.

---

### **Stack Techniczny**
* **Backend**: Java 21, **Spring Boot 3.4**, Spring Security (**JWT**), Spring Data JPA.
* **Frontend**: **React 18**, Tailwind CSS, Vite.
* **Baza danych**: **PostgreSQL** (z naciskiem na integralność transakcyjną relacji dostawa-opakowanie).
* **Narzędzia**: Maven, Docker, Axios, **jsPDF**.

---

### **Założenia**
* **Spójność danych (ACID)**: Wykorzystanie transakcji bazodanowych w celu wyeliminowania błędów przy jednoczesnym generowaniu faktury i aktualizacji salda opakowań.
* **Mobile-First Design**: Optymalizacja interfejsu pod kątem urządzeń mobilnych dla użytkowników pracujących w terenie.
* **Skalowalność**: Architektura przygotowana pod obsługę wielu punktów skupu w modelu **SaaS**.

---
### Architektura Bazy Danych

Poniższy diagram ERD przedstawia strukturę relacyjnej bazy danych PostgreSQL, zaprojektowaną na potrzeby systemu Skupomat:

![Schemat Bazy Danych](database_schema.png)


### **Roadmap projektu**

#### **Faza 1: Architektura i Fundamenty (Infrastruktura)**
- [x] **Modelowanie dziedziny**: Opracowanie schematu bazy danych (ERD) uwzględniającego relacje ACID dla dostaw i opakowań.
- [x] **Setup technologiczny**: Konfiguracja projektu (Spring Boot 3.4, React+Vite) oraz środowiska Docker dla PostgreSQL.
- [ ] **Security**: Implementacja Spring Security z obsługą bezstanowej autoryzacji **JWT** (podział na role: Admin/Dostawca).

#### **Faza 2: Moduł Logistyczny i Gospodarka Magazynowa**
- [ ] **Ewidencja Opakowań**: Budowa silnika przeliczającego saldo kartonów zwrotnych w oparciu o historię transakcji dostawcy.
- [ ] **System Rezerwacji (Sloty)**: Implementacja logiki blokowania terminów dostaw z walidacją przepustowości punktu skupu.
- [ ] **Panel Administracyjny**: CRUD dla cenników produktów (papryka, inne warzywa) z natychmiastową aktualizacją dla użytkowników.

#### **Faza 3: Integracje i Finanse (KSeF & Dokumentacja)**
- [ ] **Generator XML (FA2)**: Mapowanie danych z bazy do struktury wymaganej przez Ministerstwo Finansów.
- [ ] **Integracja z API KSeF**: Obsługa sesji interaktywnej, podpisu i asynchronicznego pobierania Urzędowego Poświadczenia Odbioru (**UPO**).
- [ ] **Moduł PDF**: Generowanie dokumentów PZ (Przyjęcie Zewnętrzne) oraz faktur pro-forma po stronie klienta (jsPDF).

#### **Faza 4: Jakość i Deployment**
- [ ] **Testy automatyczne**: Pokrycie logiki biznesowej testami jednostkowymi (JUnit/Mockito) oraz integracyjnymi.
- [ ] **Optymalizacja Mobile**: Prace nad UX/UI w celu zapewnienia pełnej responsywności dla rolników pracujących w terenie.
- [ ] **CI/CD**: Konfiguracja automatycznego wdrożenia na darmowy hosting (np. Vercel/Render).

---
