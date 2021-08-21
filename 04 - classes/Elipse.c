#include<stdio.h>

typedef struct{
    int x,y;
    int w,h;
    int ai;
    int ang;

}Elipse;

void printe(Elipse * e){
    printf("A Elipse de tamanho (%d,%d),na posicao(%d,%d), tendo inicio no angulo(%d) possui (%d) graus",e->w,e->h,e->x,e->y,e->ai,e->ang);
}

void main(void){
    Elipse e1 = {10,10,40,40,0,360};
    printe(&e1);

}
