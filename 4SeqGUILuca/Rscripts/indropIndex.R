##First read in the arguments listed at the command line
args=(commandArgs(TRUE))

##args is now a list of character vectors
## First check to see if arguments are passed.
## Then cycle through each element of the list and evaluate the expressions.
if(length(args)==0){
  print("No arguments supplied.")
  ##supply default values

}else{
  for(i in 1:length(args)){
    eval(parse(text=args[[i]]))
  }
}

library(rCASC)
indropIndex(group=group,index.folder=index.folder, ensembl.urlgenome=ensembl.urltranscriptome, ensembl.urlgtf=ensembl.urlgtf)
