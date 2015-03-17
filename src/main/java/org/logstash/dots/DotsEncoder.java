package org.logstash.dots;

import kafka.serializer.Encoder;
import kafka.utils.VerifiableProperties;

public class DotsEncoder implements Encoder<String> {
    public DotsEncoder(VerifiableProperties props) {
        //do nothing
    }

    @Override
    public byte[] toBytes(String s) {
        return ".".getBytes();
    }
}
