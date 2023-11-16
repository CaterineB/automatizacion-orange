#Proyecto de pruebas y cargado en Github
#27/01/2020
#Jhonatan Medina Blanco
Feature: Yo como usuario valido login
Scenario: Login exitoso
	Given abrir el navegador
	When el usuario diligencia usuario <userName>

	Examples:
	|userName|
	|Jhonatan|

