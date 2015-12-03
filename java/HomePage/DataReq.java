package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 2)
    public final CommonReq common;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer q_type;
    @ProtoField(tag = 5, type = Message.Datatype.DOUBLE)
    public final Double src_dip;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer src_h;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer src_w;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_SRC_W = 0;
    public static final Integer DEFAULT_SRC_H = 0;
    public static final Double DEFAULT_SRC_DIP = Double.valueOf(0.0d);
    public static final Integer DEFAULT_Q_TYPE = 0;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            this.common = builder.common;
            if (builder.src_w == null) {
                this.src_w = DEFAULT_SRC_W;
            } else {
                this.src_w = builder.src_w;
            }
            if (builder.src_h == null) {
                this.src_h = DEFAULT_SRC_H;
            } else {
                this.src_h = builder.src_h;
            }
            if (builder.src_dip == null) {
                this.src_dip = DEFAULT_SRC_DIP;
            } else {
                this.src_dip = builder.src_dip;
            }
            if (builder.q_type == null) {
                this.q_type = DEFAULT_Q_TYPE;
                return;
            } else {
                this.q_type = builder.q_type;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.common = builder.common;
        this.src_w = builder.src_w;
        this.src_h = builder.src_h;
        this.src_dip = builder.src_dip;
        this.q_type = builder.q_type;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public Integer q_type;
        public Double src_dip;
        public Integer src_h;
        public Integer src_w;
        public Long user_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.user_id = dataReq.user_id;
                this.common = dataReq.common;
                this.src_w = dataReq.src_w;
                this.src_h = dataReq.src_h;
                this.src_dip = dataReq.src_dip;
                this.q_type = dataReq.q_type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}
