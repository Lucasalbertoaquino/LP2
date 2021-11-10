#include <stdio.h>
#include "rect.h"

typedef struct Rect{
	int x,y;
}Rect;

Rect* rect_new(void){
	Rect* r = malloc(sizeof(Rect)); 
}

void rect_drag(Rect* r,int dx,int dy){
	r->x+=dx;
	r->y+=dy;
}

void rect_print(Rect* r){
	printf("Retangulo na posicao (%d,%d).\n",
	r->x,r->y);
}

