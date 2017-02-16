package com.tuniu.base.mail;

public class SendMail {
	public static void main(String[] args){   
        //这个类主要是设置邮件   
     MailSenderInfo mailInfo = new MailSenderInfo();    
     mailInfo.setMailServerHost("smtp.163.com");    
     mailInfo.setMailServerPort("25");    
     mailInfo.setValidate(true);    
     mailInfo.setUserName("zhengfuxuexi@163.com");    
     mailInfo.setPassword("yk271828");//您的邮箱密码    
     mailInfo.setFromAddress("zhengfuxuexi@163.com");    
     mailInfo.setToAddress("1270305593@qq.com");    
     mailInfo.setSubject("邮件发送测试");
     String html = "<table border='1'><tr><td>1</td><td>1</td><td>1</td></tr><tr><td>1</td><td>1</td><td>1</td></tr><tr><td>1</td><td>1</td><td>1</td></tr></table>";
     mailInfo.setContent(html);    
        //这个类主要来发送邮件   
     SimpleMailSender sms = new SimpleMailSender();   
        sms.sendTextMail(mailInfo);//发送文体格式    
        sms.sendHtmlMail(mailInfo);//发送html格式   
   }  
}
