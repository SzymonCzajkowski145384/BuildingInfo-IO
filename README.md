# BuildingInfo-IO
Dla administratorów budynków, którzy pragną optymalizować koszty zarządzania budynkami  nasza aplikacja Building Info umożliwi pozyskanie informacji o parametrach budynku na poziomie pomieszczeń, kondygnacji oraz całych budynków. Aplikacja będzie dostępna poprzez GUI a także jako zdalne API dzięki czemu można ją zintegrować z istniejącymi narzędziami.

Struktura danych (do umieszczenia w pliku README.md)
• Lokacja to budynek, poziom, lub pomieszczenie

• Budynek może składać się z poziomów a te z pomieszczeń

• Każda lokalizacja jest charakteryzowana przez:

    o id – unikalny identyfikator
    
    o name – opcjonalna nazwa lokalizacji
   
• Pomieszczenie dodatkowo jest charakteryzowane przez:

    o area = powierzchnia w m^2
   
    o cube = kubatura pomieszczenia w m^3
   
    o heating = poziom zużycia energii ogrzewania (float)
   
    o light – łączna moc oświetlenia

