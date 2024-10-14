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
def listarEmpleados():
    with open("empleados1_5.txt", "r") as csv_file:
        csv_reader = csv.reader(csv_file)
        for row in csv_reader:
            print("Nombre: " + row[0] + " " +  row[1])
            print("Cargo: " + row[2])
            print("Salario: " + row[3] + "\n")


def agregarEmpleado():
    datos = list()
    datos.append(input("Dime el Nombre: "))
    datos.append(input("Dime el Apellido: "))
    datos.append(input("Dime el Cargo: "))
    datos.append(input("Dime el Salario: "))
    with open("empleados1_5.txt", "a") as f:
        f.write("\n" +datos[0]+ "," + datos[1] + "," + datos[2] + "," + datos[3])
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
        empleado[3] = str(nuevoSalario)
        empleados.append(empleado)
        # Reescribe el archivo original y hace los cambios 
        with open("empleados1_5.txt", "w") as file:
            for em in empleados:
                file.write(",".join(em) + "\n")
    else:
        print("No se ha encontrado al empleado")

    print(empleados)
# listarEmpleados()
# modificarSalario("Juan", 3000)
agregarEmpleado()


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