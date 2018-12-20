#include<stdio.h>
#include<conio.h>
#include<string.h>
char a[50];
char temp[10][100];
int counter,variable,i,t,k=0,f;

void enter_string(){
  printf("enter the string \n");
  gets(a);
//  printf("%c\n",a[6]);
}

void string_comp()
{
  printf("comparing  ... %s\n",temp[k] );
  if(strcmp(temp[k],"int")==0||strcmp(temp[k],"double")==0||strcmp(temp[k],"char")==0||strcmp(temp[k],"float")==0){
    counter++;
    printf("word\n" );
  }
}

void counte(){
  for (i=0;i<100;i++) {
      printf("%c for1\n", a[i]);
      //if(a[i]==',')

        t=0;variable++;
        while(a[i]!=','){
          if(a[i]=='.'){goto a;f=1;}
        temp[k][t]=a[i];
        t++;
      i++;}
        printf("in\n" );
          string_comp();
          if(f==1){goto b;}
          k++;
      }
      a:
      string_comp();
      b:
  printf("total keywords are ... = %d \n",counter );
  printf("total spaces are ...  = %d \n",variable );
//  return 0;
}

int main()
{
  enter_string();
  counte();
  return 0;
}
