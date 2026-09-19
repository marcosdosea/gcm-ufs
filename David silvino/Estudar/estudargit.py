print("-------calculadora Git----------")
print("[1] - adição (+) ")
print("[2] - subtração (-) ")
print("[3] - multiplicação (×) ")
print("[4] - divisão (÷) ")
print("-------------------------")

valor1 = float(input("Primeiro valor:"))
valor2 = float(input("Segundo valor:"))

operacao = int(input("Digite a operacao da calculadora:"))

if (operacao == 1):
    print(f"Adição: {valor1 + valor2}")
if (operacao == 2):
    print(f"subtração:  {valor1 - valor2}")
if (operacao == 3):
    print(f"multiplicação:  {valor1 * valor2}") 
if (operacao == 4):
    print(f"Adidivisãoção:  {valor1 / valor2}")


