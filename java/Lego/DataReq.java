package tbclient.Lego;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_FLIP_ID = "";
    public static final String DEFAULT_ITEM_ID = "";
    public static final String DEFAULT_PARAMS = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f8857common;
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

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f8857common = builder.f8858common;
            if (builder.page_id == null) {
                this.page_id = DEFAULT_PAGE_ID;
            } else {
                this.page_id = builder.page_id;
            }
            if (builder.page_type == null) {
                this.page_type = DEFAULT_PAGE_TYPE;
            } else {
                this.page_type = builder.page_type;
            }
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = builder.pn;
            }
            if (builder.rn == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = builder.rn;
            }
            if (builder.flip_id == null) {
                this.flip_id = "";
            } else {
                this.flip_id = builder.flip_id;
            }
            if (builder.item_id == null) {
                this.item_id = "";
            } else {
                this.item_id = builder.item_id;
            }
            if (builder.params == null) {
                this.params = "";
            } else {
                this.params = builder.params;
            }
            if (builder.scr_w == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = builder.scr_w;
            }
            if (builder.scr_h == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = builder.scr_h;
            }
            if (builder.scr_dip == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
                return;
            } else {
                this.scr_dip = builder.scr_dip;
                return;
            }
        }
        this.f8857common = builder.f8858common;
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

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f8858common;
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
            if (dataReq != null) {
                this.f8858common = dataReq.f8857common;
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
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
