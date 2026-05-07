📚 Sistema de Biblioteca (Console - Java)
📌 Sobre o Projeto

Este projeto é uma aplicação em Java desenvolvida para simular o gerenciamento de empréstimos de uma biblioteca via console.

A proposta aqui não é só “fazer funcionar”, mas estruturar código de forma organizada, aplicando conceitos fundamentais como:

Programação orientada a objetos (POO)
Manipulação de listas
Separação de responsabilidades
Interação com o usuário
🎯 Objetivo

Desenvolver um sistema que permita:

Visualizar livros disponíveis
Realizar empréstimos
Registrar usuários
Controlar disponibilidade dos livros
⚙️ Como o Sistema Funciona
🔁 Fluxo principal
Início
O sistema inicia em loop perguntando se o usuário deseja ver os livros disponíveis
Listagem
Caso a resposta seja SIM, o sistema lista apenas livros disponíveis
Empréstimo
O usuário escolhe um livro pelo id
Informa seu nome
O sistema registra o empréstimo
O livro passa a ficar indisponível
Encerramento
Caso a resposta seja NÃO (ou após empréstimo)
O sistema exibe uma mensagem e finaliza
🧱 Estrutura do Projeto
📖 Classe Livro
id
titulo
autor (Autor)
disponivel
dataCadastro
dataAtualizacao
✍️ Classe Autor
id
nome
dataNascimento
🔄 Classe Emprestimo
id
livro (Livro)
nomeCliente
dataEmprestimo
dataDevolucao
🏛️ Classe Biblioteca
livros (List<Livro>)
autores (List<Autor>)
emprestimos (List<Emprestimo>)
💡 Inicialização sugerida
private List<Livro> livros = new ArrayList<>();
private List<Autor> autores = new ArrayList<>();
private List<Emprestimo> emprestimos = new ArrayList<>();
📋 Checklist de Implementação
Criar classe Autor
Criar classe Livro
Criar classe Biblioteca
Inicializar listas dentro de Biblioteca
Adicionar dados mockados (hardcoded) para iniciar o sistema
Implementar loop principal de interação
Implementar lógica para resposta "NÃO" (encerrar sistema)
Implementar lógica para resposta "SIM"
Listar apenas livros disponíveis
Permitir escolha de livro por id
Solicitar nome do usuário
Registrar empréstimo
Marcar livro como indisponível
Exibir mensagem de sucesso
🚀 Melhorias (Roadmap)
🔥 Menu Interativo

Transformar o fluxo em um menu com múltiplas opções:

Listar livros
Cadastrar livro
Realizar empréstimo
Sair
👤 Gestão de Clientes
Criar classe Cliente
Cadastrar usuários
Associar empréstimos a clientes
Consultar histórico de empréstimos
🔍 Busca e Filtros
Buscar livros por título
Buscar por autor
Filtrar por data
Filtrar por disponibilidade