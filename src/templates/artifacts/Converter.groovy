@artifact.package@

import com.budjb.rabbitmq.MessageConverter

/**
 * Provides a message converter for @artifact.datatype@ objects.
 */
class @artifact.name@ extends MessageConverter<@artifact.datatype@> {
    /**
     * Returns whether the message converter can convert a value from a(n) @artifact.datatype@ to a byte array.
     *
     * @return boolean
     */
    @Override
    public boolean canConvertFrom() {
        return true
    }

    /**
     * Returns whether the message converter can convert a value from a byte array to a(n) @artifact.datatype@.
     *
     * @return boolean
     */
    @Override
    public boolean canConvertTo() {
        return true
    }

    /**
     * Converts a value from a byte array to a(n) @atrifact.datatype@.
     *
     * @param input Value to convert.
     * @return Value converted to a String, or null if the conversion failed.
     */
    @Override
    public String convertTo(byte[] input) {
        // TODO: Implement
        //
        // return new @artifact.datatype@(input)
    }

    /**
     * Converts a value from a(n) @artifact.datatype@ to a byte array.
     *
     * @param input Value to convert.
     * @return Value converted to a byte array, or null if the conversion failed..
     */
    @Override
    public byte[] convertFrom(@artifact.datatype@ input) {
        // TODO: Implement.
    }

    /**
     * The MIME-type typically associated with the object type, if one exists.
     *
     * @return MIME-type typically associated with this object type, or null if one does not exist.
     */
    @Override
    public String getContentType() {
        // TODO: Establish the MIME-type.
        //
        // return 'text/plain'
    }
}
