### Interfaces et Implémentations

1. **IDao** (interface):
   - Définit une méthode `getData()` qui sera implémentée par des classes accédant à des sources de données.

2. **DaoImpl** (implémentation de IDao):
   - Implémente la méthode `getData()` en fournissant des données à partir d'une base de données.

3. **IMetier** (interface):
   - Définit une méthode `calcul()` qui sera implémentée par des classes exécutant des calculs sur des données.

4. **MetierImpl** (implémentation de IMetier):
   - Implémente la méthode `calcul()` en utilisant une instance de IDao pour récupérer des données et effectuer un calcul.

### Injection de dépendances

Dans la classe **MetierImpl**, la dépendance à IDao est injectée via un setter, ce qui permet de modifier l'implémentation de IDao sans modifier le code de MetierImpl lui-même. Cela favorise un faible couplage entre les classes.

### Injection des dépendances

Dans la classe **Pres1**, l'injection des dépendances est réalisée par instanciation statique :
- Une instance de **DaoImpl** est créée.
- Une instance de **MetierImpl** est créée.
- La dépendance de MetierImpl à IDao est injectée en appelant `setDao()` avec l'instance de DaoImpl.
- Le calcul est effectué à l'aide de MetierImpl.

### Extensions et Maintenance

Une extension potentielle est illustrée avec **DaoImpl2** :
- **DaoImpl2** est une nouvelle implémentation de IDao, fournissant des données à partir de services web.
- L'utilisation de DaoImpl2 peut être introduite dans Pres1 sans modifier MetierImpl, démontrant ainsi l'ouverture à l'extension et la facilité de maintenance.
