-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 18-Nov-2016 às 01:48
-- Versão do servidor: 10.1.16-MariaDB
-- PHP Version: 5.5.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sisvendas`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `caixa`
--

CREATE TABLE `caixa` (
  `CODIGO` int(10) UNSIGNED NOT NULL,
  `DINHEIRO` float NOT NULL DEFAULT '0',
  `CHEQUE` float NOT NULL DEFAULT '0',
  `CARTAO` float NOT NULL DEFAULT '0',
  `VALE` float NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `caixa`
--

INSERT INTO `caixa` (`CODIGO`, `DINHEIRO`, `CHEQUE`, `CARTAO`, `VALE`) VALUES
(1, 59, 24, 4, 10);

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientes`
--

CREATE TABLE `clientes` (
  `CODIGO` int(11) NOT NULL,
  `NOME` varchar(255) DEFAULT NULL,
  `ENDERECO` varchar(255) DEFAULT NULL,
  `BAIRRO` varchar(60) DEFAULT NULL,
  `CIDADE` varchar(60) DEFAULT NULL,
  `UF` varchar(2) DEFAULT NULL,
  `CEP` varchar(10) DEFAULT NULL,
  `TELEFONE` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `clientes`
--

INSERT INTO `clientes` (`CODIGO`, `NOME`, `ENDERECO`, `BAIRRO`, `CIDADE`, `UF`, `CEP`, `TELEFONE`) VALUES
(1, 'BALCAO', '', 'CENTRO', 'BH', 'MG', '00000000', '000000000'),
(2, 'JOÃO ALFREDO DA SILVA', 'RUA: PEDRO BOTARO, 100', 'CENTRO', 'BH', 'MG', '36500000', '985319984');

-- --------------------------------------------------------

--
-- Estrutura da tabela `contas`
--

CREATE TABLE `contas` (
  `PK_CODIGO` int(10) UNSIGNED NOT NULL,
  `FK_CODIGO_PESSOA` int(10) UNSIGNED NOT NULL,
  `DESCRICAO` varchar(500) NOT NULL,
  `DATA` date DEFAULT NULL,
  `VENCIMENTO` date DEFAULT NULL,
  `PAGAMENTO` date DEFAULT NULL,
  `FK_TIPO_PAGAMENTO` int(10) UNSIGNED NOT NULL DEFAULT '1',
  `OBSERVACAO` varchar(300) NOT NULL,
  `SITUACAO` tinyint(1) NOT NULL,
  `VALOR` float NOT NULL,
  `TIPO_CONTA` varchar(10) NOT NULL DEFAULT 'PAGAR'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `contas`
--

INSERT INTO `contas` (`PK_CODIGO`, `FK_CODIGO_PESSOA`, `DESCRICAO`, `DATA`, `VENCIMENTO`, `PAGAMENTO`, `FK_TIPO_PAGAMENTO`, `OBSERVACAO`, `SITUACAO`, `VALOR`, `TIPO_CONTA`) VALUES
(1, 1, 'Conta de água', '2016-11-17', '2016-11-18', '2016-11-18', 1, '', 0, 100, 'PAGAR'),
(2, 1, 'Conta de luz', '2016-11-16', '2016-11-17', '2016-11-17', 1, '', 1, 50, 'PAGAR'),
(3, 1, 'Produtos recebidos', '2016-11-15', '2016-11-18', '2016-11-17', 1, '', 0, 100, 'RECEBER'),
(4, 1, 'Produtos da segunda remessa', '2016-11-15', '2016-11-17', '2016-11-17', 1, '', 1, 100, 'RECEBER');

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedores`
--

CREATE TABLE `fornecedores` (
  `CODIGO` int(11) NOT NULL,
  `NOME` varchar(255) DEFAULT NULL,
  `ENDERECO` varchar(255) DEFAULT NULL,
  `BAIRRO` varchar(60) DEFAULT NULL,
  `CIDADE` varchar(60) DEFAULT NULL,
  `UF` varchar(2) DEFAULT NULL,
  `CEP` varchar(10) DEFAULT NULL,
  `TELEFONE` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `fornecedores`
--

INSERT INTO `fornecedores` (`CODIGO`, `NOME`, `ENDERECO`, `BAIRRO`, `CIDADE`, `UF`, `CEP`, `TELEFONE`) VALUES
(1, 'FD FORNECEDORES LTDA', 'RUA ARIEL', 'CENTRO', 'BH', 'MG', '68701091', '985475951');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produtos`
--

CREATE TABLE `produtos` (
  `CODIGO` int(11) NOT NULL,
  `FORNECEDORES_CODIGO` int(11) NOT NULL,
  `NOME` varchar(255) DEFAULT NULL,
  `VALOR` double DEFAULT NULL,
  `ESTOQUE` int(11) DEFAULT NULL,
  `CODIGO_BARRAS` varchar(100) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `produtos`
--

INSERT INTO `produtos` (`CODIGO`, `FORNECEDORES_CODIGO`, `NOME`, `VALOR`, `ESTOQUE`, `CODIGO_BARRAS`) VALUES
(1, 1, 'Fubá Da Roça', 1, 96, '1'),
(2, 1, 'Arroz Tio João', 9, 79, '2'),
(3, 1, 'Fermento em Pó Bicalho', 3, 48, '3'),
(4, 1, 'Açucar União pacote 5kg', 6, 82, '4'),
(5, 1, 'Café Negão 500g', 5, 89, '5'),
(6, 1, 'Farinha de Trigo', 1, 20, '6');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_usuarios`
--

CREATE TABLE `tbl_usuarios` (
  `pk_codigo` int(10) UNSIGNED NOT NULL,
  `nome` varchar(45) NOT NULL,
  `login` varchar(45) NOT NULL,
  `senha` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbl_usuarios`
--

INSERT INTO `tbl_usuarios` (`pk_codigo`, `nome`, `login`, `senha`) VALUES
(1, 'ADMINISTRADOR', 'admin', '123'),
(2, 'ANA CAROLINA', 'ana', '123');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tipo_pagamento`
--

CREATE TABLE `tipo_pagamento` (
  `pk_codigo` int(10) UNSIGNED NOT NULL,
  `descricao` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tipo_pagamento`
--

INSERT INTO `tipo_pagamento` (`pk_codigo`, `descricao`) VALUES
(1, 'DINHEIRO'),
(2, 'CARTÃO'),
(3, 'CHEQUE'),
(4, 'VALE');

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendas`
--

CREATE TABLE `vendas` (
  `CODIGO` int(11) NOT NULL,
  `CLIENTES_CODIGO` int(11) NOT NULL,
  `DATA_VENDA` date DEFAULT NULL,
  `VALOR_TOTAL` float DEFAULT NULL,
  `DESCONTO` float DEFAULT NULL,
  `TIPO_PAGAMENTO` int(10) UNSIGNED DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `vendas`
--

INSERT INTO `vendas` (`CODIGO`, `CLIENTES_CODIGO`, `DATA_VENDA`, `VALOR_TOTAL`, `DESCONTO`, `TIPO_PAGAMENTO`) VALUES
(1, 1, '2016-11-17', 27, 0, 1),
(2, 1, '2016-11-17', 8, 0, 1),
(3, 2, '2016-11-17', 4, 0, 2),
(4, 1, '2016-11-17', 24, 0, 1),
(5, 1, '2016-11-17', 10, 0, 4),
(6, 1, '2016-11-17', 24, 0, 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendas_produto`
--

CREATE TABLE `vendas_produto` (
  `CODIGO` int(11) NOT NULL,
  `CODIGO_PRODUTO` int(11) DEFAULT NULL,
  `CODIGO_VENDA` int(11) DEFAULT NULL,
  `QUANTIDADE` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `vendas_produto`
--

INSERT INTO `vendas_produto` (`CODIGO`, `CODIGO_PRODUTO`, `CODIGO_VENDA`, `QUANTIDADE`) VALUES
(1, 2, 1, 1),
(2, 4, 1, 3),
(3, 5, 2, 1),
(4, 6, 2, 3),
(5, 3, 3, 1),
(6, 6, 3, 1),
(7, 2, 4, 1),
(8, 3, 4, 3),
(9, 4, 4, 1),
(10, 5, 5, 1),
(11, 1, 5, 2),
(12, 6, 5, 3),
(13, 2, 6, 1),
(14, 3, 6, 3),
(15, 4, 6, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `caixa`
--
ALTER TABLE `caixa`
  ADD PRIMARY KEY (`CODIGO`) USING BTREE;

--
-- Indexes for table `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`CODIGO`);

--
-- Indexes for table `contas`
--
ALTER TABLE `contas`
  ADD PRIMARY KEY (`PK_CODIGO`);

--
-- Indexes for table `fornecedores`
--
ALTER TABLE `fornecedores`
  ADD PRIMARY KEY (`CODIGO`);

--
-- Indexes for table `produtos`
--
ALTER TABLE `produtos`
  ADD PRIMARY KEY (`CODIGO`),
  ADD KEY `FK_produtos_1` (`FORNECEDORES_CODIGO`);

--
-- Indexes for table `tbl_usuarios`
--
ALTER TABLE `tbl_usuarios`
  ADD PRIMARY KEY (`pk_codigo`);

--
-- Indexes for table `tipo_pagamento`
--
ALTER TABLE `tipo_pagamento`
  ADD PRIMARY KEY (`pk_codigo`);

--
-- Indexes for table `vendas`
--
ALTER TABLE `vendas`
  ADD PRIMARY KEY (`CODIGO`),
  ADD KEY `FK_vendas_1` (`CLIENTES_CODIGO`);

--
-- Indexes for table `vendas_produto`
--
ALTER TABLE `vendas_produto`
  ADD PRIMARY KEY (`CODIGO`),
  ADD KEY `FK_vendas_produto_1` (`CODIGO_PRODUTO`),
  ADD KEY `FK_vendas_produto_2` (`CODIGO_VENDA`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `caixa`
--
ALTER TABLE `caixa`
  MODIFY `CODIGO` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `clientes`
--
ALTER TABLE `clientes`
  MODIFY `CODIGO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `contas`
--
ALTER TABLE `contas`
  MODIFY `PK_CODIGO` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `fornecedores`
--
ALTER TABLE `fornecedores`
  MODIFY `CODIGO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `produtos`
--
ALTER TABLE `produtos`
  MODIFY `CODIGO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `tbl_usuarios`
--
ALTER TABLE `tbl_usuarios`
  MODIFY `pk_codigo` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `tipo_pagamento`
--
ALTER TABLE `tipo_pagamento`
  MODIFY `pk_codigo` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `vendas`
--
ALTER TABLE `vendas`
  MODIFY `CODIGO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `vendas_produto`
--
ALTER TABLE `vendas_produto`
  MODIFY `CODIGO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `produtos`
--
ALTER TABLE `produtos`
  ADD CONSTRAINT `FK_produtos_1` FOREIGN KEY (`FORNECEDORES_CODIGO`) REFERENCES `fornecedores` (`CODIGO`);

--
-- Limitadores para a tabela `vendas`
--
ALTER TABLE `vendas`
  ADD CONSTRAINT `FK_vendas_1` FOREIGN KEY (`CLIENTES_CODIGO`) REFERENCES `clientes` (`CODIGO`);

--
-- Limitadores para a tabela `vendas_produto`
--
ALTER TABLE `vendas_produto`
  ADD CONSTRAINT `FK_vendas_produto_1` FOREIGN KEY (`CODIGO_PRODUTO`) REFERENCES `produtos` (`CODIGO`),
  ADD CONSTRAINT `FK_vendas_produto_2` FOREIGN KEY (`CODIGO_VENDA`) REFERENCES `vendas` (`CODIGO`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
