# ProxyPattern 

#### Padrão de projeto que fornece um substituto ou espaço reservado para outro objeto, controla o acesso ao objeto original podendo realizar alterações antes ou depois do pedido chegar ao objeto original. 

## Como fazer? 

#### No padrão proxy você pode criar uma nova classe usando as mesmas interfaces do objeto do serviço original. Sua aplicação passa o novo objeto proxy para os clientes do objeto original  ao receber uma solicitação o proxy cria um objeto do serviço real e delega todo o serviço a ele. 

 

## Vantagens 

#### Você pode controlar o objeto do serviço sem os clientes ficarem sabendo. 

#### Você pode gerenciar o ciclo de vida de um objeto do serviço quando os clientes não se importam mais com ele. 

#### O proxy trabalha até mesmo se o objeto do serviço ainda não está pronto ou disponível. 

#### Princípio aberto/fechado. Você pode introduzir novos proxies sem mudar o serviço ou clientes. 

#### Desvantagens 

#### O código pode ficar mais complicado uma vez que você precisa introduzir uma série de novas classes. 

#### A resposta de um serviço pode ter atrasos. 
