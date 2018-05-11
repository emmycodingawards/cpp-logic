JC = javac
JFLAGS = -Xlint:all
	SRC = $(wildcard *.java)
OBJ = $(SRC:%.java=%.class)

all: $(OBJ)
	$(JC) $(JFLAGS) $^

%.class: %.java
	    $(JC) $(JFLAGS) $<

clean:
	    rm -f a.out *.class
