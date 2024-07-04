# TPs

**TP1 : Convertisseur de température**
Créez une classe `Convertisseur` avec deux méthodes :
- `celsiusVersfahrenheit(double celsius)` : convertit Celsius en Fahrenheit
- `fahrenheitVersCelsius(double fahrenheit)` : convertit Fahrenheit en Celsius

Formules :
- C = (F - 32) * 5/9
- F = C * 9/5 + 32

Exemple d'exécution :
```
20°C = 68°F
68°F = 20°C
```

**TP2 :  Calculateur de factorielle**
Créez une méthode `factorielle(int n)` qui calcule la factorielle d'un nombre n.

Exemple d'exécution :
```
Factorielle de 5 = 120
Factorielle de 0 = 1
```

**TP 3.: Vérificateur de nombre parfait**
Créez une méthode `estNombreParfait(int n)` qui retourne `true` si n est un nombre parfait, `false` sinon. Un nombre parfait est égal à la somme de ses diviseurs propres (diviseurs positifs autres que lui-même).

Exemple d'exécution :
```
6 est un nombre parfait
28 est un nombre parfait
12 n'est pas un nombre parfait
```
**TP 4: Vérificateur de nombre pair/impair**
Créez une méthode `estPair(int n)` qui retourne `true` si n est pair, `false` s'il est impair.

Exemple d'exécution :
```
4 est pair
7 est impair
```

**TP5 :  Compteur de nombres pairs dans un tableau**
Créez une méthode `nombresPairsTableau(int[] tableau)` qui retourne le nombre d'éléments pairs dans le tableau.

Exemple d'exécution :
```
Tableau : [1, 2, 3, 4, 5, 6, 7, 8]
Nombre de nombres pairs : 4
```

**TP6 : Coordonnées**
On vous donne comme argument un tableau contenant des chaînes de directions (haut, bas, gauche, droite). Imaginez une personne debout sur une grille au point 0, 0. Pour chaque direction dans le tableau de chaînes, déplacez votre personne dans cette direction sur la grille. Retournez le point final X,Y où se trouve la personne sous la forme d'un tableau de deux entiers.

Exigences
Doit retourner un tableau de deux entiers


Exemple d'exécution :

`maMethode(["haut", "haut", "bas", "gauche", "gauche", "droite", "haut"])`

Résultat :
> [-1, 2]

**TP7 : Recherche nombre**

Écrire un programme Java qui demande à l'utilisateur de remplir un tableau d'entiers à partir du clavier.

Puis le programme devra lui demander d'entrer un nombre à rechercher dans le tableau.

Si nombre existe, le programme lui dira que le nombre existe et le nombre de fois qu'ils se retrouve dans le tableau
Sinon le programme lui dira que le nombre recherché n'existe pas dans le tableau

**Exemple d'exécution :**

```
tableau saisi à partir du clavier : 12,45,6,7,12,23,33,6,22,3,6
->Entrer un nombre à rechercher : 6
->6 existe et se retrouve 3 fois dans le tableau
```