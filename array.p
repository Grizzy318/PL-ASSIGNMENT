var
  arr: array[1..100] of integer;
  i, pos, value, n: integer;

{ INSERT }
for i := n downto pos do
  arr[i+1] := arr[i];
arr[pos] := value;

{ DELETE }
for i := pos to n-1 do
  arr[i] := arr[i+1];

{ SEARCH }
found := False;
for i := 1 to n do
  if arr[i] = value then found := True;
