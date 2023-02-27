package tbclient.AgreeMe;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes9.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1110common;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long id;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer q_type;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer rn;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer scr_dip;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer scr_w;
    public static final Long DEFAULT_ID = 0L;
    public static final Integer DEFAULT_RN = 0;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Integer DEFAULT_SCR_DIP = 0;
    public static final Integer DEFAULT_Q_TYPE = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1111common;
        public Long id;
        public Integer q_type;
        public Integer rn;
        public Integer scr_dip;
        public Integer scr_h;
        public Integer scr_w;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1111common = dataReq.f1110common;
            this.id = dataReq.id;
            this.rn = dataReq.rn;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.scr_dip = dataReq.scr_dip;
            this.q_type = dataReq.q_type;
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
            this.f1110common = builder.f1111common;
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            Integer num = builder.rn;
            if (num == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = num;
            }
            Integer num2 = builder.scr_w;
            if (num2 == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num2;
            }
            Integer num3 = builder.scr_h;
            if (num3 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num3;
            }
            Integer num4 = builder.scr_dip;
            if (num4 == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = num4;
            }
            Integer num5 = builder.q_type;
            if (num5 == null) {
                this.q_type = DEFAULT_Q_TYPE;
                return;
            } else {
                this.q_type = num5;
                return;
            }
        }
        this.f1110common = builder.f1111common;
        this.id = builder.id;
        this.rn = builder.rn;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.q_type = builder.q_type;
    }
}
