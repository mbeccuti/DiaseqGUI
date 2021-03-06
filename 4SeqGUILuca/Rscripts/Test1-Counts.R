library(docker4seq)
system("wget http://130.192.119.59/public/test_R1.fastq.gz")
system("wget http://130.192.119.59/public/test_R2.fastq.gz")
rnaseqCounts(group="sudo",fastq.folder="/home/data/scratch", scratch.folder="/home/data/scratch", adapter5="AATGATACGGCGACCACCGAGATCTACACTCTTTCCCTACACGACGCTCTTCCGATCT", adapter3="AATGATACGGCGACCACCGAGATCTACACTCTTTCCCTACACGACGCTCTTCCGATCT", seq.type="pe", threads=8,  min.length=40, genome.folder="/home/data/scratch/hg38star", strandness="none", truncating.expected.counts=FALSE, annotation.type="gtfENSEMBL")
mirnaCounts(group="docker", fastq.folder="/run/media/user/Elements/InputTemp", scratch.folder="/run/media/user/Elements/tmp",  mirbase.id="hsa",  download.status=FALSE, adapter.type="NEB", trimmed.fastq=FALSE)
