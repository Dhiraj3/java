

cat master_pt.properties | while read LINE
do
	echo "$LINE" > mess_pt.properties
	echo $LINE
	java ResourceTest
	if [ "$?" -eq "1" ] 
	then
		echo $LINE
		break;
	fi
done
