#include <stdio.h> 
#include<stdlib.h>
#include<string.h> 
int main() 
{ 
char str[11]="Hello World"; 
char str1[11],str2[11],str3[11]; 
int i,len; 
len = strlen(str); 
for(i=0;i<len;i++) 
{ 
str1[i] = str[i]&127; 
printf("%c",str1[i]); 
} 
printf("\n"); 
for(i=0;i<len;i++) 
{ 
str3[i] = str2[i]^127; 
printf("%c",str3[i]); 
} 
printf("\n");
return 0; 
}  
