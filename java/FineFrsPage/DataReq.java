package tbclient.FineFrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_TAG = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f69366common;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer forder;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer publish_time;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer q_type;
    @ProtoField(tag = 4, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer scr_w;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String tag;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Double DEFAULT_SCR_DIP = Double.valueOf(0.0d);
    public static final Integer DEFAULT_Q_TYPE = 0;
    public static final Integer DEFAULT_PUBLISH_TIME = 0;
    public static final Integer DEFAULT_FORDER = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f69367common;
        public Integer forder;
        public Integer publish_time;
        public Integer q_type;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public String tag;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f69367common = dataReq.f69366common;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.scr_dip = dataReq.scr_dip;
            this.q_type = dataReq.q_type;
            this.publish_time = dataReq.publish_time;
            this.tag = dataReq.tag;
            this.forder = dataReq.forder;
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
            this.f69366common = builder.f69367common;
            Integer num = builder.scr_w;
            if (num == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num;
            }
            Integer num2 = builder.scr_h;
            if (num2 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num2;
            }
            Double d2 = builder.scr_dip;
            if (d2 == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = d2;
            }
            Integer num3 = builder.q_type;
            if (num3 == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = num3;
            }
            Integer num4 = builder.publish_time;
            if (num4 == null) {
                this.publish_time = DEFAULT_PUBLISH_TIME;
            } else {
                this.publish_time = num4;
            }
            String str = builder.tag;
            if (str == null) {
                this.tag = "";
            } else {
                this.tag = str;
            }
            Integer num5 = builder.forder;
            if (num5 == null) {
                this.forder = DEFAULT_FORDER;
                return;
            } else {
                this.forder = num5;
                return;
            }
        }
        this.f69366common = builder.f69367common;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.q_type = builder.q_type;
        this.publish_time = builder.publish_time;
        this.tag = builder.tag;
        this.forder = builder.forder;
    }
}
