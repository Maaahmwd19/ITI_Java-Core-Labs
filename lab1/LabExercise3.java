public class LabExercise3
{
public static void main(String[] args){

if(args.length>=2)
{
	int  num = Integer.parseInt(args[0]);
	String ipStr = args[1];
	for (int i=0 ; i< num ; i++)
	{
		System.out.println(ipStr);
	}
}
else{
System.out.println("Please provide two arguments: a number and a string.");

}
}
}
