package com.lss.jsch;

import com.jcraft.jsch.*;

import java.util.Properties;
import java.util.Vector;

public class JSCH {
    private static final String USER="app";
    private static final String PASSWORD="root";
    private static final String HOST="120.53.23.208";
    private static final int DEFAULT_SSH_PORT=22;

    public static void main(String[] args) throws JSchException, SftpException {
        JSch jsch  = new JSch();
        Session session = jsch.getSession(USER,HOST,DEFAULT_SSH_PORT);
        session.setPassword(PASSWORD);
        Properties sshConfig = new Properties();
        sshConfig.put("StrictHostKeyChecking", "no");
        session.setConfig(sshConfig);
        session.connect(30000);
        Channel channel = session.openChannel("sftp");
        channel.connect(3000);
        ChannelSftp sftp = (ChannelSftp)channel;
        sftp.cd("/root");
        Vector vector = sftp.ls("/");
        for (Object object :vector){
            System.out.println(object);
        }
        sftp.disconnect();
        session.disconnect();


    }
}
