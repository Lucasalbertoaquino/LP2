#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int r,g,b;
} Color;

struct Figure;
typedef void (* Figure_Print) (struct Figure*);
typedef int  (* Figure_Area)  (struct Figure*);
typedef int  (*Figure_dobra_area) (struct Figure*);
typedef int  (*Figure_divide_area) (struct Figure*);

typedef struct {
    void (* print) (struct Figure*);
    int  (* area)  (struct Figure*);
    int  (* dobra_area) (struct Figure*);
    int  (* divide_area) (struct Figure*);
} Figure_vtable;

typedef struct Figure {
    int x, y;
    Color fg, bg;
    Figure_vtable* vtable;
} Figure;

///////////////////////////////////////////////////////////////////////////////
//rect
typedef struct {
    Figure super;
    int w, h;
} Rect;

void rect_print (Rect* this) {
    Figure* sup = (Figure*) this;
    printf("Retangulo de tamanho (%d,%d) na posicao (%d,%d) e area %d e com area dobrada de %d\n",
           this->w, this->h, sup->x, sup->y, sup->vtable->area(sup),sup->vtable->dobra_area(sup));
}

int rect_area (Rect* this) {
    Figure* sup = (Figure*) this;
    return this->w * this->h;
}
int dobra_area_rect(Rect* this){
    Figure* sup = (Figure*) this;
    return rect_area(this)*2;
}

Figure_vtable rect_vtable = {
    (Figure_Print) rect_print,
    (Figure_Area)  rect_area,
    (Figure_dobra_area) dobra_area_rect
};

Rect* rect_new (int x, int y, int w, int h) {
    Rect*   this  = malloc(sizeof(Rect));
    Figure* sup = (Figure*) this;
    sup->vtable = &rect_vtable;
    sup->x = x;
    sup->y = y;
    this->w = w;
    this->h = h;
}

///////////////////////////////////////////////////////////////////////////////
//elipse
typedef struct {
    Figure super;
    int w, h;
} Ellipse;

void ellipse_print (Rect* this) {
    Figure* sup = (Figure*) this;
    printf("Elipse de tamanho (%d,%d) na posicao (%d,%d) e area %d com area dividida de %d.\n",
           this->w, this->h, sup->x, sup->y, sup->vtable->area(sup),ellipse_divide_area(this));
}

int ellipse_area (Rect* this) {
    Figure* sup = (Figure*) this;
    return this->w * this->h;
}
int ellipse_divide_area(Ellipse* this){
    Figure* sup = (Figure*) this;
    return ellipse_area(this)/2;

}

Figure_vtable ellipse_vtable = {
    (Figure_Print) ellipse_print,
    (Figure_Area)  ellipse_area,
    (Figure_divide_area) ellipse_divide_area
};

Ellipse* ellipse_new (int x, int y, int w, int h) {
    Ellipse* this = malloc(sizeof(Ellipse));
    Figure* sup = (Figure*) this;
    sup->vtable = &ellipse_vtable;
    sup->x = x;
    sup->y = y;
    this->w = w;
    this->h = h;
}
///////////////////////////////////////////////////////////////////////////////
//triangulo
typedef struct{
    Figure super;
    int w, h;
    int x2,x3,y2,y3;
}Triangulo;

void triangulo_print(Triangulo * this){
    Figure * sup = (Figure*) this;
    printf("Triangulo de tamanho (%d %d) na posicao (%d %d) e area %d.\n",
           this->w,this->h,sup->x,sup->y,sup->vtable->area(sup));
}
int triangulo_area(Triangulo * this){
    Figure * sup = (Figure *)this;
    return (this->w * this->h)/2;
}

Figure_vtable triangulo_vtable = {
    (Figure_Print) triangulo_print,
    (Figure_Area) triangulo_area
};

Triangulo* triangulo_new (int x,int x2,int x3,int y,int y2,int y3, int w, int h) {
    Triangulo* this = malloc(sizeof(Triangulo));
    Figure* sup = (Figure*) this;
    sup->vtable = &triangulo_vtable;
    sup->x = x;
    sup->y = y;
    this->x2 = x2;
    this->x3 = x3;
    this->y2 = y2;
    this->y3 = y3;
    this->w = w;
    this->h = h;
}
////////////////////////////////////////////////////////////////////////////////
//star
typedef struct {
    Figure super;
    int w, h;
    int x2,x3,x4,x5;
    int y2,y3,y4,y5;
} Star;

void star_print (Star* this) {
    Figure* sup = (Figure*) this;
    printf("Estrela de tamanho (%d,%d) na posicao (%d,%d) e area %d.\n",
           this->w, this->h, sup->x, sup->y, sup->vtable->area(sup));
}

int star_area (Star* this) {
    Figure* sup = (Figure*) this;
    return this->w * this->h;
}

Figure_vtable star_vtable = {
    (Figure_Print) star_print,
    (Figure_Area)  star_area
};

Star* star_new (int x, int x2,int x3,int x4, int x5,int y,int y2,int y3,int y4, int y5, int w, int h) {
    Star*   this  = malloc(sizeof(Star));
    Figure* sup = (Figure*) this;
    sup->vtable = &star_vtable;
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
        (Figure*) star_new(30,25,11,26,78,45,52,64,14,56,65,120),
        (Figure*) triangulo_new(15,20,30,40,50,90,100,55)
    };

    ///

    for (int i=0; i<6; i++) {
        figs[i]->vtable->print(figs[i]);
    }

    ///

    for (int i=0; i<6; i++) {
        free(figs[i]);
    }
}
