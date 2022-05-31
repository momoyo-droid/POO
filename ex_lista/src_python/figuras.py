import math

class Figura(object):
    def __init__(self, cor, filled) -> None:
        self.cor = cor
        self.filled = filled

class Quadrado(Figura):
    def __init__(self, cor, filled, lado) -> None:
        super().__init__(cor, filled)
        self.lado = lado
    
    def get_area(self):
        return self.lado*self.lado

    def get_perimetro(self):
        return 2*(self.lado+self.lado)

class Triangulo(Figura):
    def __init__(self, cor, filled, base, altura, lado_2, lado_3) -> None:
        super().__init__(cor, filled)
        self.altura = altura
        self.base = base
        self.lado_2 = lado_2
        self.lado_3 = lado_3
    
    def get_area(self):
        return (self.base*self.altura)/2

    def get_perimetro(self):
        return self.base + self.lado_2 + self.lado_3

class Circulo(Figura):
    def __init__(self, cor, filled, raio) -> None:
        super().__init__(cor, filled)
        self.raio = raio

    def get_area(self):
        return math.pi * self.raio * self.raio

    def get_perimetro(self):
        return 2 * math.pi * self.raio