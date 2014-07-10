package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class PayMemberInfo extends Message {
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer end_time;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer props_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String url;
    public static final Integer DEFAULT_PROPS_ID = 0;
    public static final Integer DEFAULT_END_TIME = 0;

    /* synthetic */ PayMemberInfo(Builder builder, boolean z, PayMemberInfo payMemberInfo) {
        this(builder, z);
    }

    private PayMemberInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.props_id == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = builder.props_id;
            }
            if (builder.end_time == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = builder.end_time;
            }
            if (builder.url == null) {
                this.url = "";
                return;
            } else {
                this.url = builder.url;
                return;
            }
        }
        this.props_id = builder.props_id;
        this.end_time = builder.end_time;
        this.url = builder.url;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<PayMemberInfo> {
        public Integer end_time;
        public Integer props_id;
        public String url;

        public Builder(PayMemberInfo payMemberInfo) {
            super(payMemberInfo);
            if (payMemberInfo != null) {
                this.props_id = payMemberInfo.props_id;
                this.end_time = payMemberInfo.end_time;
                this.url = payMemberInfo.url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PayMemberInfo build(boolean z) {
            return new PayMemberInfo(this, z, null);
        }
    }
}
