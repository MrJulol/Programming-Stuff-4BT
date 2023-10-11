#include <stdio.h>
#include <stdlib.h>
#include <sys/wait.h>
#include <sys/types.h>
#include <unistd.h>
#include <time.h>
#include <string.h>
#include <signal.h>
#include <sys/ipc.h>
#include <sys/msg.h>
#include <sys/shm.h>

int *mem;
pid_t pid;
pid_t pid2;

void par_handler(int signal)
{
    printf("PAR");
    printf("%d\n", *mem);
    printf("PAR1");
    kill(pid, SIGUSR2);
    printf("PAR2");
    kill(pid2, SIGUSR2);
    printf("PAR3");
}

void child2sigHandler(int signal)
{
    printf("CHILD2");
    if (*mem % 2 == 0)
    {
        *mem += 1;
        kill(getppid(), SIGUSR1);
    }
}

void child1sigHandler(int signal)
{
    printf("CHILD1");
    if (*mem % 2 == 1)
    {
        *mem += 1;
        kill(getppid(), SIGUSR1);
    }
}

int main()
{

    key_t key = 123;
    int ID = shmget(key, sizeof(int), IPC_CREAT | 0600);
    if (ID == -1)
    {
        perror("shmget: ");
        exit(EXIT_FAILURE);
    }
    mem = shmat(ID, NULL, 0);
    if (mem == (void *)-1)
    {
        perror("shmat: ");
        exit(EXIT_FAILURE);
    }

    *mem = 0;

    pid = fork();
    if (pid == -1)
    {
        perror("fork: ");
        exit(EXIT_FAILURE);
    }
    if (pid) //! Parent
    {
        pid2 = fork();
        if (pid2 == -1)
        {
            perror("fork: ");
            exit(EXIT_FAILURE);
        }
        if (pid) //! Parent
        {
            signal(SIGUSR1, par_handler);

            raise(SIGUSR1);

            while (*mem < 100)
                ;

            if (shmdt(mem) == -1)
            {
                perror("shmdt: ");
                exit(EXIT_FAILURE);
            }
            if (shmctl(ID, IPC_RMID, 0))
            {
                perror("shmctl: ");
                exit(EXIT_FAILURE);
            }
        }
        else //! Child 2
        {
            signal(SIGUSR2, child2sigHandler);
            while (*mem < 100)
                ;
            if (shmdt(mem) == -1)
            {
                perror("shmdt: ");
                exit(EXIT_FAILURE);
            }
        }
    }
    else //! Child 1
    {
        signal(SIGUSR2, child1sigHandler);
        while (*mem < 100)
            ;
        if (shmdt(mem) == -1)
        {
            perror("shmdt: ");
            exit(EXIT_FAILURE);
        }
    }
    return EXIT_SUCCESS;
}