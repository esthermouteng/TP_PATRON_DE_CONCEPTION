package Factory.Exemple_Du_Cours;

public class Client {
    public static void main (String [] args){
        System.out.println("........Methode2: Abstract factory.......");

        ProduitFactory produitFactoryA = new ProduitFactoryA();
        ProduitFactory produitFactoryB = new ProduitFactoryB();
        ProduitFactory produitFactoryC = new ProduitFactoryC();
        Produit produit = null;

        produit = produitFactoryA.getProduit();
        produit.methodeProduit();

         produit = produitFactoryB.getProduit();
        produit.methodeProduit();

         produit = produitFactoryC.getProduit();
        produit.methodeProduit();
        
        
        

    }
    
}
