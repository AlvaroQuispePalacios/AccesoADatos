import os
import csv

class Cliente:
    dni = ""
    nombre = ""
    apellido = ""
    telefono = ""

    def __init__(self, dni, nombre, apellido, telefono):
        self.dni = dni
        self.nombre = nombre
        self.apellido = apellido
        self.telefono = telefono

# --------------Funciones------------
def listarClientes():
    with open("clientes_secuencial.txt", "r") as csv_file:
        csv_reader = csv.reader(csv_file)
        for row in csv_reader:
            print(row)

def agregarCliente():
    datos = list()
    print("Dime el dni")
    datos.append(input())
    print("Dime el nombre")
    datos.append(input())
    print("Dime el apellido")
    datos.append(input())
    print("Dime el telefono")
    datos.append(input())

    f = open("clientes_secuencial.txt", "a")
    f.write("\n" + datos[0]+ "," + datos[1] + "," + datos[2] + "," + datos[3])
    f.close()
    print("Cliente creado")
    print(datos[0]+ "," + datos[1] + "," + datos[2] + "," + datos[3])


# ----------------Main----------------
# Menu que se muestra al usuario
salir = False
while salir != True:
    print("1. Listar clientes\n2. Agregar cliente\n3. Salir")
    seleccionar = int(input())
    print(seleccionar)
    if seleccionar == 1: 
        listarClientes()
    elif seleccionar == 2:
        agregarCliente()
    elif seleccionar == 3:
        salir = True