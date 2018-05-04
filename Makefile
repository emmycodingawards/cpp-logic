JC = javac
JFLAGS = -g
SRC = $(wildcard *.java)
OBJ = $(SRC:%.java=%.class)

a.out: $(OBJ)
	$(JC) $(JFLAGS) $^

%.class: %.java
	$(JC) $(JFLAGS) $<

clean:
	rm -f a.out *.class
