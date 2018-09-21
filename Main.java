package LapTop;

public class Main {
	public static LapTop getTopLapTop(LapTop[]lap)
	{
		LapTop max=lap[0];
		for(int i=0;i<lap.length;i++)
		{
			if(lap[i].price>max.price)
			{
				max=lap[i];
			}
		}
		return max;
	}
	public static LapTop getLowRatingLapTop(LapTop[]lap)
	{
		LapTop min=lap[0];
		for(int i=0;i<lap.length;i++)
		{
			if(lap[i].ratings<min.ratings)
			{
				min=lap[i];
			}
		}
		return min;
	}
	public static LapTop findLapTop(int id,LapTop[]lap)
	{
		LapTop lt=null;
		for(int i=0;i<lap.length;i++)
		{
			if(id==lap[i].id)
			{
				lt=lap[i];
			}
		}
		
		return lt;
	}
public static LapTop[] sortById(LapTop[]lap)
{
	LapTop t;
	for(int i=0;i<lap.length;i++)
	{
		for(int j=0;j<lap.length-1;j++)
		{
			if(lap[j].id>lap[j+1].id)
			{
				t=lap[j];
				lap[j]=lap[j+1];
				lap[j+1]=t;
			}
		}
	}
	return lap;
}
public static LapTop[] sortByPrice(LapTop[]lap)
{
	LapTop t;
	for(int i=0;i<lap.length;i++)
	{
		for(int j=0;j<lap.length-1;j++)
		{
			if(lap[j].price>lap[j+1].price)
			{
				t=lap[j];
				lap[j]=lap[j+1];
				lap[j+1]=t;
			}
		}
	}
	return lap;
}
public static void main(String[] args) {
LapTop LapTop1=new LapTop();
	LapTop1.price=27190;
	LapTop1.company="Dell";
	LapTop1.model="A553111UIN9";
	LapTop1.height=49.5;
	LapTop1.width=35.3;
	LapTop1.ratings=4;
	LapTop1.warentyPeriod=12;
	LapTop1.id=3568;
LapTop LapTop2=new LapTop();
	LapTop2.price=64490;
	LapTop2.company="Apple MacBook";
	LapTop2.model="MQD32HN/A";
	LapTop2.height=22.7;
	LapTop2.width=32.5;
	LapTop2.ratings=5;
	LapTop2.warentyPeriod=12;
	LapTop2.id=2017;
LapTop LapTop3=new LapTop();
	LapTop3.price=469999;
	LapTop3.company="Razer Blade Pro";
	LapTop3.model="7820Hk";
	LapTop3.height=27.9;
	LapTop3.width=32.5;
	LapTop3.ratings=5;
	LapTop3.warentyPeriod=12;
	LapTop3.id=7820;
LapTop LapTop4=new LapTop();
	LapTop4.price=429999;
	LapTop4.company="Microsoft";
	LapTop4.model="HNW-00001";
	LapTop4.height=31.2;
	LapTop4.width=23.2;
	LapTop4.ratings=4;
	LapTop4.warentyPeriod=0;
	LapTop4.id=1050;
	LapTop[]lap= {LapTop1,LapTop2,LapTop3,LapTop4};
	{
	LapTop l=getTopLapTop(lap);
	System.out.println(l.price);
	LapTop rat=getLowRatingLapTop(lap);
	System.out.println(rat.ratings);
	LapTop ids=findLapTop(1050,lap);
	System.out.println(ids.company);
	sortById(lap);
	for(int i=0;i<lap.length;i++)
	{
	System.out.print(lap[i].id+" ");
	System.out.println("");
	}
	sortByPrice(lap);
	for(int i=0;i<lap.length;i++)
	{
	System.out.print(lap[i].price+" ");
	}
	}
}
}
