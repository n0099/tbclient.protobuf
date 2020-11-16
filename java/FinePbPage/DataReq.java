package tbclient.FinePbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes22.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f5180common;
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

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f5180common = builder.f5181common;
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
            } else {
                this.scr_dip = builder.scr_dip;
            }
            if (builder.q_type == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = builder.q_type;
            }
            if (builder.ftid == null) {
                this.ftid = DEFAULT_FTID;
                return;
            } else {
                this.ftid = builder.ftid;
                return;
            }
        }
        this.f5180common = builder.f5181common;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.q_type = builder.q_type;
        this.ftid = builder.ftid;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f5181common;
        public Long ftid;
        public Long q_type;
        public Long scr_dip;
        public Long scr_h;
        public Long scr_w;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f5181common = dataReq.f5180common;
                this.scr_w = dataReq.scr_w;
                this.scr_h = dataReq.scr_h;
                this.scr_dip = dataReq.scr_dip;
                this.q_type = dataReq.q_type;
                this.ftid = dataReq.ftid;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
