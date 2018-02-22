/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mustafa_cms;

import java.awt.Color;
import java.awt.TextField;


public class Erorr {
       TextField input = null;
       
       public void setInput(TextField input){
          this.input=input;
       }
       
       public void  ErrorInput(){
         TextField input1 = null;
         String Text=input1.getText();
         if("".equals(Text))
            {
              input1.setText("يرجى تحديد الماده من الجدول");
              input1.setForeground(Color.red);  
            }
       }
 

  /** public void Error(){
       edit_name.setText("يرجى تحديد الماده من الجدول");
       edit_name.setForeground(Color.red);
       
       edit_id.setText("يرجى تحديد الماده من الجدول");
       edit_id.setForeground(Color.red);
       
       edit_data.setText("يرجى تحديد الماده من الجدول");
       edit_data.setForeground(Color.red);
       
       edit_priceget.setText("يرجى تحديد الماده من الجدول");
       edit_priceget.setForeground(Color.red);
       
       edit_priceout.setText("يرجى تحديد الماده من الجدول");
       edit_priceout.setForeground(Color.red);
       
       edit_number.setText("يرجى تحديد الماده من الجدول");
       edit_number.setForeground(Color.red);
       
       edit_exp.setText("يرجى تحديد الماده من الجدول");
       edit_exp.setForeground(Color.red);
       
       edit_pr.setText("يرجى تحديد الماده من الجدول");
       edit_pr.setForeground(Color.red);

    }
     **/

    
}
