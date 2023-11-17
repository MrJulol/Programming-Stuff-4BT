#include <stdio.h>
#include <assert.h>

#define MAXE 1000000

void capture(int N, int E, int X[], int Y[], int points[]) {
    // insert your code here
    points[0] = 42;
}


int X[MAXE];
int Y[MAXE];
int P[MAXE];

int main() {
    FILE *fr, *fw;
    int N, E, i;

    fr = fopen("input.txt", "r");
    fw = fopen("output.txt", "w");
    assert(2 == fscanf(fr, "%d %d", &N, &E));
    for(i=0; i<E; i++)
        assert(2 == fscanf(fr, "%d %d", &X[i], &Y[i]));
    
    capture(N, E, X, Y, P);
    for (i=0; i<N; i++)
        fprintf(fw, "%d ", P[i]);
    fprintf(fw, "\n");
    fclose(fr);
    fclose(fw);
    return 0;
}
