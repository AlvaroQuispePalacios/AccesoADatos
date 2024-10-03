import os
import csv
# Crear un archivo y escribir en el los datos
file = open("clientes_secuencial.txt", "w")
file.write("12345678,Joan,Gonzalez,654321789\n" + "87654321,Ana,Martinez,987654321\n" + "13579246,Lluis,Rodriguez,564738291\n" + "24681357,Maria,Perez,987654765")
file.close()


# Lee los datos del archivo y hace una busquedad por DNI
dni = "87654321"
with open("clientes_secuencial.txt", "r") as csv_file:
    csv_reader = csv.reader(csv_file)
    for row in csv_reader:
        if(row[0] == dni):
            # Prueba de cambio
            print("Cliente encontrado:")

            for data in row:
                print(data)
            break
        else: 
            print("Cliente no encontrado")