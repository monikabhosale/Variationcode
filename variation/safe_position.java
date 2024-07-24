public class safe_position{
    public static void main(String[] agrs)
{
    int[] a=new int[6];
    int k=3;
    int count=1;
    int index=0;
    int removedcount=0;
    while(a.length-removedcount>1){
        if(a[index]==0){
            if(count==k){
                a[index]=1;
                removedcount++;
                count=1;
            }
            else{
                count++;

            }
            }
index++;
if(index>=a.length){
    index=0;
}
        }

        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            System.out.println(i);
        }
    }
}