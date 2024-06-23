package belajarjava.validation.core.extractor;

import belajarjava.validation.core.container.Data;
import jakarta.validation.valueextraction.ExtractedValue;
import jakarta.validation.valueextraction.ValueExtractor;

public class DataValueExtractor implements ValueExtractor<Data<@ExtractedValue ?>> {

    @Override
    public void extractValues(Data<?> originalValue, ValueReceiver receiver) {
        receiver.value(null, originalValue.getData());
    }
}
