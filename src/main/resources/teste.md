<h1>Existem seis tipos de cascades (CascadeType) na especificação do JPA  São eles:</h1> 

* ALL = Realiza todas as operações em cascata
* DETACH = Realiza a operação detach em cascata
* MERGE = Realiza a operação merge em cascata
* PERSIST = Realiza a operação persist em cascata
* REFRESH = Realiza a operação refresh em cascata
* REMOVE = Realiza a operação remove em cascata
Realizar operações em cascata só faz sentido em relacionamentos Pai - Filho (a transição do estado da entidade Pai sendo realizada em cascata na entidade Filho). Por mais que seja permitido mapear o cascade no sentido inverso (Filho - Pai) não é muito útil e não pode ser considerado uma boa prática.


        Está correta a explicação de funcionamento desses tipos de cascade?

        Quando o MERGE é executado, ele também persiste os filhos caso eles ainda não tenham sido persistidos.
        REFRESH não salva, mas atualiza a entidade com as informações do banco.
        
        Mapeamento com mappedBy deve-se colocar o cascade apenas no objeto pai?
        É boa prática que as operações em cascata sejam feitas de pai para filho, e não o contrário, apesar de ser válido.
        

        Encontrei referências de cascade DETACH e LOCK, como eles funcionam?
        Cascade DETACH faz com que a operação detach, quando executada no pai, também seja executada no filho. Dizemos que uma entidade é detached quando ela não está sendo gerenciada pelo EntityManager. Isso acontece quando exectamos o método detach(entidade) do EntityManager, quando a transação é comitada ou dá rollback.
        Cascade LOCK não faz parte do JPA mas sim do Hibernate. Basicamente quando você adquirir um lock na entidade pai, essa operação será realizada também nos filhos.