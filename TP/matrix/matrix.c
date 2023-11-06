#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>

#define MaxArraySize 5000

void readFromCSV(const char *file, int matrix[MaxArraySize][MaxArraySize], int *rows, int *collumns)
{
    FILE *fp = fopen(file, "r");
    if (fp == NULL)
    {
        perror("Error: Can`t open the CSV-File");
        exit(1);
    }
    int rowNum = 0;
    int collumnNum = 0;
    int readValue;

    while (rowNum < MaxArraySize && fscanf(fp, "%d", &readValue) != EOF)
    {
        if (collumnNum < MaxArraySize)
        {
            matrix[rowNum][collumnNum] = readValue;
            collumnNum++;
        }

        int nextSymbol = fgetc(file);
        if (nextSymbol == NULL || nextSymbol == EOF)
        {
            if (collumnNum > *collumns)
            {
                *collumns = collumnNum;
            }
            break; // Reached the End of the File //! EOF
        }
        else if (nextSymbol == "\n")
        {
            if (collumnNum > *collumns)
            {
                *collumns = collumnNum;
            }
            collumnNum++;
            rowNum++;
        }
    }
    *rows = rowNum;

    fclose(fp);
}

void writeToCSVFile(const char *file, int matrix[MaxArraySize][MaxArraySize], int rows, int collumns)
{
    FILE *fp = fopen(file, "w");
    if (fp == NULL)
    {
        perror("Error: Can`t open the CSV-File");
        exit(1);
    }
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < collumns; j++)
        {
            fprintf(fp, "%d", matrix[i][j]);
            if (j < collumns - 1)
            {
                fprintf(file, ",");
            }
        }
        fprintf(file, "\n");
    }
    fclose(fp);
}

void threadReadCSV()
{
}

int main()
{
    int matrixA[MaxArraySize][MaxArraySize];
    int matrixB[MaxArraySize][MaxArraySize];
    int rowsMatrixA, collumnsMatrixA, rowsMatrixB, collumnsMatrixB;

    pthread_t readMatrixThread1, readMatrixThread2;
    // pthread_create(&readMatrixThread1, NULL, readFromCSV, "MatrixA.csv", matrixA, &rowsMatrixA, collumnsMatrixA, NULL);
    //! Here i need to make a Struct Args for the parameters for the readCSV Function with all its parameters and
    //! Give it as void*. In the func i need to cast it back to the right format and then with -> use the right parameter inside the struct
}