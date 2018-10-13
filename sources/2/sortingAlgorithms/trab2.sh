#!/bin/bash

# Diretório onde estão armazenados os arquivos de dados de entrada e onde serão
# armazenados os arquivos de saída do programa de ordenação.
DATA_DIR=/home/douglas/IFES/ifes_bsi/6_periodo/tpa/sources/2/sortingAlgorithms/data/trab2-data

# Diretório base para o trabalo de programação de LFA
TRAB2_DIR=/home/douglas/IFES/ifes_bsi/6_periodo/tpa/sources/2/sortingAlgorithms

# Diretório onde serão gerados os arquivos de coleta de dados sobre tempo de
# execução dos programas de ordenação.
REPORT_DIR=$TRAB2_DIR/report-data

# Arquivo JAR correspondendo ao código executável em byte-code do programa de
# ordenação.
MYSORT_JAR=$TRAB2_DIR/dist/sortingAlgorithms.jar

# Identificadores dos arquivos de dados de entrada e de saída. Todos os arquivos
# de entrada tem nomes que sequem o padrão `data_ID.csv`, e todos os arquivos de
# saída terão nomes que seguem o padrão `sorted_ID.csv`; onde ID é um elemento
# da lista abaixo.
FILE_IDS=(10e0 25e0 50e0 75e0\
          10e1 25e1 50e1 75e1\
          10e2 25e2 50e2 75e2\
          10e3 25e3 50e3 75e3\
          10e4 25e4 50e4 75e4\
          10e5 25e5 50e5 75e5)

# Data e hora de execução deste script de shell. Será usado para criar os nomes
# dos arquivos de dados de tempo, de log de trabalho e de alerta de término de
# execução.
TIMESTAMP=`date +%Y-%m-%d_%H-%M-%S`

# Nome do arquivo de dados de tempo de execução dos programas de ordenação.
REPORT_FILE="data_${TIMESTAMP}.dat"

# Número de vezes que cada programa de ordenação será executado para cada
# arquivo de entrada de dados.
NUM_RUNS=10

# Data e hora (com precisão de milisegundos) de início da execução dos
# programas. Será gravado no arquivo de alerta de término de execução.
INIT_TIME=`date --rfc-3339=ns`

# Nome do arquivo de log de trabalho. Nesse arquivo serão gravados todos os
# comando executados por este script de shell para evocar os programas de
# ordenação com seus respectivos parâmetros de arquivos de entrada e saída.
WORK_FILE="$REPORT_DIR/working_${TIMESTAMP}.txt"

# Cria o arquivo de log de trabalho.
touch $WORK_FILE

# Para cada algoritmo de ordenação,...
for algid in "selectionsort" "insertionsort" "mergesort" "quicksort" "heapsort"
do

  echo "#$algid"
  # Para cada ID na lista,...
  for id in ${FILE_IDS[*]}
  do

    echo -n "==> $id "
    # Para cada uma das N vezes,...
    for n in `seq $NUM_RUNS`
    do

      INFILE="$DATA_DIR/data_${id}.csv"
      OUTFILE="$DATA_DIR/sorted_${id}.csv"
      CMD="java -jar $MYSORT_JAR -a $algid -i $INFILE -o $OUTFILE >> $REPORT_DIR/$REPORT_FILE"
      echo $CMD >> $WORK_FILE
      echo -n .
      eval $CMD

    done
    echo ""

  done

done

# Data e hora (com precisão de milisegundos) de término da execução dos
# programas. Será gravado no arquivo de alerta de término de execução.
FINISH_TIME=`date --rfc-3339=ns`

# Grava o arquivo de alerta de término de execução.
COMPLETED="completed_${TIMESTAMP}.txt"
echo $INIT_TIME >> $REPORT_DIR/$COMPLETED
echo $FINISH_TIME >> $REPORT_DIR/$COMPLETED
echo "Done."
