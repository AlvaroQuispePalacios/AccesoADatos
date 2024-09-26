import os
import csv
# Crear un archivo y escribir en el
file = open("clientes_secuencial.txt", "w")
file.write("12345678,Joan,Gonzalez,654321789\n" + "87654321,Ana,Martinez,987654321\n" + "13579246,Lluís,Rodriguez,564738291\n" + "24681357,Maria,Perez,987654765")
file.close()

# f = open("clientes_secuencial.txt", "r")
with open("clientes_secuencial", "r") as csv_file:
    csv_reader = csv.DictReader(csv_file, delimiter=",")
    
# for i in range(4):
#     texto = f.readline()
#     if "2" in texto:
#         print("Se ha encontrado al usuario " + texto)
#     else :
#         print("No se ha encontrado al usuario")


# f.close()

