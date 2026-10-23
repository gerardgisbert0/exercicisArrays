Exercici 1

INICI

DEFINIR  dades COM ARRAY DE 5 ENTERS

PER i DES DE 0 FINS A 4
llegir dades[i]
FI_PER
PER i DES DE 0 FINS A 4
ESCRIURE i, “:”, dades[i]
FI_PER

    ESCRIURE "Longitud: ", dades.lenght
    ESCRIURE "Primer valor: ", dades[0]
    ESCRIURE "Últim valor: ", dades[4]
FI

Exercici 2

INICI

    DEFINIR dades COM ARRAY DE 6 ENTERS

    PER i DES DE 0 FINS A 5
        LLEGIR dades[i]
    FI_PER

    PER i DES DE 5 FINS A 0
        ESCRIURE dades[i]
    FI_PER

    PER i DES DE 0 FINS A 5
        ESCRIURE dades[i]
    FI_PER
FI

Exercici10

INICI
DEFINIR a COM ARRAY DE 5 ENTERS
DEFINIR b COM ARRAY DE 5 ENTERS
DEFINIR resultat COM ARRAY DE 5 ENTERS

    PER i DES DE 0 FINS A 4
        LLEGIR a[i]
    FI_PER

    PER i DES DE 0 FINS A 4
        LLEGIR b[i]
    FI_PER

    PER i DES DE 0 FINS A 4
        resultat[i] <- a[i] + b[i]
    FI_PER

    ESCRIURE "Array a:"
    PER i DES DE 0 FINS A 4
        ESCRIURE a[i]
    FI_PER

    ESCRIURE "Array b:"
    PER i DES DE 0 FINS A 4
        ESCRIURE b[i]
    FI_PER

    ESCRIURE "Array resultat:"
    PER i DES DE 0 FINS A 4
        ESCRIURE resultat[i]
    FI_PER
FI
