package impl;

import java.util.List;

import model.Borad;

public interface BoradService {
	public Borad getBorad(int boradId);

	public List<Borad> getBoradList(int boradId);// originBorad search

	public List<Borad> getBoradList(String keyword);//keyword originBorad

	public List<Borad> getBoradList();

	public void insertBorad(Borad borad);

	public void updateBorad(Borad borad);

	public void deleteBorad(Borad borad);

}
