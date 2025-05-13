package util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class FiltroNumerico extends DocumentFilter {

    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        String nuevaCadena = new StringBuilder(fb.getDocument().getText(0, fb.getDocument().getLength()))
                .insert(offset, string)
                .toString();

        if (esValido(nuevaCadena)) {
            super.insertString(fb, offset, string, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        String actual = fb.getDocument().getText(0, fb.getDocument().getLength());
        String nuevaCadena = new StringBuilder(actual).replace(offset, offset + length, text).toString();

        if (esValido(nuevaCadena)) {
            super.replace(fb, offset, length, text, attrs);
        }
    }

    private boolean esValido(String texto) {
        if (texto.isEmpty()) {
            return true;
        }
        try {
            double valor = Double.parseDouble(texto);
            return valor > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
