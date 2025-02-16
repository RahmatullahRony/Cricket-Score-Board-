package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import ScoreBoard.DataConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {
	@FXML
    private TextField T1p9;

    @FXML
    private TextField T2p8;

    @FXML
    private TextField T2p9;

    @FXML
    private TextField T2p6;

    @FXML
    private TextField T1p8;

    @FXML
    private TextField T2p7;

    @FXML
    private TextField T1p5;

    @FXML
    private TextField T1p11;

    @FXML
    private TextField T2p4;

    @FXML
    private Button Start;

    @FXML
    private TextField T1p10;

    @FXML
    private TextField T2p5;

    @FXML
    private TextField T1p3;

    @FXML
    private TextField T2p2;

    @FXML
    private TextField T1p4;

    @FXML
    private TextField T2p3;

    @FXML
    private TextField T2p10;

    @FXML
    private TextField T2p11;

    @FXML
    private TextField T1p;

    @FXML
    private TextField T1p1;

    @FXML
    private TextField T1p2;

    @FXML
    private TextField T2p1;
    @FXML
    private TextField Wicket;

    @FXML
    private Button BtnWicket;

    @FXML
    private TextField Team_2;

    @FXML
    private Button Btn6;

    @FXML
    private Button Btn5;

    @FXML
    private Button Btn4;

    @FXML
    private Button Btn3;

    @FXML
    private Button BtnNB;

    @FXML
    private Button Btn2;


    @FXML
    private Button save;
    
    @FXML
    private Button Btn1;

    @FXML
    private TextField Run;

    @FXML
    private TextField Over;

    @FXML
    private TextField Run_Team_1;

    @FXML
    private RadioButton T20;

    @FXML
    private TextField Wicket_Team_2;

    @FXML
    private RadioButton ODI;

    @FXML
    private TextField Wicket_Team_1;

    @FXML
    private TextField Run_Team_2;

    @FXML
    private Button BtnDot;

    @FXML
    private TextField Team_1;

    @FXML
    private Button BtnWB;

    @FXML
    private Button detailsmatch;
    
    @FXML
    private TextField Team1Name;

    @FXML
    private Button start;

    @FXML
    private TextField Team2Name;

    
    int ovr,tr=0,tw=0,to=0,b=0,a=0,bb=0,c=0,ovrt;
    @FXML
    void TAction(ActionEvent event) {
    	ovr=120;
        ovrt=ovr;
    }

    @FXML
    void OAction(ActionEvent event) {
    	 ovr=300;
         ovrt=ovr;
    }
    @FXML
    void Ball1(ActionEvent event) {
    	 tr=tr+1;
         
         
         b=b+1;
         bb=bb+1;
         if(b==6)
         {
             a=a+1;
             b=0;
         }
         if(bb<=ovr&&b<6&&tw<11)
                 {
                    
            Run.setText(""+tr);     
            Over.setText(""+a);
         
         
                 }
        if(bb==ovr)
         {
             bb=0;
             ovr=ovrt;
            
             if(c==0)
             {
             Run_Team_1.setText(""+tr);
             Wicket_Team_1.setText(""+tw);
             c=1;
             }
             else
             {
                Run_Team_2.setText(""+tr);
                Wicket_Team_2.setText(""+tw);
             }
             tr=0;tw=0;to=0;b=0;a=0;
             Run.setText("");
             Wicket.setText("");
             Over.setText("");
         }
    }
    @FXML
    void Ball2(ActionEvent event) {
    	 tr=tr+2;
         
         
         b=b+1;
         bb=bb+1;
         if(b==6)
         {
             a=a+1;
             b=0;
         }
         if(bb<=ovr&&b<6&&tw<11)
                 {
                    
            Run.setText(""+tr);     
         Over.setText(""+a);
      }                                        
     
      if(bb==ovr)
         {
              bb=0;
             ovr=120;
            
             if(c==0)
             {
             Run_Team_1.setText(""+tr);
             Wicket_Team_1.setText(""+tw);
             c=1;
             }
             else
             {
                 Run_Team_2.setText(""+tr);
                 Wicket_Team_2.setText(""+tw);
             }
             tr=0;tw=0;to=0;b=0;a=0;
             Run.setText("");
             Wicket.setText("");
             Over.setText("");
         }
    }
    @FXML
    void Ball3(ActionEvent event) {
    	tr=tr+3;
        
        
        b=b+1;
        bb=bb+1;
        if(b==6)
        {
            a=a+1;
            b=0;
        }
        if(bb<=ovr&&b<6&&tw<11)
                {
                   
           Run.setText(""+tr);     
        Over.setText(""+a);
     }                                        
   if(bb==ovr)
        {
            bb=0;
            ovr=ovrt;
          
            if(c==0)
            {
            	 Run_Team_1.setText(""+tr);
            	 Wicket_Team_1.setText(""+tw);
            c=1;
            }
            else
            {
            	  Run_Team_2.setText(""+tr);
            	  Wicket_Team_2.setText(""+tw);
            }
            tr=0;tw=0;to=0;b=0;a=0;
            Run.setText("");
            Wicket.setText("");
            Over.setText("");
        }
    }
    @FXML
    void BALL4(ActionEvent event) {
    	 tr=tr+4;
         
         
         b=b+1;
         bb=bb+1;
         if(b==6)
         {
             a=a+1;
             b=0;
         }
         if(bb<=ovr&&b<6&&tw<11)
                 {
                    
            Run.setText(""+tr);     
         Over.setText(""+a);
      }                                        
     if(bb==ovr)
         {
             bb=0;
             ovr=ovrt;
             
             if(c==0)
             {
             Run_Team_1.setText(""+tr);
             Wicket_Team_1.setText(""+tw);
             c=1;
             }
             else
             {
            	 Run_Team_2.setText(""+tr);
            	 Wicket_Team_2.setText(""+tw);
             }
             tr=0;tw=0;to=0;b=0;a=0;
             Run.setText("");
             Wicket.setText("");
             Over.setText("");
         }
    }
    @FXML
    void BALL5(ActionEvent event) {
    	 tr=tr+5;
         
         
         b=b+1;
         bb=bb+1;
         if(b==6)
         {
             a=a+1;
             b=0;
         }
         if(bb<=ovr&&b<6&&tw<11)
                 {
                    
            Run.setText(""+tr);     
            Over.setText(""+a);
      }                                        
     
      if(bb==ovr)
         {
             bb=0;
             ovr=ovrt;
             
             if(c==0)
             {
             Run_Team_1.setText(""+tr);
             Wicket_Team_1.setText(""+tw);
             c=1;
             }
             else
             {
                 Run_Team_2.setText(""+tr);
                 Wicket_Team_2.setText(""+tw);
             }
             tr=0;tw=0;to=0;b=0;a=0;
             Run.setText("");
             Wicket.setText("");
             Over.setText("");
         }
    }
    @FXML
    void BALL6(ActionEvent event) {
    	  tr=tr+6;
          
          
          b=b+1;
          bb=bb+1;
          if(b==6)
          {
              a=a+1;
              b=0;
          }
          if(bb<=ovr&&b<6&&tw<11)
                  {
                     
        	  Run.setText(""+tr);     
              Over.setText(""+a);
       }                                        
      if(bb==ovr)
          {
               bb=0;
              ovr=ovrt;
            
              if(c==0)
              {
            	  Run_Team_1.setText(""+tr);
            	  Wicket_Team_1.setText(""+tw);
              c=1;
              }
              else
              {
            	  Run_Team_2.setText(""+tr);
            	  Wicket_Team_2.setText(""+tw);
              }
              tr=0;tw=0;to=0;b=0;a=0;
              Run.setText("");
              Wicket.setText("");
              Over.setText("");
          }
    }

    

    

    @FXML
    void WideBall(ActionEvent event) {
    	tr=tr+1;
        Run.setText(""+tr);
        if(a==ovr)
       {
        	Run_Team_1.setText(""+tr);
        	Wicket_Team_1.setText(""+tw);
       }
    }

   

    

    @FXML
    void NoBall(ActionEvent event) {
    	  tr=tr+1;
          Run.setText(""+tr);  
          if(a==ovr)
         {
        	  Run_Team_1.setText(""+tr);
        	  Wicket_Team_1.setText(""+tw);
         }
    }

    @FXML
    void DotBall(ActionEvent event) {
    	 tr=tr+0;
         
         
         b=b+1;
         bb=bb+1;
         if(b==6)
         {
             a=a+1;
             b=0;
         }
         if(bb<=ovr&&b<6&&tw<11)
                 {
                    
        	 Run.setText(""+tr);     
             Over.setText(""+a);
      }                                         
  if(bb==ovr)
         {
              bb=0;
             ovr=ovrt;
             
             if(c==0)
             {
            	 Run_Team_1.setText(""+tr);
            	 Wicket_Team_1.setText(""+tw);
             c=1;
             }
             else
             {
            	 Run_Team_2.setText(""+tr);
            	 Wicket_Team_2.setText(""+tw);
             }
             tr=0;tw=0;to=0;b=0;a=0;
             Run.setText("");
             Wicket.setText("");
             Over.setText("");
         }  
    }

    @FXML
    void WICKET(ActionEvent event) {
    	tw=tw+1;
        if(tw<=10)
        {
        Wicket.setText(""+tw);
        }
        
         b=b+1;
         bb=bb+1;
       if(b==6)
       {
           a=a+1;
           b=0;
       }
       if(bb<=ovr&&b<6&&tw<11)
               {
                  
    	   Run.setText(""+tr); 
           Over.setText(""+a);
       
       
               }
       if(bb==ovr||tw>=10)
       {
            bb=0;
           ovr=ovrt;
          
           if(c==0)
           {
        	   Run_Team_1.setText(""+tr);
        	   Wicket_Team_1.setText(""+tw);
           c=1;
           c++;
           
           }
           else
           {
        	   Run_Team_2.setText(""+tr);
        	   Wicket_Team_2.setText(""+tw);
           }
           tr=0;tw=0;to=0;b=0;a=0;
           Run.setText("");
           Wicket.setText("");
           Over.setText("");
       }
       
    }

    private Stage stage ;
    private Parent root ;
    private Scene scene;
    @FXML
    public void Start(ActionEvent event) throws IOException{
    	Parent root = FXMLLoader.load(getClass().getResource("SBoard.fxml"));
    	stage =(Stage)((Node)event.getSource()).getScene().getWindow();
    	scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();
    	//JOptionPane.showMessageDialog(null, Team1Name.getText() + "\n" + Team2Name.getText());
    	
    	//Team_1.setText(""+ Team1Name.getText());
    	//Team_2.setText(""+Team2Name.getText());
    	
    }
    
    @FXML
    void Save(ActionEvent event) throws SQLException {
    	DataConnection connec1 = new DataConnection("cricket match","root","");
		
		Connection connection = connec1.getConnection(); 
		String sql = "INSERT INTO cricket VALUES(?,?,?)";
		String sql1 = "INSERT INTO cricket VALUES(?,?,?)";
		PreparedStatement ps = connection.prepareStatement(sql);
		PreparedStatement ps2 = connection.prepareStatement(sql1);
		
		ps.setString(1,Team_1.getText());
		ps.setDouble(2,Double.parseDouble(Run_Team_1.getText()));
		ps.setDouble(3,Double.parseDouble(Wicket_Team_1.getText()));
		
		ps2.setString(1,Team_2.getText());
		ps2.setDouble(2,Double.parseDouble(Run_Team_2.getText()));
		ps2.setDouble(3,Double.parseDouble(Wicket_Team_2.getText()));
			
		
		ps.executeUpdate();
		ps2.executeUpdate();
		connection.close();
		JOptionPane.showMessageDialog(null, "DATA SAVED SUCCESFULLY");	
		}
		
		
    }

  
  /*  @FXML
    void 0d0d00(ActionEvent event) {

    }*/


