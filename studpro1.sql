CREATE OR REPLACE PROCEDURE studpro1(id IN NUMBER, name IN VARCHAR2)
IS
BEGIN
	insert into student values(id,name);
END studpro1;
/
