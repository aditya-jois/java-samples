public interface ITelevision {
	public void powerOn();
	public void powerOff();
	public int nextChannel(int currentChannel);
	public int previousChannel(int currentChannel);
	public int increaseVolume(int currentVolume);
	public int decreaseVolume(int currentVolume);
}
