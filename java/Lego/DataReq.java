package tbclient.Lego;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_FLIP_ID = "";
    public static final String DEFAULT_ITEM_ID = "";
    public static final String DEFAULT_PARAMS = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f69689common;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String flip_id;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String item_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long page_id;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer page_type;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String params;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer rn;
    @ProtoField(tag = 11, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer scr_w;
    public static final Long DEFAULT_PAGE_ID = 0L;
    public static final Integer DEFAULT_PAGE_TYPE = 0;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_RN = 0;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Double DEFAULT_SCR_DIP = Double.valueOf(0.0d);

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f69690common;
        public String flip_id;
        public String item_id;
        public Long page_id;
        public Integer page_type;
        public String params;
        public Integer pn;
        public Integer rn;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f69690common = dataReq.f69689common;
            this.page_id = dataReq.page_id;
            this.page_type = dataReq.page_type;
            this.pn = dataReq.pn;
            this.rn = dataReq.rn;
            this.flip_id = dataReq.flip_id;
            this.item_id = dataReq.item_id;
            this.params = dataReq.params;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.scr_dip = dataReq.scr_dip;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f69689common = builder.f69690common;
            Long l = builder.page_id;
            if (l == null) {
                this.page_id = DEFAULT_PAGE_ID;
            } else {
                this.page_id = l;
            }
            Integer num = builder.page_type;
            if (num == null) {
                this.page_type = DEFAULT_PAGE_TYPE;
            } else {
                this.page_type = num;
            }
            Integer num2 = builder.pn;
            if (num2 == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num2;
            }
            Integer num3 = builder.rn;
            if (num3 == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = num3;
            }
            String str = builder.flip_id;
            if (str == null) {
                this.flip_id = "";
            } else {
                this.flip_id = str;
            }
            String str2 = builder.item_id;
            if (str2 == null) {
                this.item_id = "";
            } else {
                this.item_id = str2;
            }
            String str3 = builder.params;
            if (str3 == null) {
                this.params = "";
            } else {
                this.params = str3;
            }
            Integer num4 = builder.scr_w;
            if (num4 == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num4;
            }
            Integer num5 = builder.scr_h;
            if (num5 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num5;
            }
            Double d2 = builder.scr_dip;
            if (d2 == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
                return;
            } else {
                this.scr_dip = d2;
                return;
            }
        }
        this.f69689common = builder.f69690common;
        this.page_id = builder.page_id;
        this.page_type = builder.page_type;
        this.pn = builder.pn;
        this.rn = builder.rn;
        this.flip_id = builder.flip_id;
        this.item_id = builder.item_id;
        this.params = builder.params;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
    }
}
