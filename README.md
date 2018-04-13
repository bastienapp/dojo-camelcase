# Convertir vers camelCase

Ecrire une méthode qui convertit une chaine en camelCase : pratique qui consiste à écrire un ensemble de mots en les liant sans espace ni ponctuation, et en mettant en capitale la première lettre de chaque mot, excepté le premier mot qui commence par une minuscule.

Exemples :

* "a" > "a"
* "a b" > "aB"
* "suite de mots" > "suiteDeMots"
* "tExTE mAl fICHu" > "texteMalFichu"

Tu peux connaître la longueur d'une chaîne avec la méthode length(), par exemple : machaine.length(), si machaine contient "abcd", retournera 4.

Tu peux trouver le caractère d'une chaîne à une position particulière avec la méthode charAt(), par exemple : machaine.charAt(3) te donnera la quatrième lettre (car ça commence à zéro). Si machaine contient "abcd", le retour sera donc 'd'.

Rappel des commande junit :

    javac -cp .:junit-4.12.jar CamelCaseTest.java
    java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore CamelCaseTest
