#!/bin/bash

#line='logwemodule***********'
#line='logwe module rqgfg'
line='12 123   12313  123123  123:reigjeqio'
isbegin=0
#读完跳出
if [ ${isbegin} -eq 1 -a -n "$(echo ${line} | grep "*\$")" ]; then
    echo 'break'
    #
elif [ ${isbegin} -eq 0 -a -z "$(echo ${line} | grep "module")" ]; then
    echo 'contiune'
elif [ ${isbegin} -eq 0 -a -n "$(echo ${line} | grep "module")" ]; then
    isbegin=1
    echo "continue"
fi

string=`echo ${line} | awk -F ":" '{printf $1}'`
array=($string)
num=${#array[@]}
if [ $num -eq 5 ]; then
    echo ${array[1]}
elif [ $num -eq 6 ];then
    echo ${array[1]}
else
	echo "failed|$num"
fi

