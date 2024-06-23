package belajarjava.validation.core;

import belajarjava.validation.core.container.Data;
import belajarjava.validation.core.container.DataInteger;
import belajarjava.validation.core.container.Entry;
import org.junit.jupiter.api.Test;

public class ValueExtractorTest extends AbstractValidatorTest{

    @Test
    void testSampleData() {
        SampleData data = new SampleData();

        data.setData(new Data<>());
        data.getData().setData("  ");

        validate(data);
    }

    @Test
    void testSampleEntry() {
        SampleEntry entry = new SampleEntry();

        entry.setEntry(new Entry<>());
        entry.getEntry().setKey("");
        entry.getEntry().setValue("");

        validate(entry);
    }

    @Test
    void testSampleDataInteger() {
        SampleDataInteger integer = new SampleDataInteger();

        integer.setData(new DataInteger());
        integer.getData().setData(0);

        validate(integer);
    }
}
