#include <pthread.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

pthread_mutex_t mutex1;
pthread_cond_t condition;
int whereInArray = 0;
int array[100];
int ending = 0;

void *consumerFunc(void *args)
{
    while (!ending)
    {
        pthread_mutex_lock(&mutex1);
        while (array[whereInArray] == -1)
        {
            pthread_cond_wait(&condition, &mutex1);
        }
        printf("Durchgang: %d\tThe number from Producer: %d\n", whereInArray + 1, array[whereInArray]);
        ++whereInArray;
        pthread_mutex_unlock(&mutex1);
    }
    return NULL;
}
void *producerFunc(void *args)
{
    while (!ending)
    {
        pthread_mutex_lock(&mutex1);
        if (whereInArray == 99)
        {
            ending = 1;
        }
        array[whereInArray] = (rand() % 100) + 1;
        pthread_cond_signal(&condition);
        pthread_mutex_unlock(&mutex1);
    }
    return NULL;
}

int main()
{
    srand((unsigned)time(NULL));

    for (int i = 0; i < 100; i++)
    {
        array[i] = -1;
    }

    pthread_mutex_init(&mutex1, NULL);
    pthread_cond_init(&condition, NULL);

    pthread_t producer, consumer;
    pthread_create(&producer, NULL, producerFunc, NULL);
    pthread_create(&consumer, NULL, consumerFunc, NULL);
    pthread_join(producer, NULL);
    pthread_join(consumer, NULL);
    pthread_cond_destroy(&condition);
    pthread_mutex_destroy(&mutex1);

    printf("All done!\n");

    return EXIT_SUCCESS;
}
