# JSON

JSON (JavaScript Object Notation) é um formato utilizado para representação de informações, assim como XML e CSV.

Uma API precisa receber e devolver informações em algum formato, que representa os recursos gerenciados por ela. O JSON é um desses formatos possíveis, tendo se popularizado devido a sua leveza, simplicidade, facilidade de leitura por pessoas e máquinas, bem como seu suporte pelas diversas linguagens de programação.

Um exemplo de representação de uma informação no formato XML seria:
```
<produto>
    <nome>Mochila</nome>
    <preco>89.90</preco>
    <descricao>Mochila para notebooks de até 17 polegadas</descricao>
</produto>
```

Já a mesma informação poderia ser represetada no formato JSON da seguinte maneira:
```
{
    "nome" : "Mochila",
    "preco" : 89.90,
    "descricao" : "Mochila para notebooks de até 17 polegadas"
}
```

Perceba como o formato JSON é muito mais compacto e legível. Justamente por isso se tornou o formato universal utilizado em comunicação de aplicações, principalmente no caso de APIs REST.
