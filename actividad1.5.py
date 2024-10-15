import csv
import os.path as path
from faker import Faker
import random

# LLena el fichero con datos
def llenador():
    fake = Faker()
    file = open("empleados1_5.txt","a")
    i = 0
    while(i!=1000):
        i = i + 1
        fake = Faker()
        nombre = fake.name()
        job = fake.job()
        num = random.randint(1200,5000)
        resultado = nombre+","+job+","+str(num)+"\n"
        file.write(resultado)

    print("hecho")
    file.close()

# Creación del fichero
if (path.exists("empleados1_5.txt")) != True:
    llenador()
else:
    print("Leyendo ...\n")

# --------------Funciones------------
def listarEmpleados():
    with open("empleados1_5.txt", "r") as csv_file:
        csv_reader = csv.reader(csv_file)
        for row in csv_reader:
            print("Nombre: " + row[0])
            print("Cargo: " + row[1])
            print("Salario: " + row[2] + "\n")


def agregarEmpleado():
    datos = list()
    datos.append(input("Dime el Nombre: "))
    datos.append(input("Dime el Apellido: "))
    datos.append(input("Dime el Cargo: "))
    datos.append(input("Dime el Salario: "))
    with open("empleados1_5.txt", "a") as f:
        f.write(datos[0] + " "+ datos[1] + "," + datos[2] + "," + datos[3] + "\n")
    print("Empleado creado correctamente")


def modificarSalario(nombre, nuevoSalario):
    empleado = list()
    empleados = list()
    with open("empleados1_5.txt", "r") as csv_file:
        csv_reader = csv.reader(csv_file)
        for row in csv_reader:
            if nombre in row:
                empleado = row
            else:
                empleados.append(row)

    # Si el empleado existe hace los cambios
    if empleado:
        empleado[2] = str(nuevoSalario)
        empleados.append(empleado)
        # Reescribe el archivo original y hace los cambios 
        with open("empleados1_5.txt", "w") as file:
            for em in empleados:
                file.write(",".join(em) + "\n")
    else:
        print("No se ha encontrado al empleado")


# ----------------Main----------------
# Menu que se muestra al usuario
salir = False
while salir != True:
    print("1. Listar empleados\n2. Agregar empleado\n3. Modificar salario\n4. Salir")
    seleccionar = int(input())
    print(seleccionar)
    if seleccionar == 1: 
        listarEmpleados()
    elif seleccionar == 2:
        agregarEmpleado()
    elif seleccionar == 3:
        nombre = input("Dime el nombre del empleado: ")
        salario = input("Dime el nuevo salario: ")
        modificarSalario(nombre, salario)
    elif seleccionar == 4:
        salir = True
        