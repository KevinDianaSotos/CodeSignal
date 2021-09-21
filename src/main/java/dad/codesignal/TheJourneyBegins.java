package dad.codesignal;

public class TheJourneyBegins {
	int add(int param1, int param2) {
	    return param1 + param2;
	}
	int CenturyFromYear(int year) {
	return (int)Math.floor(year / 100.0) + ((year % 100.0 ==0) ? 0 : 1);
}
}