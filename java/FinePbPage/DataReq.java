package tbclient.FinePbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f72598common;
    @ProtoField(tag = 6, type = Message.Datatype.UINT64)
    public final Long ftid;
    @ProtoField(tag = 5, type = Message.Datatype.UINT64)
    public final Long q_type;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long scr_dip;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long scr_h;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long scr_w;
    public static final Long DEFAULT_SCR_W = 0L;
    public static final Long DEFAULT_SCR_H = 0L;
    public static final Long DEFAULT_SCR_DIP = 0L;
    public static final Long DEFAULT_Q_TYPE = 0L;
    public static final Long DEFAULT_FTID = 0L;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f72599common;
        public Long ftid;
        public Long q_type;
        public Long scr_dip;
        public Long scr_h;
        public Long scr_w;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f72599common = dataReq.f72598common;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.scr_dip = dataReq.scr_dip;
            this.q_type = dataReq.q_type;
            this.ftid = dataReq.ftid;
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
            this.f72598common = builder.f72599common;
            Long l = builder.scr_w;
            if (l == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = l;
            }
            Long l2 = builder.scr_h;
            if (l2 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = l2;
            }
            Long l3 = builder.scr_dip;
            if (l3 == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = l3;
            }
            Long l4 = builder.q_type;
            if (l4 == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = l4;
            }
            Long l5 = builder.ftid;
            if (l5 == null) {
                this.ftid = DEFAULT_FTID;
                return;
            } else {
                this.ftid = l5;
                return;
            }
        }
        this.f72598common = builder.f72599common;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.q_type = builder.q_type;
        this.ftid = builder.ftid;
    }
}
