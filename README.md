# enset-inc-2
 
<h1> PARTIE 2 : </h1>
 
<p>
 Dans cette partie on va créer un projet maven a l'aide du framexork Spring boot.
 On utilise les même classes et packages du projet enset_inc (https://github.com/zakariaelidrissi/enset_ico/tree/master).
</p>
 
<h3> étape 1 : </h3>
 
<p>On va intégrer la dépendance de spring-core dans le projet dans le fichier pom.xml</p>
 
![image](https://user-images.githubusercontent.com/61559275/162491937-b90f7c44-406b-43ff-819c-9cfa569bce7f.png)

<p>
 On ajoute aussi les dépendances spring-context et spring-beans dans le même fichier
</p>
 
![image](https://user-images.githubusercontent.com/61559275/162492671-d1c11e73-a290-4038-b3ca-7fba580d67d8.png)

<h3> étape 2 : </h3>
 
<h4> Version XML : </h4>
 
<p>
 Dans cette étape on va créer un fichier xml qu'on appelle appicationContext dans le package resources
</p>
 
<p> voici le fichier : </p>
 
![image](https://user-images.githubusercontent.com/61559275/162493376-786f7bed-544d-41d4-bb5f-7898a54d8d5d.png)

<h3> étape 3 : </h3>
 
<p>
 puis on va créer une classe principal qu'on appelle PresSpringXML dans le package pres.
</p>
 
![image](https://user-images.githubusercontent.com/61559275/162494008-2234145b-09d4-4348-9b56-6cc4496a0470.png)

<p> 
 On exécute le projet et on obtient le même résultat de le projet enset_inc (https://github.com/zakariaelidrissi/enset_ico/tree/master).
</p>
 
![image](https://user-images.githubusercontent.com/61559275/162494570-97376305-5bec-4182-a03c-edecd8cc82b7.png)

<h3> étape 4 : </h3>
 
<h4> Version Annotation : </h4>
 
<p>
 On ajoute dans la classe DaoImpl la notation <mark>@component()</mark> qui prend on paramétre le nom de l'instanciation la classe DaoImpl.
</p>
 
![image](https://user-images.githubusercontent.com/61559275/162495391-c92d569e-d76b-4e65-91ad-d3ffcec3fae7.png)

<p>
 On utilise aussi la même chose à la classe MetierImpl.
</p>

<p>
 Et après pour faire l'injection de dépendance il faut utiliser la nnotation <mark>@Autowired</mark>
</p>
 
<p>
 On créer un autre classe principal qu'on appelle PresSpringAnnotation 
</p>
 
<p> On éxecute le progit et on obtient : </p> 
 
![image](https://user-images.githubusercontent.com/61559275/162496637-2edcce8c-d10f-46f4-b1a4-4ec8501e5983.png)

 <p>
  Puis , on ajoute la notion @Qualifier dans le fichier IMetier.java qui prmmet d'injecter l'istance qu'on veut: -Pour injecté l'istance dao
 </p>
 
![image](https://user-images.githubusercontent.com/61559275/172963614-53137e22-95bc-422b-bf53-09fd50165f5c.png)

<p> Voici le résultat après l'execution </p>

![image](https://user-images.githubusercontent.com/61559275/172963412-99c91f51-3df2-4656-9c0d-0d71aa425a26.png)

<p> Et finalement , on a fait l'injection par constructeur </p>

![image](https://user-images.githubusercontent.com/61559275/172963658-bd26782e-5cb5-46fb-a38b-490dbc37043f.png)

<p> Voici le resultat après l'execution </p>

![image](https://user-images.githubusercontent.com/61559275/172963742-7393bb2d-8a1c-498f-96ab-03400ed5c0aa.png)




 
 
 
