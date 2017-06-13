package data;

import java.io.*;
import java.util.*;

public class PrezDriver {

	static List<President> presidents = new ArrayList<>();

	public PrezDriver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		PrezDriver pd = new PrezDriver();
		pd.loadList();

		// pd.printPresidents(presidents);
		// pd.filterByParty(presidents, "Whig");
		// pd.filterByMiddleName(presidents);
		// pd.filterBylessThanFourYears(presidents);
		// pd.filterByLastNameStartsWithR(presidents);
		pd.printForParty(presidents, "Whig");
		pd.printForParty(presidents, "Republican");
		pd.printForParty(presidents, "Democrat");
		pd.printForParty(presidents, "Independent");
	}

	public void printForParty(List<President> presidents, String filter) {

		List<President> prezlist = new ArrayList<>();
		for (int i = 0; i < presidents.size(); i++) {

			if (presidents.get(i).getParty().equals(filter)) {

				prezlist.add(presidents.get(i));
			}
		}

		try {
			FileOutputStream fout = new FileOutputStream(filter + ".txt");
			PrintWriter out = new PrintWriter(fout);
			for (President president : prezlist) {
				out.println(prezlist);
			}
			out.close();
			fout.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		for (President president : prezlist) {
			System.out.println(president.getFirstName() + " " + president.getLastName());
		}

	}

	public void filterByParty(List<President> presidents, String filter) {
		// List<President> tempList = new ArrayList<President>();
		for (int i = 0; i < presidents.size(); i++) {
			if (presidents.get(i).getParty().equals(filter)) {
				System.out.println(presidents.get(i));
			}
		}
	}

	public void filterByMiddleName(List<President> presidents) {
		// List<President> tempList = new ArrayList<President>();
		for (int i = 0; i < presidents.size(); i++) {
			if (!presidents.get(i).getMiddleName().equals("")) {
				System.out.println(presidents.get(i));
			}
		}
	}

	public void filterBylessThanFourYears(List<President> presidents) {
		// List<President> tempList = new ArrayList<President>();
		for (int i = 0; i < presidents.size(); i++) {

			if ((presidents.get(i).getEndYear()) - (presidents.get(i).getStartYear()) < 4) {
				System.out.println(presidents.get(i));
			}
		}
	}

	public void filterByLastNameStartsWithR(List<President> presidents) {
		// List<President> tempList = new ArrayList<President>();
		for (int i = 0; i < presidents.size(); i++) {

			if (presidents.get(i).getLastName().startsWith("R")) {
				System.out.println(presidents.get(i));
			}
		}
	}

	public void printPresidents(List<President> presidents2) {
		for (President president : presidents) {
			System.out.println(president);
		}
	}

	public List<President> loadList() {

		BufferedReader bufIn = null;
		try {
			bufIn = new BufferedReader(new FileReader("presidents.csv"));

			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] temp = line.split(", ");
				String[] temp2 = temp[4].split("-");

				President p = new President();
				p.setTermNumber(Integer.parseInt(temp[0]));
				p.setFirstName(temp[1]);
				p.setMiddleName(temp[2]);
				p.setLastName(temp[3]);
				p.setStartYear(Integer.parseInt(temp2[0]));
				p.setEndYear(Integer.parseInt(temp2[1]));
				p.setParty(temp[5]);
				presidents.add(p);

			}
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			if (bufIn != null) {
				try {
					bufIn.close();
				} catch (IOException e) {
					System.err.println(e);
				}
			}
		}
		return presidents;
	}

}
