LXI H,8000H
MVI C,00H
MOV B,M
XRA A
UP: ADI 01H
DAA
JNC LOOP
INR C
LOOP: DCR B
JNZ UP
STA 8001H
MOV A,C
STA 8002H
HLT
