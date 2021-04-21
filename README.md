# zhaw-devops-project8-ci-jenkins

## Beschreibung
Dieses Projekt zeigt den Einsatz von Jenkins, einer webbasierten opensource Continous-Integration-Lösung. Das Ziel ist, für unser Path-Projekt, welches wir im Rahmen von Projekt 5 "unit tests" und Projekt 6 "code quality" mit wenig Java-Funktionalität und zugehörigen Tests erweitert haben, einen Jenkins-Build zu erstellen. Die vorhanden JUnit-Tests sollen in den Build integriert und mittels gradle Task test automatisiert auf dem Server ausgeführt werden. Zudem sollen die Test-Reports von JaCoCo und JUnit ausgeben werden. Dafür müssen auf der Jenkins-Instanz die entsprechenden Plugins installiert werden und eine sog. Post-Build Action hinzugefügt werden. Den Jenkins-Server installieren und betreiben wir über einen Docker Container.

## Mindestumfang der Aufgabe
* Docker und Jenkins aufsetzen
* Job für DevOpsPath erstellen (eigener Fork!)
* JUnit einbinden
* JaCoCo einbinden
* Anpassungen am Code/Tests vornehmen und Build jeweils erneut starten
* Dokumentation von Veränderungen
