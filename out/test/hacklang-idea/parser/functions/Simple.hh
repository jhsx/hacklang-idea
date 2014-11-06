<?hh

function main(){}

function main():int{}

function main(int $variable):int{}

function main<T>(int $variable):int{}

function main<T as myInterface>(int $variable):int{}

<<__Native>>
function main<T as myInterface>(int $variable=true):int{}
function main<T as myInterface>(int $variable=3*4):int{}
