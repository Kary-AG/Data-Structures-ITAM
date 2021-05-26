public class problema3{
    public static void main(String[] args) {
       double[] uno = {1.2,4,6,7.8,10,10};
       double[] dos = {1.2,4,6,7.8,10,10};
       if (compa(dos, uno))
           System.out.println("Si");
       else
           System.out.println("No");
    }

    public static boolean compa(double[] array, double[] array2){
        if(array.length != array2.length)
            return  false;
        for(int i= 1;i< array.length; i++)
            if(array[i] != array2[i])
                return false;
        return true;
    }
}
