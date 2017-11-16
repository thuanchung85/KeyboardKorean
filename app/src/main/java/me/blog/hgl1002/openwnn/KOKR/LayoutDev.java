package me.blog.hgl1002.openwnn.KOKR;

public class LayoutDev {
	public static final int[][] JAMO_NEBUL_1969 = {
			{49, 0x31, 0x21},
			{50, 0x32, 0x22},
			{51, 0x33, 0xffe6},
			{52, 0x34, 0x24},
			{53, 0x35, 0x25},
			{54, 0x36, 0x5f},
			{55, 0x37, 0x3a},
			{56, 0x38, 0x27},
			{57, 0x39, 0x28},
			{48, 0x30, 0x29},

			{113, 0x1107, 0x1108},		// q
			{119, 0x110c, 0x110d},		// w
			{101, 0x1103, 0x1104},		// e
			{114, 0x1100, 0x1101},		// r
			{116, 0x1109, 0x110a},		// t
			{121, 0x1169, 0x116d},		// y
			{117, 0x1165, 0x1167},		// u
			{105, 0x1161, 0x1163},		// i
			{111, 0x1175, 0x1162},		// o
			{112, 0x1166, 0x3f},		// p
			{0x5b, 0x11a8, 0x11bc},		// [

			{97, 0x1106, 0x110f},		// a
			{115, 0x1102, 0x1110},		// s
			{100, 0x110b, 0x110e},		// d
			{102, 0x1105, 0x1111},		// f
			{103, 0x1112, 0x2f},		// g
			{104, -5100-0x09, -5100-0x0d},		// h
			{106, -5100-0x05, -5100-0x07},		// j
			{107, -5100-0x01, -5100-0x03},		// k
			{108, -5100-0x15, -5100-0x02},		// l
			{59, -5100-0x06, -5100-0x08},
			{39, 0x11b8, 0x11ae},

			{122, 0x11b7, 0x11c2},		// z
			{120, 0x11ab, 0x11c0},		// x
			{99, 0x11bc, 0x11be},		// c
			{118, 0x11af, 0x11c1},		// v
			{98, -5100-0x0e, -5100-0x12},			// b
			{110, 0x116e, 0x1172},		// n
			{109, 0x1173, 0x2e},		// m
			{44, -5100-0x13, 0x2c},
			{46, 0x11ba, 0x11b9},
			{47, 0x11bb, 0x11ad},

			{0x2d, 0x2d, 0x2715},
			{0x3d, 0x3d, 0x2b},

			{128, 0x2e, 0x2c},
	};

	public static final int[][] COMB_NEBUL_1969 = {
			{0x1169, 0x1161, 0x116a},	// ㅘ
			{0x1169, 0x1162, 0x116b},	// ㅙ
			{0x1169, 0x1175, 0x116c},	// ㅚ
			{0x116e, 0x1165, 0x116f},	// ㅝ
			{0x116e, 0x1166, 0x1170},	// ㅞ
			{0x116e, 0x1175, 0x1171},	// ㅟ
			{0x1173, 0x1175, 0x1174},	// ㅢ

			{0x1169, -5100-0x01, -5100-0x0a},	// ㅘ
			{0x1169, -5100-0x02, -5100-0x0b},	// ㅙ
			{0x1169, -5100-0x15, -5100-0x0c},	// ㅚ
			{0x116e, -5100-0x05, -5100-0x0f},	// ㅝ
			{0x116e, -5100-0x06, -5100-0x10},	// ㅞ
			{0x116e, -5100-0x15, -5100-0x11},	// ㅟ
			{0x1173, -5100-0x15, -5100-0x14},	// ㅢ

			{0x11a8, 0x11a8, 0x11a9},	// ㄲ
			{0x11a8, 0x11ba, 0x11aa},	// ㄳ
			{0x11ab, 0x11bd, 0x11ac},	// ㄵ
			{0x11ab, 0x11c2, 0x11ad},	// ㄶ
			{0x11af, 0x11a8, 0x11b0},	// ㄺ
			{0x11af, 0x11b7, 0x11b1},	// ㄻ
			{0x11af, 0x11b8, 0x11b2},	// ㄼ
			{0x11af, 0x11ba, 0x11b3},	// ㄽ
			{0x11af, 0x11c0, 0x11b4},	// ㄾ
			{0x11af, 0x11c1, 0x11b5},	// ㄿ
			{0x11af, 0x11c2, 0x11b6},	// ㅀ
			{0x11b8, 0x11ba, 0x11b9},	// ㅄ
			{0x11ba, 0x11ba, 0x11bb},	// ㅆ
	};

	public static final int[][] VIRTUAL_NEBUL_1969 = {
			{HangulEngine.VIRTUAL_JUNG, -5100-0x01, 0x1161},
			{HangulEngine.VIRTUAL_JUNG, -5100-0x02, 0x1162},
			{HangulEngine.VIRTUAL_JUNG, -5100-0x03, 0x1163},
			{HangulEngine.VIRTUAL_JUNG, -5100-0x04, 0x1164},
			{HangulEngine.VIRTUAL_JUNG, -5100-0x05, 0x1165},
			{HangulEngine.VIRTUAL_JUNG, -5100-0x06, 0x1166},
			{HangulEngine.VIRTUAL_JUNG, -5100-0x07, 0x1167},
			{HangulEngine.VIRTUAL_JUNG, -5100-0x08, 0x1168},
			{HangulEngine.VIRTUAL_JUNG, -5100-0x09, 0x1169},
			{HangulEngine.VIRTUAL_JUNG, -5100-0x0a, 0x116a},
			{HangulEngine.VIRTUAL_JUNG, -5100-0x0b, 0x116b},
			{HangulEngine.VIRTUAL_JUNG, -5100-0x0c, 0x116c},
			{HangulEngine.VIRTUAL_JUNG, -5100-0x0d, 0x116d},
			{HangulEngine.VIRTUAL_JUNG, -5100-0x0e, 0x116e},
			{HangulEngine.VIRTUAL_JUNG, -5100-0x0f, 0x116f},
			{HangulEngine.VIRTUAL_JUNG, -5100-0x10, 0x1170},
			{HangulEngine.VIRTUAL_JUNG, -5100-0x11, 0x1171},
			{HangulEngine.VIRTUAL_JUNG, -5100-0x12, 0x1172},
			{HangulEngine.VIRTUAL_JUNG, -5100-0x13, 0x1173},
			{HangulEngine.VIRTUAL_JUNG, -5100-0x14, 0x1174},
			{HangulEngine.VIRTUAL_JUNG, -5100-0x15, 0x1175},
	};

}
