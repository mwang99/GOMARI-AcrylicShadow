public class AttendanceClock 
{
	public AttendanceClock()
	{
		attendanceCount = 0;
	}
	public void clockIn()
	{
		attendanceCount++;
	}
	public int getAttendance()
	{
		return attendanceCount;
	}
	private int attendanceCount;
}
