public  class  NivelAcucar {
     int nivel = 3;

     public void alteraNivelAcucar(int quantidadeAcucar){
         if (quantidadeAcucar >= 0 && quantidadeAcucar <=5){
             this.nivel = quantidadeAcucar;
         }
     }

     public int mostraNivelAcucar(){
         return this.nivel;
     }
}


