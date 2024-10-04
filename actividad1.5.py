import csv
import os.path as path
# Creación del fichero

if (path.exists("empleados1_5.txt")) != True:
    with open("empleados1_5.txt", "w") as f:
        f.write("Juan,Pons,Desarrollador,2500")
else:
    print("Leyendo ...\n")

# --------------Funciones------------
# Lista los empleados del fichero empleados1.5.txt

def leerFichero():
    with open("empleados1_5.txt", "r") as csv_file:
        csv_reader = csv.reader(csv_file)

    

def listarEmpleados():
    with open("empleados1_5.txt", "r") as csv_file:
        csv_reader = csv.reader(csv_file)
        for row in csv_reader:
            print("Nombre: " + row[0] + " " +  row[1])
            print("Cargo: " + row[2])
            print("Salario: " + row[3] + "\n")


def modificarSalario(nombre):
    empleado = list()
    with open("empleados1_5.txt", "r") as csv_file:
        csv_reader = csv.reader(csv_file)
        for row in csv_reader:
            if(nombre == row[0]):
                empleado = row

    print(empleado)
# listarEmpleados()
modificarSalario("Juan")

# Agrega un nuevo cliente y lo guarda en el fichero
# def agregarCliente():
#     datos = list()
#     print("Dime el dni")
#     datos.append(input())
#     print("Dime el nombre")
#     datos.append(input())
#     print("Dime el apellido")
#     datos.append(input())
#     print("Dime el telefono")
#     datos.append(input())

#     f = open("clientes_secuencial.txt", "a")
#     f.write("\n" + datos[0]+ "," + datos[1] + "," + datos[2] + "," + datos[3])
#     f.close()
#     print("Cliente creado")
#     print(datos[0]+ "," + datos[1] + "," + datos[2] + "," + datos[3])


# ----------------Main----------------
# Menu que se muestra al usuario
# salir = False
# while salir != True:
#     print("1. Listar clientes\n2. Agregar cliente\n3. Salir")
#     seleccionar = int(input())
#     print(seleccionar)
#     if seleccionar == 1: 
#         listarClientes()
#     elif seleccionar == 2:
#         agregarCliente()
#     elif seleccionar == 3:
#         salir = True