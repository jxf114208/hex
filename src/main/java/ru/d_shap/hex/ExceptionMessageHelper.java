///////////////////////////////////////////////////////////////////////////////////////////////////
// Hex library converts bytes to hex representation and vice versa.
// Copyright (C) 2016 Dmitry Shapovalov.
//
// This file is part of hex library.
//
// Hex library is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// Hex library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with this program. If not, see <http://www.gnu.org/licenses/>.
///////////////////////////////////////////////////////////////////////////////////////////////////
package ru.d_shap.hex;

/**
 * Class provides messages for all exceptions.
 *
 * @author Dmitry Shapovalov
 */
final class ExceptionMessageHelper {

    private ExceptionMessageHelper() {
        super();
    }

    static String createWrongHexStringSizeMessage(final int length) {
        return "Wrong number of symbols in hex string (" + length + ")";
    }

    static String createWrongResultArrayMessage(final int expected, final int actual) {
        return "Result array is too small for hex string (" + actual + "), expected size is (" + expected + ")";
    }

    static String createWrongHexSymbol(final int symbol) {
        return "Wrong symbol obtained: '" + (char) symbol + "' (" + symbol + ")";
    }

    static String createEndOfStreamMessage() {
        return "Unexpected end of stream";
    }

}
