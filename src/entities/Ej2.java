package entities;

import java.util.LinkedList;

public class Ej2 {
		public double getTotal(LinkedList<BillItem> items, boolean includeTax)	{
			double total=0;
			for (BillItem billItem : items) {
				if(billItem.includeTax()) {
					total=total+billItem.getQuantity()*billItem.getUnitPrice()*0.21;
				}else {
					total=total+billItem.getQuantity()*billItem.getUnitPrice();
				}
			}
			return total;
		}
	}

