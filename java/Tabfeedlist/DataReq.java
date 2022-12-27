package tbclient.Tabfeedlist;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes9.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_TAB_CODE = "";
    public static final String DEFAULT_TAB_NAME = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1395common;
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

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1396common;
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
            if (dataReq == null) {
                return;
            }
            this.f1396common = dataReq.f1395common;
            this.tab_name = dataReq.tab_name;
            this.tab_code = dataReq.tab_code;
            this.load_type = dataReq.load_type;
            this.pn = dataReq.pn;
            this.rn = dataReq.rn;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.scr_d = dataReq.scr_d;
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
            this.f1395common = builder.f1396common;
            String str = builder.tab_name;
            if (str == null) {
                this.tab_name = "";
            } else {
                this.tab_name = str;
            }
            String str2 = builder.tab_code;
            if (str2 == null) {
                this.tab_code = "";
            } else {
                this.tab_code = str2;
            }
            Integer num = builder.load_type;
            if (num == null) {
                this.load_type = DEFAULT_LOAD_TYPE;
            } else {
                this.load_type = num;
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
            Integer num6 = builder.scr_d;
            if (num6 == null) {
                this.scr_d = DEFAULT_SCR_D;
                return;
            } else {
                this.scr_d = num6;
                return;
            }
        }
        this.f1395common = builder.f1396common;
        this.tab_name = builder.tab_name;
        this.tab_code = builder.tab_code;
        this.load_type = builder.load_type;
        this.pn = builder.pn;
        this.rn = builder.rn;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_d = builder.scr_d;
    }
}
