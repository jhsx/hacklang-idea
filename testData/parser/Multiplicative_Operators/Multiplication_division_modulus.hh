<?hh // strict

namespace NS_multiplication_division_modulus;

function doit(num $p1_num): void {
   $m = 12*12;
   $m1 = 12/12;
   $m2 = 12%12;
   $m3 = 12%12*$m/$m2;
   $m3 = 12%(12*$m)/$m2;
}

function main(): void {
  doit(11);
}

/* HH_FIXME[1002] call to main in strict*/
main();
