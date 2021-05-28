package Order;

import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GetTableString {
	public String getTableData(JTable table) {
		int a = 0;
		for(int i = 0; i < Main.menu.length;i++){
			if(Main.mount[i] != 0){
				a = a+(Main.price[i]*Main.mount[i]);
			}
		}
		String returnValue = "";
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		Vector<Vector> datas = model.getDataVector();
		for (Vector row : datas) {

			returnValue += row.get(0) + "    " + row.get(1) + "    " + row.get(2) + "   " + row.get(3) + "   " + "\n";
			// System.out.print("row = "+ );
			// System.out.print(row.get(1));
			// System.out.print(row.get(2));
			// System.out.println(row.get(3));
		}
		
		return returnValue+"ÃÑ °áÁ¦±Ý¾× : "+a;
		
	}

}
