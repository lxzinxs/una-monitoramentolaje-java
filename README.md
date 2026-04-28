# 🏗️ Sistema SafeBuild: Monitoramento de Carga

Este repositório contém o desenvolvimento do **SafeBuild**, uma aplicação em **Java** projetada para o monitoramento em tempo real da carga em estruturas de escoramento durante processos de construção[cite: 12]. O sistema atua como uma camada de segurança crítica, automatizando a tomada de decisão com base em leituras de sensores[cite: 12].

---

## 🔍 Visão Geral do Exercício

O objetivo desta atividade foi implementar um sistema de controle lógico que utiliza **estruturas condicionais compostas** para classificar estados de risco em uma obra[cite: 12]. O software calcula automaticamente margens de segurança e emite protocolos de emergência baseados na carga detectada em relação ao limite do projeto[cite: 12].

---

## 🚦 Níveis de Monitoramento e Decisão

O sistema opera sob quatro estados lógicos distintos[cite: 12]:

1. **Status VERDE (Operação Normal)**: 
   * Ativado quando a carga está abaixo de **80%** (limite seguro) da carga de projeto[cite: 12].
   * Indica que a operação pode seguir os parâmetros normais[cite: 12].

2. **Status AMARELO (Alerta)**: 
   * Ativado quando a carga está entre **80% e 100%** do limite do projeto[cite: 12].
   * Protocolo: Reduzir a velocidade de concretagem e evacuar pessoal não essencial[cite: 12].

3. **Status VERMELHO (Crítico)**: 
   * Ativado quando a carga excede **100%** da capacidade do projeto[cite: 12].
   * Protocolo: Interrupção imediata da operação devido ao risco de colapso das escoras[cite: 12].

4. **ALERTA ADICIONAL (Falha Catastrófica)**: 
   * Ativado se a carga atingir ou ultrapassar **122%** da carga de projeto[cite: 12].
   * Protocolo: Evacuação total imediata da área[cite: 12].

---

## 🛠️ Detalhes Técnicos

* **Linguagem**: Java[cite: 12].
* **Entrada de Dados**: Classe `Scanner` para leitura de dados do sensor[cite: 12].
* **Cálculos Automáticos**: O software utiliza uma carga base de **15.0** e define dinamicamente o `limiteSeguro` (80% da carga)[cite: 12].
* **Lógica Condicional**: Implementação de blocos `if`, `else if` e `if` aninhados para tratamento de múltiplos cenários de segurança[cite: 12].

---

## 🚀 Como Executar

1. Certifique-se de ter o **JDK** instalado em seu sistema.
2. Compile o arquivo:
   ```bash
   javac Atividade.java
3. Execute a aplicação:
   ```bash
   java Atividade
---

**Desenvolvido por Lucas Nery Miranda**
*Estudante de Ciência da Computação - UNA*
