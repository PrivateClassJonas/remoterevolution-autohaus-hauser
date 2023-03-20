SHOWIDCOMMAND OLD:
        /*if (!fahrzeuge.isEmpty()) {
            System.out.println("Wie lautet die Fahrzeug-ID?");
            int id = 0;
            String id_text = scanner.nextLine();
            try {
                id = Integer.parseInt(id_text);
                for (Kraftfahrzeug kraftfahrzeug : fahrzeuge) {
                    if (id <= fahrzeuge.size() && id > 0) {
                        if (kraftfahrzeug.getID() == id) {
                            if (kraftfahrzeug instanceof Auto)
                                System.out.println("Fahrzeug Typ: Auto, System-ID: " + kraftfahrzeug.getID());
                            else if (kraftfahrzeug instanceof Motorrad)
                                System.out.println("Fahrzeug Typ: Motorrad, System-ID: " + kraftfahrzeug.getID());

                            System.out.println("Fahrzeug Marke: " + kraftfahrzeug.getMarke());
                            System.out.println("Fahrzeug Bezeichnung: " + kraftfahrzeug.getBezeichnung());
                            break;
                        }
                    } else {
                        System.out.println("Es ist kein Fahrzeug mit der ID: " + id + " vorhanden!");
                    }
                }
            } catch (NumberFormatException nfe) {
                System.out.println(id_text + " ist keine gültige ID!");
            }
            return true;
        }**/

SHOW OLD
/* if (!fahrzeuge.isEmpty()) {
            String newline = System.getProperty("line.separator");
            for (Kraftfahrzeug kraftfahrzeug : fahrzeuge) {
                if (kraftfahrzeug instanceof Auto)
                    System.out.println("Fahrzeug Typ: Auto, System-ID: " + kraftfahrzeug.getID());
                else if (kraftfahrzeug instanceof Motorrad)
                    System.out.println("Fahrzeug Typ: Motorrad, System-ID: " + kraftfahrzeug.getID());

                System.out.println("Fahrzeug Marke: " + kraftfahrzeug.getMarke());
                System.out.println("Fahrzeug Bezeichnung: " + kraftfahrzeug.getBezeichnung() + newline);
            }
        } else {
            System.out.println("Noch keine Fahrzeuge vorhanden!");
        }**/