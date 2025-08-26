import sys
#diccionario almacena los datos
cuentas = {
    "12345": {"contraseña": 6789, "saldo": 1000}
}
#se pide que se ingrese la cuenta con el input, esa cuenta se valida en el diccionario
def val_cue():
    while True:
        cuenta = input("\nTeclea tu cuenta: ")
        if cuenta not in cuentas:
            print("\nLa cuenta no existe, intenta de nuevo")
            continue
        intentos = 0
        while intentos < 3:
            try:
                contraseña = int(input("\nTeclea tu contraseña: "))
            except ValueError:
                print("El valor ingresado no es válido ")
                intentos += 1
                continue

            if cuenta in cuentas and cuentas[cuenta]["contraseña"] == contraseña:
                #cuentas se refiere al diccionario
                #[cuenta] se refiere a lo que hemos ingresado en input Teclea tu cuenta
                #Estos corchetes analizan si la cuenta que existe y su contraseña son iguales, sino, devuelve error
                print("\nAcceso correcto!")
                return cuenta
            #este return guarda la cuenta numerica en la variable cuenta durante el codigo
            #y permite el uso de esta en todo el codigo
            else:
                print("\nCuenta o contraseña incorrecta\n")
                intentos += 1
        print("\nCerrando cuenta...")
        sys.exit()

#cuenta se usa desde el return y es esa misma cuenta la que sera usada durante todo el codigo
def consul_saldo(cuenta):
    print(f"\nSu saldo es de: ${cuentas[cuenta]['saldo']}")
    return

def retirar_saldo(cuenta):
    print(f"\nSu saldo es: ${cuentas[cuenta]['saldo']}")
    retiro=float(input("Cuanto desea retirar?: "))
    if retiro <= cuentas[cuenta]['saldo']:
        cuentas[cuenta]['saldo']-=retiro
        print(f"\nHa retirado ${retiro}. Su saldo restante es: ${cuentas[cuenta]['saldo']}")
        return cuenta
    else:
        print("\nNo tienes fondos suficientes")
        return None


def depositar(cuenta):
    deposito = float(input("\nIngrese la cantidad a depositar: "))

    if deposito <= 0:
        print("\nIngrese un monto mayor a cero.")
        return None

    cuentas[cuenta]['saldo'] += deposito
    print(f"\nSe ha depositado a la cuenta {cuenta} la cantidad de {deposito}\nSu saldo es: ${cuentas[cuenta]['saldo']}")


cuenta = val_cue()
#se declara antes del while para que la cuenta que se ingrese sea la que se use durante todo el codigo
op=0
while op !=4:
    print("\nMenu\n")
    print("1. Consultar saldo\n2. Retirar dinero\n3. Depositar dinero\n4. Salir")
    op = int(input("\nTeclea tu opcion: "))
    match op:
        case 1:
             consul_saldo(cuenta)
        case 2:
            retirar_saldo(cuenta)
        case 3:
            depositar(cuenta)
        case 4:
            print("\nSaliendo...")
        case _:
            print("\nLa opcion no es valida")
