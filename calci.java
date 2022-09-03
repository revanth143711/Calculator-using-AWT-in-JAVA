import java.awt.*;
import java.awt.event.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

public class calci implements ActionListener,ItemListener{
 
    double num1=0, num2=0, result=0;
    int calculation;
    
    //Creating object of Frame Class
    Frame frame=new Frame("CALCULATOR.revanth");
    
    //Creating objects of all the components
    Label label=new Label();
    TextField textField=new TextField();
    CheckboxGroup checkboxGroup=new CheckboxGroup();
    Checkbox onCheckbox=new Checkbox("On",checkboxGroup,true);
    Checkbox offCheckbox=new Checkbox("Off",checkboxGroup,false);
    Button b0 = new Button("0");
    Button b1 = new Button("1");
    Button b2 = new Button("2");
    Button b3 = new Button("3");
    Button b4 = new Button("4");
    Button b5 = new Button("5");
    Button b6 = new Button("6");
    Button b7 = new Button("7");
    Button b8 = new Button("8");
    Button b9 = new Button("9");
    Button a = new Button("A");
    Button b = new Button("B");
    Button c = new Button("C");
    Button d = new Button("D");
    Button e = new Button("E");
    Button f = new Button("F");
    Button round = new Button("Round");
    Button abs = new Button("Abs");
    Button pow = new Button("Power");
    Button ceil = new Button("Ceil");
    Button floor = new Button("Floor");
    Button deci1 = new Button("binary-deci");
    Button deci2 = new Button("octal-deci");
    Button deci3 = new Button("hexa-deci");
    Button binary = new Button("binary");
    Button octal = new Button("octal");
    Button hexa = new Button("hexadecimal");
    Button bsin = new Button("sin");
    Button bcos = new Button("cos");
    Button btan = new Button("tan");
    Button bcosec = new Button("cosec");
    Button bsec = new Button("sec");
    Button bcot = new Button("cot");
    //Button b3 = new Button("3");
    Button buttonDot = new Button(".");
    Button buttonClear = new Button("CLR");
    Button buttonDelete = new Button("DEL");
    Button buttonEqual = new Button("=");
    Button buttonNegative = new Button("(-)");
    Button buttonMul = new Button("x");
    Button buttonDiv = new Button("/");
    Button buttonPlus = new Button("+");
    Button buttonMinus = new Button("-");
    Button buttonSquare = new Button("x\u00B2");
    Button buttonReciprocal = new Button("1/x");
    Button buttonSqrt = new Button("\u221A");
    Button bfac = new Button("factorial");
    Button bpri = new Button("isPrime");
    Button brem = new Button("Remainder");
    Button boddeven = new Button("Odd or Even");
    Button barm = new Button("Armstrong");
    Button bpali = new Button("Palindrome");
    Button time = new Button("Time");
    
