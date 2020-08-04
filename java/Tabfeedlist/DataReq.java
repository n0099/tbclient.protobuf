package tbclient.Tabfeedlist;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes16.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_TAB_CODE = "";
    public static final String DEFAULT_TAB_NAME = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1224common;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer load_type;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer pn;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer rn;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer scr_d;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer scr_h;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer scr_w;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String tab_code;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tab_name;
    public static final Integer DEFAULT_LOAD_TYPE = 0;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_RN = 0;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Integer DEFAULT_SCR_D = 0;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1224common = builder.f1225common;
            if (builder.tab_name == null) {
                this.tab_name = "";
            } else {
                this.tab_name = builder.tab_name;
            }
            if (builder.tab_code == null) {
                this.tab_code = "";
            } else {
                this.tab_code = builder.tab_code;
            }
            if (builder.load_type == null) {
                this.load_type = DEFAULT_LOAD_TYPE;
            } else {
                this.load_type = builder.load_type;
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
            if (builder.scr_d == null) {
                this.scr_d = DEFAULT_SCR_D;
                return;
            } else {
                this.scr_d = builder.scr_d;
                return;
            }
        }
        this.f1224common = builder.f1225common;
        this.tab_name = builder.tab_name;
        this.tab_code = builder.tab_code;
        this.load_type = builder.load_type;
        this.pn = builder.pn;
        this.rn = builder.rn;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_d = builder.scr_d;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1225common;
        public Integer load_type;
        public Integer pn;
        public Integer rn;
        public Integer scr_d;
        public Integer scr_h;
        public Integer scr_w;
        public String tab_code;
        public String tab_name;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1225common = dataReq.f1224common;
                this.tab_name = dataReq.tab_name;
                this.tab_code = dataReq.tab_code;
                this.load_type = dataReq.load_type;
                this.pn = dataReq.pn;
                this.rn = dataReq.rn;
                this.scr_w = dataReq.scr_w;
                this.scr_h = dataReq.scr_h;
                this.scr_d = dataReq.scr_d;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
