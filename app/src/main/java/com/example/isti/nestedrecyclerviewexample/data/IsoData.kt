package com.example.isti.nestedrecyclerviewexample.data

enum class IsoData(val iso: Int) {
    ISO_50(50), ISO_64(64), ISO_100(100), ISO_125(125), ISO_160(160), ISO_200(200), ISO_250(250),
    ISO_320
            (320),
    ISO_400(400), ISO_500(500), ISO_640(640), ISO_800(800), ISO_1000(1000), ISO_1250(1250), ISO_1600(1600), ISO_2000(2000), ISO_2500(2500), ISO_3200(3200),
    ISO_4000(4000), ISO_5000(5000), ISO_6400(6400), ISO_8000(8000), ISO_10000(10000), ISO_12800(12800), ISO_16000(16000), ISO_20000(20000), ISO_25600(25600), ISO_51200(51200), ISO_102400(102400);

    override fun toString(): String {
        return iso.toString()
    }
}
