package org.logstash.dots;

import kafka.serializer.Decoder;
import kafka.utils.VerifiableProperties;

public class DotsDecoder implements Decoder<String> {
    public DotsDecoder(VerifiableProperties props) {
        // do nothing
    }

    public DotsDecoder() {
        // do nothing
    }

    @Override
    public String fromBytes(byte[] bytes) {
        return ".";
    }
}
