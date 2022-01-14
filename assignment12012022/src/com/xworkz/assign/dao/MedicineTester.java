package com.xworkz.assign.dao;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.assign.entity.MedicineEntity;


public class MedicineTester {

	public static void main(String[] args) {
		List<MedicineEntity> MedE=new ArrayList<MedicineEntity>();
		MedE.add(new MedicineEntity(1, "Dr. Reddy's Laboratories","Moxikind CV 625 Mg","treat Pneumonia,infections","13.10.2021","14.11.2024",135));
		MedE.add(new MedicineEntity(2, "Lupin", "Azithral 500 Tablet", "antibiotic","16.12.2021","14.09.2024", 120));
		MedE.add(new MedicineEntity(3, "Sun Pharma","Ketamine Hydrochloride","General anesthetics&Oxygen","11.9.2021", "14.11.2023", 80));
		MedE.add(new MedicineEntity(4, "Sun Pharma", "Diclofenac","Anti inflamatory","13.10.2021", "14.11.2023", 170));
		MedE.add(new MedicineEntity(5, "Lupin", "Paracetmol","cure Fever&Cold","13.10.2021", "14.11.2023", 700));
		MedE.add(new MedicineEntity(6, "Lupin", "Ibuprofen","Antipyretics","13.10.2021", "14.11.2023", 400));
		MedE.add(new MedicineEntity(7, "Dr. Reddy's Laboratories", "Citrizine","Antiallergic","13.10.2021", "14.11.2023", 120));
		MedE.add(new MedicineEntity(8, "Alkem Laboratories", "Activated Charcols", "Antidotes and poisoning","11.10.2021", "14.11.2023", 70));
		MedE.add(new MedicineEntity(9, "Alkem Laboratories", "Atropine Sulphate", "Antidotes and poisoning","10.10.2020", "12.11.2023", 400));
		MedE.add(new MedicineEntity(10, "Alkem Laboratories", "Calcium gluconate", "Antidotes and poisoning","13.10.2021", "10.11.2023", 270));
		
		MedE.add(new MedicineEntity(11, "Lupin", "Diazepam", "Antipileptics","1.10.2021", "4.11.2023",100));
		MedE.add(new MedicineEntity(12, "Beta lactum", "Amoxicilin", "Antibacterial","12.11.2022", "14.1.2024", 45));
		MedE.add(new MedicineEntity(13, "Gland Pharma", "Ampicillin", "Antibacterial","11.06.2021", "13.11.2023", 60));
		MedE.add(new MedicineEntity(14, "Beta lactum", "Cefotaxime", "Antibacterial","18.10.2021", "16.11.2023", 59));
		MedE.add(new MedicineEntity(15, "Gland Pharma", "Ceftazidime", "Antibacterial","19.10.2021", "15.11.2023", 58));
		MedE.add(new MedicineEntity(16, "Gland Pharma", "Ceftrixone", "Antibacterial","12.10.2021", "14.11.2023", 98));
		MedE.add(new MedicineEntity(17, "Aurobindo Pharma", "Cephalexin", "Antibacterial","10.11.2021", "4.8.2023", 60));
		MedE.add(new MedicineEntity(18, "Aurobindo Pharma", "Cloxacilin", "Antibacterial","11.08.2021", "14.11.2023", 70));
		MedE.add(new MedicineEntity(19, "Aurobindo Pharma", "Cefixime", "Antibacterial","13.8.2021", "14.7.2023", 58));
		MedE.add(new MedicineEntity(20, "Dr. Reddy's Laboratories", "Azithromycin", "Antibacterial","13.10.2021", "14.11.2023", 77));
		
		MedE.add(new MedicineEntity(21, "Cipla", "Acetyl SalicylicAcid", "treat accute attack","13.10.2021", "14.11.2023", 100));
		MedE.add(new MedicineEntity(22, "Cipla", "Amphotericin B", "Antifungal","13.10.2021", "14.11.2023",230));
		MedE.add(new MedicineEntity(23, "Sun Pharma", "Clotrimazole", "Antifungal","13.10.2021", "14.11.2023",170));
		MedE.add(new MedicineEntity(24, "Sun Pharma", "Fluconazol", "Antifungal","13.10.2021", "14.11.2023",167));
		MedE.add(new MedicineEntity(25, "Sun Pharma", "Nystacin", "Antifungal","13.10.2021", "14.11.2023", 198));
		MedE.add(new MedicineEntity(26, "Cipla", "Azathioprine", "immuno suppressive","13.10.2021", "14.11.2023", 169));
		MedE.add(new MedicineEntity(27, "Cipla", "Actinomycin D", "immuno suppressive","14.10.2021", "14.11.2023", 139));
		MedE.add(new MedicineEntity(28, "Cipla", "Cyclosporine", "immuno suppressive","13.03.2021", "14.11.2023", 149));
		MedE.add(new MedicineEntity(29, "Cadila Healthcare", "Raloxifene", "Harmones&Anitharmones","13.10.2021", "12.11.2023", 170));
		MedE.add(new MedicineEntity(30, "Gland Pharma", "Tamoxifen Citrate", "Harmones&Anitharmones","12.11.2021", "08.11.2023", 165));
		
		MedE.add(new MedicineEntity(31, "Cadila Healthcare", "Folic Acid", "Antianaemia","13.06.2021", "14.11.2023", 230));
		MedE.add(new MedicineEntity(32, "Cadila Healthcare", "Iron dextran", "Antianaemia","13.05.2021", "14.11.2023", 170));
		MedE.add(new MedicineEntity(33, "Cadila Healthcare", "Pyridoxine", "Antianaemia","05.10.2021", "14.11.2023",160));
		MedE.add(new MedicineEntity(34, "Cadila Healthcare", "Protamine Sulphate", "Antianaemia","12.10.2021", "11.10.2023", 130));
		
		 MedicineInterf dao= new MedicineImpl();
		 dao.putAll(MedE);
		 
		//MedicineEntity entity1=new MedicineEntity(1, "Mankind", "Shreyass", "Cold", "13.10.2021", "14.11.2023", 70);
		//MedicineInterf dao=new MedicineImpl();
		//dao.put(entity1);

	}

}
