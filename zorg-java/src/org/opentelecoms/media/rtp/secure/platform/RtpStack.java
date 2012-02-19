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
package org.opentelecoms.media.rtp.secure.platform;

/**
 * Interface for RTP stack, used to send ZRTP packets, eventually with masquerading
 */
public interface RtpStack {

	/** send a ZRTP packet with data as packet payload */
	void sendZrtpPacket(byte[] data);

	void setNextZrtpSequenceNumber(int startSeqNum);


	
	/** ZRTP packets use invalid RTP version number and some PBX could drop them instead of relaying. 
	 * Enable dual masquerading: RTP stack send both original and masqueraded ZRTP packet */
	void setMasqueradingDual();
	
	/** ZRTP packets use invalid RTP version number and some PBX could drop them instead of relaying. 
	 * Enable active masquerading: RTP stack sends only masqueraded ZRTP packets */
	void setMasqueradingActive();
	
}
