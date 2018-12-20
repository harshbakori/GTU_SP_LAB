%{
#include <stdio.h>
int vowels = 0;
int cons = 0;
%}
%
[aeiouAEIOU]
[a-zA-Z]
%%
int yywrap()
{
reyurn 1;
}
main()
{
printf("enter string at end\n");
yylex();
printf("mo of vowels =%d \n no of const=%d",vowels,cons);

}