public class Problem4 {
    public static void main(String[] args) {
        int arr[] = {1,2,8,9,12,46,76,82,15,20,30};
        int count=0;
        System.out.println("Multiple of[1,2,3,4,5,6,7,8,9] in given List is ");
        for(int i=1;i<=9;i++)
        {
            for(int j=0;j<=10;j++)
            {
                if(arr[j]%i==0)
                {
                    count++;
                }

            }
            System.out.println(i + ":" + count);
            count = 0;
        }

    }
}
