package restaurant1;

import java.util.Scanner;

public class anurestaurant 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String st[]= {"chicken","lollipop biryani","paneer butter masala","mushroom biryani","dum biryani"};
		double cost=0;
		System.out.println("Display the items");
		for(int i=0;i<st.length;i++) {
			switch(st[i]) {
			case "chicken":
				cost=150;
				System.out.println(st[i]+"="+cost);
				break;
			case "lollipop biryani":
				cost=100;
				System.out.println(st[i]+"="+cost);
				break;
			case "paneer butter masala":
				cost=90;
				System.out.println(st[i]+"="+cost);
				break;
			case "mushroom biryani":
				cost=110;
				System.out.println(st[i]+"="+cost);
				break;
			case "dum biryani":
				cost=130;
				System.out.println(st[i]+"="+cost);
				break;
			default:
				System.out.println(" Thank you");
			}
		}
		System.out.println("welcome to AnuRestaurant ! please pick your order");
		int ol=sc.nextInt();
		double totalcost=0;
		while(ol>=0) {
			String ord=sc.nextLine();
			switch(ord) {
			case "fullmeals":
				cost=150;
				totalcost=totalcost+cost;
				break;
			case "halfmeals":
				cost=100;
				totalcost=totalcost+cost;
				break;
				
			case "gobi friedrice":
				cost=90;
				totalcost=totalcost+cost;
				break;
			case "mushroom friedrice":
				cost=110;
				totalcost=totalcost+cost;
				break;
			case "panneer f	riedrice":
				cost=130;
				totalcost=totalcost+cost;
				break;
			}
			ol--;
		}
		System.out.println(totalcost);
	}
}
			
