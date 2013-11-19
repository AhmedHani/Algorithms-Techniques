using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuickSort
{
    class Program
    {
        public static int[] Arr = {2, 10, 0, 1, 0, 54, 12, 9, 50};
        static void Main(string[] args)
        {
            quickSort Q = new quickSort();
            Q.QSort(Arr, 0, Arr.Length - 1);
            for (int i = 0; i < Arr.Length; i++)
            {
                Console.WriteLine(Arr[i] + " ");
            }
        }
    }
}
