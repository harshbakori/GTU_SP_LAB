#include<stdio.h>
#include<conio.h>
#include<string.h>
char a[10];
int counter,variable,i;
void enter_string(){
  printf("enter the string with opraters total 10 wordspase are allowded only\n");
  gets(a);

}

void counte(){
  for(i=0;i<10;i++)
  {
    if(a[i]=='+'||a[i]=='-'||a[i]=='='||a[i]=='/'||a[i]=='*')
    {
      //printf("i\n");
      counter++;
    }
    else{
    //  printf("ie\n");
      variable++;
    }
  }
  printf("total variables are ... = %d \n",variable );
  printf("total oprators are ...  = %d \n",counter );
//  return 0;
}

int main()
{
  enter_string();
  counte();
  return 0;
}
