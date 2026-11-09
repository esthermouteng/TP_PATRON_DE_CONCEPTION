package Factory.Exemple_Modifie;

import Factory.Exemple_Modifie.ProduitModif.ProduitA;
import Factory.Exemple_Modifie.ProduitModif.ProduitB;
import Factory.Exemple_Modifie.ProduitModif.ProduitC;
import Factory.Exemple_Modifie.ProduitModif.ProduitD;

public abstract class ProduitFactory {

     public ProduitModif getProduit(){
        return createProduit();

    }
    protected abstract ProduitModif createProduit();
}

class ProduitFactoryA extends ProduitFactory {
  
    protected ProduitModif createProduit() {
      ProduitModif produit = null;
      produit = new ProduitA();
      return produit;
    }
}
class ProduitFactoryB extends ProduitFactory {
  
    protected ProduitModif createProduit() {
      ProduitModif produit = null;
      produit = new ProduitB();
      return produit;
    }
}
class ProduitFactoryC extends ProduitFactory {
  
    protected ProduitModif createProduit() {
      ProduitModif produit = null;
      produit = new ProduitC();
      return produit;
    }
}

class ProduitFactoryD extends ProduitFactory {
  
    protected ProduitModif createProduit() {
      ProduitModif produit = null;
      produit = new ProduitD();
      return produit;
    }
    
}
