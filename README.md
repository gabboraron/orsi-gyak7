# GY7
Készíts olyan chat alkalmazást, amelyben a két kliensnek nem kell egymásra várnia soronként, hanem bármikor beszélhetnek egymáshoz, és ez azonnal kiíródik a másik kliensnél.

- Készíts chat szervert, amelyhez tetszőleges számú kliens kapcsolódhat, illetve bármikor bonthatják is a kapcsolatot. Minden kliens először a nevét közli egy sorban. A kliensek bármikor beszélhessenek, ami azonnal íródjon ki minden kapcsolódott kliensnél.

- A szerver, ha két parancssori paramétert kap, akkor a megadott gépen/porton levő másik szerverhez kapcsolódik, és névként “kliens” szerver nevet küld át; ebből a másik szerver tudja, hogy szerver kapcsolódott hozzá. A rendszer továbbra is működjön chat-szerverként, azaz bármelyik szerver bármelyik kliense üzenetét kapja meg mindegyik olyan kliens, aki a rendszerbe tartozik.
