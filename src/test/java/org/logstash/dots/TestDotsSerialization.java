package org.logstash.dots;

import org.testng.annotations.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class TestDotsSerialization {

    @Test
    public void shouldEncode() {
        DotsEncoder encoder = new DotsEncoder();
        assertThat(".".getBytes().equals(encoder.toBytes("arbitrary")));
    }

    @Test
    public void shouldDecode() {
        DotsDecoder decoder = new DotsDecoder();
        assertThat(".".equals(decoder.fromBytes("arbitrary".getBytes())));
        assertThat(".".equals(decoder.fromBytes(".".getBytes())));
    }
}