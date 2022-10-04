package com.example

class PrimitiveTypes {
    static void main(String[] args) {

        //----------------------------------------------------------------
        // static typed variables
        //----------------------------------------------------------------

        byte  b = 1
        char  c = 2
        short s = 3
        int   i = 4
        long  l = 5
        BigInteger bi =  6

        float  f = 1.234
        double d = 2.345
        BigDecimal bd =  3.456

        boolean bo = true

        //----------------------------------------------------------------
        // dynamic typed variables
        //----------------------------------------------------------------

        def n1=12;

        //----------------------------------------------------------------

        assert 42I == Integer.valueOf('42')
        assert 42i == Integer.valueOf('42') // lowercase i more readable
        assert 123L == Long.valueOf("123") // uppercase L more readable
        assert 2147483648 == Long.valueOf('2147483648') // Long type used, value too large for an Integer
        assert 456G == new BigInteger('456')
        assert 456g == new BigInteger('456')
        assert 123.45 == new BigDecimal('123.45') // default BigDecimal type used
        assert .321 == new BigDecimal('.321')
        assert 1.200065D == Double.valueOf('1.200065')
        assert 1.234F == Float.valueOf('1.234')
        assert 1.23E23D == Double.valueOf('1.23E23')
        assert 0b1111L.class == Long // binary
        assert 0xFFi.class == Integer // hexadecimal
        assert 034G.class == BigInteger // octal

        //----------------------------------------------------------------

    }
}
