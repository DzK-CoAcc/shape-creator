#  ShapeCreator
* als Factory


## Ablauf
1. Projekt clone
git clone https://github.com/michacim/shape-creator
2. neuen Branch erzeugen (feature branch)
git switch -c feature/shadow_circle
3. git branch (anzeigen)
4. neuen Creator erzeugen z.B. ShadowCircle  - ausführen/testen
5. git add . und git commit 
6. neuen Branch verknüpfen: git push -u origin feature/shadow_circle
    >> ab jetzt genügt immer git push 
7. git status

    >> wenn feature fertig, dann Pullrequest
8. Pullrequest im github 
9. wenn erfolgreich, dann kann man branch löschen
   * im github (remote)
   * lokal: vorher auf master wechseln switch master
## nach erfolgreichem Merge
git switch master
git pull origin master
git branch -d my_feature_branch
git push origin --delete my_feature_branch