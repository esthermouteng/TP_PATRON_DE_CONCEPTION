public abstract  class Produit {

    public abstract void methodeproduit();

}

    class ProduitA extends Produit {
       public  ProduitA(){
       }
        
         public void methodeproduit (){
            System.out.println("Je suis un produit de typeA");
            System.out.println("ProduitA.methoProduit()");
         }
       }

        class ProduitB extends Produit{
         public void methodeproduit(){
              System.out.println("Je suis un produit de typeB");
            System.out.println("ProduitB.methoProduit()");
         }
       }

        class ProduitC extends Produit{
         public void methodeproduit(){
              System.out.println("Je suis un produit de typeC");
            System.out.println("ProduitC.methoProduit()");
         }
       }

       class ProduitD extends Produit{
         public void methodeproduit(){
            System.out.println("Je suis un produit de typeD");
            System.out.println("ProduitD.methoProduit()");
         }
       }
    

