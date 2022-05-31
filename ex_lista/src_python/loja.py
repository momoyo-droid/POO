class Produto(object):
    def __init__(self, nome, cod_barras) -> None:
        self.nome = nome
        self.cod_barras = cod_barras

class Livro(Produto):
    def __init__(self, nome, cod_barras, autor) -> None:
        super().__init__(nome, cod_barras)
        self.autor = autor

class CD(Produto):
    def __init__(self, nome, cod_barras, genero) -> None:
        super().__init__(nome, cod_barras)
        self.genero = genero


class DVD(Produto):
    def __init__(self, nome, cod_barras, genero) -> None:
        super().__init__(nome, cod_barras)
        self.genero = genero

class Loja(object):
    def __init__(self) -> None:
        self.lista_prod = []
        self.max = 200
        self.conta = 0

    def bota_prod(self, prod):
        if self.conta < 200:
            self.lista_prod.append(prod)
            
        self.conta += 1
    
    def vende_prod(self, prod):
        conta = 0
        for i in self.lista_prod:
            if prod.cod_barras == i.cod_barras:
                self.lista_prod.pop(conta)
            conta +=1
        
    def ver_estoque(self):
        qtd_livros = 0
        qtd_cds = 0
        qtd_dvds = 0

        for i in self.lista_prod:
            if i.__class__.__name__ == "Livro":
                qtd_livros += 1
            if i.__class__.__name__ == "CD":
                qtd_cds += 1
            if i.__class__.__name__ == "DVD":
                qtd_dvds += 1

        print(f"Qtd Livros: {qtd_livros}")
        print(f"Qtd CDs:    {qtd_cds}")
        print(f"Qtd DVDs:   {qtd_dvds}")
