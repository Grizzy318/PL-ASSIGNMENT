type
  PNode = ^Node;
  Node = record
    data: integer;
    next: PNode;
  end;

var
  head, curr, prev, newNode: PNode;

{ INSERT AT HEAD }
new(newNode);
newNode^.data := value;
newNode^.next := head;
head := newNode;

{ DELETE FIRST OCCURRENCE }
prev := nil;
curr := head
while (curr <> nil) and (curr^.data <> value) do
begin
  prev := curr;
  curr := curr^.next;
end;
if curr <> nil then
begin
  if prev = nil then head := curr^.next
  else prev^.next := curr^.next;
end;

{ SEARCH }
found := False;
curr := head;
while curr <> nil do
begin
  if curr^.data = value then found := True;
  curr := curr^.next;
end;
