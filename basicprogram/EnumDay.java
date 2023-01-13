package basicprogram;

public enum EnumDay {
		SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), 
		SATURDAY(6);
		private int dayIndex;
		
		EnumDay(int name)
		{
			this.dayIndex = name;
		} 
		public static void main(String[] args) 
		{
			System.out.println(EnumDay.MONDAY.getDayIndex());
			System.out.println(EnumDay.TUESDAY);
		} 
		public int getDayIndex() 
		{
			return dayIndex;
		}
	}
	


