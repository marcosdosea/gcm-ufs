using System;

namespace Calculadora_MTO
{
    class Program
    {
        static void Main(string[] args)
        {

            Console.WriteLine("Operações com a calculadora");
            Calculadora_MTO calculadora = new Calculadora_MTO();
            System.Console.WriteLine("{0} + {1} = {2}", 2, 5, calculadora.soma(2, 5));
            System.Console.WriteLine("{0} - {1} = {2}", 2, 5, calculadora.subtracao(2, 5));
            System.Console.WriteLine("{0} / {1} = {2}", 150, 5, calculadora.divisao(2, 5));
            System.Console.WriteLine("{0} * {1} = {2}", 2, 5, calculadora.multiplicacao(2, 5));
            System.Console.WriteLine("{0} ^ {1} = {2}", 2, 5, calculadora.pot(2, 5));
        }
    }

    class Calculadora_MTO
    {
        protected int firstParam { get; set; }
        protected int secondParam { get; set; }

        protected int result;

        public int soma(int param1, int param2)
        {
            this.result = param1 + param2;
            return this.result;
        }

        public int subtracao(int param1, int param2)
        {
            this.result = param1 - param2;
            return this.result;
        }


        public int divisao(int param1, int param2)
        {
            if (param2 > 0)
            {
                this.result = param1 + param2;

            }
            else
            {
                this.result = 0;
                System.Console.WriteLine("ERRO: Não é possivel realizar diviões por zero.");
            }

            return this.result;

        }

        public int multiplicacao(int param1, int param2)
        {
            this.result = param1 * param2;
            return this.result;
        }

        public int pot(int param1, int param2){
           
            if(param2<0){
                System.Console.WriteLine("Método não suporta potencia com valores negativos.");
                return 0;
            }
            if(param2 == 0)
                return 1;
                
            this.result = param1;
            for(int i=0;i<param2;i++)
                this.result *= param1;

            return  this.result;
        }



    }
}