    //Creating Constructor of the Class
    calci(){
        frame.setSize(675,575);
        frame.setLayout(null);
        frame.setBackground(new Color(12,12,93));
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.addWindowListener(
                new WindowAdapter(){
                    public void windowClosing(WindowEvent e) { System.exit(0); }
                }
        );
        label.setBounds(10, 40, 200, 20);
        label.setForeground(Color.white);
        label.setFont(new Font("Arial",Font.BOLD,15));
        frame.add(label);
 
        textField.setBounds(15,60,645,35);
        textField.setFont(new Font("Arial",Font.BOLD,20));
        textField.setEditable(false);
        frame.add(textField);
 
        onCheckbox.setBounds(15, 100, 60, 40);
        onCheckbox.setFont(new Font("Arial", Font.BOLD, 14));
        onCheckbox.setBackground(new Color(12,12,93));
        onCheckbox.setForeground(Color.white);
        onCheckbox.setFocusable(false);
        frame.add(onCheckbox);
 
        offCheckbox.setBounds(15, 125, 60, 40);
        offCheckbox.setFont(new Font("Arial", Font.BOLD, 14));
        offCheckbox.setBackground(new Color(12,12,93));
        offCheckbox.setForeground(Color.white);
        offCheckbox.setFocusable(false);
        frame.add(offCheckbox);

        b7.setBounds(15, 230, 60, 40);
        b7.setFont(new Font("Arial", Font.BOLD, 20));
        b7.setBackground(Color.pink);
        b7.setFocusable(false);
        frame.add(b7);
 
        b8.setBounds(85, 230, 60, 40);
        b8.setFont(new Font("Arial", Font.BOLD, 20));
        b8.setBackground(Color.pink);
        b8.setFocusable(false);
        frame.add(b8);
 
        b9.setBounds(155, 230, 60, 40);
        b9.setFont(new Font("Arial", Font.BOLD, 20));
        b9.setBackground(Color.pink);
        b9.setFocusable(false);
        frame.add(b9);
 
        b4.setBounds(15, 290, 60, 40);
        b4.setFont(new Font("Arial", Font.BOLD, 20));
        b4.setBackground(Color.pink);
        b4.setFocusable(false);
        frame.add(b4);
 
        b5.setBounds(85, 290, 60, 40);
        b5.setFont(new Font("Arial", Font.BOLD, 20));
        b5.setBackground(Color.pink);
        b5.setFocusable(false);
        frame.add(b5);
 
        b6.setBounds(155, 290, 60, 40);
        b6.setFont(new Font("Arial", Font.BOLD, 20));
        b6.setBackground(Color.pink);
        b6.setFocusable(false);
        frame.add(b6);
 
        b1.setBounds(15, 350, 60, 40);
        b1.setFont(new Font("Arial", Font.BOLD, 20));
        b1.setBackground(Color.pink);
        b1.setFocusable(false);
        frame.add(b1);
 
        b2.setBounds(85, 350, 60, 40);
        b2.setFont(new Font("Arial", Font.BOLD, 20));
        b2.setBackground(Color.pink);
        b2.setFocusable(false);
        frame.add(b2);
 
        b3.setBounds(155, 350, 60, 40);
        b3.setFont(new Font("Arial", Font.BOLD, 20));
        b3.setBackground(Color.pink);
        b3.setFocusable(false);
        frame.add(b3);
        

        ceil.setBounds(225, 350, 60, 40);
        ceil.setFont(new Font("Arial", Font.BOLD, 20));
        ceil.setBackground(new Color(72, 231, 172));
        ceil.setFocusable(false);
        frame.add(ceil);
        
        floor.setBounds(225, 410, 60, 40);
        floor.setFont(new Font("Arial", Font.BOLD, 20));
        floor.setBackground(new Color(72, 231, 172));
        floor.setFocusable(false);
        frame.add(floor);
 
        buttonDot.setBounds(155, 410, 60, 40);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDot.setBackground(Color.pink);
        buttonDot.setFocusable(false);
        frame.add(buttonDot);
 
        b0.setBounds(15, 410, 60, 40);
        b0.setFont(new Font("Arial", Font.BOLD, 20));
        b0.setBackground(Color.pink);
        b0.setFocusable(false);
        frame.add(b0);
        
        a.setBounds(15, 465, 60, 40);
        a.setFont(new Font("Arial", Font.BOLD, 20));
        a.setBackground(Color.pink);
        a.setFocusable(false);
        frame.add(a);
        
        b.setBounds(85, 465, 60, 40);
        b.setFont(new Font("Arial", Font.BOLD, 20));
        b.setBackground(Color.pink);
        b.setFocusable(false);
        frame.add(b);
        
        c.setBounds(155, 465, 60, 40);
        c.setFont(new Font("Arial", Font.BOLD, 20));
        c.setBackground(Color.pink);
        c.setFocusable(false);
        frame.add(c);
        
        d.setBounds(15, 515, 60, 40);
        d.setFont(new Font("Arial", Font.BOLD, 20));
        d.setBackground(Color.pink);
        d.setFocusable(false);
        frame.add(d);
        
        e.setBounds(85, 515, 60, 40);
        e.setFont(new Font("Arial", Font.BOLD, 20));
        e.setBackground(Color.pink);
        e.setFocusable(false);
        frame.add(e);
        
        f.setBounds(155, 515, 60, 40);
        f.setFont(new Font("Arial", Font.BOLD, 20));
        f.setBackground(Color.pink);
        f.setFocusable(false);
        frame.add(f);
        
        abs.setBounds(225, 515, 60, 40);
        abs.setFont(new Font("Arial", Font.BOLD, 20));
        abs.setBackground(new Color(72, 231, 172));
        abs.setFocusable(false);
        frame.add(abs);
        
        time.setBounds(290, 515, 120, 40);
        time.setFont(new Font("Arial", Font.BOLD, 20));
        time.setBackground(new Color(72, 231, 172));
        time.setFocusable(false);
        frame.add(time);
        
        round.setBounds(225, 465, 60, 40);
        round.setFont(new Font("Arial", Font.BOLD, 20));
        round.setBackground(new Color(72, 231, 172));
        round.setFocusable(false);
        frame.add(round);
        
        pow.setBounds(290, 465,120, 40);
        pow.setFont(new Font("Arial", Font.BOLD, 20));
        pow.setBackground(new Color(72, 231, 172));
        pow.setFocusable(false);
        frame.add(pow);
        
        buttonNegative.setBounds(85,410,60,40);
        buttonNegative.setFont(new Font("Arial",Font.BOLD,20));
        buttonNegative.setBackground(Color.pink);
        buttonNegative.setFocusable(false);
        frame.add(buttonNegative);
 
        buttonEqual.setBounds(415, 465, 245, 90);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEqual.setBackground(new Color(72, 231, 172));
        buttonEqual.setFocusable(false);
        frame.add(buttonEqual);
 
        buttonDiv.setBounds(225, 110, 60, 40);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDiv.setBackground(new Color(72, 231, 172));
        buttonDiv.setFocusable(false);
        frame.add(buttonDiv);
        
        bfac.setBounds(290, 110, 120, 40);
        bfac.setFont(new Font("Arial", Font.BOLD, 20));
        bfac.setBackground(new Color(72, 231, 172));
        bfac.setFocusable(false);
        frame.add(bfac);
        
        deci1.setBounds(540, 290, 120, 40);
        deci1.setFont(new Font("Arial", Font.BOLD, 20));
        deci1.setBackground(new Color(72, 231, 172));
        deci1.setFocusable(false);
        frame.add(deci1);
        
        deci2.setBounds(540, 350, 120, 40);
        deci2.setFont(new Font("Arial", Font.BOLD, 20));
        deci2.setBackground(new Color(72, 231, 172));
        deci2.setFocusable(false);
        frame.add(deci2);
        
        deci3.setBounds(540, 410, 120, 40);
        deci3.setFont(new Font("Arial", Font.BOLD, 20));
        deci3.setBackground(new Color(72, 231, 172));
        deci3.setFocusable(false);
        frame.add(deci3);
        
        binary.setBounds(540, 110, 120, 40);
        binary.setFont(new Font("Arial", Font.BOLD, 20));
        binary.setBackground(new Color(72, 231, 172));
        binary.setFocusable(false);
        frame.add(binary);
        
        octal.setBounds(540, 170, 120, 40);
        octal.setFont(new Font("Arial", Font.BOLD, 20));
        octal.setBackground(new Color(72, 231, 172));
        octal.setFocusable(false);
        frame.add(octal);
        
        hexa.setBounds(540, 230, 120, 40);
        hexa.setFont(new Font("Arial", Font.BOLD, 20));
        hexa.setBackground(new Color(72, 231, 172));
        hexa.setFocusable(false);
        frame.add(hexa);
        
        bsin.setBounds(415, 110, 120, 40);
        bsin.setFont(new Font("Arial", Font.BOLD, 20));
        bsin.setBackground(new Color(72, 231, 172));
        bsin.setFocusable(false);
        frame.add(bsin);
        
        bcos.setBounds(415, 170, 120, 40);
        bcos.setFont(new Font("Arial", Font.BOLD, 20));
        bcos.setBackground(new Color(72, 231, 172));
        bcos.setFocusable(false);
        frame.add(bcos);
        
        btan.setBounds(415, 230, 120, 40);
        btan.setFont(new Font("Arial", Font.BOLD, 20));
        btan.setBackground(new Color(72, 231, 172));
        btan.setFocusable(false);
        frame.add(btan);
        
        bcosec.setBounds(415, 290, 120, 40);
        bcosec.setFont(new Font("Arial", Font.BOLD, 20));
        bcosec.setBackground(new Color(72, 231, 172));
        bcosec.setFocusable(false);
        frame.add(bcosec);
        
        bsec.setBounds(415, 350, 120, 40);
        bsec.setFont(new Font("Arial", Font.BOLD, 20));
        bsec.setBackground(new Color(72, 231, 172));
        bsec.setFocusable(false);
        frame.add(bsec);
        
        bcot.setBounds(415, 410, 120, 40);
        bcot.setFont(new Font("Arial", Font.BOLD, 20));
        bcot.setBackground(new Color(72, 231, 172));
        bcot.setFocusable(false);
        frame.add(bcot);
        
        buttonSqrt.setBounds(15, 170, 60, 40);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 18));
        buttonSqrt.setBackground(Color.pink);
        buttonSqrt.setFocusable(false);
        frame.add(buttonSqrt);
 
        buttonMul.setBounds(225, 230, 60, 40);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMul.setBackground(new Color(72, 231, 172));
        buttonMul.setFocusable(false);
        frame.add(buttonMul);
        
        brem.setBounds(290, 230, 120, 40);
        brem.setFont(new Font("Arial", Font.BOLD, 20));
        brem.setBackground(new Color(72, 231, 172));
        brem.setFocusable(false);
        frame.add(brem);
 
        buttonMinus.setBounds(225, 170, 60, 40);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMinus.setBackground(new Color(72, 231, 172));
        buttonMinus.setFocusable(false);
        frame.add(buttonMinus);
        
        bpri.setBounds(290, 170, 120, 40);
        bpri.setFont(new Font("Arial", Font.BOLD, 20));
        bpri.setBackground(new Color(72, 231, 172));
        bpri.setFocusable(false);
        frame.add(bpri);
        
        bpali.setBounds(290, 410, 120, 40);
        bpali.setFont(new Font("Arial", Font.BOLD, 20));
        bpali.setBackground(new Color(72, 231, 172));
        bpali.setFocusable(false);
        frame.add(bpali);
        
        barm.setBounds(290, 350, 120, 40);
        barm.setFont(new Font("Arial", Font.BOLD, 20));
        barm.setBackground(new Color(72, 231, 172));
        barm.setFocusable(false);
        frame.add(barm);
        
        buttonPlus.setBounds(225, 290, 60, 40);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPlus.setBackground(new Color(72, 231, 172));
        buttonPlus.setFocusable(false);
        frame.add(buttonPlus);
        
        boddeven.setBounds(290, 290, 120, 40);
        boddeven.setFont(new Font("Arial", Font.BOLD, 20));
        boddeven.setBackground(new Color(72, 231, 172));
        boddeven.setFocusable(false);
        frame.add(boddeven);
 
        buttonSquare.setBounds(85, 170, 60, 40);
        buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSquare.setBackground(Color.pink);
        buttonSquare.setFocusable(false);
        frame.add(buttonSquare);
 
        buttonReciprocal.setBounds(155, 170, 60, 40);
        buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 15));
        buttonReciprocal.setBackground(Color.pink);
        buttonReciprocal.setFocusable(false);
        frame.add(buttonReciprocal);
 
        buttonDelete.setBounds(155, 110, 60, 40);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 12));
        buttonDelete.setBackground(Color.red);
        buttonDelete.setForeground(Color.white);
        buttonDelete.setFocusable(false);
        frame.add(buttonDelete);
 
        buttonClear.setBounds(85, 110, 60, 40);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 12));
        buttonClear.setBackground(Color.red);
        buttonClear.setForeground(Color.white);
        buttonClear.setFocusable(false);
        frame.add(buttonClear);
        //Registering ActionListener and ItemListener
        onCheckbox.addItemListener(this);
        offCheckbox.addItemListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDiv.addActionListener(this);
        bfac.addActionListener(this);
        bpri.addActionListener(this);
        brem.addActionListener(this);
        boddeven.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        bpali.addActionListener(this);
        barm.addActionListener(this);
        deci1.addActionListener(this);
        deci2.addActionListener(this);
        deci3.addActionListener(this);
        binary.addActionListener(this);
        octal.addActionListener(this);
        hexa.addActionListener(this);
        bsin.addActionListener(this);
        bcos.addActionListener(this);
        btan.addActionListener(this);
        bcosec.addActionListener(this);
        bsec.addActionListener(this);
        bcot.addActionListener(this);
        buttonMinus.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b5.addActionListener(this);
        buttonMul.addActionListener(this);
        b4.addActionListener(this);
        b9.addActionListener(this);
        b6.addActionListener(this);
        buttonPlus.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        buttonEqual.addActionListener(this);
        b0.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonNegative.addActionListener(this);
        a.addActionListener(this);
        b.addActionListener(this);
        c.addActionListener(this);
        d.addActionListener(this);
        e.addActionListener(this);
        f.addActionListener(this);
        ceil.addActionListener(this);
        floor.addActionListener(this);
        round.addActionListener(this);
        abs.addActionListener(this);
        pow.addActionListener(this);
        time.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == buttonClear) {
            textField.setText("");
        }else if(source==buttonDelete){
            int length = textField.getText().length();
            int number = length - 1;
            if (length > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());
 
            }if (textField.getText().endsWith("")) {
                label.setText("");
            }
        }
 
        else if(source==b0){
    	    textField.setText(textField.getText() + "0");
        } else if (source == b1) {
            textField.setText(textField.getText() + "1");
        } else if (source == b2) {
            textField.setText(textField.getText() + "2");
        } else if (source == b3) {
            textField.setText(textField.getText() + "3");
        } else if (source == b4) {
            textField.setText(textField.getText() + "4");
        } else if (source == b5) {
            textField.setText(textField.getText() + "5");
        } else if (source == b6) {
            textField.setText(textField.getText() + "6");
        } else if (source == b7) {
            textField.setText(textField.getText() + "7");
        } else if (source == b8) {
            textField.setText(textField.getText() + "8");
        } else if (source == b9) {
            textField.setText(textField.getText() + "9");
        }else if (source == a) {
            textField.setText(textField.getText() + "A");
        }else if (source == b) {
            textField.setText(textField.getText() + "B");
        }else if (source == c) {
            textField.setText(textField.getText() + "C");
        }else if (source == d) {
            textField.setText(textField.getText() + "D");
        }else if (source == e) {
            textField.setText(textField.getText() + "E");
        }else if (source == f) {
            textField.setText(textField.getText() + "F");
        }else if(source==buttonNegative){
            textField.setText(textField.getText() + "-");
        }else if (source == buttonDot) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }
        }else if(source==buttonPlus){
           String str = textField.getText();
            num1=(double)Double.parseDouble(textField.getText());
            calculation=1;
            textField.setText("");
            label.setText(str + "+");
        }else if(source==buttonMinus){
            String str = textField.getText();
            num1=(double)Double.parseDouble(textField.getText());
            calculation=2;
            textField.setText("");
            label.setText(str + "-");
        }else if(source==buttonMul){
            String str = textField.getText();
            num1=Double.parseDouble(textField.getText());
            calculation=3;
            textField.setText("");
            label.setText(str + "X");
        }else if(source==buttonDiv){
            String str = textField.getText();
            num1=Double.parseDouble(textField.getText());
            calculation=4;
            textField.setText("");
            label.setText(str + "/");
        }else if(source==brem){
            String str = textField.getText();
            num1=Double.parseDouble(textField.getText());
            calculation=5;
            textField.setText("");
            label.setText(str + "%");
        }else if(source==bfac){
            String str = textField.getText();
            num1=Double.parseDouble(textField.getText());
            int result=1;
            for(int i=1;i<=num1;i++)
        	{
        		result=result*i;
        	}
            label.setText("factorial of "+str);
            textField.setText(Double.toString(result));
        }else if(source==deci1){
            String str = textField.getText();
            //int num1=Integer.parseInt(textField.getText());
            int n=Integer.parseInt(str,2);
            label.setText("Decimal value of "+str+" is ");
            textField.setText(String.valueOf(n));
        }else if(source==deci2){
            String str = textField.getText();
            int n=Integer.parseInt(str,8);
            label.setText("Decimal value of "+str+" is ");
            textField.setText(String.valueOf(n));
        }else if(source==deci3){
            String str = textField.getText();
            int n=Integer.parseInt(str,16);
            label.setText("Decimal value of "+str+" is ");
            textField.setText(String.valueOf(n));
        }else if(source==binary){
            String str = textField.getText();
            int num1=Integer.parseInt(textField.getText());
            String n=Integer.toBinaryString(num1);
            label.setText("Binary of "+str+" is ");
            textField.setText(n);
        }else if(source==octal){
            String str = textField.getText();
            int num1=Integer.parseInt(textField.getText());
            String n=Integer.toOctalString(num1);
            label.setText("Octal of "+str+" is ");
            textField.setText(n);
        }else if(source==hexa){
            String str = textField.getText();
            int num1=Integer.parseInt(textField.getText());
            String n=Integer.toHexString(num1);
            label.setText("HexaDecimal of "+str+" is ");
            textField.setText(n);
        }else if(source==bsin){
            String str = textField.getText();
            double num1=Math.sin(Integer.parseInt(textField.getText()));
            label.setText("Sin of "+str+" is ");
            textField.setText(String.valueOf(num1));
        }else if(source==bcos){
            String str = textField.getText();
            double num1=Math.cos(Integer.parseInt(textField.getText()));
            label.setText("Cos of "+str+" is ");
            textField.setText(String.valueOf(num1));
        }else if(source==btan){
            String str = textField.getText();
            double num1=Math.tan(Integer.parseInt(textField.getText()));
            label.setText("tan of "+str+" is ");
            textField.setText(String.valueOf(num1));
        }else if(source==bcosec){
            String str = textField.getText();
            double num1=1/Math.sin(Integer.parseInt(textField.getText()));
            label.setText("cosec of "+str+" is ");
            textField.setText(String.valueOf(num1));
        }else if(source==bsec){
            String str = textField.getText();
            double num1=1/Math.cos(Integer.parseInt(textField.getText()));
            label.setText("sec of "+str+" is ");
            textField.setText(String.valueOf(num1));
        }else if(source==bcot){
            String str = textField.getText();
            double num1=1/Math.tan(Integer.parseInt(textField.getText()));
            label.setText("cot of "+str+" is ");
            textField.setText(String.valueOf(num1));
        }else if(source==ceil){
            String str = textField.getText();
            double num1=Math.ceil(Double.parseDouble(textField.getText()));
            label.setText("Maximum value of "+str+" is ");
            textField.setText(String.valueOf(num1));
        }else if(source==floor){
            String str = textField.getText();
            double num1=Math.floor(Double.parseDouble(textField.getText()));
            label.setText("Minimum value of "+str+" is ");
            textField.setText(String.valueOf(num1));
        }else if(source==round){
            String str = textField.getText();
            double num1=Math.round(Double.parseDouble(textField.getText()));
            label.setText("RoundOf value of "+str+" is ");
            textField.setText(String.valueOf(num1));
        }else if(source==abs){
            String str = textField.getText();
            double num1=Math.abs(Double.parseDouble(textField.getText()));
            label.setText("Positive value of "+str+" is ");
            textField.setText(String.valueOf(num1));
        }else if(source==pow){
        	String str1 = textField.getText();
	        num1=Double.parseDouble(textField.getText());
	        calculation=6;
            textField.setText("");
            label.setText(str1 + "Power of ");
        }else if(source==time){
        	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        	LocalDateTime now = LocalDateTime.now();  
            label.setText("Date and Exact Time is ");
            textField.setText(String.valueOf(dtf.format(now)));
        }else if(source==barm){
            String str = textField.getText();
            num1=Double.parseDouble(textField.getText());
            int l=str.length();
            String result="";
            double sum=0;
            for(int i=0;i<l;i++)
        	{
            	String str2=String.valueOf(str.charAt(i));
            	num2=Double.parseDouble(str2);
            	sum=sum+Math.pow(num2,l);
        	}
            if(num1==sum)
            {
            	result="a Armstrong Number";
            }
            else
            {
            	result="Not a Armstrong Number";
            }
            label.setText(str+" is ");
            textField.setText(result);
        }else if(source==bpali){
            String str = textField.getText();
            num1=Double.parseDouble(textField.getText());
            int l=str.length();
            String str1="";
            String result="";
            for(int i=l-1;i>=0;i--)
        	{
            	String str2=String.valueOf(str.charAt(i));
            	str1=str1.concat(str2);
        	}
            if(str.equals(str1))
            {
            	result="a Palindrome Number";
            }
            else
            {
            	result="Not a Palindrome Number";
            }
            label.setText(str+" is ");
            textField.setText(result);
        }else if(source==boddeven){
            String str = textField.getText();
            num1=Double.parseDouble(textField.getText());
            if(num1%2==0)
            	textField.setText("Even Number");
            else
            	textField.setText("Odd Number");
            label.setText(str+" is a ");
            
        }else if(source==bpri){
            String str = textField.getText();
            num1=Double.parseDouble(textField.getText());
            int result=1;
            String s="a Prime Number";
            for(int i=2;i<num1;i++)
        	{
        		if(num1%i==0)
        		{
        			s="Not a Prime Number";
        			break;
        		}
        	}
            label.setText(str+" is ");
            textField.setText(s);
        }else if (source == buttonSqrt) {
            String str = textField.getText();
            num1 =Double.parseDouble(textField.getText());
            Double sqrt = Math.sqrt(num1);
            textField.setText(Double.toString(sqrt));
 
        }else if (source == buttonSquare) {
            String str = textField.getText();
            num1 =Double.parseDouble(textField.getText());
            double square = Math.pow(num1, 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
         }else if (source == buttonReciprocal) {
            num1 = Double.parseDouble(textField.getText());
            double reciprocal = 1 / num1;
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
        }else if(source==buttonEqual){
            num2=Double.parseDouble(textField.getText());
            switch(calculation){
                case 1:
                    result=num1+num2;
                    break;
                case 2:
                    result=num1-num2;
                    break;
                case 3:
                    result=num1*num2;
                    break;
                case 4:
                    result=num1/num2;
                    break;
                case 5:
                	result=num1%num2;
                    break;
                case 6:
                	result=Math.pow(num1,num2);
                    break;
            }
            if (Double.toString(result).endsWith(".0")) {
                textField.setText(Double.toString(result).replace(".0", ""));
            } else {
                textField.setText(Double.toString(result));
            }
            label.setText("");
            num1=result;
        }
    }
 
    //@Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==onCheckbox){
            enable();
        }
        else if(e.getSource()==offCheckbox){
            disable();
        }
        
    }
    
     public void enable(){
 
        onCheckbox.setEnabled(false);
        offCheckbox.setEnabled(true);
        textField.setEnabled(true);
        label.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonReciprocal.setEnabled(true);
        buttonMinus.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b5.setEnabled(true);
        buttonMul.setEnabled(true);
        b4.setEnabled(true);
        b9.setEnabled(true);
        b6.setEnabled(true);
        buttonPlus.setEnabled(true);
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        buttonEqual.setEnabled(true);
        b0.setEnabled(true);
        buttonDot.setEnabled(true);
        buttonNegative.setEnabled(true);
    }
    public void disable(){
 
        onCheckbox.setEnabled(true);
        offCheckbox.setEnabled(false);
        label.setText("");
        textField.setText("");
        buttonClear.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonSqrt.setEnabled(false);
        buttonSquare.setEnabled(false);
        buttonReciprocal.setEnabled(false);
        buttonMinus.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        buttonMul.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        buttonPlus.setEnabled(false);
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        buttonEqual.setEnabled(false);
        b0.setEnabled(false);
        buttonDot.setEnabled(false);
        buttonNegative.setEnabled(false);
    }
    public static void main(String[] args) {
      
        calci calculator = new calci();
    }
    
}