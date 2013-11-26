from subprocess import call


#for line in open("master_pt.properties"):
#	print line,


f = open("master_pt.properties")
line = f.readline()
while line:
	
	
	t = open("mess_pt.properties", 'w')
	t.write(line)
	t.close()
	
	return_code = call(["java", "ResourceTest"])	
	if return_code == 1:
		print line
	
	line = f.readline()
f.close()

