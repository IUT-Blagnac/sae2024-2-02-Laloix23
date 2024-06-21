
def RLE(chaine):
    if len(chaine) == 0:
        return ""

    resultat = ""
    compteur = 1
    premier_caractere = chaine[0]
    longueur = len(chaine)

    for i in range(1, longueur):
        if chaine[i] == premier_caractere:
            compteur += 1
            if compteur == 9:
                resultat += str(compteur) + premier_caractere
                compteur = 0
        else:
            if compteur > 0:
                resultat += str(compteur) + premier_caractere
            premier_caractere = chaine[i]
            compteur = 1

    if compteur > 0:
        resultat += str(compteur) + premier_caractere

    return resultat


def unRLE(chaine):
    resultat = ""
    i = 0
    longueur = len(chaine)

    while i < longueur:
        caractere = chaine[i]

        if caractere.isdigit():
            nombre = int(caractere)
            caractere_suivant = chaine[i + 1]
            resultat += nombre * caractere_suivant
            i += 2
        else:
            resultat += caractere
            i += 1

    return resultat

def unRLEit(chaine, iteration):
    resultat = chaine
    for i in range(iteration):
        resultat = unRLE(resultat)
    return resultat

def RLEit(chaine, iteration):
    resultat = chaine
    for i in range(iteration):
        resultat = RLE(resultat)
    return resultat


