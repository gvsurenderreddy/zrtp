/**
 * ZRTP.org is a ZRTP protocol implementation  
 * Copyright (C) 2010 - PrivateWave Italia S.p.A.
 * 
 * This  program  is free software:  you can  redistribute it and/or
 * modify  it  under  the terms  of  the  GNU Affero  General Public
 * License  as  published  by the  Free Software Foundation,  either 
 * version 3 of the License,  or (at your option) any later version.
 * 
 * This program is  distributed in  the hope that it will be useful,
 * but WITHOUT ANY WARRANTY;  without even  the implied  warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU 
 * Affero General Public License for more details.
 * 
 * You should have received a copy of the  GNU Affero General Public
 * License along with this program.
 * If not, see <http://www.gnu.org/licenses/>.
 * 
 * For more information, please contact PrivateWave Italia S.p.A. at
 * address zorg@privatewave.com or http://www.privatewave.com 
 */
package zorg;

public enum CipherType {

	UNDEFINED ( null, 0, 0 ),
	AES1 ( new byte[] { 'A', 'E', 'S', '1' }, 128, 112 ),
	AES3 ( new byte[] { 'A', 'E', 'S', '3' }, 256, 112);
	
    private byte[] symbol;
	private int masterKeyBits;
	private int saltBits;

	CipherType(byte[] symbol, int masterKeyBits, int saltBits) {
	    this.symbol = symbol;
	    this.masterKeyBits = masterKeyBits;
	    this.saltBits = saltBits;
    }
	
	public byte[] getSymbol() {
		return symbol;
	}

	public int getMasterKeyBits() {
		return masterKeyBits;
	}

	public int getSaltBits() {
		return saltBits;
	}

}
