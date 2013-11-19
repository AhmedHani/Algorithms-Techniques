using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuickSort
{
    public class quickSort
    {
        public void QSort(int[] Arr, int LHS, int RHS)
        {
            int i = LHS;
            int j = RHS;
            int Pivot = Arr[(LHS + RHS) / 2];

            while (i <= j)
            {
                while (Arr[i] < Pivot) i++;
                while (Arr[j] > Pivot) j--;

                if (i <= j)
                {
                    int Tmp = Arr[i];
                    Arr[i] = Arr[j];
                    Arr[j] = Tmp;
                    i++;
                    j--;
                }
            }
            if (LHS < j) QSort(Arr, LHS, j);
            if (RHS > i) QSort(Arr, i, RHS);
        }
    }
}
