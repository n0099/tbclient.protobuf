package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class DisplayWindowInfo extends Message {
    public static final String DEFAULT_INTRO = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 4)
    public final DealMedia img;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String intro;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer is_display;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long product_id;
    @ProtoField(tag = 9, type = Message.Datatype.UINT64)
    public final Long sales;
    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long ship_fee;
    @ProtoField(tag = 6, type = Message.Datatype.UINT64)
    public final Long stock;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 5, type = Message.Datatype.UINT64)
    public final Long unit_price;
    public static final Long DEFAULT_PRODUCT_ID = 0L;
    public static final Long DEFAULT_UNIT_PRICE = 0L;
    public static final Long DEFAULT_STOCK = 0L;
    public static final Long DEFAULT_SHIP_FEE = 0L;
    public static final Integer DEFAULT_IS_DISPLAY = 0;
    public static final Long DEFAULT_SALES = 0L;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DisplayWindowInfo> {
        public DealMedia img;
        public String intro;
        public Integer is_display;
        public Long product_id;
        public Long sales;
        public Long ship_fee;
        public Long stock;
        public String title;
        public Long unit_price;

        public Builder() {
        }

        public Builder(DisplayWindowInfo displayWindowInfo) {
            super(displayWindowInfo);
            if (displayWindowInfo == null) {
                return;
            }
            this.product_id = displayWindowInfo.product_id;
            this.title = displayWindowInfo.title;
            this.intro = displayWindowInfo.intro;
            this.img = displayWindowInfo.img;
            this.unit_price = displayWindowInfo.unit_price;
            this.stock = displayWindowInfo.stock;
            this.ship_fee = displayWindowInfo.ship_fee;
            this.is_display = displayWindowInfo.is_display;
            this.sales = displayWindowInfo.sales;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DisplayWindowInfo build(boolean z) {
            return new DisplayWindowInfo(this, z);
        }
    }

    public DisplayWindowInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.product_id;
            if (l == null) {
                this.product_id = DEFAULT_PRODUCT_ID;
            } else {
                this.product_id = l;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.intro;
            if (str2 == null) {
                this.intro = "";
            } else {
                this.intro = str2;
            }
            this.img = builder.img;
            Long l2 = builder.unit_price;
            if (l2 == null) {
                this.unit_price = DEFAULT_UNIT_PRICE;
            } else {
                this.unit_price = l2;
            }
            Long l3 = builder.stock;
            if (l3 == null) {
                this.stock = DEFAULT_STOCK;
            } else {
                this.stock = l3;
            }
            Long l4 = builder.ship_fee;
            if (l4 == null) {
                this.ship_fee = DEFAULT_SHIP_FEE;
            } else {
                this.ship_fee = l4;
            }
            Integer num = builder.is_display;
            if (num == null) {
                this.is_display = DEFAULT_IS_DISPLAY;
            } else {
                this.is_display = num;
            }
            Long l5 = builder.sales;
            if (l5 == null) {
                this.sales = DEFAULT_SALES;
                return;
            } else {
                this.sales = l5;
                return;
            }
        }
        this.product_id = builder.product_id;
        this.title = builder.title;
        this.intro = builder.intro;
        this.img = builder.img;
        this.unit_price = builder.unit_price;
        this.stock = builder.stock;
        this.ship_fee = builder.ship_fee;
        this.is_display = builder.is_display;
        this.sales = builder.sales;
    }
}
