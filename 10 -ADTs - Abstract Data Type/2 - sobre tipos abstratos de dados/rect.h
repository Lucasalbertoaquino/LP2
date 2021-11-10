#ifndef RECT
#define RECT

typedef struct Rect Rect;
Rect* rect_new(void);
void rect_drag(Rect* r,int dx,int dy);
void rect_print(Rect* r);

#endif
