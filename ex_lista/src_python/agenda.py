class Agenda:
    def __init__(self, name, address, email) -> None:
        self.name = name
        self.address = address
        self.email = email
        self.list_ = []

    def __add__(self,person):
        self.list_.append(person)

    def __display__(self):
        for person in self.list_:
            print("Nome:",self.name)
            print("Endereco:",self.address)
            print("Email:",self.email)
            print("CPF:",*self.CPF)
            print("Data nasc:",*self.birth_date)
            print("Estado Civil:",self.marital_status)

    def __pop__(self, person) -> None:
        print("Lista atual:\n")
        self.__display__()
        if person in self.list_:
            conta = 0
            for i in self.list_:
                if person == i:
                    self.list_.pop(conta)
                conta+=1

        print("Lista atualizada:\n")
        self.__display__()

    def ordena_lista(self) -> None:
        lista_pf= []
        lista_pj = []
        lista_per = []

        for i in self.list_:
            if i.__class__.__name__ == "PessoaFisica":
                lista_pf.append(i)
            elif i.__class__.__name__ == "PessoaJuridica":
                lista_pj.append(i)
            else: 
                lista_per.append(i)

        self.insertion_sort(lista_pf)
        self.insertion_sort(lista_pj)
        self.list_ = lista_pf + lista_pj + lista_per
        
    def insertion_sort(self, arr):
        for i in range(1, len(arr)):
            
            key = arr[i]
            j = i-1
            while j >= 0 and key.get_id() < arr[j].get_id() :
                    arr[j + 1] = arr[j]
                    j -= 1
            arr[j + 1] = key

class PessoaFisica(Agenda):
    def __init__(self, name, address, email, CPF, birth_date, marital_status):
        super().__init__(name, address, email)
        self.CPF = CPF
        self.birth_date = birth_date
        self.marital_status = marital_status
    
    def get_id(self):
        return int(self.CPF)

class PessoaJuridica(Agenda):
    def __init__(self, name, address, email, CNPJ, st_subscribe, r_social):
        super().__init__(name, address, email)
        self.CNPJ = CNPJ
        self.st_subscribe = st_subscribe
        self.r_social = r_social
    
    def get_id(self):
        return int(self.CNPJ)

def display_menu() -> None:
    print("1. Adicionar Pessoa Fisica\n2. Adicionar Pessoa Juridica\n3. Remover")
    print("4. Pesquisar")
    print("5. Mostrar agenda\n")

def loop_menu(op) -> None:
    print("Ajudo em algo mais? Y/N")
    answer = input()
    if answer == "Y":
        display_menu()
    elif answer == "N":
        print("Agenda finalizada!")
        exit(0)
    else:
        print("Opcao invalida! Digite novamente a opcao desejada:\n")
        answer = input()

def pf_data() -> None:
    name = input("Digite o nome:\n")
    address = input("Digite o endereco:\n")
    email = input("Digite o email:\n")
    CPF = input("Digite seu CPF:\n")
    birth_date = input("Digite sua Data de Nascimento:\n")
    marital_status = input("Estado Civil:\n")
    pf_obj = PessoaFisica(name, address, email, CPF, birth_date, marital_status)
    pf_obj.__add__(pf_obj)

def pj_data() -> None:
    name = input("Digite o nome:\n")
    address = input("Digite o endereco:\n")
    email = input("Digite o email:\n")
    CNPJ = input("Digite seu CNPJ:\n")
    st_subscribe = input("Digite sua Inscricao Social:\n")
    r_social = input("Razao Social:\n")
    pj_obj = PessoaJuridica(name, address, email, CNPJ, st_subscribe, r_social)
    pj_obj.__add__(pj_obj)    

def main():
    print("Bem-vinde a Agenda\n")
    display_menu()


    pj_obj = 0
    pf_obj = 0

    while True:
        op = int(input())
        if op == 1:
            pf_data()
        elif op == 2:
            pj_data()
        elif op == 3:
            print("Digite nome ou CPF/CNPJ\n")
            person = input()
            rem = Agenda(person, None, None)
            rem.__pop__(person)
        loop_menu(op)
if __name__ == "__main__":
    main()
