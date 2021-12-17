# BuildingInfo-IO ![example workflow](https://github.com/SzymonCzajkowski145384/BuildingInfo-IO/actions/workflows/maven.yml/badge.svg)
Dla administratorów budynków, którzy pragną optymalizować koszty zarządzania budynkami  nasza aplikacja Building Info umożliwi pozyskanie informacji o parametrach budynku na poziomie pomieszczeń, kondygnacji oraz całych budynków. Aplikacja będzie dostępna poprzez GUI a także jako zdalne API dzięki czemu można ją zintegrować z istniejącymi narzędziami.

### Struktura danych

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

### Opis działania

- [POST] /buildings - umożliwia dodanie listy budynków.
Przykładowy input:
```json
[
    {
        "id": 1,
        "name": "A",
        "floors": [
            {
                "id": 1,
                "name": "A",
                "rooms": [
                    {
                        "id": 1,
                        "name": "a",
                        "area": 100.0,
                        "cube": 20.0,
                        "heating": 10.0,
                        "light": 5.0
                    },
                    {
                        "id": 2,
                        "name": "a",
                        "area": 60.0,
                        "cube": 20.0,
                        "heating": 10.0,
                        "light": 5.0
                    }
                ]
            },
            {
                "id": 2,
                "name": "B",
                "rooms": [
                    {
                        "id": 1,
                        "name": "b",
                        "area": 100.0,
                        "cube": 20.0,
                        "heating": 10.0,
                        "light": 5.0
                    },
                    {
                        "id": 2,
                        "name": "b",
                        "area": 60.0,
                        "cube": 20.0,
                        "heating": 10.0,
                        "light": 5.0
                    }
                ]
            }
        ]
    }
]
```

- [GET] /buildins - wyświtla listę pwszystkich budynków
- [DELETE] /buildings - usuwa wszystkie budynki
- [GET] /area/{id1} - wyświetla pole budynku o podanym id1
- [GET] /area/{id1}/{id2} - wyświetla pole piętra o id2 w budynku id1
- [GET] /area/{id1}/{id2}/{id3} - wyświetla pole pomieszczenia o id3 na piętrze o id2 w budynku id1
- [GET] /cube/{id1} - wyświetla kubature budynku o podanym id1
- [GET] /cube/{id1}/{id2} - wyświetla kubature piętra o id2 w budynku id1
- [GET] /cube/{id1}/{id2}/{id3} - wyświetla kubature pomieszczenia o id3 na piętrze o id2 w budynku id1
- [GET] /light/{id1} - wyświetla oświetlenie budynku o podanym id1
- [GET] /light/{id1}/{id2} - wyświetla oświetlenie piętra o id2 w budynku id1
- [GET] /light/{id1}/{id2}/{id3} - wyświetla oświetlenie pomieszczenia o id3 na piętrze o id2 w budynku id1
- [GET] /heating/{id1} - wyświetla poziom zużycia energii budynku o podanym id1
- [GET] /heating/{id1}/{id2} - wyświetla poziom zużycia energii piętra o id2 w budynku id1
- [GET] /heating/{id1}/{id2}/{id3} - wyświetla poziom zużycia energii pomieszczenia o id3 na piętrze o id2 w budynku id1
- [GET] /wrong/{norm} - wyświetla pomieszczenia, które przekraczają podany limit (norm)
