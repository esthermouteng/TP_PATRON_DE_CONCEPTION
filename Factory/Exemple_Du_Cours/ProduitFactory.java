package Factory.Exemple_Du_Cours;

import Factory.Exemple_Du_Cours.Produit.ProduitA;
import Factory.Exemple_Du_Cours.Produit.ProduitB;
import Factory.Exemple_Du_Cours.Produit.ProduitC;

public abstract class ProduitFactory {

    public Produit getProduit(){
        return createProduit();

    }
    protected abstract Produit createProduit();
}

class ProduitFactoryA extends ProduitFactory {
  
    protected Produit createProduit() {
      Produit produit = null;
      produit = new ProduitA();
      return produit;
    }
}
class ProduitFactoryB extends ProduitFactory {
  
    protected Produit createProduit() {
      Produit produit = null;
      produit = new ProduitB();
      return produit;
    }
}
class ProduitFactoryC extends ProduitFactory {
  
    protected Produit createProduit() {
      Produit produit = null;
      produit = new ProduitC();
      return produit;
    }
}


