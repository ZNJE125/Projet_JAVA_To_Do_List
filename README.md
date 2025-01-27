# Projet_JAVA_To_Do_List
application to do list :


le code de l'API Java se trouve dans le dossier structure.

- 27/01/2025 - Création de la table tasks dans la base de donnée TASK sur SQLServeur.

le type boolean ne marchant pas avec sql serveur, c'est le type bit qui le remplace. La valeur par défault 0 equivaut a faux.

un trigger a été crée pour qu'en cas de mise a jour d'un enregistrement, la date de mise a jour soit mise a jour automatiquement a la date actuel.

- 27/01/2025 - Ajout d'une entité tasks Java pour faire la correspondance avec la table tasks sql.
