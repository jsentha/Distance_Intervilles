public class DistanceInterville {
        public static void main (String[] args)
        {
            //Déclaration des variables
            String Depart, Arrivee, Continue;
            int Dep, Arr, Dist, i, a;
            boolean Finish = false, Valide = false, Valide2 = false;
            String Ville[] = {"Brest", "Grenoble", "Lille", "Lyon", "Marseille", "Nantes", "Paris", "Rennes", "Strasbourg", "Toulouse"};
            int Distance[][] = {{0,996,723,890,1286,305,564,245,1026,884},
                    {996,0,750,104,286,711,576,747,505,543},
                    {723,750,0,668,979,593,224,515,524,905},
                    {890,104,668,0,316,607,472,645,434,467},
                    {1286,286,979,316,0,890,769,938,750,400},
                    {305,711,597,607,890,0,386,106,832,559},
                    {564,576,224,472,769,386,0,348,447,681},
                    {245,747,515,646,938,106,348,0,799,665},
                    {1026,505,524,434,750,832,447,799,0,901},
                    {884,543,905,467,400,559,681,665,901,0}};

            // Présentation du proramme
            System.out.println();
            System.out.println("_______________________Bienvenue dans le programme Distance Inter-Villes_______________________");
            System.out.println("______________________Voici la liste des villes que vous pouvez choisir :______________________");
            System.out.println();

            for (i = 0; i < Ville.length; i++) {
                System.out.print(Ville[i] + " ; ");
            }

            System.out.println();
            System.out.println();

            while(!Finish)
            {
                //Saisie ville de départ
                Depart = Saisie.lire_String("Donnez votre ville de départ ? ");
                while(Valide != true)
                {
                    for(i = 0; i < Ville.length; i++)
                    {
                        if(Depart.equals(Ville[i]))
                        {
                            Valide = true;
                        }
                    }
                }

                //Saisie ville d'arrivée
                Arrivee = Saisie.lire_String("Donnez votre ville d'arrivée ? ");
                while(Valide2 != true)
                {
                    for(i = 0; i < Ville.length; i++)
                    {
                        if(Depart.equals(Ville[i]))
                        {
                            Valide2 = true;
                        }
                    }

                    if(Valide2 == false) Arrivee = Saisie.lire_String("Erreur, Donnez votre ville d'arrivée ? ");
                }


                // Initialisation de Dep et Arr
                Dep = 0;
                Arr = 0;

                // On compare la ville entrer avec notre liste pré défini
                for(a = 0; a<Ville.length; a++)
                {
                    if(Depart.equals(Ville[a]))
                    {
                        Dep = a;
                    }
                }

                for(a = 0; a<Ville.length; a++)
                {
                    if(Arrivee.equals(Ville[a]))
                    {
                        Arr = a;
                    }
                }

                //Pour ne pas se tromper dans le sens et donc avec les distances (de Paris à Lille est différent de Lille à Paris)
                if(Dep>Arr)
                {
                    Dist =Distance[Arr][Dep];
                    System.out.println("La distance entre "+Depart+" et "+Arrivee+" est de "+Dist+" km.");
                }
                else
                {
                    Dist =Distance[Dep][Arr];
                    System.out.println("La distance entre "+Depart+" et "+Arrivee+" est de "+Dist+" km.");
                }

                System.out.println();

                //Demande à l'utilisateur s'il veut continuer ou non
                Continue = Saisie.lire_String("Voulez-vous continuer ? (oui/non)");
                while(!Continue.equals("oui") && !Continue.equals("non"))
                {
                    Continue = Saisie.lire_String("Erreur, veuillez taper (oui/non) pour continuer.");
                }
                if(Continue.equals("non"))
                {
                    Finish = true;
                    System.out.println();
                    System.out.println("Fin du programme.");
                }
            }
        }
    }

}

