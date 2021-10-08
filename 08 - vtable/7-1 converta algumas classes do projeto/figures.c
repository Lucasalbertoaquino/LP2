#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int r,g,b;
} Color;

struct Figure;
typedef void (* Figure_Print) (struct Figure*);

typedef struct Figure {
    int x, y;
    Color fg, bg;
    void (* print) (struct Figure*);
} Figure;

///////////////////////////////////////////////////////////////////////////////
//rect
typedef struct {
    Figure super;
    int w, h;
} Rect;

void rect_print (Rect* this) {
    Figure* sup = (Figure*) this;
    printf("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
           this->w, this->h, sup->x, sup->y);
}

Rect* rect_new (int x, int y, int w, int h) {
    Rect*   this  = malloc(sizeof(Rect));
    Figure* sup = (Figure*) this;
    sup->print = (Figure_Print) rect_print;
    sup->x = x;
    sup->y = y;
    this->w = w;
    this->h = h;
}

///////////////////////////////////////////////////////////////////////////////
//ellipse
typedef struct {
    Figure super;
    int w, h;
} Ellipse;

void Ellipse_print (Ellipse* this) {
    Figure* sup = (Figure*) this;
    printf("Elipse de tamanho (%d,%d) na posicao (%d,%d).\n",
           this->w, this->h, sup->x, sup->y);
}

Ellipse* ellipse_new (int x, int y, int w, int h) {
    Ellipse* this = malloc(sizeof(Ellipse));
    Figure* sup = (Figure*) this;
    sup->print = (Figure_Print) Ellipse_print;
    sup->x = x;
    sup->y = y;
    this->w = w;
    this->h = h;
}
/////////////////////////////////////////////////////////////////////////////////
//triangulo
typedef struct{
    Figure super;
    int w,h;
    int x2,x3,y2,y3;
}Triangulo;

void triangulo_print(Triangulo *this){
    Figure* sup = (Figure*) this;
    printf("Triangulo de tamanho (%d,%d) na posicao (%d,%d)\n",
           this->w,this->h,sup->x,sup->y);
}
Triangulo* triangulo_new(int x,int x2,int x3,int y,int y2,int y3,int w, int h){
    Triangulo* this = malloc(sizeof(Triangulo));
    Figure* sup = (Figure*) this;
    sup->print = (Figure_Print) triangulo_print;
    sup->x = x;
    sup->y = y;
    this->x2 = x2;
    this->x3 = x3;
    this->y2 = y2;
    this->y3 = y3;
    this->w = w;
    this->h = h;

}
//////////////////////////////////////////////////////////////////////////////
//estrela
typedef struct{
    Figure super;
    int w,h;
    int x2,x3,x4,x5;
    int y2,y3,y4,y5;
}Star;

void star_print(Star *this){
    Figure* sup = (Figure*) this;
    printf("Estrela de tamanho (%d,%d) na posicao (%d,%d)\n",
           this->w,this->h,sup->x,sup->y);
}
Star* star_new(int x, int x2,int x3,int x4, int x5,int y,int y2,int y3,int y4, int y5,int w, int h){
    Star* this = malloc(sizeof(Star));
    Figure* sup = (Figure*) this;
    sup->print = (Figure_Print) star_print;
    sup->x = x;
    sup->y = y;
    this->x2 = x2;
    this->x3 = x3;
    this->x4 = x4;
    this->x5 = x5;
    this->y2 = y2;
    this->y3 = y3;
    this->y4 = y4;
    this->y5 = y5;
    this->w = w;
    this->h = h;

}

///////////////////////////////////////////////////////////////////////////////

void main (void) {
    Figure* figs[6] = {
        (Figure*) rect_new(10,10,100,100),
        (Figure*) ellipse_new(40,10,140,300),
        (Figure*) rect_new(10,10,100,100),
        (Figure*) ellipse_new(210,110,305,130),
        (Figure*) triangulo_new(15,20,30,40,50,90,100,55),
        (Figure*) star_new(30,25,11,26,78,45,52,64,14,56,65,120)
    };

    ///

    for (int i=0; i<6; i++) {
        figs[i]->print(figs[i]);
    }

    ///

    for (int i=0; i<6; i++) {
        free(figs[i]);
    }
}
