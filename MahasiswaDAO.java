package jtbcTrain;

import java.util.List;

public interface MahasiswaDAO {
	public void getMahasiswaByKelas(String kelas);
	public List<Mahasiswa> getAllMahasiswa();
	public void saveMahasiswa(Mahasiswa mahasiswa);
	public void updateMahasiswa(Mahasiswa mahasiswa);
	public void deleteMahasiswa(Mahasiswa mahasiswa);
}