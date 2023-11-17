procedure capture(N, E: longint; var X, Y, points: array of longint);
begin
    (* insert your code here *)
    points[0] := 42;
end;


const
    MAXE = 1000000;
var
    N, E, i : longint;
    X, Y, P : array[0..MAXE-1] of longint;
    fr, fw  : text;

begin
    assign(fr, 'input.txt');
    assign(fw, 'output.txt');
    reset(fr);
    rewrite(fw);
    readln(fr, N, E);
    for i:=0 to E-1 do
        readln(fr, X[i], Y[i]);

    capture(N, E, X, Y, P);
    for i:=0 to N-1 do
        write(fw, P[i], ' ');
    writeln(fw);
    close(fr);
    close(fw);
end.
