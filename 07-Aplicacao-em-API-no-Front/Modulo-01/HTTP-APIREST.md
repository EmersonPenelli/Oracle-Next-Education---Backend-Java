# HTTP - APIREST e Comunicação Web

Ao trabalhar com o Spring Web estamos subindo um servidor em uma porta do nosso computador. Mas o que é um servidor?

Servidor é justamente algo que oferta recursos aos clientes. No nosso caso, o recurso ofertado serão as séries que estão no nosso banco de dados. Ofertamos esses recursos com o uso da nossa API, ou “Interface de Programação de Aplicações”, traduzindo a sigla.

Para que isso seja possível, precisamos usar o Spring Web como dependência da nossa aplicação. Com isso, ao contrário de como era feito anteriormente, o Spring “starta” automaticamente um servidor TomCat na porta 8080, o que facilita o trabalho da pessoa desenvolvedora.

Estamos desenvolvendo uma API que irá se comunicar com o mundo externo através do protocolo HTTP. Caso queira se aprofundar mais nesse protocolo, recomendamos o curso HTTP: entendendo a web por baixo dos panos.

Uma vez que entendemos a relação entre servidor e cliente e conhecemos o HTTP, precisamos pensar em como os nossos dados serão transmitidos.

Durante o curso, trabalharemos com uma API REST(Representational State Transfer, ou Transferência de Estado Representacional). Quando falamos desse conceito, estamos nos referindo a um conjunto de princípios de arquitetura que especificam como solicitações e respostas devem ser construídas em uma API.

Os dados em uma API REST são geralmente enviados e recebidos no formato JSON (JavaScript Object Notation). No entanto, eles também podem ser enviados em outros formatos, como XML.

A arquitetura REST sugere o uso de métodos HTTP padronizados para executar tarefas específicas, incluindo:

* GET para obter dados,
* POST para enviar novos dados,
* PUT para atualizar dados existentes,
* DELETE para remover dados.

Tendo um padrão, a comunicação fica muito mais eficiente. Além disso, as APIs REST devem ser stateless, o que significa que as solicitações do cliente podem ser processadas independentemente umas das outras. Isso as torna altamente escaláveis, facilitando a vida dos desenvolvedores que trabalham em grandes projetos web, pois facilita o gerenciamento, a manutenção e o teste do software.
