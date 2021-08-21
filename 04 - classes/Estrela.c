#include<stdio.h>

typedef struct{
    int x,y;
    int w,h;
    float ainicial;
    float ainc;
    float pi;
    int r1,r2;
    float raio;

}Estrela;

void printe(Estrela * es){
    printf("A Estrela de tamanho (%d,%d),na posicao(%d,%d), tendo inicio no angulo(%f) e (%f), possui pi (%f),com raio de circulos auxiliares de (%d) e (%d) de raio (%f).",es->w,es->h,es->x,es->y,es->ainicial,es->ainc,es->pi,es->r1,es->r2,es->raio);
}

void main(void){
    Estrela es1 = {10,10,40,40,90.0,2.5,3.14,23,41,0.4};
    printe(&es1);
}
