#!/bin/sh


docker=$1
scratchfolder=$2
datafolder=$3
threads=$4
output=$5
path=${PWD}


echo
echo "======================================================="
echo "			  INPUT PARAMETERS"
echo "======================================================="
echo
echo "Docker user:             $docker"
echo "Scratch folder:          $scratchfolder"
echo "Data folder:             $datafolder"
echo "Thread:                  $thread"
echo "Output:                  $output"
echo 
echo "======================================================="

echo 


echo " Current folder: ${PWD}"
echo " "
echo "Executing R script"

args="R CMD BATCH --no-save --no-restore  '--args   $docker $scratchfolder $datafolder  $threads ' ./Rscripts/SMM1.R  $output/Routput.Rout"

echo "$args"

eval "$args"

echo
echo
echo "======================================================="
echo "		       END EXECUTION"
echo "======================================================="
