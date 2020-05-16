import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;

public class Risk{
    public static JFrame riskFrame;
    private static JLabel timeLabel;


    public static void riskGUI(Player player){
        //����������󵹼�ʱ�����ݽ���ʾ�ڸô�������

            riskFrame=new JFrame();

        riskFrame.setLayout(new GridLayout(3,1));

        JLabel text = new JLabel("you will finish a risk after",JLabel.CENTER);
        text.setFont(new Font("Default", Font.PLAIN, 25));

        timeLabel = new JLabel("",JLabel.CENTER);

        JButton backToMain = new JButton("<<back");
        backToMain.setFont(new Font("Default", Font.PLAIN, 20));
        backToMain.addActionListener( (e) -> {
            riskFrame.setVisible(false);
            MainGUI.mainFrame.setVisible(true);

        });

        riskFrame.add(text);
        riskFrame.add(timeLabel,BorderLayout.CENTER);
        riskFrame.add(backToMain);

        riskFrame.setSize(400,150);
        riskFrame.setLocationRelativeTo(null);
        riskFrame.setResizable(false);
        riskFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        riskFrame.setVisible(false);

        /*
         * ���õ���ʱ��ʱ�䳤��
         * ����timer�����ٸ���timer��schedule�������������ڲ���
         * ��ʵ���߳�
         */
        final long[] end = {System.currentTimeMillis() + 1000 * 60 * 1};
        final int[] times = {2};
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            //��ȡʣ��ĵ���ʱ��
            public void run() {
                long sub= end[0] -System.currentTimeMillis();
                if(sub<0){
                    player.uesEquipment(new Equipment("test","des",10,5,1));
                    end[0] = System.currentTimeMillis()+1000*60*(times[0]);
                    times[0]+=1;
                    return;
                }
                updateTimer(sub);
            }
        },0,1000);
    }
    //��ʾ��HH��mm��ss���ĸ�ʽ��ˢ��ʣ���ʱ��
    public static void updateTimer(long sub){
        int h=(int)(sub/1000/60/60);
        int m=(int)(sub/1000/60%60);
        int s=(int)(sub/1000%60);
        String str=h+":"+m+":"+s;
        //��String����ת����Date���͵ĸ�ʽ
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
        Date date=new Date();
        Font font=new Font("Default", Font.PLAIN, 30);
        timeLabel.setFont(font);
        try{
            date=sdf.parse(str);
        }catch(Exception e){
            e.printStackTrace();
        }

        timeLabel.setText(sdf.format(date));
    }
}

